import java.util.Scanner;

public class MonitoramentoDadosMoveis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o limite mensal de dados em GB
        int limiteMensalGB = Integer.parseInt(scanner.nextLine());
        // Lê o consumo total de dados em MB
        int consumoTotalMB = Integer.parseInt(scanner.nextLine());
        scanner.close();

        // Converte o limite de dados de GB para MB
        int limiteMensalMB = limiteMensalGB * 1024;

        // Verifica se o consumo total excedeu o limite
        if (consumoTotalMB > limiteMensalMB) {
            System.out.println("Limite de dados excedido. Compre ou renove seu pacote.");
        } else {
            int mbDisponiveis = limiteMensalMB - consumoTotalMB;
            System.out.printf("Voce ainda possui %d MB disponiveis.%n", mbDisponiveis);
        }
    }
}