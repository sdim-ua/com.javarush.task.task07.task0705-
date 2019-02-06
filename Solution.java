import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        
        int[] num = new int[20];
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         for (int i = 0; i < num.length; i++){
            num[i] = Integer.parseInt(reader.readLine()); 
        }
        int[] a_10 = new int[10];
        int[] a_20 = new int[10];
     
     for (int i = 0; i < a_10.length; i++){
        
            a_10[i] = num[i];
            
        }
        
    for (int i = 0; i < a_20.length; i++){
        
            a_20[i] = num[i+10];
            System.out.println(a_20[i]);
        } 
        
        
    }
}
