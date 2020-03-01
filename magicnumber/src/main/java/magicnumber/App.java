package magicnumber;

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

    public MyExtension getExtensionFromFile(String fileName) {
        return null;
    }
}
