package br.com.alura;

public class Somadenúmeros {
    public static void main(String[] args) {
        /*
         * int[] valores = {10, 20, 30, 40, 50};
         * int somaTotal = 0;
         * 
         * for(int i = 0; i < valores.length; i++) {
         * somaTotal += valores[i]; // somaTotal = somaTotal + valores[i]
         * }
         * System.out.println("A soma total é: " + somaTotal);
         */

         int[] valores = {10,20};
         int soma= 0;

         for( int i = 0; i < valores.length; i++) {
             soma += valores[i]; // soma = soma - valores[i]
         }
         System.out.println("A soma total é: " + soma);
    }
}
