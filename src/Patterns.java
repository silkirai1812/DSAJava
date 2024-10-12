//import java.lang.Math;
//import java.util.Arrays;
public class Patterns{
    public static void main(String[] args) {       
        // pattern1();
        // pattern2();
        // pattern3();
        // pattern4();
        // pattern5(5);
        // pattern21();
        // pattern6(4);
        // pattern7(4);
        // pattern8(5);
        // pattern9(5);
        // pattern10(5);
        // pattern11(5);
        // pattern12(5);
        // pattern13(6);
        // pattern14(6);
        // pattern15(6);
        // pattern16(6);
        // pattern17(5);
        // pattern18(5);
        // pattern19(6);
        pattern20(5);
        pattern22(5);
        pattern23(3);
        pattern24(5);
        pattern25(5);
        pattern26(6);
        // pattern27(5);
        pattern28(5);
        pattern29(5);
        pattern30(5);
        // pattern31(5);
        pattern32(5);
        pattern33(5);
        pattern34(5);
        pattern35(5);

    }

    static void pattern1(){
        System.out.println("\n pattern-1");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(){
        System.out.println("\n pattern-2");
        for(int i=0;i<5;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern3(){
        System.out.println("\n pattern-3");
        for(int i=0;i<5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(){
        System.out.println("\n pattern-4");
        for(int i=0;i<5;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        System.out.println("\n pattern-5");
        for(int i=0;i<2*n-1;i++){

        //     if(i<n){
        //     for(int j=0;j<i+1;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // else{
        //     //for(int j=0;j=i>=n?2*n-i-1:i+1;j++)
        //     for(int j=0;j<2*n-i-1;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        int c=i>=n?2*n-i-1:i+1;
        for(int j=0;j<c;j++){
            System.out.print("* ");
        }
        System.out.println();
        }
    }


    static void pattern6(int n){
        System.out.println("\n pattern-6");
        for(int row=0;row<n;row++){
            for(int space=0;space<n-row-1;space++){
                System.out.print(" ");
            }
            for(int col=0;col<row+1;col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern7(int n){
        System.out.println("\n pattern-7");
        for(int row=0;row<n;row++){
            for(int space=0;space<row;space++){
                System.out.print(" ");
            }
            for(int col=0;col<n-row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        System.out.println("\n pattern-8");
        for(int row=0;row<n;row++){
            for(int space=0;space<n-row-1;space++){
                System.out.print(" ");
            }
            for(int col=0;col<2*row+1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void pattern9(int n){
        System.out.println("\n pattern-9");
        for(int row=0;row<n;row++){
            for(int space=0;space<row;space++){
                System.out.print(" ");
            }
            for(int col=0;col<2*(n-row)-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void pattern10(int n){
        System.out.println("\n pattern-10");
        for(int row=0;row<n;row++){
            for(int space=0;space<n-row+1;space++){
                System.out.print(" ");
            }
            for(int col=0;col<row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern11(int n){
        System.out.println("\n pattern-11");
        for(int row=0;row<n;row++){
            for(int space=0;space<row;space++){
                System.out.print(" ");
            }
            for(int col=0;col<n-row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern12(int n){
        System.out.println("\n pattern-12");
        for(int row=0;row<2*n;row++){
            int c=row<n?n-row:(row-n)+1;
            int s=row<n?row:2*n-row-1;
            for(int space=0;space<s;space++){
                System.out.print(" ");
            }
            for(int col=0;col<c;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern13(int n){
        System.out.println("\n pattern-13");
        for(int j=0;j<n-1;j++){
            System.out.print(" ");
        }
        System.out.print("*\n");
        for(int row=1;row<n-1;row++){
            for(int space=0;space<n-row-1;space++){
                System.out.print(" ");
            }
                       
            System.out.print("*");
            for(int i=0;i<2*row-1;i++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();   
        }
        for(int i=0;i<2*n-1;i++){
            System.out.print("*");
        }
    }


    static void pattern14(int n){
        System.out.println("\n pattern-14");
        for(int i=0;i<2*n-1;i++){
            System.out.print("*");
        }
        System.out.println();
        for(int row=1;row<n-1;row++){
            for(int space=0;space<row;space++){
                System.out.print(" ");
            }
                       
            System.out.print("*");
            for(int i=0;i<2*(n-2-row)+1;i++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();   
        }
        for(int i=0;i<n-1;i++){
            System.out.print(" ");
        }
        System.out.print("*\n"); 
    }

    static void pattern15(int n){
        System.out.println("\n pattern-15");
        for(int i=0;i<n-1;i++){
            System.out.print(" ");
        }
        System.out.print("*\n");
        for(int row=1;row<2*n-2;row++){
            int x=row<n?n-row-1:row-n+1;
            for(int space=0;space<x;space++){
                System.out.print(" ");
            }
            System.out.print("*");
            int s=row<n?2*row-1:2*(2*n-row-2)-1;
            for(int j=0;j<s;j++){
                System.out.print(" ");
            }
            System.out.print("*\n");
        }
        for(int i=0;i<n-1;i++){
            System.out.print(" ");
        }
        System.out.print("*\n");
        


       /* for(int row=0;row<2*n-1;row++){ 
            int s=row<n?n-row-1:row-n+1;
            for(int space=0;space<s;space++){
                System.out.print(" ");
            }
            for(int col=0;col<2*n-1;col++){
                if((col-row==n-1 || col-row==0) && col>=n){
                    for(int j=0;j<row && row<n ;j++){
                    System.out.print("  ");
                    }
                    for(int k=0;k<2*n-row-1;k++){
                        System.out.print("  ");
                    }

                }

                if(row+col==3*(n-1) && row>n-1 && col>n-1){
                    System.out.print("*");
                }

                else if(row+col==n-1 && row<n-1 && col<n-1){
                    
                    System.out.print("*");
                }
                
                else if(col-row==n-1 || row-col==n-1){
                    System.out.print("*");
                }

                else{
                    System.out.print(" ");
                }
            }
            System.out.println();        
    }*/
}


//pascal's triangle
static void pattern16(int n){
    /*System.out.println("\n pattern-16");
    for(int i=0;i<n;i++){
        for(int space=0;space<n-i-1;space++){
            System.out.print(" ");
        }
        int r=(int) Math.pow(11,i);
        //int[] arr=new int[n-1];
        while(r>0){
            int t=r%10;
            System.out.print(t+" ");
            r=r/10;
        }
        
    System.out.println();
    }*/
}


static void pattern17(int n){
    System.out.println("\n pattern-17");
    for(int i=0;i<2*n-1;i++){
        int s=i<n?n-i-1:i-n+1;
        for(int space=0;space<s;space++){
            System.out.print(" ");
        }
        if(i<n){
        for(int j=i+1; j>=1;j--){
            System.out.print(j);
        }
        for(int j=2;j<=i+1;j++){
            System.out.print(j);
        }
    }

    else{
        for(int j=2*n-i-1;j>=1;j--){
            System.out.print(j);
        }
        for(int j=2;j<2*n-i;j++){
            System.out.print(j);
        }
    }
        System.out.println();
    }
}


static void pattern18(int n){
    System.out.println(" \n Pattern-18");
    for(int row=0;row<2*n;row++){
        /* if(row<n){
            for(int j=0;j<n-row;j++){
                System.out.print("*");
            }
            for(int space=0;space<2*row;space++){
                System.out.print(" ");
            }
            for(int j=0;j<n-row;j++){
                System.out.print("*");
            }
        }
        
        else{
            for(int j=0;j<row-n+1;j++){
                System.out.print("*");
            }
            for(int space=0;space<2*(2*n-row-1);space++){
                System.out.print(" ");
            }
            for(int j=0;j<row-n+1;j++){
                System.out.print("*");
            }

        }*/

        int a=row<n?n-row:row-n+1;
        int b=row<n?2*row:2*(2*n-row-1);
        int c=row<n?n-row:row-n+1;

        for(int j=0;j<a;j++){
            System.out.print("*");
        }
        for(int space=0;space<b;space++){
            System.out.print(" ");
        }
        for(int j=0;j<c;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

static void pattern19(int n){
    System.out.println(" \n Pattern-19");
    for(int row=0;row<2*n-1;row++){
        int a=row<n?row+1:2*n-row-1;
        int s=row<n?2*(n-row-1):2*(row-n+1);
        int b=row<n?row+1:2*n-row-1;
        for(int j=0;j<a;j++){
            System.out.print("*");
        }
        for(int space=0;space<s;space++){
            System.out.print(" ");
        }
        for(int j=0;j<b;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

static void pattern20(int n){
    System.out.println(" \n Pattern-20");
    for(int row=0;row<n;row++){
        for(int col=0;col<n;col++){
            if(row==0|| row==n-1 || col==0|| col==n-1){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}


static void pattern21(){
        System.out.println("\n pattern-21");
        int c=0;
        for(int i=0;i<5;i++){
            for(int j=1;j<=i+1;j++){
                c++;
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }

static void pattern22(int n){
    System.out.println("\n pattern-22");
    for(int row=0;row<n;row++){
        int c=1;
        for(int col=0;col<row+1;col++){
            if(row%2!=0 && col==0){
            c=0;
        }
            System.out.print(c+" ");
            if(c==1){
                c--;
            }
            else if(c==0){
                c++;
            }
        }
        System.out.println();
    }
}


static void pattern23(int n){
    System.out.println("\n pattern-23");
    for(int row=0;row<n;row++){
        
        for(int space=0;space<n-row-1;space++){
            System.out.print(" ");
        }
        System.out.print("*");
        for(int space=0;space<2*row-1;space++){
            System.out.print(" ");
        }
        if(row>0){
        System.out.print("*");
        }   
        for(int space=0;space<n-2*row;space++){
            System.out.print(" ");
        }
        if(row<n-1){
            System.out.print("*");
        }
        for(int space=0;space<2*row-1;space++){
            System.out.print(" ");
        }
        if(row>0){
        System.out.print("*");
        }
        System.out.println();
    }
    
}

static void pattern24(int n){
    System.out.println("\n pattern-24");
    for(int row=0;row<2*n;row++){
        System.out.print("*");
            int a=row<n?row-1:2*(n-1)-row;
            for(int s1=1;s1<=a;s1++){
                System.out.print(" ");
            }
            if(row>0 && row<2*n-1){
            System.out.print("*");
            }

            int b=row<n?2*(n-row-1):2*(row-n);
            for(int s2=0;s2<b;s2++){
                System.out.print(" ");
            }
            if(row>0 && row<2*n-1){
            System.out.print("*");
            }
            
            int a1=row<n?row-1:2*(n-1)-row;
            for(int s1=0;s1<a1 ;s1++){
                System.out.print(" ");
            
        }
        System.out.print("*\n");
        }    
}


static void pattern25(int n){
    System.out.println(" \n Pattern-25");
    for(int row=0;row<n;row++){
        for(int space=0;space<n-row;space++){
            System.out.print(" ");
        }
        for(int col=0;col<n;col++){
            if(row==0|| row==n-1 || col==0|| col==n-1){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

static void pattern26(int n){
    System.out.println("\n Pattern 26");
    for(int row=1;row<=n;row++){
        for(int col=0;col<=n-row;col++){
            System.out.print(row+" ");
        }
        System.out.println();
    }
}

static void pattern27(int n){

}

static void pattern28(int n){
    System.out.println("\n Pattern 28");
    for(int row=0;row<2*n-1;row++){
        int s=row<n?n-row-1:row-n+1;
        for(int space=0;space<s;space++){
            System.out.print(" ");
        }
        int r=row<n?row+1:2*n-row-1;
        for(int i=0;i<r;i++){
            System.out.print("* ");
        }
        System.out.println();
    }
}

static void pattern29(int n){
    System.out.println("\n Pattern 29");
    for(int row=0;row<2*n-1;row++){
        int r=row<n?row+1:2*n-row-1;
        for(int i=0;i<r;i++){
            System.out.print("*");
        }
        int s=row<n?2*(n-row-1):2*(row-n+1);
        for(int space=0;space<s;space++){
            System.out.print(" ");
        }
        for(int i=0;i<r;i++){
            System.out.print("*");
        }

    System.out.println();
}
}


static void pattern30(int n){
    System.out.println("\n Pattern 30");
    for(int row=0;row<n;row++){
        for(int space=0;space<n-row-1;space++){
            System.out.print("  ");
        }
        for(int i=row+1;i>=1;i--){
            System.out.print(i+" ");
        }
        for(int i=2;row>=1 && i<=row+1;i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}

static void pattern31(int n){
    System.out.println("\n Pattern 31");
    for(int row=1;row<2*n;row++){
        for(int col=1;col<2*n;col++){
             int i=67 ;
             System.out.print(i+" ");
        }
        System.out.println();
    }

}


static void pattern32(int n){
    System.out.println("\n Pattern 32");
    char ch=(char) ('A'+n-1);
    for(int row=0;row<n;row++){

        for(int col=0;col<row+1;col++){
            System.out.print((char)(ch+col)+" ");
            
        }
        ch--;
        System.out.println();

    }
}

static void pattern33(int n){
    System.out.println("\n Pattern 33");
    char ch='a';
    for(int row=0;row<n;row++){
        for(int col=0;col<row+1;col++){
            System.out.print(ch+" ");
            if(ch>=65 && ch<=91){
                ch=(char)(ch+32+1);
            }
            else if(ch>=97 && ch<=123){
                ch=(char)(ch-32+1);
            }
        }
        System.out.println();
    }
}

static void pattern34(int n){
    System.out.println("\n Pattern 34");
    
    for(int row=0;row<n;row++){
        char ch=(char)('A'+(n-1-row));
        for(int j=0;j<n-row;j++){
            System.out.print(ch+" ");
            ch--;
        }
        System.out.println();
    }
}


static void pattern35(int n){
    System.out.println("\n Pattern 35");
    for(int row=1;row<=n;row++){
        for(int i=1;i<=row;i++){
            System.out.print(i);
        }
        for(int space=0;space<2*(n-row);space++){
            System.out.print(" ");
        }
        for(int j=row;j>=1;j--){
            System.out.print(j);
        }
    System.out.println();
    }
}
}
