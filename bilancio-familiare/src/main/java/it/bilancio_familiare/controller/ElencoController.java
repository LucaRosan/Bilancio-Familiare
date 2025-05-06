package it.bilancio_familiare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.bilancio_familiare.service.OperazioniFinanziarieService;

@Controller
@RequestMapping("/elenco")
public class ElencoController {

    @Autowired
    private OperazioniFinanziarieService opFService;

    @GetMapping
    public String renderPagina(Model model) {

        model.addAttribute("lista", opFService.getAll());
        model.addAttribute("saldo", opFService.calcolaSaldo(opFService.getAll()));
        return "elenco";
    }


    @GetMapping("/delete")
    public String cancellaOperazione(@RequestParam(defaultValue="0") int id){

        if(id==0){
            return "redirect:/elenco"; 
        }
        opFService.eliminaOperazione(id);
        return "redirect:/elenco";
    }

}
