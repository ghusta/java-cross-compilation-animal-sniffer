package fr.husta.test;

import org.apache.commons.codec.Charsets;

import java.nio.charset.Charset;

public class TestCharset {

    public static void testSig() {
        try {
            Charset charset = Charsets.toCharset("ISO-8859-15");
            System.out.println(charset);
        } catch (UnsupportedClassVersionError error) {
            // If library in an unsupported Java version, will get this error :
            // java.lang.UnsupportedClassVersionError: Bad version number in .class file
            System.err.println("Pb version Java : " + error.toString());
        } catch (LinkageError error) {
            System.err.println("Other LinkageError : " + error.toString());
        }
    }

}
