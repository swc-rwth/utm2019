package de.rwth.swc.bibliography.rest;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import core.Bibliography;
import io.swagger.annotations.ApiOperation;
import publications.Book;
import publications.Publication;
import tools.AdminTool;

/**
 * Created by andy on 14.01.16.
 */

@RestController
@RequestMapping("/books")
public class PublicationResource {

	@Autowired
	private Bibliography bibliography;

	@Autowired
	private AdminTool adminTool;

	@PostConstruct
	private void init() {

		Book b1 = new Book("01"), b2 = new Book("02");

		b1.setTitle("Software Engineering");
		b1.addAuthor("Ian Sommerville");
		b1.setYear("2015");
		b1.setPublishingHouse("Pearson");
		b1.setIsbn("978-0133943030");

		b2.setTitle("Design Patterns");
		b2.addAuthor("Erich Gamma, Richard Helm, John Vlissides, Ralph Johnson");
		b2.setYear("2010");
		b2.setPublishingHouse("Addison-Wesley");
		b2.setIsbn("978-3827330437");

		adminTool.add(b1);
		adminTool.add(b2);

	}

	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public String info() {
		return "Everything fine";
	}

	@ApiOperation(value = "Gets all existing publications", notes = "Provides all publications as String", response = Publication.class)
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String getAllBooks() {
		bibliography.search("*");
		return bibliography.export();
	}

	@ApiOperation(value = "Gets all existing publications", notes = "Provides all publications as String", response = Publication.class)
	@RequestMapping(value = "", method = RequestMethod.GET, consumes = "application/json")
	public List<Publication> getAllBooksAsJSON() {
		bibliography.search("*");
		return bibliography.getPublications();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<String> showPublication(@PathVariable("id") String id) {
		bibliography.search(id);
		return ResponseEntity.ok().body(bibliography.export());
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, consumes = "application/json")
	@ResponseBody
	public ResponseEntity<Book> showBookAsJSON(@PathVariable("id") String id) {
		bibliography.search(id);
		return ResponseEntity.ok().body((Book) bibliography.getPublications().getFirst());
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = "application/json")
	@ResponseBody
	public ResponseEntity<Book> createBook(@PathVariable("id") String id, @RequestBody Book pub) {
		bibliography.search(id);
		bibliography.add(pub);
		return ResponseEntity.status(201).build();
	}

	@RequestMapping(value = "", method = RequestMethod.POST, consumes = "application/json")
	@ResponseBody
	public ResponseEntity<Publication> updateBook(@RequestBody Book pub) {
		bibliography.add(pub);
		return ResponseEntity.status(201).build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<Publication> createBook(@PathVariable("id") String id) {
		bibliography.remove(id);
		return ResponseEntity.status(200).build();
	}

}
