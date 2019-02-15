package ex03;

import java.util.Scanner;

public class Main3 {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        double salario;
        double vlrPrestacao;
        double porcentagem;

        System.out.print("Entre com o Salario Bruto: R$");
        salario = s.nextDouble();
        System.out.print("Entre com o Valor da Prestação: R$");
        vlrPrestacao = s.nextDouble();

        porcentagem = salario * 0.30;
       if (vlrPrestacao <= porcentagem) {

           System.out.println("Credito Concedido");
       }else {
           System.out.println("Credito Negado!!");
       }
       }
    }

