package org.example;

import org.example.dominio.Conteudo;
import org.example.dominio.Curso;
import org.example.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();

        curso.setTitulo("Curso java");
        curso.setDescricao("Descricao curso java");
        curso.setCargaHoraria(8);
        curso.getCargaHoraria();

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descricao curso java");
        curso2.setCargaHoraria(4);
        curso2.getCargaHoraria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria 1");
        mentoria.setDescricao("Mentoria  Descricao");
        mentoria.setData(LocalDate.now());
        System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}