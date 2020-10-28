package teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

    public static void main(String[] args) throws UnsupportedEncodingException {

        String s = "Layla";
        System.out.println(s.codePointAt(0));
        System.out.println(s.codePointAt(1));
        System.out.println(s.codePointAt(2));
        System.out.println(s.codePointAt(3));
        System.out.println(s.codePointAt(4));

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        System.out.println(bytes.length);

        bytes = s.getBytes(StandardCharsets.UTF_16);
        System.out.println(bytes.length);

        bytes = s.getBytes(StandardCharsets.US_ASCII);
        System.out.println(bytes.length);

    }
}
