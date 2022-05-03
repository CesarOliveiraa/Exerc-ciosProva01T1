import java.util.Scanner;

public class exercicio03{
    public static void main (String[] args) {

        Scanner numero = new Scanner(System.in);

        System.out.print("Qantos anos você tem? ");
        int valor = numero.nextInt();

        

        double resultado = 2022 -valor;
        
        System.out.println("Você nasceu em " + resultado);
    }
    
}

//Faça um programa que calcula o ano de nascimento de uma pessoa a partir de sua idade e do ano atual.