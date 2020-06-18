package other;

import java.io.IOException;
import java.util.Scanner;

import builder.BuilderFiles;
import builder.Director;
import builder.File;
import builder.OccurrenceFile;
import builder.SimpleFile;

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
	public static void main(String args[])  {
		
		Scanner reader = new Scanner(System.in);
		BuilderFiles fichierBuilder;
		
		System.out.print("Do you want a simple file (1) or a file with occurrence (2) ? :");
		String choice = reader.next();
		
		if(choice.equals("1")) fichierBuilder = new SimpleFile();
		
		else fichierBuilder = new OccurrenceFile();
		
        Director directeur = new  Director(fichierBuilder); 

        try {
			directeur.buildfile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
      }
}
