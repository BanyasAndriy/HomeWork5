package HomeWork4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		File oldCatalog = new File("C:\\Users\\User\\Desktop\\java course\\Java OOP\\Catalog");
        File newCatalog = new File("C:\\Users\\User\\Desktop\\java course\\Java OOP\\newCatalog");
		MyFileFilter filter = new MyFileFilter("txt");


		if( !(oldCatalog.exists())) {
		System.out.println("Такої папки не існує");
		}
	
		if( !(newCatalog.exists())) {
			System.out.println("Такої папки не існує");
			}

		
	    File[] listOfFiles = oldCatalog.listFiles(filter);

	    Path newDirect = Paths.get(newCatalog.getAbsolutePath());
	    
	    if(listOfFiles!=null) {
	    for (File file : listOfFiles) {
			Files.copy( newCatalog.toPath(), newDirect.resolve(file.getName()));
		}
	    }
	   
		
	}

}
