//Made by martijn de Vries
//24 junie 2020

package com.ms.matrix;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner scanny= new Scanner(System.in);
        System.out.println("Vul x dimension in(rows)"); //vul rows in
        int mtxRow = scanny.nextInt();
        System.out.println("Vul y dimension in(Columns)"); //vul columns in
        int mCollection = scanny.nextInt();
        int[][] mtx = new int[mtxRow][mCollection]; //Defining 2D data
        Mtx(scanny, mtx, mtxRow, mCollection); //Enter data matrix
        printMtx(mtx, mtxRow, mCollection); //Print matrix
    }
    public static void Mtx(Scanner scanny, int[][] mtx, int mtxRow, int mCollection){ //function enter data
        System.out.println("Vul de matrix met nummers");
        for (int i = 0; i < mtxRow; i++) //for loop matrixrows
        {
            for (int j = 0; j < mCollection; j++) //for loop matrix collection
            {
                mtx[i][j] = scanny.nextInt(); //matrix scanny input for [j] collection and [i] rows
            }
        }
    }
    public static void printMtx(int[][] mtx, int mtxRow, int mCollection){ //function print matrix
        for (int i = 0; i < mtxRow; i++)  //for loop print matrix rows
        {
            for (int j = 0; j < mCollection; j++) //for loop print matrix collection
            {
                System.out.print(mtx[i][j]+"\t"); //print rows and collection
            }
            System.out.println();
        }
    }
}
