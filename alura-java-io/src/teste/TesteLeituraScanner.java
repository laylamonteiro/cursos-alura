package teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraScanner {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("contas.csv"));

        while (scanner.hasNextLine()){
            String linha = scanner.nextLine();
//            System.out.println(linha);

            Scanner scanner2 = new Scanner(linha);
            scanner2.useLocale(Locale.US);
            scanner2.useDelimiter(",");

            String valor1 = scanner2.next();
            String valor2 = scanner2.next();
            String valor3 = scanner2.next();
            String valor4 = scanner2.next();
            String valor5 = scanner2.next();

            System.out.println(valor1 + valor2 + valor3 + valor4 + valor5);

//            String[] valores = linha.split(",");
//            System.out.println(valores[3]);
        }

        scanner.close();
    }
}
