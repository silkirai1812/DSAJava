package MathsforDSA;

public class CalculatingSqrt {
    public static void main(String[] args) {
        System.out.printf("%.2f",binarySearchSqrt(36, 1));
        
    }


    //newton raphson method
    //root = (x + (n/x))/2


    //p--precision upto which decimal place we want the answer
    static double binarySearchSqrt(int n,int p){
        int s=0;
        int e=n;
        double root=0.0;
        while(s<=e){
            int m=s+(e-s)/2;
            if(m*m == n){
                return m; 
            }
            if(m*m<n){
                e=m-1;
            }
            else{
                s=m+1;
            }  
        }
        double incr=0.1;
        for(int i=0;i<p;i++){
            while(root*root<n){
                root+=incr;
            }
            incr/=10;
        }
    return root;   

    }
    
}
