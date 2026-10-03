
import java.io.*;
import java.util.*;

class program568
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet = false;
        File fobj = null;
        String FileName = null;

        System.out.println("Enter File Name : ");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists())
        {
            System.out.println("File Name : "+fobj.getName());
            System.out.println("File Path : "+fobj.getAbsolutePath());
            System.out.println("File Size : "+fobj.length());   
        }
        else
        {
            System.out.println("There is no such file");
        }

        sobj.close();
    }
}

