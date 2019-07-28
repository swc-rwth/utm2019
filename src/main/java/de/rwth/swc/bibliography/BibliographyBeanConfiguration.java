package de.rwth.swc.bibliography;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import core.Bibliography;
import tools.AdminTool;

@Configuration
public class BibliographyBeanConfiguration {

	@Bean
	public Bibliography createBibliography(){
		return new Bibliography();
	}
	
	@Bean 
	public AdminTool createAdminTool() {
		AdminTool admin = new AdminTool();
		admin.setBibliography(createBibliography());
		return admin;
	}

}
