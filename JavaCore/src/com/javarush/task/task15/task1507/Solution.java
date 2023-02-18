package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(){
        System.out.println("Something");
    }
    public static int printMatrix(int a, int b){
        return a * b;
    }
    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
    public static int printMatrix(int n, int m, int k){
        return n*m*k;
    }

    public static double printMatrix(double n, double m){
        return n*m;
    }

    public static String printMatrix(Object o){
        return "Matrix SAY: Hello my FirstName is:"+o.getClass().getSimpleName();
    }

    public static Object printMatrix(Object o, boolean life){
        boolean is = true;
        if (life || is || life)
            return o;
        return null;
    }
    public static float printMatrix(float a, float b)
    {
        return a * b;
    }
}
