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
public class Automovel extends Veiculo {

    public Automovel(String marca, String modelo, Integer ano, Double valor, String placa) {
        super(marca, modelo, ano, valor, placa);
        this.qtdPortas = 0;
        this.ipva = this.valor * 0.03;
    }

    private Integer qtdPortas;

    public Integer getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(Integer qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    @Override
    public String toString() {
        return super.toString() + "qtdPortas=" + qtdPortas;
    }

}
