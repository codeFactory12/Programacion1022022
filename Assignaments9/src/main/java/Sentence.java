/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MENESES
 */
import java.util.Arrays;
public class Sentence {
    
    public static void main(String[] args){ 
        Utility util = new Utility();
       //util.Repeated("tt t t a a a a a a a a a a");
       final String[] c = util.Repeated("This is a repeated word test this is a A");
       System.out.println(Arrays.toString(c));//Should print [a, 3] 
       final String[] c1 = util.Repeat("This is a repeated word test this this this this this this"); 
       System.out.println(Arrays.toString(c1));//Should print [this, 7] 
       // final String[] c2 = util.Repeated("This is a repeated word test this word word word"); 
       // System.out.println(Arrays.toString(c2));//Should print [word, 4] 
    }
}
