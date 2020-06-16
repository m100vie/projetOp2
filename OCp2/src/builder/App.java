package builder;

import java.util.Scanner;

/**
 * <b>Class application, contient main().</b>
 * 
 * @see main(String args[])
 * @see Fichier
 * @see FichierBuilder
 * @see FichierSimple
 * @see FichierCompose
 * @see Directeur
 * @author Matthieu
 * @version 1.0
 */
public class App {

	/**
	 * 
	 * @see    Fichier
	 * @see    FichierBuilder
	 * @see    FichierSimple
	 * @see    FichierCompose
	 * @see    Directeur
	 * @see    constructFichier()
	 * @see    getFichier()
	 * @param  args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {
		
		Scanner reader = new Scanner(System.in);
		FichierBuilder fichierBuilder;
		
		System.out.print("Voulez vous un fichier simple (1) ou un fichier avec occurrence (2) ? : ");
		String choix = reader.next();
		
		if(choix.equals("1")) fichierBuilder = new FichierSimple();
		
		else fichierBuilder = new FichierCompose();
		
        Directeur directeur = new  Directeur(fichierBuilder); 

        directeur.constructFichier(); 
     
     
     }

}
