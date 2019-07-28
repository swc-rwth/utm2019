package de.rwth.swc.oosc.swcarchitect.webservice;

import de.rwth.swc.bibliography.BibliographySpringApplication;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.helpers.MessageFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.net.URI;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by andy on 27.01.17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=BibliographySpringApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Ignore
public class PublicationResourceTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @LocalServerPort
    int port;

    private String host = "localhost";

    @Test
    public void testInfoResource() throws Exception {
        assertThat(restTemplate).isNotNull();
        assertThat(port).isGreaterThan(0);

        RequestEntity request = RequestEntity.get(new URI(MessageFormatter.arrayFormat("http://{}:{}/publications/info", new Object[]{host, new Long(port)}).getMessage()))
                                .build();

        ResponseEntity<String> result = restTemplate.exchange(request, String.class);
        assertThat(result).isNotNull();
        assertThat(result.getStatusCode().is2xxSuccessful()).isTrue();
        assertThat(result.getBody()).isNotEmpty();
        assertThat(result.getBody()).contains("Everything fine");

    }
}
