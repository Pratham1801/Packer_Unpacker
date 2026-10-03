import java.io.*;
import java.util.*;

class program590
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        int iRet = 0;
        byte Buffer[] = new byte[1024];

        String FolderName = null;
        String PackName = null;

        System.out.println("Enter the name of folder: ");
        FolderName = sobj.nextLine();
        
        System.out.println("Enter the name of packed file : ");
        PackName = sobj.nextLine();

        File fobj = new File(FolderName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            File packobj = new File(PackName);
            packobj.createNewFile();

            FileOutputStream foobj = new FileOutputStream(packobj);
            FileInputStream fiobj = null;

            System.out.println("Folder is present");

            File fArr[] = fobj.listFiles();

            System.out.println("Number of Files in folder are: "+fArr.length);

            for(int i = 0; i < fArr.length; i++)
            {
                fiobj = new FileInputStream(fArr[i]);

                System.out.println("File Name : "+fArr[i].getName()+" | File Size : "+fArr[i].length()+ " bytes");

                if(fArr[i].getName().endsWith(".txt"))
                {
                    while((iRet = fiobj.read(Buffer)) != -1)
                    {
                        foobj.write(Buffer, 0 ,iRet);
                    }
                }
                
                fiobj.close();
            }
            foobj.close();
        }
        else
        {
            System.out.println("There is no such Folder");
        }

        sobj.close();
    }
}

