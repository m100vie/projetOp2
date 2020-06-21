package builder;

import java.io.IOException;

/**
 * <b>Director is the class used to control the construction phase of a File
 * through FileBuilder.</b>
 * 
 * 
 * @see File
 * @see BuilderFiles
 * 
 * @author Matthieu
 * @version 2.0
 */
public class Director {

	private BuilderFiles builderfiles;

	/**
	 * constructor Director(), initialize fichierBuilder
	 * 
	 * @param builderfilesr
	 * @see class Director
	 * @see builderfiles
	 */
	public Director(BuilderFiles builderfiles) {
		this.builderfiles = builderfiles;
	}

	/**
	 * <b>getFichier()<b>
	 * 
	 * @return file
	 * @see BuilderFiles
	 * @see getFile()
	 */
	public File getFichier() {
		return this.builderfiles.getFile();
	}

	/**
	 * <b>buildfile()<b>
	 * 
	 * @throws IOException
	 * @see builderfiles
	 * @see BuilderFiles
	 * @see print()
	 * @see save()
	 */
	public void buildfile() throws IOException {
		this.builderfiles.print();
		this.builderfiles.save();
	}
}