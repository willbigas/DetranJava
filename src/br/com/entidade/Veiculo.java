/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.entidade;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Alunos
 */
public class Veiculo {

    private String tipo;
    private String marca;
    private String modelo;
    private Integer ano;
    protected Double valor;
    private String placa;
    protected Double ipva;
    private Date dataCadastro;

    public Veiculo(String marca, String modelo, Integer ano, Double valor, String placa) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
        this.dataCadastro = new Date();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getIpva() {
        return ipva;
    }

    public void setIpva(Double ipva) {
        this.ipva = ipva;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "Veiculo" + "-" + "tipo=" + tipo + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", valor=" + br.com.utilpacket.UtilFormat.decFormatNormal(valor) + ", placa=" + placa + ", ipva=" + br.com.utilpacket.UtilFormat.decFormatNormal(ipva) + ", dataCadastro=" + dataCadastro +" ";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Veiculo other = (Veiculo) obj;
        if (!Objects.equals(this.placa, other.placa)) {
            return false;
        }
        return true;
    }

}
