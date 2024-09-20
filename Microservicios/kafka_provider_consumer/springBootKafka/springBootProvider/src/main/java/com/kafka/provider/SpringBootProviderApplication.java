package com.kafka.provider;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@SpringBootApplication
public class SpringBootProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProviderApplication.class, args);
	}
	@Bean
	CommandLineRunner init(KafkaTemplate<String,String> kafkaTemplate){
		return args -> {
			List<Object> messages = List.of("1",1212,"Hello World!",new Producto1("Galleta Maria",22.4));
				kafkaTemplate.send("probando_zzz",new Producto1("Galleta Maria",22.4).toString());
		};
	}
}
class Producto1{
	String nombre;
	Double price;

	public Producto1(String nombre, Double price) {
		this.nombre = nombre;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Producto1{" +
				"nombre='" + nombre + '\'' +
				", price=" + price +
				'}';
	}
}
