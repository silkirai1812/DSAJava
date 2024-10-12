package Recursion.Strings;

import java.util.ArrayList;

public class Phonepad {
    public static void main(String[] args) {
        phonepad("","99");
        System.out.println(phonepad1("","89"));
        System.out.println(phonepadCount("","84"));
        System.out.println(phonepad1("","7"));
        
    }

    //letter combinations of a phone assuming (1-abc, 2-def, 3-ghi, 4-jkl, 5-mno, 6-pqr, 7-stu, 8-vwx, 9-yz)
    static void phonepad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';
        for(int i=3*(digit-1);i<3*digit && i<26;i++){
            char ch=(char)('a'+i);
            phonepad(p+ch,up.substring(1));
        }
    }

    static ArrayList<String> phonepad1(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';
        ArrayList<String> list=new ArrayList<>();
        for(int i=3*(digit-1);i<3*digit && i<26;i++){
            char ch=(char)('a'+i);
            ArrayList<String> ans= phonepad1(p+ch,up.substring(1));
            list.addAll(ans);
        }  
        return list;
    }

    

    static int phonepadCount(String p,String up){
        int count=0;
        if(up.isEmpty()){
            return 1;
        }
        int digit=up.charAt(0)-'0';
        for(int i=3*(digit-1);i<3*digit && i<26;i++){
            char ch=(char)('a'+i);
            count=count + phonepadCount(p+ch,up.substring(1));
        }
        return count;
    }

}
