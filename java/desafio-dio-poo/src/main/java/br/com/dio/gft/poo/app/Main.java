package br.com.dio.gft.poo.app;

import br.com.dio.gft.poo.model.*;
import br.com.dio.gft.poo.controller.BootcampController;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Java");
        curso1.setCargaHoraria(4);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso - Lombok");
        curso2.setDescricao("Lombok");
        curso2.setCargaHoraria(2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setData(LocalDate.now());
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição");

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java");
        bootcamp1.setDescricao("Descrição bootcamp");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev dev = new Dev();
        dev.setNome("Victor");

        Dev dev2 = new Dev();
        dev2.setNome("Camila");

        BootcampController bootcampService = new BootcampController();
        bootcampService.inscreverBootcamp(dev,bootcamp1);
        bootcampService.inscreverBootcamp(dev2,bootcamp1);

        System.out.println("Incritos: \n");
        System.out.println(String.format("Dev: %s, cursos: ",dev.getNome())+ dev.getConteudosInscritos());
        System.out.println(String.format("Dev: %s, cursos: ",dev2.getNome())+ dev2.getConteudosInscritos());


        bootcampService.progredir(dev);
        bootcampService.progredir(dev2);
        bootcampService.progredir(dev2);
        bootcampService.progredir(dev2);

        System.out.println("\nConluídos: \n");
        System.out.println(String.format("Dev: %s, cursos: ",dev.getNome())+ dev.getConteudosConcluidos());
        System.out.println(String.format("Dev: %s, cursos: ",dev2.getNome())+ dev2.getConteudosConcluidos());

        System.out.println("\nInscritos: \n");
        System.out.println(String.format("Dev: %s, cursos: ",dev.getNome())+ dev.getConteudosInscritos());
        System.out.println(String.format("Dev: %s, cursos: ",dev2.getNome())+ dev2.getConteudosInscritos());

        System.out.println("\nXP: \n");
        System.out.println(String.format("Dev: %s, XP: ",dev.getNome())+ bootcampService.calcularTotalXp(dev));
        System.out.println(String.format("Dev: %s, XP: ",dev2.getNome())+ bootcampService.calcularTotalXp(dev2));
    }

}
