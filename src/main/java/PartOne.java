/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MENESES
 */
public class PartOne {
    public void fill(int[][] matrix){
       for(int x = 0; x< matrix.length; x++){
           for(int y = 0; y < matrix[x].length;y++){
               matrix[x][y] = (int)(Math.random()*(10 - 1));
           }
       }
       printmatrix(matrix);
    }
    public void sumofrows(int[][] matrix){
        for(int y =0; y< matrix.length;y++){
            int sum = 0;
            for(int x = 0; x < matrix[y].length; x++){
                sum += matrix[y][x];
            }
            System.out.printf("%d\n", sum);
        }
    }
    public void sumofcolumns(int [][] matrix){
        for(int x = 0; x < matrix[0].length; x++ ){
            int sum = 0;
            for(int y = 0; y < matrix.length; y++ ){
                sum = sum + matrix[y][x];
            }
            System.out.printf("%d\n", sum);
        }
    }
    public void summaindiagonal(int [][] matrix){
        int sum = 0;
        for(int xy = 0; xy < matrix.length; xy++){
            sum = sum + matrix[xy][xy];
        }
         System.out.printf("%d\n", sum);
        
    }
    public void summaindiagonalreverse(int [][] matrix){
        int sum = 0;
        int x = matrix.length - 1;
           while(x >= 0){
               for(int y = 0; y < matrix.length; y++){
               sum = sum + matrix[y][x];
               x = x - 1;
               }
        }
        System.out.println(sum);
        
    }
    public void printmatrix(int [][] matrix){
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                System.out.printf("%d ", matrix[y][x]);
            }
            System.out.println();
        }
    }
}
