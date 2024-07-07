package academy.devdojo.maratonajava.string.teste;

public class StringPerformanceTeste01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String " + (inicio - fim) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(30_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder " + (inicio - fim) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(30_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer " + (inicio - fim) + "ms");

    }

    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
