package cliente;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MainCliente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca los numeros a sumar: ");
		String numero1 = sc.nextLine();
		String numero2 = sc.nextLine();
		String cadena = numero1 + "-" + numero2;

		String ip = "127.0.0.1";
		int puerto = 2019;

		try {
			Socket socketCliente = new Socket(ip, puerto);
			PrintStream pw = new PrintStream(socketCliente.getOutputStream());
			InputStreamReader isr = new InputStreamReader(socketCliente.getInputStream());
			BufferedReader bf = new BufferedReader(isr);
			
			
			pw.println(cadena);

			String resultado = bf.readLine();//aqui me quedo hasta que el servidor me haga un println
			System.out.println("El resultado de la operacion es: " + resultado);

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
