package escrvendoarquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escrever {

	public static void main(String[] args) {
		
		String [] linha = new String[] {"Bom Dia", "Boa Tarde", "Boa Noite"};
		
		String path ="C:\\temp\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			
			for (String linhas :linha) {
				
				bw.write(linhas);
				bw.newLine();
			}
			
			
		}
		catch(IOException e){
			
			e.printStackTrace();
				
		}
		
	}

}
