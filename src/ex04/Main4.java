package ex04;

import java.util.Scanner;

public class Main4 {
    public static void main (String args []){
        Scanner s = new Scanner(System.in);

        System.out.print("Informar o Valor: ");
       int valor = s.nextInt();

       if
       ((valor >=0) && (valor<=100)){
                System.out.println("Esta dendro da Faixa!");
            }else{
                System.out.println("Fora da Faixa");
            }

        }


    }

