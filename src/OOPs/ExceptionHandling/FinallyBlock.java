package OOPs.ExceptionHandling;

public class FinallyBlock {
    public static void main(String[] args) {
        int a[]=new int[5];
        System.out.println("hello");
        try{
            System.out.println(a[8]);
        }
        catch(Exception e){
            System.out.println("Handling all exceptions");
        }
        finally{
            System.out.println("I will always run");
        }
        System.out.println("bye");
    }
    
}
