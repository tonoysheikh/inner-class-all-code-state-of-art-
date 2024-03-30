package su.innerclassall;

class outerdemu{
    private int num = 3012;
    
    public class inner{
        public int result()
        {
            System.out.print("My private id is ");
            return num;
        }
    }
}

public class privateattibute {
    public static void main(String[] args) {
        outerdemu out = new outerdemu();
        outerdemu.inner in = out.new inner();
        System.out.println(in.result());
    }
}
