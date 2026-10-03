
import java.io.*;
import java.util.*;

class program563
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet = false;
        File fobj = null;
        String FileName = null;

        System.out.println("Enter File Name : ");
        FileName = sobj.nextLine();

        FileReader frobj = new FileReader(FileName);

        frobj.close();
        sobj.close();
    }
}

