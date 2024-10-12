package Recursion.Strings;

import java.util.ArrayList;

public class DiceSum {
    public static void main(String[] args) {
       diceSum("",4);
       System.out.println(diceSum1("",4)); 
    }

    static void diceSum(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6 && i<=target;i++){
            diceSum(p+i,target-i);
        }
    }

    static ArrayList<String> diceSum1(String p,int target){
        if(target==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        for(int i=1;i<=6 && i<=target;i++){
            ArrayList<String> ans=diceSum1(p+i,target-i);
            list.addAll(ans);
        }
        return list;
    }
    
}
