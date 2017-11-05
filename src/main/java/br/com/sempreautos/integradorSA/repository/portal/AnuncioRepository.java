package br.com.sempreautos.integradorSA.repository.portal;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sempreautos.integradorSA.model.portal.Anuncio;

@Repository
public interface AnuncioRepository extends JpaRepository<Anuncio, Serializable> { }
