package teste;

import java.io.*;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String writeNome = "Layla Monteiro Ferreira";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
        objectOutputStream.writeObject(writeNome);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("objeto.bin"));
        Object readNome = objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(readNome);
    }
}
