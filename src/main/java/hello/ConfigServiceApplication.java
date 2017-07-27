package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServiceApplication {

	public static void main(String[] args) {

		System.setProperty("http.proxyHost", "pun-fsrprx.net.plm.eds.com");
		System.setProperty("http.proxyPort", "3128");
		System.setProperty("http.proxyUser", "frxd0m");
		System.setProperty("http.proxyPassword", "123$nILRUP");
		System.setProperty("http.nonProxyHosts", "localhost");
		System.setProperty("http.keepAlive", "true"); 
		
		System.setProperty("https.proxyHost", "pun-fsrprx.net.plm.eds.com");
		System.setProperty("https.proxyPort", "3128");
		System.setProperty("https.proxyUser", "frxd0m");
		System.setProperty("https.proxyPassword", "123$nILRUP");
		System.setProperty("https.nonProxyHosts", "localhost");
		System.setProperty("https.keepAlive", "true");
		
		SpringApplication.run(ConfigServiceApplication.class, args);
	}
}
