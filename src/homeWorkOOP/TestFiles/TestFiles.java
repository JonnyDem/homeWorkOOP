package homeWorkOOP.TestFiles;
/*
    Черновик.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class TestFiles {
    public static void main(String[] args)throws IOException {
        File obj=new File("c:/Users/Ольга/Desktop/Vanya/file1/file2/file3/file4");
        boolean b1=obj.exists();
        System.out.println("exist: "+b1);
        b1=obj.isFile();
        System.out.println("File: "+b1);
        b1=obj.isDirectory();
        System.out.println("Directory: "+b1);
        File[]files=obj.listFiles();

       // System.out.println(Arrays.toString(files));
      //  System.out.println(obj.getCanonicalPath());
      //  System.out.println(obj.separatorChar);
       // obj.createNewFile();
       // obj.mkdirs();


        //FileWriter fw=new FileWriter("c:/Users/Ольга/Desktop/Vanya/directory.txt");
        //fw.write("Hello");
        //fw.close();
    }
}
