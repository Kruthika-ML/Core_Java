package General.Jan_11;

public class ExcpetionHandlingDemo2 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        try {
            arr[4] = 34;
            System.out.println("In try block");
        }
        catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("Exception");
        }
        finally {
            System.out.println("Finally block");
        }
    }
}
