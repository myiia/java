public class TesteUm {

    public static void main(String[] args) {
        String segundoNome = "Clementino";
        String primeiroNome = "Iasmym";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
