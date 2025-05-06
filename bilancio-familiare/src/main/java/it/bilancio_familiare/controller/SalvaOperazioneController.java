package it.bilancio_familiare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.bilancio_familiare.model.OperazioniFinanziarie;
import it.bilancio_familiare.service.OperazioniFinanziarieService;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/")
public class SalvaOperazioneController {


    @Autowired
    private OperazioniFinanziarieService oFService;



    @GetMapping
    public String renderPagina(Model model){
        OperazioniFinanziarie opF = new OperazioniFinanziarie();
        model.addAttribute("operazioniFinanziarie", opF);
        return "index";
    }


    @PostMapping
    public String salvaOperazioni(@Valid @ModelAttribute OperazioniFinanziarie opF, BindingResult result, Model model){

        if(result.hasErrors()){
            return "index";
        }


        oFService.salvaOperazioneFin(opF);
        return "redirect:/elenco";
    }


}
