package ex01;

import java.util.Scanner;

public class Man1 {
    public static void main(String[] args){
        double conta;
        double gorjeta;
        double valor_final;

        Scanner s = new Scanner(System.in);
        System.out.print("Valor total da Conta: R$");
        conta = s.nextDouble();
        gorjeta = (conta * 0.10);
        System.out.println("Valor da Gorjeta: R$"+ gorjeta);
        valor_final = (conta+gorjeta);
        System.out.println("Total: R$"+ valor_final);
        }

    }

