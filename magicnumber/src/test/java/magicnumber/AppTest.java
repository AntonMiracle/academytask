package magicnumber;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {
    private String[] fileNames = {"src/test/data/test.jpg", "src/test/data/test.txt", "src/test/data/wrong.jpg", "src/test/data/wrong.txt"};

    @Test
    public void shouldBeJPGWhenGetExtensionFromFileName() throws IOException {
        App app = new App();
        MyExtension expected = MyExtension.JPG;
        MyExtension actual = app.getExtensionFromFileName(fileNames[0]);
        assertThat(expected == actual).isTrue();
    }


    @Test
    public void shouldBeJPGWhenGetExtensionFromFile() throws IOException {
        App app = new App();
        MyExtension expected = MyExtension.JPG;
        MyExtension actual = app.getExtensionFromFile(fileNames[0]);
        assertThat(expected == actual).isTrue();
    }


}
