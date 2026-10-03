import java.io.*;
import java.util.*;

class program577
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        int iRet = 0;

        byte Buffer[] = new byte[1024];
        File fobjsrc = null;
        File fobjdest = null;

        String FileNameSrc = null;
        String FileNameDest = null;

        System.out.println("Enter Source File Name : ");
        FileNameSrc = sobj.nextLine();

        System.out.println("Enter Destination File Name : ");
        FileNameDest = sobj.nextLine();

        fobjsrc = new File(FileNameSrc);

        if(fobjsrc.exists())
        {
            fobjdest = new File(FileNameDest);

            fobjdest.createNewFile();

            FileInputStream fiobj = new FileInputStream(fobjsrc);
            FileOutputStream foobj = new FileOutputStream(fobjdest);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                // System.out.print(str);
                foobj.write(Buffer, 0, iRet);
            }

            System.out.println("File Copied Successfully\n");

            fiobj.close();
            foobj.close();
        }
        else
        {
            System.out.println("There is no source file\n");
        }

        sobj.close();
    }
}

