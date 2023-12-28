package it.unisa.yawa.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
@RepositoryRestResource
public interface BookRepository extends JpaRepository<Book, Long> {
	List<Book> findByTitleContaining(String title);
}
