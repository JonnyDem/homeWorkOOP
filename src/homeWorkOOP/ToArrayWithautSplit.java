package homeWorkOOP;

import java.util.Arrays;

/**
 * Created by Ваня on 12.08.2017.
 * Тема: Повторение(строки)
 *   Задача 9: Написать метод String[] MySplit, который принимает две строки и возвращщает массив строк
 *      (не используя split).
 */
public class ToArrayWithautSplit {

    public String[] mySplit(String a,String b){
        String c=a+' '+b+' ';
        String result="";
        String[]resultArray=new String [c.length()];
        int count=0;
        for (int i = 0; i <c.length() ; i++) {
            if(c.charAt(i)!=' '){
                result+=c.charAt(i);

            }else{
                resultArray[count]=result;
                count++;
                result="";
            }
        }
        count=0;
        for (int i = 0; i <resultArray.length ; i++) {
            if(resultArray[i]!=null){
                count++;
            }
        }
        String mas[]=new String[count];
        count=0;
        for (int i = 0; i <mas.length ; i++) {
            if(resultArray[i]!=null){
                mas[i]=resultArray[i];
            }
            if(mas[i]!=""){
                count++;
            }
        }
        final int numberOfWords=count;
        String []targetedArray=new String[count];
        count=0;
        for (int i = 0; i <mas.length ; i++) {
            if(mas[i]!=""){
                targetedArray[count]=mas[i];
                count++;
            }
        }
        System.out.println("Слов в массиве: "+numberOfWords+" "+Arrays.toString(targetedArray));
        return targetedArray;
    }

    public static void main(String[] args) {

        new ToArrayWithautSplit().mySplit(" ","dfre asdfsaf            asdfasfdasf  adfg                                         ");
    }
}
