package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(123));
        System.out.println(productOfDigits(44));
        int n=123;
        reverse(n);
        System.out.println(r);
        System.out.println(reverse2(1234));
        
    }
    
    //reversing a number
    static int r=0;
    static void reverse(int n){
        if(n==0){
            return;
        }
        int t=n%10;
        r=r*10+t;
        reverse(n/10);
    }

    static int reverse2(int n){
        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);

    }

    static int helper(int n,int digits){
        if(n%10==n){
            return n;
        }
        int r=n%10 ;
        return r * (int)(Math.pow(10,digits-1))+ helper(n/10,digits-1);
    }


    static int sumOfDigits(int num){
        if(num==0){
            return 0;
        }
        return sumOfDigits(num/10) + num%10;
    }

    static int productOfDigits(int num){
        if(num%10 == num){
            return num;
        }
        int r=num%10;
        return productOfDigits(num/10) * r;
    }
}
