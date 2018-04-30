package test.java;

import java.util.Scanner;


public class TestJava {

 /**
  * @param args
  */
 public static void main(String[] args) {
  // TODO Auto-generated method stub
    int x, i,j;
          System.out.println("*");
          Scanner sc = new Scanner(System.in);
          x = sc.nextInt();
          for(i=1;i<x+1;) {
              for(j=0;j<i;j++) {
               System.out.print("*");
              }
              i++;
              System.out.println("");
               
              
              }
          }
 }