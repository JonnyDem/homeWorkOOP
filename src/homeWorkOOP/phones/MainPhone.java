package homeWorkOOP.phones;

import java.util.*;

/**
 * Created by Ваня on 30.08.2017.
 */
public class MainPhone {

   static List<Phone> list=new ArrayList<>();

    public static void main(String[] args) {

        list.add(new Nokia("11111",false,7));
        list.add(new Samsung("11122",true,3));
        list.add(new IPhone4("22222",true,5,12));
        list.add(new IPhone5("22211",true,2,18));
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter index of phone you want to call from");
        int index1=scan.nextInt();
        System.out.println("Enter index of phone you want to call to");
        int index2=scan.nextInt();
        list.get(index1).call(list.get(index2));

        printAllModel();
        printAllAppleId();

    }
  public static void printAllModel(){
      Iterator<Phone>iterator=list.iterator();
      while (iterator.hasNext()) {
          Phone ph=iterator.next();
          System.out.println(ph.printModel());
      }
  }
  public static void printAllAppleId(){
      for(Object o:list){
              if(o instanceof IPhone){
                  ((IPhone) o).printAppleId();
              }
          }

  }
}
