package br.com.alura;

public class Somadosnúmerospares {
    public static void main(String[] args) {
        int[] valores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
       
        int somaPares = 0;

        for ( int i = 0; i < valores.length; i++){
            if(valores[i] % 2 == 0){
                somaPares += valores[i]; // somaPares = somaPares + valores[i]
            }
        }
        System.out.println("A soma dos números pares é: " + somaPares);
    }
}
