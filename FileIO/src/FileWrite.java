import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		File myFile = new File("fileWriteTest.txt");
		if(!myFile.exists()) {
			myFile.createNewFile();
		}

	
		PrintWriter printer = new PrintWriter(new FileOutputStream(myFile.getName(), false));
		
		printer.println("The moon is not full today.");
		printer.println("The moon is not full today.");
		if(printer.checkError()) {
			System.out.println("There were errors when writing");
		}
//		PrintWriter printer = new PrintWriter(myFile.getName());
	/*	try {
		numCharsWritten();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}*/
		printer.close();
	}
	
	/*public static int numCharsWritten() {
		
	}*/

}
