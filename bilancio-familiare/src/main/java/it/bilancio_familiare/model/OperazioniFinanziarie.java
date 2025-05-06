package it.bilancio_familiare.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "operazioni_finanziarie")
public class OperazioniFinanziarie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @PastOrPresent(message = "La Data non può essere nel Futuro")
    private LocalDate dataOperazione;
    
    @Pattern(regexp = "[a-zA-Z\\sàèìòù1-9]{1,50}", message = "Caratteri Non Ammessi In Descrizione")
    private String descrizione;

    @DecimalMin(value = "0.01", message = "L'importo deve essere maggiore di zero")
    private double importo;
    private String tipoMovimento;
    private double bilancioFinale;
}
