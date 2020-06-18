package builder;


import java.io.FileWriter;
import java.io.IOException;

/**
 * <b>SimpleFile is a class allowing to build a File and to display it sorted by AZ and to save it.</b>
 * <p>
 * SimpleFile extends to FBuilderFiles
 * </p>
 * 
 * @see File
 * @see BuilderFiles 
 * 
 * @author Matthieu
 * @version 2.0
 */
public class SimpleFile extends BuilderFiles {
	
	/**
	 *  constructor of SimpleFile 
	 *
	 *  @see class Fichier 
	 *  @see upload()
	 */
	public SimpleFile () {
		file = new File();
		file.upload();
	}
	
	
	/**
	 * print () displays the sorted file of AZ
	 *
	 */
	public void print()  {
		
		for(int i = 0 ; i < file.setFileTrie().size() ; i++)
			System.out.print(file.setFileTrie().get(i) + "\n");
		System.out.println();
		System.out.print("Total number of symptoms : "+file.setFileTrie().size());
	}
		
	
	/**
	 * save() save file in "result.out.txt"
	 */
	public void save()  {
		
		try {
			writer = new FileWriter ("result.out.txt");
		
				
		for(int i = 0 ; i < file.setFileTrie().size() ; i++)
			writer.write(file.setFileTrie().get(i)+"\n");
			
		writer.write("Total number of symptoms : "+file.setFileTrie().size());
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally{
		try {
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}