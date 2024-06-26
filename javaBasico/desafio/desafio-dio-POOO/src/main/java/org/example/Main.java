package org.example;

import org.example.dominio.*;

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
//        System.out.println(curso);
//        System.out.println(curso2);
//        System.out.println(mentoria);
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descricao Bootcamp Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev will = new Dev();
        will.setNome("Willian");
        will.increverBootcamp(bootcamp);
        System.out.println("Conteudo inscrito" +will.getConteudosInscritos());
        will.progredir();
        System.out.println("Conteudo inscrito" +will.getConteudosInscritos());
        System.out.println("Conteudo concluidos" +will.getConteudosConcluirs());
        System.out.println("xp" +will.calcularTotalXp());


        Dev pedro = new Dev();
        pedro.setNome("Pedrinho");
        pedro.increverBootcamp(bootcamp);
        System.out.println("Conteudo inscrito" +pedro.getConteudosInscritos());
        pedro.progredir();
        pedro.progredir();
        System.out.println("Conteudo inscrito" +pedro.getConteudosInscritos());
        System.out.println("Conteudo concluidos" +pedro.getConteudosConcluirs());
        System.out.println("xp" +pedro.calcularTotalXp());



    }
}