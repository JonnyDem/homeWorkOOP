package homeWorkOOP.TestFiles;
/*
Тема: Поговорим о файлах
Задача 1:
Запросить с консоли путь папки и расширение. Вывести на экран все файлы с расширением из этой папки.
 */

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        showFiles();
    }

    private static void showFiles() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter path to file.(example: c:/User/...)");
        String path=scan.nextLine();
        File file=new File(path);
        File[]files=file.listFiles();
       // System.out.println(Arrays.toString(files));
        System.out.println("Enter extend of file(txt,doc...)");
        String extend=scan.nextLine();
        scan.close();
        for (int i = 0; i <files.length ; i++) {
            if(files[i].getName().endsWith(extend)){
                System.out.println(files[i]);
            }
        }
    }
}
