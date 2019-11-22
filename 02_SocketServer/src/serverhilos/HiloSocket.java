package serverhilos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class HiloSocket implements Runnable{
	
	public Socket socket;
	public static int numeroPeticion = 0;
	
	public HiloSocket(Socket socket) {
		this.socket = socket;
		numeroPeticion++;
	}

	@Override
	public void run() {
		try {
			System.out.println("Procesando peticion: " + numeroPeticion);
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
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	

}
