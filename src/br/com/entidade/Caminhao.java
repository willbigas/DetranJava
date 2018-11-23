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
public class Caminhao extends Veiculo {

    private Integer qtdEixos;

    public Caminhao(String marca, String modelo, Integer ano, Double valor, String placa) {
        super(marca, modelo, ano, valor, placa);
        this.qtdEixos = 0;
        this.ipva = this.valor * 0.05;
    }

    public Integer getQtdEixos() {
        return qtdEixos;
    }

    public void setQtdEixos(Integer qtdEixos) {
        this.qtdEixos = qtdEixos;
    }

    public void calculoIpva() {
        this.setIpva(this.getValor() * 0.5);

    }

    @Override
    public String toString() {
        return super.toString() + "qtdEixos=" + qtdEixos + '}';
    }

}
