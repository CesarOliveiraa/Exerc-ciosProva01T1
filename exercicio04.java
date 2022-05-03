import java.util.Scanner;

public class exercicio04 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a velocidade: ");
        int velocidade = entrada.nextInt();

        double resultado = velocidade / 3.6;

        System.out.println(velocidade + " km/h é igual a " + resultado + " m/s");


    }

    
}

//leia uma velocidade em km/h (quilômetros por hora) e apresente convertida em m/s (metros por segundo). A fórmula de conversão é M = K/36, sendo K a velocidade em km/h e M em m/s.
