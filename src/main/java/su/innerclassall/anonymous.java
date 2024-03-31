
package su.innerclassall;

import java.util.Scanner;

abstract class anonymousCls{
    public abstract void myfun();
}
public class anonymous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        anonymousCls an = new anonymousCls(){
           public void myfun()
           {
               System.out.print("Enter your number :");
               String num = sc.next();
               int sum = 0;
               for (int i = 0; i < num.length(); i++) {
                   char c = num.charAt(i);
                   int digit = Character.getNumericValue(c);
                   sum += digit;

               }
               System.out.println("Here digit sum = "+sum);
           }
        };
        an.myfun();
    }
}
