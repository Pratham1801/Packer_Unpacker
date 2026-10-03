
import java.io.*;
import java.util.*;

class program571
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
            FileInputStream fiobj = new FileInputStream(fobj);

            byte Arr[] = new byte[50];

            fiobj.read(Arr); 

            System.out.println(Arr);    
        }
        else
        {
            System.out.println("There is no such file");
        }

        sobj.close();
    }
}

