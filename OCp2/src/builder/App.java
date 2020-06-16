package builder;


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
	
	 FichierBuilder fichierSimple = new FichierCompose(); 
     Directeur directeur = new  Directeur(fichierSimple); 

     directeur.constructFichier(); 
     
     Fichier fichier = directeur.getFichier();
     }

}
