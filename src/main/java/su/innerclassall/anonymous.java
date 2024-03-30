
package su.innerclassall;

abstract class anonymousCls{
    public abstract void myfun();
}
public class anonymous {
    public static void main(String[] args) {
        anonymousCls an = new anonymousCls(){
           public void myfun()
           {
               System.out.println("Hi,Print me.");
           }
        };
        an.myfun();
    }
}
