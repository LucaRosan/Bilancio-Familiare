package it.bilancio_familiare.service;

import org.springframework.beans.factory.annotation.Autowired;

import it.bilancio_familiare.model.OperazioniFinanziarie;
import it.bilancio_familiare.repository.BilancioRepository;

public class OperazioniFinanziarieServiceImpl implements OperazioniFinanziarieService {


    @Autowired
    private BilancioRepository bilancioRepository;


    @Override
    public void salvaOperazioneFin(OperazioniFinanziarie opF) {
    }

}
