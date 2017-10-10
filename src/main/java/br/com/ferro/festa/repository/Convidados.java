package br.com.ferro.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ferro.festa.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long>{

}
