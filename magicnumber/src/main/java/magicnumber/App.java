package magicnumber;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public MyExtension getExtensionFromFileName(String fileName) {
        String extension = "";
        int i = fileName.lastIndexOf('.');
        if (i > 0) extension = fileName.substring(i + 1).toLowerCase();
        if (extension.length() == 0) return MyExtension.UNKNOWN;
        try {
            return MyExtension.valueOf(extension.toUpperCase());
        } catch (IllegalArgumentException e) {
            return MyExtension.UNKNOWN;
        }
    }

    public MyExtension getExtensionFromFile(String fileName) throws IOException {
        try (DataInputStream ins = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)))) {
            for (MyExtension ex : MyExtension.values()) {
                if (ex.getStart() == ins.readInt()) return ex;
            }
        }
        return MyExtension.UNKNOWN;
    }
}
