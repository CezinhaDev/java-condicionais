import java.util.Scanner;

public class VerificacaoDiaUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o dia da semana (em letras minúsculas): ");
        String dia = scanner.nextLine();
        scanner.close();

        if (dia.equals("segunda") || dia.equals("terça") || dia.equals("quarta") ||
                dia.equals("quinta") || dia.equals("sexta")) {
            System.out.println(dia + " é um dia útil.");
        } else if (dia.equals("sábado") || dia.equals("domingo")) {
            System.out.println(dia + " não é um dia útil.");
        } else {
            System.out.println("Dia inválido! Por favor, digite um dia da semana válido.");
        }
    }
}