/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author Alunos
 */
public class Moto extends Veiculo {

    private Integer potencia;

    public Moto(String marca, String modelo, Integer ano, Double valor, String placa) {
        super(marca, modelo, ano, valor, placa);
        this.potencia = 0;
        this.ipva = this.valor * 0.02;

    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return super.toString() + "potencia=" + potencia + '}';
    }

}
