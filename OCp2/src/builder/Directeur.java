package builder;


import java.util.*;

/**
 * 
 */
public class Directeur {
	
	protected FichierBuilder fichier ;

    /**
     * Default constructor
     */
   
    
    public void construit (FichierBuilder fichier) {
    	this.fichier = fichier;
    }

}