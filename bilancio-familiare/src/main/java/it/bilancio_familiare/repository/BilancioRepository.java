package it.bilancio_familiare.repository;

import org.springframework.data.repository.CrudRepository;

import it.bilancio_familiare.model.OperazioniFinanziarie;

public interface BilancioRepository extends CrudRepository<OperazioniFinanziarie, Integer>{
}
