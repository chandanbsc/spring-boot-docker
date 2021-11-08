package com.example.springbootdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.net.InetAddress;
import java.net.UnknownHostException;


@SpringBootApplication
@RestController
public class SpringBootDockerApplication {

	@RequestMapping("/")
	public String home() {
		InetAddress ip;
		String hostname = "N/A";
		String retString = "Hello Docker World";
		try {
			ip = InetAddress.getLocalHost();
			hostname = ip.getHostName();
			retString = retString + " @ IP: " + ip.toString() + " & HostName: " + hostname + "\n";
		} catch (UnknownHostException e) {
			retString = "Hello Docker World @ Unknown IP & Unknown HostName \n";
			e.printStackTrace();
		}
		return  retString;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}

}
