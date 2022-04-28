import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) throws FileNotFoundException {

		File readFile = null;
		Scanner input = null;

		try {
			readFile = new File("SampleInput");
			input = new Scanner(readFile);
			while (input.hasNextLine()) {
				String line = input.nextLine();
				System.out.println(line);
				
				String[] numStr = line.split(",");
				int[] nums = new int[numStr.length];
				for(int i = 0; i < numStr.length; i++) {
					nums[i] = Integer.parseInt(numStr[i]);
				}
				
			}
		} catch (NullPointerException e) {
			System.out.println("Something went wrong");
			System.out.println(e.getMessage());
			System.exit(-1);
		} catch (Exception e) {
			System.out.println("Wrong");
			System.out.println(e.getMessage());
			e.printStackTrace();
	//		e.printStackTrace();
	//		System.exit(-1);
		}
		finally {
			if (input != null) {
		//		input.close();
			}
		}

		input.close();
	}

}
