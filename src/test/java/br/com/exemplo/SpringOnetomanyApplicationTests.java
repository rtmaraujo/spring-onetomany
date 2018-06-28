package br.com.exemplo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.exemplo.model.Aula;
import br.com.exemplo.repository.IAulaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringOnetomanyApplicationTests {
	
	@Autowired
	private IAulaRepository repository;

	@Test
	public void contextLoads() {
		Aula aula = repository.findOne(1L);
		Assert.assertEquals("Matematica", aula.getTitulo());
		
		Assert.assertEquals("Trabalho N1", aula.getTarefas().get(0).getTitulo());
		Assert.assertEquals("Trabalho N2", aula.getTarefas().get(1).getTitulo());
	}

}
