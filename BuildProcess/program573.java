import java.io.*;
import java.util.*;

class program573
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        int iRet = 0;
        byte Arr[] = new byte[100];
        File fobj = null;
        String FileName = null;

        System.out.println("Enter File Name : ");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists())
        {
            FileInputStream fiobj = new FileInputStream(fobj);

            iRet = fiobj.read(Arr); 

            String str = new String(Arr);

            System.out.println("iRet = "+ iRet);

            System.out.println(str);
        }
        else
        {
            System.out.println("There is no such file");
        }

        sobj.close();
    }
}

