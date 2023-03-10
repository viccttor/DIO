package br.com.dio.gft.poo.controller;

import br.com.dio.gft.poo.model.Bootcamp;
import br.com.dio.gft.poo.model.Conteudo;
import br.com.dio.gft.poo.model.Dev;

import java.util.Iterator;
import java.util.Optional;

public class BootcampController {


    public void inscreverBootcamp(Dev dev, Bootcamp bootcamp) {
        dev.getConteudosInscritos().addAll(bootcamp.getConteudos());
        bootcamp.getDevInscritos().add(dev);
    }

    ;

    public void progredir(Dev dev) {
        Optional<Conteudo> conteudo = dev.getConteudosInscritos().stream().findFirst();
        if (conteudo.isPresent()) {
            dev.getConteudosConcluidos().add(conteudo.get());
            dev.getConteudosInscritos().remove(conteudo.get());
        } else {
            System.err.println("Você não está inscrito em nenhum conteúdo");
        }
    }

    ;

    public double calcularTotalXp(Dev dev) {
        Iterator<Conteudo> iterator = dev.getConteudosConcluidos().iterator();
        double soma = 0;
        while (iterator.hasNext()) {
            double next = iterator.next().calcularXp();
            soma += next;
        }
        return soma;

    }
}