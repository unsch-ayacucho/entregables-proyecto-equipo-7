package pe.edu.unsch;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticaApplication.class, args);
		Browse("http://localhost:8080/views/login");
	}

	 public static void Browse(String url) {
	        if (Desktop.isDesktopSupported()) {
	            Desktop desktop = Desktop.getDesktop();
	            try {
	                desktop.browse(new URI(url));
	            } catch (IOException | URISyntaxException e) {
	                e.printStackTrace();
	            }
	        } else {
	            Runtime runtime = Runtime.getRuntime();
	            try {
	                runtime.exec("rundll32 url.dll,FileProtocolHandler " + url);
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
}
