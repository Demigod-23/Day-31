package com.ank.lamdaexpression2;
interface Sayable{  
    String say(String message);  
}  
  
public class lexp{  
    public static void main(String[] args) {  
        
        Sayable person = (message)-> {  
            String str1 = "Hello! my name is, ";  
            String str2 = str1 + message;   
            return str2;  
        };  
            System.out.println(person.say("Ankesh Gupta."));  
    }  
}  