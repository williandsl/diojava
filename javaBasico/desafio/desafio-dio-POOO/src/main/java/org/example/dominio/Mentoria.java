package org.example.dominio;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Data
public class Mentoria extends Conteudo {

    private LocalDate data;

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
}
