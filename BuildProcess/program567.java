
import java.io.*;
import java.util.*;

class program567
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet = false;
        File fobj = null;
        FileReader frobj = null;
        String FileName = null;

        System.out.println("Enter File Name : ");
        FileName = sobj.nextLine();

        fobj = new File(FileName);
        if(fobj.exists())
        {
            frobj = new FileReader(FileName);

            char Buffer[] = new char[50];

            frobj.read(Buffer, 0, 14);

            System.out.println("Data from file: "+new String(Buffer));  // Error
        }
        else
        {
            System.out.println("There is no such file");
        }

        if(frobj != null)
        {
            frobj.close();
        }
        sobj.close();
    }
}

