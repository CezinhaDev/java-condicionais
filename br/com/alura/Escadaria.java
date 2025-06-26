package br.com.alura;
import java.util.Scanner;

public class Escadaria {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a qunatidade de degraus da escada:");
        int degraus = scanner.nextInt();

        for( int i = 1; i <= degraus; i++){
            System.out.println("subindo p degrau " + i);
        }
        System.out.println("Cheguei ao topo da escada!");

        scanner.close();
    }
}
