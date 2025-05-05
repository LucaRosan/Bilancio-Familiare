package it.bilancio_familiare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.bilancio_familiare.model.OperazioniFinanziarie;
import it.bilancio_familiare.service.OperazioniFinanziarieService;

@Controller
@RequestMapping("/")
public class SalvaOperazioneController {


    @Autowired
    private OperazioniFinanziarieService oFS;



    @GetMapping
    public String renderPagina(Model model){
        OperazioniFinanziarie opF = new OperazioniFinanziarie();
        model.addAttribute("operazioniFinanziarie", opF);
        return "index";
    }


    @PostMapping
    public String salvaOperazioni(@ModelAttribute OperazioniFinanziarie opF){
        oFS.salvaOperazioneFin(opF);
        return "redirect:/";
    }


}
