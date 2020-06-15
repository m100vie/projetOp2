package builder;


import java.util.*;

/**
 * 
 */
public class Directeur {
	
	 private FichierBuilder fichierBuilder; 
	  
	    public Directeur(FichierBuilder fichierBuilder) 
	    { 
	        this.fichierBuilder = fichierBuilder; 
	    } 
	  
	    public Fichier getFichier() 
	    { 
	        return this.fichierBuilder.getFichier(); 
	    } 
	  
	    public void constructFichier() 
	    { 
	        this.fichierBuilder.buildContenu();
	    } 

}