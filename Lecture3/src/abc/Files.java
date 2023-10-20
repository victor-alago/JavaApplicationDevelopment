//package abc;
//import java.io.*;
//import java.util.*;
//
//public class Files {
//
//	public static void main(String[] args)throws IOException {
////		File fileObj = new File("C:\\Users\\alago\\OneDrive\\Desktop\\School\\L2\\Java Dev\\file.txt");
////		try {
////			if(fileObj.createNewFile()) {
////				System.out.println("NewFile Created");
////			}
////			else {
////				System.out.println("Already Exists");
////			}
////		}catch(FileNotFoundException ex) {
////			ex.printStackTrace();
////		}
//		// Method 1 - Writing into the file
//		FileWriter fileWriter = new FileWriter("C:\\Users\\alago\\OneDrive\\Desktop\\School\\L2\\Java Dev\\file1.txt");
//		fileWriter.append("Java Programming is easy lol");
//		fileWriter.close();
//		
//		
//		// Method 2 - Getting input from the user (dynamic method)
//		try {
//			File fileObj = new File("C:\\Users\\alago\\OneDrive\\Desktop\\School\\L2\\Java Dev\\file.txt");
//			System.out.println("Enter the file content:");
//			Scanner scanInput = new Scanner(System.in);
//			String data = "";
//			while(scanInput.hasNextLine()) {
//				data = scanInput.nextLine();
//				System.out.println("File Content: "+ data);
//			}
//			fileObj.write(data);
//			fileObj.close();
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
//		
//	}
//	
//
//}
