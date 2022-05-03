import java.util.Scanner;

public class exercicio02 {

    public static void main (String[] args) {
    
        Scanner numero = new Scanner(System.in);

        System.out.print("Coloque um número: ");
        int numeroUm = numero.nextInt();

        System.out.print("Coloque um número: ");
        int numeroDois = numero.nextInt();

        System.out.print("Coloque um número: ");
        int numeroTres = numero.nextInt();

        double resultado = numeroUm + numeroDois + numeroTres;

        System.out.println("A soma dos números é " + resultado);



        
    }
    

}
