package MathsforDSA;

public class LCM {
    public static void main(String[] args) {
        System.out.println(lcm(3,7));
        System.out.println(lcm(4,16));
        funrev(5);
    }


    //formula for lcm: lcm(a,b)= (a*b)/gcd(a,b)
    static int lcm(int a,int b){
        int gcd = gcd(a,b);
        int f=a/gcd;
        int g=b/gcd;
        return f*g*gcd;
        // return (a*b)/gcd;
    }

    static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }

    static void funrev(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        funrev(n-1);
        System.out.println(n);
        
    }
    
}
