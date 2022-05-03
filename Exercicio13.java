import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        int valor = entrada.nextInt();

        if(valor % 3 == 0 && ! (valor % 5 == 0)){
            System.out.println("Número divisivel por 3 e não por 5");

        }else if (valor % 5 == 0 && !(valor % 3 == 0)){
            System.out.println("Número divisivel por 5 e não por 3");
        }else{
            System.out.println("Valor não é divisivel por 3 ou por 5");
        }

    }
    
}
