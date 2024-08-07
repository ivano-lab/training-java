package academy.devdojo.maratonajava.classesinternas.teste;

public class OuterClassesTeste02 {

    private String nome = "Jaspion";

    void print(final String param) {
        String lastName = "Ninja";
        class LocalClass {
            public void printLocal() {
                System.out.println(param);
                System.out.println("O nome dele é " + nome + " " + lastName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTeste02 outer = new OuterClassesTeste02();
        outer.print("Adivinha quem é?");
    }
}
