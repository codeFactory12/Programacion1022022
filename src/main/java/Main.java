/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MENESES
 */
public class Main {
    public static void main(String [] args){
        PartOne mat = new PartOne();
        PartTwo square = new PartTwo();
        int x = 4;
        int y = 4;
        int [] [] matrix = {{5,4,3},
                            {8,9,10},
                            {1,2,3}};
        int [] [] matrix1 = new int [x] [y];
        System.out.println("La matriz rellenada es: " );
        mat.fill(matrix1);
        System.out.println("La suma de las diagonales de la matriz es:" );
        mat.summaindiagonal(matrix);
        System.out.println("La suma de las filas de la matriz es:");
        mat.sumofrows(matrix);
        System.out.println("La suma de las columans de la matriz es:");
        mat.sumofcolumns(matrix);
        System.out.println("La suma de la diagonal inversa de la matriz es:" );
        mat.summaindiagonalreverse(matrix);
    }
}
