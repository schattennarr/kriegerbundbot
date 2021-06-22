package de.schattennarr.kriegerbundbot;

import net.dv8tion.jda.api.JDABuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KriegerbundbotApplication {

	String token;
	JDABuilder builder = JDABuilder.createDefault(token);

	public static void main(String[] args) {
		SpringApplication.run(KriegerbundbotApplication.class, args);
	}

}
