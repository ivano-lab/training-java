package academy.devdojo.maratonajava.formatacao.teste;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import static java.text.NumberFormat.getInstance;

public class NumberFormatTeste01 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[2] = NumberFormat.getCurrencyInstance(localePT);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);
        double valor = 10_000.2130;
        for (NumberFormat numberFormat : nfa) {
            //System.out.println(numberFormat.getMaximumFractionDigits());
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }
        String valorString = "10_000.2130";
        try {
            System.out.println(nfa[0].getInstance(localePT).parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
