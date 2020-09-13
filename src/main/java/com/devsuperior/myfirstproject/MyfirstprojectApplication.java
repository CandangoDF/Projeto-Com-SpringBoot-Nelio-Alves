package com.devsuperior.myfirstproject;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.myfirstproject.entities.Category;
import com.devsuperior.myfirstproject.entities.Product;
import com.devsuperior.myfirstproject.repositories.CategoryRepository;
import com.devsuperior.myfirstproject.repositories.ProductRepository;

@SpringBootApplication
public class MyfirstprojectApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryrepository;
	
	@Autowired
	private ProductRepository productrepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MyfirstprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(1L, "Electronics");
		Category cat2 = new Category(2L, "Books");
		
		Product p1 = new Product(1L, "TV", 2200.00, cat1);
		Product p2 = new Product(2L, "Domain Driven Design", 120.00, cat2);
		Product p3 = new Product(3L, "PS5", 2800.00, cat1);
		Product p4 = new Product(4L, "Docker", 100.00, cat2);

		cat1.getProducts().addAll(Arrays.asList(p1, p3));
		cat2.getProducts().addAll(Arrays.asList(p2, p4));
		
		categoryrepository.save(cat1);
		categoryrepository.save(cat2);
		
		productrepository.save(p1);
		productrepository.save(p2);
		productrepository.save(p3);
		productrepository.save(p4);
		
	}

	
}
