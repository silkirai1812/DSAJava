package Recursion;
import java.lang.Math;
public class Fibonacci{
    public static void main(String[] args) {
        int ans=fibo(5);
        System.out.println(ans);
        for(int i=0;i<=10;i++){
           System.out.println(fiboFormula(i )); 
        }
        System.out.println(fiboFormula(50)); 
        
    }
    
    static long fiboFormula(int n){
        long a=(long)((Math.pow( ( ( 1 + Math.sqrt(5))/2 ) , n))/(Math.sqrt(5)));
        return a;

        // int a=(int)((Math.pow( ( ( 1 + Math.sqrt(5))/2 ) , n))/(Math.sqrt(5)));
        // return a;
    }

    static int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        return fibo(n-1)+fibo(n-2);
    }
    
}
