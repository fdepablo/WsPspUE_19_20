package _02_asimetrica;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;

import javax.crypto.Cipher;

/*
 * En este apartado estudiaremos el algoritmo RSA, 
 * Desarrollado por Ron Rivest, Adi Shamir y Leonard Adleman 
 * cuyas iniciales dieron nombre al algoritmo. 
 * 
 *  La clave privada, que es distinta para cada usuario. 

    La clave pública, que es la misma para todos los usuarios.

	El procedimiento empleado para el cifrado es el siguiente:

    Un proceso que desea enviar un mensaje utiliza la clave pública 
    (conocida por todos los procesos) para cifrar el mensaje.

    El proceso destinatario del mensaje podrá descifrarlo utilizando la 
    clave privada, que solo él conoce, asegurando así la confidencialidad.

    La clave privada es generada a partir de la clave pública, 
    de modo que ambas están relacionadas.
 */
public class _03_MainRSA {
	public static void main(String[] args) {
		try {
			KeyPairGenerator generador = KeyPairGenerator.getInstance("RSA");
			System.out.println("Paso 1: Se ha obtenido el generador de claves");
			
			//Claves va a contener la clave privada y la clave publica
			KeyPair claves = generador.generateKeyPair();
			System.out.println("Paso 2: Se ha obtenido el par de claves");
			
			Cipher descifrador = Cipher.getInstance("RSA");
			System.out.println("Paso 3: Hemos obtenido el descifrador");
			
			PrivateKey pk = claves.getPrivate();
			descifrador.init(Cipher.ENCRYPT_MODE, claves.getPublic());
			//System.out.println(claves.getPublic().getClass().getName());
			System.out.println("Paso 4: Hemos configurado el descifrador para usar clave publica");
			
			String mensajeOriginal = "Ya no nos queda nada para acabar la asignatura :'(";
			byte[] bytesMensajeOriginal = mensajeOriginal.getBytes();
			byte[] bytesMensajeCifrado = descifrador.doFinal(bytesMensajeOriginal);
			String mensajeCifrado = new String(bytesMensajeCifrado);
			System.out.println("Paso 5: Hemos preparado y cifrado el mensaje original");
			System.out.println("Mensaje Original: " + mensajeOriginal);
			System.out.println("Mensaje Cifrado: " + mensajeCifrado);
			
			//Mandariamos el mensaje por la red
			System.out.println("AHORA VAMOS A DESCIFRAR EL MENSAJE CIFRADO USANDO LA CLAVE PRIVADA");
			descifrador.init(Cipher.DECRYPT_MODE, claves.getPrivate());
			byte[] bytesMensajeDescifrado = descifrador.doFinal(bytesMensajeCifrado);
			System.out.println("Mensaje Descifrado: " + new String(bytesMensajeDescifrado));
			
		} catch (GeneralSecurityException e) {
			System.out.println("Error al cifrar o descifrar el mensaje");
			System.out.println("Excepción de tipo: " + e.getClass().getName());
			System.out.println(e.getMessage());
		}
	}
}
