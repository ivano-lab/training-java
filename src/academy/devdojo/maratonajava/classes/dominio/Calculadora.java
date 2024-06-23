package academy.devdojo.maratonajava.classes.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10+10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(22 - 3);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double n1, double n2) {
        if(n2 == 0) {
            return 0;
        }
        return n1 / n2;
    }

    public void alteraNum(int n1, int n2) {
        n1 = 99;
        n2 = 66;
        System.out.println("No alteraNUm");
        System.out.println("n1 " + n1);
        System.out.println("n2 " + n2);
    }

    public void somaArray(int... numeros) {
        int soma = 0;
        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
