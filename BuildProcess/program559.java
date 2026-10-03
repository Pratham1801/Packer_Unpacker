
import java.io.*;
import java.util.*;

class program559
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

        bRet = fobj.exists();

        if(bRet == true)
        {
            System.out.println("File is present");
        }
        else
        {
            System.out.println("File dosen't exist let's create one");

            bRet = fobj.createNewFile();

            if(bRet == true)
            {
                System.out.println("File gets created successfully");
            }
            else
            {
                System.out.println("Unable to create file");
            }
        }

       

        sobj.close();
    }
}