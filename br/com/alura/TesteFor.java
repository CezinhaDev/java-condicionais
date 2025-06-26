package br.com.alura;

public class TesteFor {
    public static void main(String[] args) {
        // while (enquanto) é usado quando não sabemos a quantidade de iterações
        // for (para) é usado quando sabemos a quantidade de iterações

        for (int contador = 0; contador > 50; contador++) {
            System.out.println("Executando o loop for " + contador);
            contador++;
        }
    }
}
