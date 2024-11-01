import java.util.Scanner;

public class ConsumoDadosMoveis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        scanner.close();

        // Converte a entrada para um array de inteiros, cada valor representa uma
        // semana
        String[] consumoSemanalStr = entrada.split(",");
        int[] consumoSemanal = new int[consumoSemanalStr.length];
        int totalMensal = 0;
        int maiorConsumo = 0;
        int semanaMaiorConsumo = 1;

        for (int i = 0; i < consumoSemanalStr.length; i++) {
            consumoSemanal[i] = Integer.parseInt(consumoSemanalStr[i]);
            totalMensal += consumoSemanal[i];

            // Identifica a semana de maior consumo
            if (consumoSemanal[i] > maiorConsumo) {
                maiorConsumo = consumoSemanal[i];
                semanaMaiorConsumo = i + 1;
            }
        }

        // Calcula a média semanal
        double mediaSemanal = (double) totalMensal / consumoSemanal.length;

        // Imprime a saída formatada conforme os requisitos
        System.out.printf("Total mensal: %d MB%n", totalMensal);
        System.out.printf("Media semanal: %.0f MB%n", mediaSemanal);
        System.out.printf("Maior consumo: Semana %d%n", semanaMaiorConsumo);
    }
}
