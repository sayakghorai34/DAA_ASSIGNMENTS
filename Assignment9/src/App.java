import java.awt.Desktop;
import java.net.URI;

public class App {

    public static void main(String[] args) throws Exception {
        String url = "http://stackoverflow.com";

        if (Desktop.isDesktopSupported()) {
            // Windows
            Desktop.getDesktop().browse(new URI(url));
        } else {
            // Ubuntu
            Runtime runtime = Runtime.getRuntime();
            runtime.exec("/usr/bin/firefox -new-window " + url);
        }
    }
}