package OOPs.ExceptionHandling;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String str){
        super(str);
    }
}

public class CustomExceptions {
    
    static void validate(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age is not valid");
        }
        else{
            System.out.println("eligible to vote");
        }
    }
    public static void main(String[] args) {
        try{
            validate(13);
        }
        catch(InvalidAgeException ex){
            System.out.println("Exception caught");
            System.out.println(ex);
        }
    }
    
}
