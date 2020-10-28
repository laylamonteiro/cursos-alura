package teste;

import java.io.*;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {
        long ini = System.currentTimeMillis();

        Writer fw = new FileWriter("lorem4.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw.newLine();
        bw.newLine();
        bw.newLine();
        bw.write("Teste teste teste teste");

        bw.close();

        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução: " + (fim - ini));
    }
}
