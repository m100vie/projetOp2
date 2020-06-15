package builder;


import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * 
 */
public class FichierSimple extends FichierBuilder {
	
	public FichierSimple () {
		fichier = new Fichier();
		fichier.upload();
	}
	
	@Override
	public void print() throws IOException {
		// TODO Auto-generated method stub
		writer = new FileWriter ("result.out.txt"); 
		
		for(int i = 0 ; i < fichier.setFileTrie().size() ; i++){
		
			writer.write(fichier.setFileTrie().get(i)+"\n");
   		}
        writer.close();
	}
		
	@Override
	public void save() throws IOException {
		
		// TODO Auto-generated method stub
		for(int i = 0 ; i < fichier.setFileTrie().size() ; i++)
			System.out.print(fichier.setFileTrie().get(i) + "\n");
	}
	
}