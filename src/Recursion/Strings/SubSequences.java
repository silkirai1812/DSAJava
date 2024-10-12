package Recursion.Strings;

import java.util.ArrayList;
//import java.util.Arrays;

public class SubSequences {
    public static void main(String[] args) {
        subsequence("abcd","");
        System.out.println();
        subsequence1("abcd","");
        System.out.println(list1);
        System.out.println(subsequence2("", "abcd"));
        System.out.println(subsequenceAscii("","abc"));
    }


    //Subsets using iteration



    //returning all the possible subsequences and ascii value of those characters which are missing
    static ArrayList<String> subsequenceAscii(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        int c=up.charAt(0)+0;
        ArrayList<String> left=subsequenceAscii(p+ch,up.substring(1));
        ArrayList<String> right=subsequenceAscii(p+c,up.substring(1));
        left.addAll(right);
        return left;
    }

    //returning all the possible subsequences
    static void subsequence(String up,String p){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        } 
        char ch=up.charAt(0);
        subsequence(up.substring(1),p);
        subsequence(up.substring(1),p+ch); 
    }


    //returning all the possible subsequences in a list
    static ArrayList<String> subsequence2(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left=subsequence2( p+ch, up.substring(1));
        ArrayList<String> right=subsequence2(p, up.substring(1));

        left.addAll(right);
        return left;
    }


    static ArrayList<String> list1=new ArrayList<>();
    static void subsequence1(String up,String p){
        if(up.isEmpty()){
            return;
        } 
        char ch=up.charAt(0);
        subsequence1(up.substring(1),p+ch);
        list1.add(p+ch);
        subsequence1(up.substring(1),p);
        //list1.add(p);   
    }

}
