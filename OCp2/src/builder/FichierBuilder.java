package builder;


import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * <b>FichierBuilde est la classe abstraite qui permet de construire d'afficher et d'enregistrer un fichier.</b>
 * <p>
 * Deux constructeurs concrets hérite de FichierBuilde :
 * <ul>
 * <li>Fichier Simple.</li>
 * <li>FichierCompose.</li>
 * 
 *  
 * @see Fichier
 * @see FichierSimple
 * @see FichierCompose
 * 
 * 
 * @author Matthieu
 * @version 1.0
 */
public abstract class  FichierBuilder {
	
	
	/**
	 * <b>Instance de la class Fichier<b>
	 * 
	 * @see Fichier
	 * @see FichierSimple
	 * @see FichierCompose
	 */
	public Fichier fichier;
	
	/**
	 * <b>Instance de la class FileWriter<b>
	 * 
	 * 
	 * @see FichierSimple   ->  print()
	 * @see FichierCompose  ->  print()
	 */
	public FileWriter writer;
	
	/**
	 * <b>Instance de la class Map<b>
	 *
	 * @see FichierCompose  ->  print()
	 */
	public Map<String,Integer> map;
	
	/**
	 * <b>Instance de la class Map<b>
	 *
	 * @see FichierCompose  ->  save()
	 */
	public Map<String, Integer> sortedMap;
	
	
	
	/**
	 * <b>getFichier()<b>
	 * 
	 * @return fichier
	 * 
	 * @see fichier
	 */
	public Fichier getFichier() {
		return fichier;
	};
    
    /**
     * <b>abstract void print() affiche un fichier selon le type de constructeur utilisé<b>
     * @throws IOException
     */
    public abstract void print() throws IOException;
    
    /**
     * <b>abstract void save() enregistre un fichier selon le type de constructeur utilisé<b>
     * @throws IOException
     */
    public abstract void save() throws IOException;

}