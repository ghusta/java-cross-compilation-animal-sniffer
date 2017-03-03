package fr.husta.test;

import org.apache.commons.codec.Charsets;

import java.nio.charset.Charset;

public class TestCharset {

    public static void testSig() {
        try {
            Charset charset = Charsets.toCharset("ISO-8859-15");
            System.out.println(charset);
        } catch (LinkageError error) {
            System.err.println("Pb version Java : " + error.toString());
        }
    }

}
