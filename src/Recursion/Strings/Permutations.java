package Recursion.Strings;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        permutation("","abc");
        System.out.println(permutation1("","abc"));
        System.out.println(permutationCount("", "abcd"));
    }

    //permutation count
    static int permutationCount(String p,String up){
        if(up.isEmpty()){ //whenever the unproccessed become empty it will return 1
            return 1;
        }
        char ch=up.charAt(0);
        int count=0;
        for(int i=0;i<=p.length();i++){
            String first= p.substring(0,i);
            String last= p.substring(i,p.length());
            count = count +permutationCount(first+ch+last, up.substring(1));
        }
        return count;
    }

    //permutation= factorial of length of string
    static void permutation(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String first= p.substring(0,i);
            String last= p.substring(i,p.length());
            permutation(first+ch+last, up.substring(1));
        }
    }

    static ArrayList<String> permutation1(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> list=new ArrayList<>();

        for(int i=0;i<=p.length();i++){
            String first= p.substring(0,i);
            String last= p.substring(i,p.length());
            list.addAll(permutation1(first+ch+last,up.substring(1)));
        }
        return list;
    }
    
}
