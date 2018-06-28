package br.com.exemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.exemplo.model.Aula;

public interface IAulaRepository extends JpaRepository<Aula, Long>{

}
