import java.nio.file.*;
import java.io.*;
public class FileOperations {
	public static void main(String args[]){
		Path sourcePath = Paths.get("C:\\users\\pakal\\Desktop\\1");
		Path DestinationPath=Paths.get("C:\\users\\pakal\\Desktop\\java files\\2");
	try{
		Files.createDirectory(DestinationPath);
		Files.copy(sourcePath, DestinationPath);
	}
	catch(FileAlreadyExistsException f){
		
	}
	catch(IOException e){
		
	}
		
	}
}
