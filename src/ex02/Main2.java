package ex02;

import java.util.Scanner;

public class Main2 {
   public static void main (String args []){
       Scanner s = new Scanner(System.in);

       double vlrp = 3.141559;
       System.out.print("Informe o Raio: ");
       double vlrR = s.nextDouble();
       System.out.print("Informe a Altura: ");
       double vlrAltura = s.nextDouble();
       double volume = vlrp * (vlrR*vlrR) * vlrAltura;
       System.out.println("Volume: "+ volume);
   }



}
