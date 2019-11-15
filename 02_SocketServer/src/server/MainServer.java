package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			ServerSocket servidor = new ServerSocket(2019);
			while(true) {
				System.out.println("Servidor esperando peticiones por el puerto 2019");
				Socket socket = servidor.accept();//aqui nos quedamos esperando a que llegue una peticion
				
				InputStreamReader isr = new InputStreamReader(socket.getInputStream());
				BufferedReader bf = new BufferedReader(isr);
				
				System.out.println("ip conectada: " + socket.getInetAddress().getHostName());
				
				String numeros = bf.readLine();//45-56
				
				String[] aNumeros = numeros.split("-");
				String sNumero1 = aNumeros[0];
				String sNumero2 = aNumeros[1];
				int iNumero1 = Integer.parseInt(sNumero1);
				int iNumero2 = Integer.parseInt(sNumero2);
				int resultado = iNumero1 + iNumero2;
				PrintStream pw = new PrintStream(socket.getOutputStream());
				pw.println(resultado);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
