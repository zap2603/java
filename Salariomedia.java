package salariomedia;


import java.util.Scanner;

public class Salariomedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar e armazenar os 4 valores informados pelo usuário
        System.out.println("Informe os 4 valores separados por espaço:");
        double valor1 = scanner.nextDouble();
        double valor2 = scanner.nextDouble();
        double valor3 = scanner.nextDouble();
        double valor4 = scanner.nextDouble();
        
        // Solicitar e armazenar o salário bruto do funcionário
        System.out.println("Informe o salário bruto do funcionário:");
        double salarioBruto = scanner.nextDouble();
        
        // Calcular a média ponderada dos 4 valores
        double mediaPonderada = ((valor1 + valor2 + valor3 + valor4) / 4.0);
        
        // Calcular o desconto do INSS
        double descontoINSS = salarioBruto * 0.11;
        
        // Calcular o salário líquido (salário bruto - desconto do INSS)
        double salarioComDesconto = salarioBruto - descontoINSS;
        
        // Mostrar a média ponderada e o salário líquido com desconto
        System.out.println("A média ponderada dos valores é: " + mediaPonderada);
        System.out.println("O salário com desconto do INSS é: " + salarioComDesconto);
        
        scanner.close();
    }
}
