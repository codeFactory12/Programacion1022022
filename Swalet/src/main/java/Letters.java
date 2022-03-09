/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MENESES
 */
import java.util.ArrayList;
public class Letters {   
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    
    public void letter1(String text){
        String ans =" ";
        String [] parts = text.split(" ");
        for(int i = 0; i < parts.length; i++){
            if(parts[i].length() > 3 ){
                numbers.clear();
                ans = ans + mixl(parts[i]) + " ";
            }
        }
        System.out.println(ans);
    }
    
    public String mixl(String partext ){
        char [] list = partext.toCharArray(); // {S,e,g,u,n}
        for( int i = 1; i < list.length - 1; i++){
             int randomindex = random(list);
            if(valida(list,randomindex) == true){
                char temp = list[i];
                list[i] = list[randomindex];
                list[randomindex] = temp;
            }
        }
        
        String mixed = String.valueOf(list);
        System.out.println(mixed);
        return mixed;
    }
    public boolean contains(int [] numbers, int mix){
        boolean found = false;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i]==mix) {
                found=true;
            }
        }
        return found;
    }
    // RANDOM PARA CADENAS .LENGTH > 2 Y RANDOM QUE NO SE REPITEN
    public int random(char list []){
        int ans;
        ans = (int)(Math.random()*(list.length - 1));
        if( ans != 0 && ans != list.length ){
            if(numbers.contains(ans) == false){
                numbers.add(ans);  
            }
        }else{
           random(list);
        }
        if(ans == 0 || ans == list.length -1){
            random(list);
        }
        return ans;
    }
    // VALIDA QUE LOS NUMERO NO SEAN 0 NI EL ULTIMO DEL ARRAY.
    public boolean valida(char list[], int number){
        boolean found = true;
        if(number == 0){
            found = false;
        }
        if(number == list.length -1){
            found = false;
        }
        return found;
    }
}
