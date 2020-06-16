package builder;


import java.io.IOException;
import java.util.*;

/**
 * <b>Directeur est la class permettant de contrôler la phase de construction d'un Fichier par l'intermédiaire de FichierBuilder.</b>
 * 
 * 
 * @see Fichier
 * @see FichierBuilder 
 * 
 * @author Matthieu
 * @version 1.0
 */
public class Directeur {
	
	 private FichierBuilder fichierBuilder; 
	  
	    /**
	     * Constructeur  Directeur(), initialise fichierBuilder
	     * @param fichierBuilder
	     * @see class Directeur
	     * @see fichierBuilder
	     */
	    public Directeur(FichierBuilder fichierBuilder) { 
	        this.fichierBuilder = fichierBuilder; 
	    } 
	    
	    
	    /**
	     * <b>getFichier()<b>
	     * @return fichier
	     * @see FichierBuilder
	     * @see getFichier()
	     */
	    public Fichier getFichier() { 
	        return this.fichierBuilder.getFichier(); 
	    } 
	  
	    
	    /**
	     * <b>constructFichier()<b>
	     * @throws IOException
	     * @see fichierBuilder
	     * @see FichierBuilder
	     * @see print()
	     * @see save()
	     */
	    public void constructFichier() throws IOException { 
	    	this.fichierBuilder.print ();
	    	this.fichierBuilder.save();
	    } 
}