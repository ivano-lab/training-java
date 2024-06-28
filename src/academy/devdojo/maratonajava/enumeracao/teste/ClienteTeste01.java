package academy.devdojo.maratonajava.enumeracao.teste;

import academy.devdojo.maratonajava.enumeracao.TipoCliente;
import academy.devdojo.maratonajava.enumeracao.dominio.Cliente;
import academy.devdojo.maratonajava.enumeracao.dominio.TipoPagamento;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("DC Comics", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Flash", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente);
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente novoTipoCliente = tipoCliente.tipoClienteNomeRelatorio("Pessoa Física**");
        System.out.println(novoTipoCliente);
    }
}
