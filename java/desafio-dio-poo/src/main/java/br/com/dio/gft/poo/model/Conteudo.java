package br.com.dio.gft.poo.model;

import lombok.Data;

@Data
public abstract class Conteudo {

    protected String titulo;
    protected String descricao;
    protected static final double XP_PADRAO = 10d;
    public abstract double calcularXp();

}
