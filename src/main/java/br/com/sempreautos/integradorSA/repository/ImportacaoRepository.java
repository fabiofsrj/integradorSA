package br.com.sempreautos.integradorSA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sempreautos.integradorSA.model.Importacao;

@Repository
public interface ImportacaoRepository extends JpaRepository<Importacao, Long> { }
