package Recursion;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(count(12030900));
        System.out.println(count(12030900,0));
    }

    static int count=0;
    static int count(int n){
        if(n==0){
            return 0;
        } 
        if(n%10==0){
            count++;
        }
        count(n/10);
        return count;  
    }  


    //special pattern, how to pass a value to above calls(return same value to above function)
    static int count(int n,int cnt){
        if(n==0){
            return cnt;
        } 
        if(n%10==0){
            return count(n/10,cnt+1);
        }
        // else if(n%10!=0){
        //     return count(n/10,cnt);
        // }
        // return 0;
        return count(n/10,cnt);
    } 
}
