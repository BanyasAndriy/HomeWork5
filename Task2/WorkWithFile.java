package HomeWork4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WorkWithFiles {

	
	public char[] getTextFromFile(File file){
	
		char textOfFile[]= new char[(int) file.length()];
		try(FileReader reader = new FileReader(file)) {
			int i;
			int l=0;
			
			while((i=reader.read())>0) {
			
				textOfFile[l]=(char)i;
				l++;
			}	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	
		return textOfFile;
	
	}
	
	public File writeDatatoFileFrom2Files(char[] first , char[]second,File file) {
		
		try(FileWriter writter = new FileWriter(file)) {
		
				writter.write(first);
			writter.write("\n");
			writter.write(second);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return file;
		
	}
}
