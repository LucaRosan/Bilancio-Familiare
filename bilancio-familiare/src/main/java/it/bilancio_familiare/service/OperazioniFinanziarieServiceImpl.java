package it.bilancio_familiare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.bilancio_familiare.model.OperazioniFinanziarie;
import it.bilancio_familiare.repository.BilancioRepository;

@Service
public class OperazioniFinanziarieServiceImpl implements OperazioniFinanziarieService {

    @Autowired
    private BilancioRepository bilancioRepository;

    @Override
    public void salvaOperazioneFin(OperazioniFinanziarie opF) {
        List<OperazioniFinanziarie> lista = getAll();

        double saldoAttuale = calcolaSaldo(lista);

        double nuovoSaldo;
        if (opF.getTipoMovimento().equalsIgnoreCase("entrata")) {
            nuovoSaldo = saldoAttuale + opF.getImporto();
        } else {
            if(opF.getImporto() > saldoAttuale){
                return;
            }
            nuovoSaldo = saldoAttuale - opF.getImporto();
        }

        opF.setBilancioFinale(nuovoSaldo);

        bilancioRepository.save(opF);

    }

    @Override
    public double calcolaSaldo(List<OperazioniFinanziarie> lista) {
        double saldo = 0;

        for (OperazioniFinanziarie op : lista) {
            if (op.getTipoMovimento().equalsIgnoreCase("entrata")) {
                saldo += op.getImporto();
            } else if (op.getTipoMovimento().equalsIgnoreCase("uscita")) {
                saldo -= op.getImporto();
            }
        }

        return saldo;
    }

    @Override
    public List<OperazioniFinanziarie> getAll() {
        return (List<OperazioniFinanziarie>) bilancioRepository.findAll();
    }

    @Override
    public void eliminaOperazione(int id) {
        OperazioniFinanziarie opF = bilancioRepository.findById(id).get();

        bilancioRepository.delete(opF);
    }

}
