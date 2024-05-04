public class TesteUm {
public static void main(String[] args){
      String primeiroNome = "Iasmym";
      String segundoNome = "aparecida";
      String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
      System.out.println(nomeCompleto);
    }
public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
