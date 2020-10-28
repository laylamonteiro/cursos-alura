package teste;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {
    public static void main(String[] args) throws IOException {

        PrintStream ps = new PrintStream("lorem5.txt");
        PrintWriter pw = new PrintWriter("lorem6.txt");
        ps.println("PrintStream");
        ps.println();
        pw.println("PrintWriter");
        pw.println();

        ps.close();
        pw.close();
    }
}
