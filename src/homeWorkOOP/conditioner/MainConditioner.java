package homeWorkOOP.conditioner;
/*
Тема : Делегирование
Задача 3: (стр 45-46)
 */

import java.util.Scanner;

public class MainConditioner {
   static String [] menuList={"1.Show condition of all conditioners","2.Turn on conditioner(index)","3.Turn off conditioner(index)","4.Set temperature to conditioner(index)","5.Exit"};

    public static void main(String[] args) {
        BlockConditioners blockConditioners = new BlockConditioners();
        boolean runWhile = true;
        Scanner scan = new Scanner(System.in);
        while(runWhile) {
            System.out.println("Select operation");
            for(String s:menuList){
                System.out.println(s);
            }
            int operation = scan.nextInt();
            switch (operation){
                case 1:
                    int count=0;
                    for (BlockConditioners.Conditioner c:BlockConditioners.conditioners) {
                        System.out.print("Conditioner "+count+": is turned on: "+ c.isTurnOn()+", ");
                        System.out.print("Is opened(turned): "+c.isGetTurn()+", ");
                        System.out.println("temperature: "+c.getTemperature()+", ");
                        count++;
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Select conditioner you want to turn on.");
                    int condTurnOn = scan.nextInt();
                    BlockConditioners.conditioners.get(condTurnOn).turnOn();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Select conditioner you want to turn off.");
                    int condTurnOff = scan.nextInt();
                    BlockConditioners.conditioners.get(condTurnOff).turnOf();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Select conditioner you want to set the temperature.");
                    int condSetTemperature = scan.nextInt();
                    BlockConditioners.conditioners.get(condSetTemperature).setTemperature();
                    System.out.println();
                    break;
                case 5:
                    runWhile = false;
                    break;
               default:
                   System.out.println("Select from 1 to 5");
                   System.out.println();
                   break;
            }
        }
    }
}
