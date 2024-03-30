
package su.innerclassall;


class out{
    private class print{
        void fn()
        {
            System.out.println("Please print me,baby");
        }
    }
    void ck()
    {
        print pn = new print(); 
        pn.fn();
    }
}
public class in_01 {
    public static void main(String[] args) {
        out ot = new out();
        ot.ck();
    }
}
