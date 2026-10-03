import java.io.*;
import java.util.*;

class program580
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String FolderName = null;

        System.out.println("Enter the name of folder: ");
        FolderName = sobj.nextLine();
        
        File fobj = new File(FolderName);

        if(fobj.exists())
        {
            System.out.println("Folder is present");
        }
        else
        {
            System.out.println("There is no such Folder");
        }

        sobj.close();
    }
}

