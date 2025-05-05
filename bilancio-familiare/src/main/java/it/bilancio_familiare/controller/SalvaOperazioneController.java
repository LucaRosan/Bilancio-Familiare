package it.bilancio_familiare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.bilancio_familiare.model.OperazioniFinanziarie;

@Controller
@RequestMapping("/")
public class SalvaOperazioneController {



    @GetMapping
    public String renderPagina(Model model){
        OperazioniFinanziarie opF = new OperazioniFinanziarie();
        model.addAttribute("operazioniFinanziarie", opF);
        return "index";
    }


    @PostMapping
    public String salvaOperazioni(@ModelAttribute OperazioniFinanziarie opF){
        
        return null;
    }


}
