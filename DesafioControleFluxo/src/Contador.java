import java.util.Scanner;

class ParametrosInvalidosException extends Exception{ // a classe é uma subclasse da superclasse exception e todas as excecoes sao subclasses da classe sao throwable e exception é uma subclasse de throwable
    public ParametrosInvalidosException(String message){
        super(message); // o construtor aceita uma string chamada message como parametro (( super chama o construtor da superclasse))
    }
}
public class Contador {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro numero: ");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Insira o primeiro numero: ");
        int segundoNumero = scanner.nextInt();

        try{
            contar(primeiroNumero, segundoNumero);
        }
       catch(ParametrosInvalidosException e){
            System.out.println(e.getMessage()); // recuperando a mensagem da superclasse
        }
       scanner.close();
    }
    static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException{//metodo contar que pode lancar essa excecao usando throws
        if(primeiroNumero > segundoNumero){
            throw new ParametrosInvalidosException("O segundo parametro te que ser maior que o primeiro");
        }
        for(int i = primeiroNumero; i <= segundoNumero; i++) {
            System.out.printf("imprimindo o numero... %d%n",  i);
        }
    }
}
