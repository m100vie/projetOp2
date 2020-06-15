package builder;


import java.util.*;

/**
 * 
 */
public class FichierSimple implements FichierBuilder {
	
	private Fichier fichier;

    /**
     * Default constructor
     */
	public FichierSimple () {
		this.fichier = new Fichier();
	
	}
	
	public void buildContenu() {
		fichier.setContenu("ça marche !");
	}
	
   

    /**
     * 
     */
//    public void afficher() {
//    	// TODO implement here
//    	fichier.upload();
//    	Collections. sort(fichier.getFile());
//    	}
   

    /**
     * 
     */
    public void enregister() {
        // TODO implement here
    }



	@Override
	public Fichier getFichier() {
		// TODO Auto-generated method stub
		return this.fichier;
	}

	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		
	}

	

}