package builder;

public class App {

	public static void main(String args[]) throws Exception {
	

		
	 FichierBuilder fichierSimple = new FichierCompose(); 
     Directeur directeur = new  Directeur(fichierSimple); 

     directeur.constructFichier(); 
     
     Fichier fichier = directeur.getFichier();
     

     }

}
