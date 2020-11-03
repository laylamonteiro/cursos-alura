package teste;

import java.io.*;


public class TesteSerializacaoCliente {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cliente cliente = new Cliente();
        cliente.setNome("Layla Monteiro Ferreira");
        cliente.setCpf("123.456.789-00");
        cliente.setProfissao("Desenvolvedora");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        objectOutputStream.writeObject(cliente);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente readCliente = (Cliente) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(readCliente.getNome());
        System.out.println(readCliente.getCpf());
        System.out.println(readCliente.getProfissao());
        System.out.println(readCliente);
    }
}
