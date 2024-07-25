import java.util.*;
public class Anagram{
     public static void main(String []args){
        String str1 = "SILENT";
        String str2 = "LISTEN";
        
        
        char c1[] = str1.toCharArray(); // we check the length of that array of str1  
        char c2[] = str2.toCharArray();  // we check the length of that array of str2
        
        
        if(c1.length != c2.length)  // here we compare the str1 length != str2 length
        {
            System.out.println("Not Anagramm By Checking by the length of array");
            System.exit(0);
        }
        
        Arrays.sort(c1);  // here we short the  str1 array here means E I L M S T 
        Arrays.sort(c2);  // here we short the str2  array here means E I L M S T  
        
        
        for (int i = 0; i < c1.length; i++)
        {
            if (c1[i] != c2[i])  // here we compare the 2array one by one 
            {   
                System.out.println("by comparing two of charecter its not anagram ");
                System.exit(0);
            }
        
        }
        System.out.println("By completely checking its Anagram");
     }
}