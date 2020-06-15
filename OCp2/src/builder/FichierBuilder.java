package builder;


import java.util.*;

/**
 * 
 */
public interface  FichierBuilder {
	
	
    /**
     * Default constructor
     */
  

    /**
     * @param file 
     * 
     */
    public abstract void afficher();

    /**
     * 
     */
    public abstract void enregister();
    
    public abstract Fichier getFichier();
    
    public abstract void buildContenu();

	

}