package builder;


import java.util.*;

/**
 * 
 */
public abstract class FichierBuilder {
	
	protected Fichier fichier;

    /**
     * Default constructor
     */
    public  FichierBuilder() {
    	fichier = new Fichier();
 
    }

    /**
     * 
     */
    protected abstract void afficher();

    /**
     * 
     */
    protected abstract void enregister();

}