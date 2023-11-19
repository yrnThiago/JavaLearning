public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);

        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        double media = notaDoFilme + 9.1;

        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura
                Muito bom!
                Ano de lançamento %d
                """ + anoDeLancamento;

        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }
}