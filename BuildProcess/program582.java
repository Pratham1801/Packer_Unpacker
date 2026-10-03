import java.io.*;
import java.util.*;

class program582
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String FolderName = null;

        System.out.println("Enter the name of folder: ");
        FolderName = sobj.nextLine();
        
        File fobj = new File(FolderName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            System.out.println("Folder is present");

            File fArr[] = fobj.listFiles();

            System.out.println("Number of Files in folder are: "+fArr.length);
        }
        else
        {
            System.out.println("There is no such Folder");
        }

        sobj.close();
    }
}

