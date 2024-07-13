package academy.devdojo.maratonajava.datas;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTeste01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("message", new Locale("pt", "BR"));
        ResourceBundle bundle2 = ResourceBundle.getBundle("message", new Locale("en", "US"));
        System.out.println(bundle.getString("hi"));
        boolean sasa = bundle.containsKey("sasa");
        System.out.println(sasa);
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        System.out.println(bundle2.getString("hello"));
        System.out.println(bundle2.getString("good.morning"));
        System.out.println(bundle.getString("hi"));
        System.out.println(bundle.getString("azul"));
    }
}
