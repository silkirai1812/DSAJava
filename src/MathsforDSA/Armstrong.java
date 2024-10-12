package MathsforDSA;

public class Armstrong {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(armstrong(n));
        System.out.println(n);
    }
    
    static boolean armstrong(int n){
        int temp = n;
        int res=0;
        int c = cntDigits(n);
        while(n>0){
            res=res+(int)Math.pow(n%10,c);
            n=n/10;
        }
        return temp==res?true:false;
    }
    
    static int cntDigits(int n){
        int c = 0;
        while(n!=0){
            c++;
            n=n/10;
        }
        return c;
    }
}
