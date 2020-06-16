package builder;


import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * <b>fichierCompose est une class permettant de construire un Fichier, de l'afficher trie de AZ et de compter les occurences,et de l'enregistrer.</b>
 * <p>
 * FichierSimple hérite de FichierBuilder
 * </p>
 * 
 * @see Fichier
 * @see FichierBuilder 
 * 
 * @author Matthieu
 * @version 1.0
 */
public class FichierCompose extends FichierBuilder {
	
	
	/**
	 *  Constructeur de FichierCompose () : 
	 *
	 *  @see class Fichier 
	 *  @see upload()
	 */
	public FichierCompose() {
		fichier = new Fichier();
		fichier.upload();
	}
	
	
	/**
	 * print() affiche le fichier trie de AZ et compte le nb d'occurence
	 *
	 */
	public void print() throws IOException {
		
		map = new HashMap<String,Integer>();
		
		for(int i = 0 ; i < fichier.setFileTrie().size() ; i++)	{
			
			 if(map.containsKey(fichier.setFileTrie().get(i)))	{  
				 map.replace(fichier.setFileTrie().get(i),map.get(fichier.setFileTrie().get(i))+1);
			 }
			 else	{ 
				 map.put(fichier.setFileTrie().get(i),1);
			 }
		}	
	}

	
	/**
	 * save() enregistre le fichier dans "result.out.txt"
	 */
	public void save() throws IOException {
		// TODO Auto-generated method stub
        writer = new FileWriter ("result.out.txt");  
		sortedMap = new TreeMap<String, Integer>(map);
        Set set2 = sortedMap.entrySet();
        Iterator iterator2 = set2.iterator();
        
        while(iterator2.hasNext()) {
           Map.Entry me2 = (Map.Entry)iterator2.next();

           System.out.print(me2.getKey() + ": ");
           System.out.println(me2.getValue());
           
        writer.write(me2.getKey() + " : "+me2.getValue()+"\n");
   		}
        writer.close();
	}
}

    