import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número do mês: ");
        int mes = entrada.nextInt();

        switch (mes) {
            case 1:
                mes = 1;
                System.out.println("");
                System.out.println("Janeiro");
                System.out.println("");
                break;

            case 2:
                mes = 2;
                System.out.println("");
                System.out.println("Fevereiro");
                System.out.println("");
                break;

                
        case 3:
            mes = 3;
            System.out.println("");
            System.out.println("Março");
            System.out.println("");
            break;

            case 4:
                mes = 4;
                System.out.println("");
                System.out.println("Abril");
                System.out.println("");
                break;

            case 5:
                mes = 5;
                System.out.println("");
                System.out.println("Maio");
                System.out.println("");
                break;

            case 6:
                mes = 6;
                System.out.println("");
                System.out.println("Junho");
                System.out.println("");
                break;

            case 7:
                mes = 7;
                System.out.println("");
                System.out.println("Julho");
                System.out.println("");
                break;

            case 8:
                mes = 8;
                System.out.println("");
                System.out.println("Agosto");
                System.out.println("");
                break;

            case 9:
                mes = 9;
                System.out.println("");
                System.out.println("Setembro");
                System.out.println("");
                break;

            case 10:
                mes = 10;
                System.out.println("");
                System.out.println("Outubro");
                System.out.println("");
                break;

            case 11:
                mes = 11;
                System.out.println("");
                System.out.println("Novembro");
                System.out.println("");
                break;
            
            case 12:
                mes = 12;
                System.out.println("");
                System.out.println("Dezembro");
                System.out.println("");
                break;



                

        
            default:
            System.out.println("Número não disponível");
                break;
        }
    }
    
}
