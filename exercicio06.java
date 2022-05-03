import java.util.Scanner;

public class exercicio06 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura: ");
        int temperatura = entrada.nextInt();

        double resultado = temperatura *(9.0/5.0)+32.0;

        System.out.println(temperatura + " graus Celsius  equivalem a " + resultado + " graus Fahrenheit" );

    }
}


//Leia um programa que represente uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é: F = C*(9.0/5.0)+32.0, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

