package Recursion.Strings.java;

public class BasicQs {
    public static void main(String[] args) {
        System.out.println(fun("abccdacb",0,""));
        fun1("abccdacb",0,"");
        // System.out.println(fun("abbcade",0));
        skip("asdfgaerae","");
        System.out.println(skip2("asdarsda"));
        skipApple("abappledf","");
        System.out.println(skipApple2("asdapple f"));
        skipApp("abappledf","");
    }

    //skip app when substring is not equal to apple
    static void skipApp(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        if(str.startsWith("app") && !str.startsWith("apple")){
            skipApp(str.substring(3),ans);
        }
        else{
            skipApp(str.substring(1),ans+str.charAt(0));
        }

    }

    //skip a word
    static void skipApple(String str,String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        if(str.startsWith("apple")){
            skipApple(str.substring(5),ans);
        }else{
            skipApple(str.substring(1),ans+str.charAt(0));
        }
    }

    static String skipApple2(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("apple")){
            return skipApple2(str.substring(5));
        }else{
            return str.charAt(0)+skipApple2(str.substring(1));
        }
    }



    //skip a character
    static void skip(String str,String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        if(ch=='a'){
            skip(str.substring(1),ans);
        }else{
            skip(str.substring(1),ans+ch);
        }
    }

    static String skip2(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch=str.charAt(0);
        if(ch=='a'){
            return skip2(str.substring(1));
        }else{
            return ch+skip2(str.substring(1));
        }
    }

    static String fun(String str,int index,String ans){
        if(index==str.length()){
            return ans;
        }
        if(str.charAt(index)!='a'){
            ans=ans+str.charAt(index);
        }
        return fun(str,index+1,ans);   
        
    }

    static void fun1(String str,int index,String ans){
        if(index==str.length()){
            System.out.println(ans);
            return;
        }
        if(str.charAt(index)!='a'){
            ans=ans+str.charAt(index);
        }   
        fun1(str,index+1,ans);
 
    }
 
}
