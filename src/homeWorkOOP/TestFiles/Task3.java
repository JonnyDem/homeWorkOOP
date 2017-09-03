package homeWorkOOP.TestFiles;
/*
Тема: Поговорим о файлах
Задача 3: Описание на странице 55;
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {

    private static ArrayList<String> list = new ArrayList();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter directory ");
        String directory = scan.nextLine();

        try {
            addContent(directory);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            scan.close();
        }
    }

    private static void addContent(String path)throws IOException {
        File file = new File(path);
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory()) {
                    list.add(files[i].getCanonicalPath());
                   addContent(files[i].getCanonicalPath());
                } else if(files[i].isFile()){
                    list.add(files[i].getName());
                }
        }
        FileWriter fw = new FileWriter(path + "/" + "directory.txt", true);
        for (int i = 0; i <list.size() ; i++) {
            fw.write(list.get(i)+"\n");
        }
        fw.close();
    }
}


