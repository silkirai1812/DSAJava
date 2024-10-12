package MathsforDSA;
import java.util.ArrayList;

public class Factors {

    public static void main(String[] args) {
        int n=36;
        //factor1(n);
        //factor2(n);
        factor3(n);
    }

    //complexity -- O(sqrt(n))
    static void factor2(int n){
        int i=1;
        while(i*i<=n){
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print(i+" "+n/i+" ");
                }
            }
            i++;
        }
    }


    static void factor3(int n){
        ArrayList<Integer> list = new ArrayList<>();
        int i=1;
        while(i*i<=n){
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print(i+" ");
                    list.add(n/i);
                }
            }
            i++;
        }
        for(int j=list.size()-1;j>=0;j--){
            System.out.print(list.get(j)+" ");
        }
    }

    //complexity -- O(n/2)
    static void factor1(int n){
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
    
}
