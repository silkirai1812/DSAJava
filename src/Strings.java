import java.util.ArrayList;

public class Strings {
    public static void main(String[] args) {
        System.out.println("a"+1);
        System.out.println("hello "+ new ArrayList<>());

        System.out.println('a'-'b');
        //the operator + in java is only defined for primitives and when any one of the value is string(atleast one 
        //of the object should be string)
        System.out.println(ispallindromeString("aba"));
    }

    static boolean ispallindromeString(String str){
        str=str.toLowerCase();
        int l=str.length();
        int c=0;
        for(int i=0;i<=l/2;i++){
            // if(str.charAt(i)!=str.charAt(l-i));{
            //     return false;
                
            // }
            if(str.charAt(i)==str.charAt(l-i-1)){
                c++;
            }
        }
        if(c==l/2 +1){
            return true;
        }
        return false;

        
    //     int s=0;
    //     int e=l-1;
    //     while(s<e){
    //         if(str.charAt(s)==str.charAt(e)){
    //             s++;
    //             e--;
    //         }
    //         else{
    //             return false;
    //         }
    //     }
    //     return true;
     }
    
}
