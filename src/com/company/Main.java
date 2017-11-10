package com.company;

import java.util.Scanner;

public class Main {

    /**
     * Дана целочисленная прямоугольная матрица.
     * Упорядочить столбцы по убыванию среднего значения.
     */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n=in.nextInt(), m=in.nextInt();

        int[][] A = new int[n][m]; // наша матрица

        int[] sum = new int[m]; // суммы значений в столбцах

        for(int i=0; i<n; ++i)
            for(int j=0; j<m; ++j)
            {
                A[i][j] = in.nextInt();

                sum[j]+=A[i][j];
            }


        int z;


        // сортируем пузырьком
        for(int i1=0; i1<m-1; ++i1)
            for(int j=0; j<m-1; ++j)
                if(sum[j]<sum[j+1]) {

                    for (int i = 0; i < n; ++i) {
                        z = A[i][j];
                        A[i][j] = A[i][j + 1];
                        A[i][j + 1] = z;
                    }

                    z=sum[j];
                    sum[j]=sum[j+1];
                    sum[j+1]=z;
                }





        for(int i=0; i<n; ++i)
        {
            for(int j=0; j<m; ++j) System.out.print(A[i][j]+" ");

            System.out.print("\n");
        }



    }
}
