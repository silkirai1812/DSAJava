package OOPs.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println();
        System.out.println("hello");
        try{
            // int result = 5/0;
            System.out.println(a[8]);
        }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("tried to access the out of bound element");
        // }
        // catch(ArithmeticException e){
        //     System.out.println("divide by 0 not possible");
        //     System.out.println(e.getStackTrace());
        //     System.out.println(e.getMessage());
        //     System.out.println(e);
        // }

        // catch(ArrayIndexOutOfBoundsException | NullPointerException | ArithmeticException e){
        //     System.out.println("handling the exception");
        // }

        catch(Exception e){
            System.out.println("all exceptions handled");
        }

        System.out.println("bye");
    }
}
