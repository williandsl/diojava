package org.example.dominio;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.LinkedHashSet;
import java.util.Set;
@Data
@EqualsAndHashCode
public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluirs = new LinkedHashSet<>();

    public void increverBootcamp (Bootcamp bootcamp) {

    }

    private void progredir() {

    }
    private void  calcularTotalXp () {

    }
}
