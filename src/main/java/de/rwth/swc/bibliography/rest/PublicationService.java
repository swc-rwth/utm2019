package de.rwth.swc.bibliography.rest;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import core.Bibliography;
import publications.Book;
import tools.AdminTool;

/**
 * Created by andy on 14.01.16.
 */

@Service
public class PublicationService {

	public String health() {
		return "Everything fine";
	}

	@Autowired
	AdminTool adminTool;
	
	@Autowired
	Bibliography bibliography;
	
	@PostConstruct
	private void init() {

		System.out.println("############# INIT ####################");
		
		
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

		bibliography.add(b1);
		bibliography.add(b2);
		
		bibliography.search("*");
		System.out.println(bibliography.export());
	}
	
}
