package academy.devdojo.maratonajava.classesinternas.teste;

public class OuterClassesTeste03 {
    private String name = "MySelf";

    static class Nested {
        private String lastName = "Again";
        void print() {
            System.out.println(new OuterClassesTeste03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
