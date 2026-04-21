/*Write a function to find out duplicate words in a
given string?*/

import java.util.*;

class Main {
    public static void main(String[] args) {
        
        String  abc = "Big black bug bit a big black dog on his big black nose";
       
        String lowercase= abc.toLowerCase();
               
        String[] strarr = lowercase.split(" ");
      
       for(int i=0;i<strarr.length;i++){
           int count =1;
           for(int j=i+1;j<strarr.length;j++){
               if(strarr[i].equals(strarr[j])){
                    count++;
                    strarr[j]="0";
               }
           }
            if(count>1 && strarr[i]!="0"){
                   System.out.println(strarr[i]);
               }
       }
        
    }
}
