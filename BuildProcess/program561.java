
import java.io.*;
import java.util.*;

class program561
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet = false;
        File fobj = null;
        String FileName = null;

        System.out.println("Enter File Name : ");
        FileName = sobj.nextLine();

        FileWriter fwobj = new FileWriter(FileName);
        

        sobj.close();
    }
}