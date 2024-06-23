package academy.devdojo.maratonajava;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int [][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1,2,3};
        arrayInt[2] = array;

        for(int[] arrBase: arrayInt) {
            System.out.println("\n----------------");
            for (int num: arrBase) {
                System.out.print(num + " ");
            }
        }
    }
}
