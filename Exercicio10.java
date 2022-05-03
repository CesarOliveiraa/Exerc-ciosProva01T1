import java.util.Scanner;

public class Exercicio10 {
    
    public static void main(String[] args) {
        

        float resultado = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("");

        System.out.print("Digite o número 1: ");
        int x = entrada.nextInt();

        System.out.print("Digite o número 2: ");
        int y = entrada.nextInt();

        System.out.print("Digite o número 3: ");
        int z = entrada.nextInt();
        
        System.out.println("");
        

        System.out.println("");
        System.out.println("1 - Média Geometrica");
        System.out.println("2 - Média Ponderada");
        System.out.println("3 - Média Aritmética");
        System.out.println("");
        
        System.out.print("Escolha a formúla da média: ");
        
        System.out.println("");



        int operacao = entrada.nextInt();

        switch (operacao) {

            case 1:
                resultado = x*y*z;
                System.out.println("");
                System.out.println("O valor da média geométrica é: "+ resultado);
                System.out.println("");
                break;

            case 2: 
                resultado = (x+2*y+3*z)/6;
                System.out.println("");
                System.out.println("O valor da média ponderada é: " + resultado);
                System.out.println("");
                break;

            case 3:
                resultado = (x*y*z)/3;
                System.out.println("");
                System.out.println("O valor da média aritmética é: " + resultado);
                System.out.println("");
                break;
        
            default:
                System.out.println("Opção inválida!!!");
                break;
        }


        
    }
}
