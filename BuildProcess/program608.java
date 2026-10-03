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

        System.out.println("Header : "+Header);

        sobj.close();
    }
}