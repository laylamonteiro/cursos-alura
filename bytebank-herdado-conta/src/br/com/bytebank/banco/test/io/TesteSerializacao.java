package br.com.bytebank.banco.test.io;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException {
        Cliente cliente=new Cliente();
        cliente.setNome("Layla Monteiro Ferreira");
        cliente.setCpf("123.456.789-00");
        cliente.setProfissao("Desenvolvedora");

        ContaCorrente cc = new ContaCorrente(222,333);
        cc.deposita(2500);
        cc.setTitular(cliente);

        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("cc.bin"));
        objectOutputStream.writeObject(cc);
        objectOutputStream.close();
    }

}
