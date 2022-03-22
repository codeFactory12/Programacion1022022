/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MENESES
 */
public class ArrayGenerator {
    int [] fibo = {0,1,2,3,5,8,13,21,43,55,89};
    int [] list = new int [100];
    @Override
    public String toString(){
        return generator();
    }
    public String generator(){
        int random;
        int cont = 0;
        int ind = 0;
        String ans = "";
        do{
            random = (int) (Math.random()*(140 + 1));
            if(valido(random,fibo) == true){
                if(valido(random,list)== true){
                    list[ind] = random;
                    ans = ans + ", " + random;
                    cont++;
                    ind++;
                }
            }
        }while(cont < 100);
        return ans;
    }
    public void recorrer(int [] num){
        int cont = 0;
        int a;
        do{
            a = num[cont];
            System.out.println(a);
            cont ++;
        }while(cont < num.length);
    }
    public boolean valido(int num, int [] arr){
        boolean valido = true;
        int box;
        int cont = 0;
        do{
            box = arr[cont];
            if(box == num){
                valido = false;
            }
            cont ++;
        }while(cont< arr.length);
        return valido;
    }
    
}
