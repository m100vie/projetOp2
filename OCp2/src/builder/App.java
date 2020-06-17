package builder;

import java.util.Scanner;

/**
 * <b>Class application, contains main ().</b>
 * 
 * @see main(String args[])
 * @see File
 * @see BuilderFiles
 * @see SimpleFile
 * @see OccurrenceFile
 * @see Director
 * @author Matthieu
 * @version 2.0
 */
public class App {

	/**
	 * 
	 * @see    File
	 * @see    BuilderFiles
	 * @see    SimpleFile
	 * @see    OccurrenceFile
	 * @see    Director
	 * @see    constructFichier()
	 * @see    getFichier()
	 * @param  args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {
		
		Scanner reader = new Scanner(System.in);
		BuilderFiles fichierBuilder;
		
		System.out.print("Do you want a simple file (1) or a file with occurrence (2) ? :");
		String choice = reader.next();
		
		if(choice.equals("1")) fichierBuilder = new SimpleFile();
		
		else fichierBuilder = new OccurrenceFile();
		
        Director directeur = new  Director(fichierBuilder); 

        directeur.buildfile(); 
     
     
     }

}
