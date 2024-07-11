package academy.devdojo.maratonajava.formatacao.teste;

import java.util.Locale;

public class FormatacaoTeste02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for(String isoLanguage : isoLanguages) {
            System.out.println(isoLanguage + " ");
        }
        System.out.println();

        for (String isoCountry : isoCountries) {
            System.out.println(isoCountry + " ");
        }
    }
}
