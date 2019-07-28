package de.rwth.swc.oosc.swcarchitect.webservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import de.rwth.swc.bibliography.BibliographySpringApplication;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=BibliographySpringApplication.class)
public class BibliographySpringApplicationTests {

	@Test
	public void contextLoads() {
	}

}
