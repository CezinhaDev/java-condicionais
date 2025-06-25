import java.util.Scanner;

public class Verificandoaprovaçãoemumadisciplina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Verificando a aprovação em uma disciplina");

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite a nota do aluno:");
        double nota = scanner.nextDouble();

        if (nota >= 7.0) {
            System.out.println(" O aluno " + nome + " foi aprovado com a nota " + nota + ".");
        } else if (nota >= 5.0 && nota < 7.0) {
            System.out.println(" O aluno " + nome + " está de recuperação com a nota " + nota + ".");
        } else {
            System.out.println(" O aluno " + nome + " foi reprovado com a nota " + nota + ".");
        }
    }
}
