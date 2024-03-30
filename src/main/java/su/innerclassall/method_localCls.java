
package su.innerclassall;

class outer{
    void show()
    {
        int num = 3012;
        
        class inner{
           void print()
           {
               System.out.println("My Id is " + num);
           }
        }
        
        inner in = new inner();
        in.print();
    }
}

public class method_localCls {
    public static void main(String[] args) {
        outer out = new outer();
        out.show();    
    }
}
