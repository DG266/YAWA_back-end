package it.unisa.yawa;

import it.unisa.yawa.model.Book;
import it.unisa.yawa.model.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final BookRepository repository;

	@Autowired
	public DatabaseLoader(BookRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {
		this.repository.save(new Book("The Alchemist", "Paulo Coelho"));
		this.repository.save(new Book("Fahrenheit 451", "Ray Bradbury"));
		this.repository.save(new Book("Le cronache del mondo emerso", "Licia Troisi"));
	}

}
