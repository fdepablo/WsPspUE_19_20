package serverhilos;

import java.net.ServerSocket;
import java.net.Socket;

public class MainServerHilos {

	public static void main(String[] args) {
		//metemos el servidor en un bloque autocloseable para que se cierre
		//automaticamente
		try (ServerSocket servidor = new ServerSocket(2019);){
			while(true) {
				System.out.println("Servidor esperando peticiones por el puerto 2019");
				Socket socket = servidor.accept();//aqui nos quedamos esperando a que llegue una peticion
				//para evitar bloquear el hilo principal con la peticion y poder
				//procesar varias peticiones de los clientes de manera simultanea
				//abrimos un nuevo hilo por cada peticion para poder procesar
				//varias peticiones al mismo tiempo
				new Thread(new HiloSocket(socket)).start();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
