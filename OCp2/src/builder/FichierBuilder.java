package builder;


import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * 
 */
public abstract class  FichierBuilder {
	
	public Fichier fichier;
	public FileWriter writer;
	
	
	
	public Fichier getFichier() {
		return fichier;
	};
    
    public abstract void print() throws IOException;
    
    public abstract void save() throws IOException;

}