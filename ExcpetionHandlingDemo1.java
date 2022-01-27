package General.Jan_11;

public class ExcpetionHandlingDemo1 {
    public static void main(String[] args) {
        try{
            int data = 100/0;
        }
        catch (ArithmeticException ae){
            ae.getMessage();
        }
        System.out.println("Exception handling demo");
    }
}
