package Recursion;

public class Pallindrome {
    public static void main(String[] args) {
        palindrome(23);
        palindrome(121);  
        String str="abab";
        System.out.println(palin2(str,0,str.length()-1)); 
    }

    //2nd way
    static boolean palin2(String str,int s,int e){
        if(s==e){
            return true;
        }
        if(s>e){
            return false;
        }
        return palin2(str,s+1,e-1);

    }
    
    static void palindrome(int n){
        int digits=(int)(Math.log10(n))+1;
        int r = helper(n,digits);
        if(n==r){
            System.out.println(n+ " is pallindrome");
        }
        else{
            System.out.println(n+ " is not pallindrome");
        }
    }

    static int helper(int n,int digits){
        if(n==0){
            return 0;
        }
        int res=n%10 *(int)(Math.pow(10,digits-1));
        return res+helper(n/10,digits-1);
    }
}
