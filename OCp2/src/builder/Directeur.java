package builder;


import java.io.IOException;
import java.util.*;

/**
 * 
 */
public class Directeur {
	
	 private FichierBuilder fichierBuilder; 
	  
	    public Directeur(FichierBuilder fichierBuilder) { 
	        this.fichierBuilder = fichierBuilder; 
	    } 
	  
	    public Fichier getFichier() { 
	        return this.fichierBuilder.getFichier(); 
	    } 
	  
	    public void constructFichier() throws IOException { 
	        this.fichierBuilder.save();
	        this.fichierBuilder.print ();
	    } 

}