import java.io.*;
import java.util.Scanner;

public class CopyingFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the file name (avoid space): ");
        File file = new File(scan.nextLine());
        do {
            try {
                //creates a buffer reader input stream 
                FileInputStream fis = new FileInputStream(file);
                System.out.println("file content: ");  
                int r = 0;  
                while((r = fis.read())!=-1)  
                {  
                    System.out.print((char)r); //prints the content of the file  
                }
                scan.close();
                break;
            } catch (Exception e) {
                System.out.println("Enter the valid name of file: ");
                file = new File(scan.nextLine());
            }
        } while (true);
    }
}