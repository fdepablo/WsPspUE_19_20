package interfaces;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ImprimirFichero implements Imprimible{

	@Override
	public void imprimir(String cadena) {
		/*PrintWriter pw = null;
		try {
			pw = new PrintWriter(new File("fichero.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(pw != null) {
				pw.close();
			}
		}*/
		try(PrintWriter pw = new PrintWriter(new File("fichero.txt"))){
			pw.println(cadena);
		}catch(FileNotFoundException fnfe) {
			
		}
		
	}

}
