import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7: ");
        int numero = entrada.nextInt();

        switch (numero) {
            case 1:
                System.out.println("O dia da semana é Domingo");
                
                break;

            case 2:
                System.out.println("O dia da semana é Segunda");
                    
                break;      

            case 3:
                System.out.println("O dia da semana é Terça");
                    
                break;  
                
            case 4:
                System.out.println("O dia da semana é Quarta");
                    
                break;   

            case 5:
                System.out.println("O dia da semana é Quinta");
                    
                break;   

            case 6:
                System.out.println("O dia da semana é Sexta");
                    
                break;   

            case 7:
                System.out.println("O dia da semana é Sábado");
                    
                break;   



            
        
            default:
            System.out.println("Número não disponível");
                break;
        }
    }
    
}
