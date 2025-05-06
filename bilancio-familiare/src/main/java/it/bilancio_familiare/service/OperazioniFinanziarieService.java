package it.bilancio_familiare.service;

import java.util.List;

import it.bilancio_familiare.model.OperazioniFinanziarie;

public interface OperazioniFinanziarieService {

    void salvaOperazioneFin(OperazioniFinanziarie opF);
    double calcolaSaldo(List<OperazioniFinanziarie> lista);
    List<OperazioniFinanziarie> getAll();
    void eliminaOperazione(int id);
}
