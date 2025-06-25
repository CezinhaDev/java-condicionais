import java.util.Scanner;

public class Verificaçãodedescontoemcompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Verificando desconto em compras");

        System.out.println("Digite o valor da compra:");
        double valorCompra = scanner.nextDouble();

        if (valorCompra >= 100.0) {
            double desconto = valorCompra * 0.1; // 10% de desconto
            double valorFinal = valorCompra - desconto;
            System.out.printf("Você recebeu um desconto de R$ %.2f. Valor final: R$ %.2f%n", desconto, valorFinal);
        } else {
            System.out.printf("Nenhum desconto aplicado. Valor total: R$ %.2f%n", valorCompra);
        }

        scanner.close();
    }
}
