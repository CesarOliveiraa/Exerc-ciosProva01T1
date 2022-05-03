import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Coloque a altura: ");
        float altura  = entrada.nextFloat();

        System.out.print("Coloque o peso: ");
        double peso = entrada.nextDouble();

        if (altura < 1.20 && peso <= 60) {
            String classificacao = "A";
            System.out.print("Classificaçaõ : " + classificacao);
        
        
        } else if (altura < 1.20 && peso > 60 && peso <= 90) {
            String classificacao = "D";
            System.out.print("Classificaçaõ : " + classificacao);
        
        
        } else if (altura < 1.20 && peso > 90) {
            String classificacao = "G";
            System.out.print("Classificaçaõ : " + classificacao);
        
        
        } else if (altura >= 1.20 && altura <= 1.70 && peso <= 60) {
            String classificacao = "B";
            System.out.print("Classificaçaõ : " + classificacao);
        
        
        } else if (altura >= 1.20 && altura <= 1.70 && peso > 60 && peso <= 90) {
            String classificacao = "E";
            System.out.print("Classificaçaõ : " + classificacao);
        
        
        } else if (altura >= 1.20 && altura <= 1.70 && peso > 90) {
            String classificacao = "H";
            System.out.print("Classificaçaõ : " + classificacao);
        
        
        } else if (altura > 1.70 && peso <= 60) {
            String classificacao = "C";
            System.out.print("Classificaçaõ : " + classificacao);
        
        
        } else if (altura > 1.70 && peso > 60 && peso <= 90) {
            String classificacao = "F";
            System.out.print("Classificaçaõ : " + classificacao);
        
        
        } else if (altura > 1.70 && peso > 90) {
            String classificacao = "I";
            System.out.print("Classificaçaõ : " + classificacao);
        
        
        } else {
            System.out.print("ERRO");
        }


    }

}