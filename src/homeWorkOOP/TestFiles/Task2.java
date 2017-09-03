package homeWorkOOP.TestFiles;
/*
Тема: Поговорим о файлах
Задача 2: Запросить с консоли путь на папку с консоли, получить список всех папок заданной папки с учетом иерархии.

 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args)throws IOException  {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter directory(example: c/user...");
        String directory = scan.nextLine();
        showAllDirectories(directory);
        scan.close();
    }

    private static void showAllDirectories(String path) throws IOException {
        File file = new File(path);
        File files[] = file.listFiles();
        System.out.println(file);
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                showAllDirectories(files[i].getCanonicalPath());
            }
        }
    }
}
