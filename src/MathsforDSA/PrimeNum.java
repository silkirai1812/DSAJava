package MathsforDSA;

public class PrimeNum {
    public static void main(String[] args) {
        int n=40;
        for(int i=1;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }        
    }


    //sieve of eratosthenes




    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        // int s=(int) Math.sqrt(n);
        // for(int i=2;i<=s;i++){
        //     if(n%i==0){
        //         return false;
        //     }
        // }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
    
}
