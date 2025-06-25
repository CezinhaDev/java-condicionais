import java.util.Scanner;

public class Comparandodoisnúmeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Comparando dois números");

        System.out.println("Digite o primeiro número:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("O número " + numero1 + " é maior que o número " + numero2 + ".");
        } else if (numero1 < numero2) {
            System.out.println("O número " + numero1 + " é menor que o número " + numero2 + ".");
        } else {
            System.out.println("Os números são iguais.");
        }
    }
}
