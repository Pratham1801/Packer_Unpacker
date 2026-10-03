// UNPACKING CODE
import java.io.*;
import java.util.*;

class program607
{
    public static void main(String A[]) throws Exception
    {
        // Variable Creation
        Scanner sobj = null;
        String FileName = null;
        File fpackobj = null;
        FileInputStream fiobj = null;
        String Header = null;
        String Tokens[] = null;

        byte bHeader[] = new byte[100]; 

        sobj = new Scanner(System.in);

        System.out.println("Enter the name of Packed file: ");
        FileName = sobj.nextLine();

        fpackobj = new File(FileName);

        if(fpackobj.exists() == false)
        {
            System.out.println("Error : There is no such packed file");
            return;
        }

        fiobj = new FileInputStream(fpackobj);

        // read the header
        fiobj.read(bHeader, 0, 100);

        Header = new String(bHeader);

        Header = Header.trim();

        Tokens = Header.split(" ");

        System.out.println("File Name : "+ Tokens[0]);
        System.out.println("File Size : "+ Tokens[1]);

        sobj.close();
    }
}