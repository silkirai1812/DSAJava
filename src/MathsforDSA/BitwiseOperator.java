package MathsforDSA;

public class BitwiseOperator {
    // Bitwise operators
    //  XOR(^) of any number with itself gives 0 -- a^a=0
    //  a^1=a'
    // a^0 = a 
    public static void main(String[] args) {
        
        System.out.println("if the number is odd or not = "+ isOdd(50));
        // System.out.println(1^1^1);
        
        // int [] arr2 = {2,4,3,2,4,3,5,6,6};
        // System.out.println(uniquenuminarr(arr2));

        // int[] arr1= {2,2,3,2,8,7,8,7,8,7};
        // findUnique2(arr1);

        // ithBit(30,4);

        // settingbit(32, 3);

        // resetbit(32, 3);

        rightmostSetBit(36);

        // magicNum(5);

        // sum(5);

        // System.out.println("number of digits in base b="+numOfDigits(32, 2));

        // System.out.println("is Power of two="+powerOfTwo(0));
        // System.out.println("is Power of two="+powerOfTwo(5));
        // System.out.println("is Power of two="+powerOfTwo(32));
        
        // powerCalculation(3, 3);

        // numofsetbits(10);

        // System.out.println("xor from 0 to a= "+xorrange0toa(9));

        // xorrangeatob(3,9);
    }
    
    
    //to check a number if it's odd or even without using modulo operator or using bitwise(xor) operator

    // concept - leaving the least significant bit(last digit) every other bit is power of 2, so the last bit decides whether the number
    // is even or odd if the LSB is 1 then the number is odd else even. if we and any number with 1 then if the LSB will be 
    // 0 then it will return 0 and if the LSB is 1 then it will return 1 and as explained if the LSB is 1 then the number is odd.
    static boolean isOdd(int n){
        return ((n & 1)==1);
    }


    //find unique element from the array where all the elements are occuring twice e.g. [8,7,4,7,8,4,3] (ans- 3) 
    static int uniquenuminarr(int [] arr){
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];  //xor of any nuber with 0 will give that number and xor of any number with itself will give 0
        }
        return xor;
    }
    
    //find ith bit of a number
    static void ithBit(int num,int n){
        System.out.println("i th bit of number = "+(num & (1<<n-1)));
    }
    
    
    //set the ith bit means if the ith bit is zero convert it into 1 and if its already 1 then don't change it
    static void settingbit(int num,int n){
        int a= (num |(1<<n-1));
        System.out.println("on setting ith bit, the number = "+a);   
    }


    //reset the ith bit means if the ith bit is one convert it into zero and if its already zero don't change it
    static void resetbit(int num,int n){
        int a =num & (~(1<<n-1));
        System.out.println("on resetting i th bit, the number = "+a);
    }


    //position for rightmost set bit -- first positon of 1 in the number from right side
    // let n be the number then answer = (n&-n)
    static void rightmostSetBit(int n){
        int ans=(n & -n);
        System.out.println(ans);
    }


    //find unique element from the array where all the elements are occuring thrice/five times
    // concept - if a number is occuring n times then their set bits will also appear n times so the mudulo of total
    // set bit with n will give that unique number in the arr which is not occuring n times
    // static int findUniqueElement(int[] arr){

    // }


    //to find xor of numbers ranges from a to b
    static void xorrangeatob(int a, int b){
        //xor from 0 to b
        int x=xorrange0toa(b);

        //xor from 0 to a-1
        int y=xorrange0toa(a-1);
         
        System.out.println("xor from a to b= "+ (x^y));
    }


    //to find xor of numbers from 0 to a
    static int xorrange0toa(int n){
        int x=0;
        switch (n%4){
            case 0:{
                x=n;
                break;
            }
            case 1:{
                x=1;
                break;
            }
            case 2:{
                x=n+1;
                break;
            }
            case 3:{
                x=0;
                break;
            }    
        }
        return x;

        // if(n%4==0){
        //     return n;
        // }
        // else if(n%4==1){
        //     return 1;
        // }
        // else if(n%4==2){
        //     return n+1;
        // }
        // else{
        //     return 0;
        // }
    }



    //to find the number of set bits in a number
    static void numofsetbits(int n){
        int count=0;
        // while(n>0){
        //     if((n & 1)==1){
        //         count++;
        //     }
        //     n=n>>1;
        // }

        // while(n>0){
        //     count++;
        //     n= n & (n-1) ; 
        //     // or
        //     // n= n - (n & -n);
        // }
        System.out.println("number of set bits="+count);
    }


    //calculation of a to the power b
    static void powerCalculation(int base,int pow){
        int ans=1;
        while(pow>0){
            if((pow & 1)==1){
                ans=ans*base;
            }
            base*=base;
            pow = pow>>1;
    }
        System.out.println(ans);
    }

    //to check if a number is power of 2 or not
    static boolean powerOfTwo(int n){
        if(n==0){
            return false;
        }
        return (n & (n-1))==0;
        //since, 10000 will be equal to 1111 + 1, 1111 is n-1 here 
    }


    //find the sum of nth row of pascal's triangle
    static void sum(int n){
        //  int ans=(int) Math.pow(2,n-1);
         int ans1=1<<(n-1);
         //both ans & ans1 are equal
         System.out.println("sum of nth row of pascal's triangle = "+ans1);
    }


    //find the nth magic number
    static void magicNum(int n) {
        int base=1;
        int ans=0;
        int count=0;
        while(n>0){ 
            base=base*5;
            ans=ans+(n&1)*base;
            n=n>>1;
            count++;
        }
        System.out.println("Magic number of n = "+ans);
        System.out.println("number of digits="+count);
    }


    //find number of digits in base b
    //formula - (int)(logb / loga)+1
    static int numOfDigits(int n,int base){
        return (int)(Math.log(n)/Math.log(base)) +1;
    }
    
}
