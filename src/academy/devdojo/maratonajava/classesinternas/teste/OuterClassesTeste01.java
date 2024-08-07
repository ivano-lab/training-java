package academy.devdojo.maratonajava.classesinternas.teste;

public class OuterClassesTeste01 {

    private String name = "Monkey D. LUffy";

    class Inner {
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTeste01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassesTeste01 outerClass = new OuterClassesTeste01();
        Inner inner = outerClass.new Inner();
        Inner inner2 = new OuterClassesTeste01().new Inner();
        inner.printOuterClassAttribute();
        //inner2.printOuterClassAttribute();
    }
}
