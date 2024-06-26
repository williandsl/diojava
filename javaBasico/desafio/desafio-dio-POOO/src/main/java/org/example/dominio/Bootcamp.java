package org.example.dominio;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@EqualsAndHashCode
public class Bootcamp extends Conteudo{

    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate daaFinal = dataInicial.plusDays(45);

    private Set<Dev> devsIncritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();


    @Override
    public double calcularXp() {
        return 0;
    }
}
