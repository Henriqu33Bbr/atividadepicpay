import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        ArrayList<Banco> listaBancos = new ArrayList<Banco>();
        Banco bc = new Banco();
        bc.setRazao("Razão?");
        bc.setIdBancario(0001);
        listaBancos.add(bc);

        Cliente cl = new Cliente();
        cl.setCpf("12345678909");
        cl.setNome("Henrique");
        cl.settelefone("12345678909");
        listaCliente.add(cl);

        System.out.println(">>>> Lista de Bancos ");
        System.out.println(listaBancos.toString());

        System.out.println(">>>> Lista de Clientes ");
        System.out.println(listaCliente.toString());
    }
}
