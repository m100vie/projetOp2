package builder;


import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * <b>fichierSimple est une class permettant de construire un Fichier et de l'afficher trie de AZ et de l'enregistrer.</b>
 * <p>
 * FichierSimple h�rite de FichierBuilder
 * </p>
 * 
 * @see Fichier
 * @see FichierBuilder 
 * 
 * @author Matthieu
 * @version 1.0
 */
public class FichierSimple extends FichierBuilder {
	
	/**
	 *  Constructeur de FichierSimple () : 
	 *
	 *  @see class Fichier 
	 *  @see upload()
	 */
	public FichierSimple () {
		fichier = new Fichier();
		fichier.upload();
	}
	
	
	/**
	 * print() affiche le fichier trie de AZ
	 *
	 */
	public void print() throws IOException {
		
		for(int i = 0 ; i < fichier.setFileTrie().size() ; i++)
			System.out.print(fichier.setFileTrie().get(i) + "\n");
		System.out.println();
		System.out.print("Total nombre de symptômes : "+fichier.setFileTrie().size());
	}
		
	
	/**
	 * save() enregistre le fichier dans "result.out.txt"
	 */
	public void save() throws IOException {
		
		writer = new FileWriter ("result.out.txt"); 
				
		for(int i = 0 ; i < fichier.setFileTrie().size() ; i++)
			writer.write(fichier.setFileTrie().get(i)+"\n");
			
		writer.write("Total nombre de symptômes : "+fichier.setFileTrie().size());
		writer.close();
	}
}