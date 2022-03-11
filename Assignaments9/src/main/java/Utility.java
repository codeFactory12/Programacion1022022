/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MENESES
 */
public class Utility {
    //LA LETRA MAS REPETIDA
    static String[] Repeated(String text){
        String frase = text.toLowerCase();
        String [] palab = frase.split(" ");
        String frasse = String.join("", palab);
        char [] lista = frasse.toCharArray(); // text a un array de char
        char actual;
        char siguiente;
        int act;
        int [] num = new int [10];
        char [] ans = new char [2];
        String [] answer = new String [2];
        for(int i =0; i < lista.length ;i++){
            actual = lista[i];
            for(int j = 1; j <lista.length ; j++){
                siguiente = lista[j];
                if(repetido(lista,actual) > repetido(lista,siguiente)){
                act = repetido(lista,actual);
                answer[1] = act+"";
                String res = Character.toString(actual);
                answer[0] = res; 
                }
            }
        }
       return answer;
    }
    //SABER CUANTAS VECES SE HA REPETIDO EL CARACTER
    static int repetido(char [] lista, char a){
        int contador = 0;
        for(int i = 0; i < lista.length; i++){
            if(a == lista[i]){
                contador ++;
            }
        }
        return contador;
    }
    //LA PALABRA MAS REPETIDA
    static String[] Repeat(String text){
        String frase = text.toLowerCase();
        String [] palabras = frase.split(" ");
        String actual;
        String siguiente;
        String [] ans = new String [2];
        int mayor;
        for(int i =0; i<palabras.length ;i++){
            actual = palabras[i];
            for(int j=1; j<palabras.length ;j++){
                siguiente = palabras[j];
                if(palabra(palabras,actual)> palabra(palabras,siguiente)){
                    mayor = palabra(palabras,actual);
                    ans[1]= mayor+"";
                    ans[0]= actual;
                }
            }
            
        }
        return ans;
    }
    static int palabra( String [] palabras, String actual){
        int contador=0;
        for (String palabra : palabras) {
            if (palabra == null ? actual == null : palabra.equals(actual)) {
                contador++;
            }
        }
        return contador;
    }
}
