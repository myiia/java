import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        while (true) {
            int opcao = scanner.nextInt();
            switch (opcao){
                case 1:{

                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo atual: %.2f%n"+ saldo);
                    break;
                }
                case 2:{
                    double saque = scanner.nextDouble();
                    if (saque <=saldo) {
                        saldo -= saque;
                        System.out.println("Saldo atual: %.2f%n"+ saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                }
                case 3:{
                    System.out.println("Saldo atual: %.2f%n"+ saldo);
                    break;
                }
                case 0:{
                    scanner.close();
                    System.exit(0);
                }
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}


