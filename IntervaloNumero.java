import java.util.Scanner;

public class IntervaloNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int limiteDeEmprestimo = 5000;

        System.out.println("Verificando se um número está dentro de um intervalo");
        System.out.println("Digite um número:");
        double numero = scanner.nextDouble();

        if(numero >= 0 && numero <= limiteDeEmprestimo) {
            System.out.printf("O número %.2f está dentro do intervalo de 0 a %d.%n", numero, limiteDeEmprestimo);
        } else {
            System.out.printf("O número %.2f está fora do intervalo de 0 a %d.%n", numero, limiteDeEmprestimo);
        }
        scanner.close();
    }
}
