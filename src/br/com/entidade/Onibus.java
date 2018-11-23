/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.entidade;

/**
 *
 * @author Alunos
 */
public class Onibus extends Veiculo {

    public Onibus(String marca, String modelo, Integer ano, Double valor, String placa) {
        super(marca, modelo, ano, valor, placa);
        this.qtdAcentos = 0;
        this.ipva = this.valor * 0.04;
    }

    private Integer qtdAcentos;

    public Integer getQtdAcentos() {
        return qtdAcentos;
    }

    public void setQtdAcentos(Integer qtdAcentos) {
        this.qtdAcentos = qtdAcentos;
    }

    @Override
    public String toString() {
        return super.toString() + "qtdAcentos=" + qtdAcentos + '}';
    }

}
