package academy.devdojo.maratonajava.Exception.runtime.teste;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTeste04 {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }

        try {
            maybeSomeException();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    private static void maybeSomeException() throws SQLException, FileNotFoundException {

    }
}
