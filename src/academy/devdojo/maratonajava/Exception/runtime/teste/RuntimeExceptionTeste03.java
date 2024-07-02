package academy.devdojo.maratonajava.Exception.runtime.teste;

public class RuntimeExceptionTeste03 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static void abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            throw new RuntimeException();
        }finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
