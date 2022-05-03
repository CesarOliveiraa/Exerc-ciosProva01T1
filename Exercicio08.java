import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println(" ");
        System.out.print("Digite a idade do nanador: ");
        System.out.println(" ");
        int idade = entrada.nextInt();

        if (idade >= 5 && idade <= 7){
            System.out.println(" ");
            System.out.println("Infantil A");
            System.out.println();
        

        }else if (idade >= 8 && idade <= 10){
            System.out.println(" ");
            System.out.println("Infantil B");
            System.out.println();
        

        }else if (idade >= 11 && idade <= 13){
            System.out.println(" ");
            System.out.println("Juvenil A");
            System.out.println();
        

        }else if (idade >= 14 && idade <= 17){
            System.out.println(" ");
            System.out.println("Junenil B");
            System.out.println();
        

        }else if (idade >= 18 && idade < 100){
            System.out.println();
            System.out.println("Sénior");
            System.out.println();
        
        }else{
            System.out.println(" ");
            System.out.println("IDADE NÂO DISPONÌVEL");
            System.out.println();
        
        }



        


    }
    
    
}
