package builder;


import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * <b>BuilderFile is the abstract class that allows you to build, display and save a file.</b>
 * <p>
 * Two concrete builders extends  BuilderFiles :
 * <ul>
 * <li>SimpleFiles.</li>
 * <li>OccurrenceFile.</li>
 * 
 *  
 * @see File
 * @see SimpleFile
 * @see OccurrenceFile
 * 
 * 
 * @author Matthieu
 * @version 2.0
 */
public abstract class  BuilderFiles {
	
	
	/**
	 * <b>Instance of the File  class<b>
	 * 
	 * @see File
	 * @see SimpleFile
	 * @see OccurrenceFile
	 */
	public File file;
	
	/**
	 * <b>Instance of the FileWriter  class<b>
	 * 
	 * 
	 * @see SimpleFile   ->  print()
	 * @see OccurrenceFile  ->  print()
	 */
	public FileWriter writer;
	
	/**
	 * <b>Instance of the Map class<b>
	 *
	 * @see OccurrenceFile  ->  print()
	 */
	public Map<String,Integer> map;
	
	/**
	 * <b>Instance of the Map class <b>
	 *
	 * @see OccurrenceFile  ->  save()
	 */
	public Map<String, Integer> sortedMap;
	
	
	
	/**
	 * <b>getFile()<b>
	 * 
	 * @return file
	 * 
	 * @see file
	 */
	public File getFile() {
		return file;
	};
    
    /**
     * <b>abstract void print() display a file according to the type of constructor used<b>
     * @throws IOException
     */
    public abstract void print() throws IOException;
    
    /**
     * <b>abstract void save() saves a file according to the type of constructor used<b>
     * @throws IOException
     */
    public abstract void save() throws IOException;

}