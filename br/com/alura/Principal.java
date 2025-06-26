package br.com.alura;

public class Principal {

    public static void main(String[] args) {
        String[] vendedores = {"Carlos", "Mariana", "João", "Fernanda", "Roberto", "Ana", "Luiza", "Pedro", "Sofia", "Ricardo", "Julia"};
        double[] vendas = {4000.00, 8000.00, 12000.00, 5000.00, 15000.00, 6000.00, 9000.00, 3000.00, 11000.00, 7000.00, 2000.00};

        for (int i = 0; i < vendedores.length; i++) { // length muito usado em arrays
            System.out.printf("%s - comissão %.2f\n", vendedores[i], calcularComissao(vendas[i]));
        }


        System.out.println("\n testando com while");

        int j = 0;
        boolean imprimeOutro = true;

        while (imprimeOutro){
            
        }
    }

    public static double calcularComissao(double totalVendas) {
        if (totalVendas <= 5000) {
            return totalVendas * 0.03;
        } else if (totalVendas <= 10000) {
            return totalVendas * 0.05;
        } else {
            return totalVendas * 0.07;
        }
    }
}