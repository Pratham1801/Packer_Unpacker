import java.io.*;
import java.util.*;

class program574
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        int iRet = 0;
        byte Buffer[] = new byte[100];
        File fobj = null;
        String FileName = null;

        System.out.println("Enter File Name : ");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists())
        {
            FileInputStream fiobj = new FileInputStream(fobj);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                System.out.print(new String(Buffer));
            }

            System.out.println();
        }
        else
        {
            System.out.println("There is no such file");
        }

        sobj.close();
    }
}

