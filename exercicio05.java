import java.util.Scanner;

public class exercicio05 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor em reais: ");
        int real = entrada.nextInt();

        double resultado = real * 4.78;

        System.out.println(real + " reais equivalem a " + resultado + " dólares");

    }
}


//Faça um programa que leia a cotação do dólar. Em seguida, imprima o valor correspondente em reais.
