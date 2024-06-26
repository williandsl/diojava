package org.example.dominio;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
@Data
@EqualsAndHashCode
public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluirs = new LinkedHashSet<>();

    public void increverBootcamp (Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsIncritos().add(this);

    }

    public void progredir() {
        Optional <Conteudo> conteudo =this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()){
            this.conteudosConcluirs.add((conteudo.get()));
            this.conteudosInscritos.remove((conteudo.get()));
        }else {
            System.out.println("Voce nao esta macriculado em nenhum conteudo");
        }

    }
    public double calcularTotalXp() {
        return this.conteudosInscritos.stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

}
