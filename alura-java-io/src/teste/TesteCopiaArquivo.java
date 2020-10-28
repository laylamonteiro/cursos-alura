package teste;

import java.io.*;

public class TesteCopiaArquivo {

    public static void main(String[] args) throws IOException {
        long ini = System.currentTimeMillis();
        //Leitura
        InputStream fis =  new FileInputStream("lorem.txt"); // Ler arquivo
//        InputStream fis = System.in; // Ler console
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        //Escrita
//        OutputStream fos =  new FileOutputStream("lorem3.txt");// Escrever arquivo
        OutputStream fos = System.out; // Escrever console
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();

        while (linha != null && !linha.isBlank()){
            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha = br.readLine();
        }

        br.close();
        bw.close();

        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução: " + (fim - ini));
    }
}
