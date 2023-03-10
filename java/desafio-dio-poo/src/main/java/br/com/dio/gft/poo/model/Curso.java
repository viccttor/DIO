package br.com.dio.gft.poo.model;

import lombok.*;
@Getter
@Setter
public class Curso extends Conteudo{

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

}
