
package br.com.detranjava;

import static br.com.detranjava.Principal.AUTOMOVELS;
import static br.com.detranjava.Principal.CAMINHAOS;
import static br.com.detranjava.Principal.MOTOS;
import static br.com.detranjava.Principal.ONIBUS;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import objetos.Automovel;
import objetos.Caminhao;
import objetos.Moto;
import objetos.Onibus;

/**
 *
 * @author WILL
 */
public class ManterInterfaceNegocio {

    public static String menuPrincipal() throws HeadlessException {
        String opcao;
        opcao = JOptionPane.showInputDialog("###GERENCIAMENTO DE VEICULOS###\r\n"
                + "\r\n1) CADASTRO"
                + "\r\n2) PESQUISAR (PLACA)"
                + "\r\n3) EXCLUIR"
                + "\r\n4) ALTERAR"
                + "\r\n5) LISTAR TODOS"
                + "\r\n0) SAIR\r\n");
        return opcao;
    }

    public static void imprimindoLista() {
        System.out.println("LISTA DE VEICULOS");
        System.out.println("QTD Automoveis= " + AUTOMOVELS.size());
        System.out.println(AUTOMOVELS);
        System.out.println("QTD Motos= " + MOTOS.size());
        System.out.println(MOTOS);
        System.out.println("QTD Onibus= " + ONIBUS.size());
        System.out.println(ONIBUS);
        System.out.println("QTD Caminhoes= " + CAMINHAOS.size());
        System.out.println(CAMINHAOS);
    }

    public static void alterarAtributos() throws NumberFormatException, HeadlessException {
        // ALTERAR ATRIBUTOS DOS VEICULOS //

        String opcao4 = "";

        do {
            opcao4 = menuTipoVeiculo3();
            switch (opcao4) {
                case "1": // ALTERANDO ATRIBUTOS DE AUTOMOVEL
                    alterarAtributosAutomovel();
                    break;

                case "2":   // ALTERANDO ATRIBUTOS DE MOTO
                    alterarAtributosMoto();
                    break;

                case "3":  // ALTERANDO ATRIBUTOS DE ONIBUS
                    alterarAtributosOnibus();
                    break;

                case "4": // ALTERANDO ATRIBUTOS DE CAMINHAO
                    alterarAtributosCaminhao();
                    break;
            }
        } while (!opcao4.equals("0"));
    }

    public static String menuTipoVeiculo3() throws HeadlessException {
        String opcao4;
        opcao4 = JOptionPane.showInputDialog("###SELECAO DE VEICULO###\r\n"
                + "\r\n1) AUTOMOVEL"
                + "\r\n2) MOTO"
                + "\r\n3) ONIBUS"
                + "\r\n4) CAMINHAO"
                + "\r\n0) SAIR\r\n");
        return opcao4;
    }

    public static void alterarAtributosCaminhao() throws NumberFormatException, HeadlessException {
        // ALTERAR ATRIBUTOS DE CAMINHAO //

        String opcao44 = "";

        do {
            opcao44 = JOptionPane.showInputDialog("###MODIFICAR CAMINHÃO###\r\n"
                    + "\r\n1) VALOR"
                    + "\r\n2) PLACA"
                    + "\r\n3) TIPO"
                    + "\r\n4) EIXOS"
                    + "\r\n0) SAIR\r\n");
            switch (opcao44) {
                case "1": // ALTERANDO VALOR DO CAMINHAO
                    alterarValorCaminhao();
                    break;

                case "2": // ALTERANDO PLACA DO CAMINHAO
                    alterarPlacaCaminhao();
                    break;

                case "3": // ALTERANDO TIPO DO CAMINHAO
                    alterarTipoCaminhao();
                    break;

                case "4": // ALTERANDO QTD EIXOS DO CAMINHAO
                    alterarQtdEixosCaminhao();
                    break;

            }
        } while (!opcao44.equals("0"));
    }

    public static void alterarAtributosOnibus() throws NumberFormatException, HeadlessException {
        // ALTERAR ATRIBUTOS DE ONIBUS //

        String opcao43 = "";

        do {
            opcao43 = JOptionPane.showInputDialog("###MODIFICAR ONIBUS###\r\n"
                    + "\r\n1) VALOR"
                    + "\r\n2) PLACA"
                    + "\r\n3) TIPO"
                    + "\r\n3) ACENTOS"
                    + "\r\n0) SAIR\r\n");
            switch (opcao43) {
                case "1": // ALTERANDO VALOR DO ONIBUS
                    alterarValorOnibus();
                    break;

                case "2": // ALTERANDO PLACA DO ONIBUS
                    alterarPlacaOnibus();
                    break;

                case "3": // ALTERANDO TIPO DO ONIBUS
                    alterarTipoOnibus();
                    break;

                case "4": // ALTERANDO QUANTIDADE DE ACENTOS DO ONIBUS
                    alterandoQtdAcentosOnibus();
                    break;

            }
        } while (!opcao43.equals("0"));
    }

    public static void alterarAtributosMoto() throws NumberFormatException, HeadlessException {
        // ALTERAR ATRIBUTOS DE MOTO //

        String opcao42 = "";

        do {
            opcao42 = JOptionPane.showInputDialog("###MODIFICAR MOTO###\r\n"
                    + "\r\n1) VALOR"
                    + "\r\n2) PLACA"
                    + "\r\n3) TIPO"
                    + "\r\n4) POTENCIA"
                    + "\r\n0) SAIR\r\n");
            switch (opcao42) {
                case "1": // ALTERANDO VALOR DA MOTO
                    alterarValorMoto();
                    break;

                case "2": // ALTERANDO PLACA DA MOTO
                    alterarPlacaMoto();
                    break;

                case "3": // ALTERANDO TIPO DA MOTO
                    alterarTipoMoto();

                    break;

                case "4": // ALTERANDO POTENCIA DA MOTO
                    alterarPotenciaMoto();

                    break;

            }
        } while (!opcao42.equals("0"));
    }

    public static void alterarAtributosAutomovel() throws HeadlessException, NumberFormatException {
        // ALTERAR ATRIBUTOS DE AUTOMOVEL //

        String opcao41 = "";

        do {
            opcao41 = JOptionPane.showInputDialog("###MODIFICAR VEICULO###\r\n"
                    + "\r\n1) VALOR"
                    + "\r\n2) PLACA"
                    + "\r\n3) TIPO"
                    + "\r\n4) PORTAS"
                    + "\r\n0) SAIR\r\n");
            switch (opcao41) {
                case "1": // ALTERANDO VALOR DO AUTOMOVEL
                    alterarValorAutomovel();
                    break;

                case "2": // ALTERANDO PLACA DO AUTOMOVEL
                    alterarPlacaAutomovel();
                    break;

                case "3": // ALTERANDO TIPO AUTOMOVEL
                    alterarTipoAutomovel();
                    break;

                case "4": // ALTERANDO QUANTIDADE DE PORTAS
                    alterandoQtdPortasAutomovel();

                    break;

            }
        } while (!opcao41.equals("0"));
    }

    public static void alterarQtdEixosCaminhao() throws NumberFormatException, HeadlessException {
        // ALTERAR QTDEixos CAMINHAO //

        String placaPesquisa3 = JOptionPane.showInputDialog("Digite a placa");

        for (int i = 0; i < CAMINHAOS.size(); i++) {
            if (placaPesquisa3.equals(CAMINHAOS.get(i).getPlaca())) {
                String qtdEixos = JOptionPane.showInputDialog("Digite a nova qtdEixos");
                CAMINHAOS.get(i).setQtdEixos(Integer.valueOf(qtdEixos));
                System.out.println("Quantidade de Eixos Alterada");
            } else {
                System.out.println("Placa não Existe , Tente novamente!");
            }

        }
    }

    public static void alterarTipoCaminhao() throws HeadlessException {
        // ALTERAR TIPO CAMINHAO //

        String placaPesquisa2 = JOptionPane.showInputDialog("Digite a placa");

        for (int i = 0; i < CAMINHAOS.size(); i++) {
            if (placaPesquisa2.equals(CAMINHAOS.get(i).getPlaca())) {
                String altTipo = JOptionPane.showInputDialog("Digite o novo Tipo");
                CAMINHAOS.get(i).setTipo(altTipo);
                System.out.println("Tipo Alterado");
            } else {
                System.out.println("Placa não Existe , Tente novamente!");
            }

        }
    }

    public static void alterarPlacaCaminhao() throws HeadlessException {
        // ALTERAR PLACA CAMINHAO //

        String placaPesquisa1 = JOptionPane.showInputDialog("Digite a placa");

        for (int i = 0; i < CAMINHAOS.size(); i++) {
            if (placaPesquisa1.equals(CAMINHAOS.get(i).getPlaca())) {
                String altPlaca = JOptionPane.showInputDialog("Digite a nova Placa");
                CAMINHAOS.get(i).setPlaca(altPlaca);
                System.out.println("Placa Alterada");
            } else {
                System.out.println("Placa não Existe , Tente novamente!");
            }

        }
    }

    public static void alterarValorCaminhao() throws NumberFormatException, HeadlessException {
        // ALTERAR VALOR CAMINHAO //

        String placaPesquisa = JOptionPane.showInputDialog("Digite a placa");

        for (int i = 0; i < CAMINHAOS.size(); i++) {
            if (placaPesquisa.equals(CAMINHAOS.get(i).getPlaca())) {
                String altValor = JOptionPane.showInputDialog("Digite o novo valor");
                Double valor = Double.valueOf(altValor);
                CAMINHAOS.get(i).setValor(valor);
                System.out.println("Valor Alterado");
            } else {
                System.out.println("Placa não Existe , Tente novamente!");
            }

        }
    }

    public static void alterandoQtdAcentosOnibus() throws NumberFormatException, HeadlessException {
        // ALTERAR QTDACENTOS ONIBUS //

        String placaPesquisa3 = JOptionPane.showInputDialog("Digite a placa");

        for (int i = 0; i < ONIBUS.size(); i++) {
            if (placaPesquisa3.equals(ONIBUS.get(i).getPlaca())) {
                String qtdAcentos = JOptionPane.showInputDialog("Digite o nova qtdAcentos");
                ONIBUS.get(i).setQtdAcentos(Integer.valueOf(qtdAcentos));
                System.out.println("Quantidade de Acentos Alterada");
            } else {
                System.out.println("Placa não Existe , Tente novamente!");
            }

        }
    }

    public static void alterarTipoOnibus() throws HeadlessException {
        // ALTERAR TIPO ONIBUS //

        String placaPesquisa2 = JOptionPane.showInputDialog("Digite a placa");

        for (int i = 0; i < ONIBUS.size(); i++) {
            if (placaPesquisa2.equals(ONIBUS.get(i).getPlaca())) {
                String altTipo = JOptionPane.showInputDialog("Digite o novo Tipo");
                ONIBUS.get(i).setTipo(altTipo);
                System.out.println("Tipo Alterado");
            } else {
                System.out.println("Placa não Existe , Tente novamente!");
            }

        }
    }

    public static void alterarPlacaOnibus() throws HeadlessException {
        // ALTERAR PLACA ONIBUS //

        String placaPesquisa1 = JOptionPane.showInputDialog("Digite a placa");

        for (int i = 0; i < ONIBUS.size(); i++) {
            if (placaPesquisa1.equals(ONIBUS.get(i).getPlaca())) {
                String altPlaca = JOptionPane.showInputDialog("Digite a nova Placa");
                ONIBUS.get(i).setPlaca(altPlaca);
                System.out.println("Placa Alterada");
            } else {
                System.out.println("Placa não Existe , Tente novamente!");
            }

        }
    }

    public static void alterarValorOnibus() throws NumberFormatException, HeadlessException {
        // ALTERAR VALOR ONIBUS //

        String placaPesquisa = JOptionPane.showInputDialog("Digite a placa");

        for (int i = 0; i < ONIBUS.size(); i++) {
            if (placaPesquisa.equals(ONIBUS.get(i).getPlaca())) {
                String altValor = JOptionPane.showInputDialog("Digite o novo valor");
                Double valor = Double.valueOf(altValor);
                ONIBUS.get(i).setValor(valor);
                System.out.println("Valor Alterado");
            } else {
                System.out.println("Placa não Existe , Tente novamente!");
            }

        }
    }

    public static void alterarPotenciaMoto() throws NumberFormatException, HeadlessException {
        // ALTERAR POTENCIA MOTO

        String placaPesquisa3 = JOptionPane.showInputDialog("Digite a placa");

        for (int i = 0; i < MOTOS.size(); i++) {
            if (placaPesquisa3.equals(MOTOS.get(i).getPlaca())) {
                String altPotencia = JOptionPane.showInputDialog("Digite o nova Potencia");
                MOTOS.get(i).setPotencia(Integer.valueOf(altPotencia));
                System.out.println("Potencia Alterada");
            } else {
                System.out.println("Placa não Existe , Tente novamente!");
            }

        }
    }

    public static void alterarTipoMoto() throws HeadlessException {
        // ALTERAR TIPO MOTO //

        String placaPesquisa2 = JOptionPane.showInputDialog("Digite a placa");

        for (int i = 0; i < MOTOS.size(); i++) {
            if (placaPesquisa2.equals(MOTOS.get(i).getPlaca())) {
                String altTipo = JOptionPane.showInputDialog("Digite o novo Tipo");
                MOTOS.get(i).setTipo(altTipo);
                System.out.println("Tipo Alterado");
            } else {
                System.out.println("Placa não Existe , Tente novamente!");
            }

        }
    }

    public static void alterarPlacaMoto() throws HeadlessException {
        // ALTERAR PLACA MOTO //

        String placaPesquisa1 = JOptionPane.showInputDialog("Digite a placa");

        for (int i = 0; i < MOTOS.size(); i++) {
            if (placaPesquisa1.equals(MOTOS.get(i).getPlaca())) {
                String altPlaca = JOptionPane.showInputDialog("Digite a nova Placa");
                MOTOS.get(i).setPlaca(altPlaca);
                System.out.println("Placa Alterada");
            } else {
                System.out.println("Placa não Existe , Tente novamente!");
            }

        }
    }

    public static void alterarValorMoto() throws NumberFormatException, HeadlessException {
        // ALTERAR VALOR MOTO //

        String placaPesquisa = JOptionPane.showInputDialog("Digite a placa");

        for (int i = 0; i < MOTOS.size(); i++) {
            if (placaPesquisa.equals(MOTOS.get(i).getPlaca())) {
                String altValor = JOptionPane.showInputDialog("Digite o novo valor");
                Double valor = Double.valueOf(altValor);
                MOTOS.get(i).setValor(valor);
                System.out.println("Valor Alterado");
            } else {
                System.out.println("Placa não Existe , Tente novamente!");
            }

        }
    }

    public static void alterandoQtdPortasAutomovel() throws NumberFormatException, HeadlessException {
        // ALTERAR QUANTIDADE DE PORTAS AUTOMOVEL //

        String placaPesquisa3 = JOptionPane.showInputDialog("Digite a placa");

        for (int i = 0; i < AUTOMOVELS.size(); i++) {
            if (placaPesquisa3.equals(AUTOMOVELS.get(i).getPlaca())) {
                String altQtdPortas = JOptionPane.showInputDialog("Digite o nova Quantidade de Portas");
                AUTOMOVELS.get(i).setQtdPortas(Integer.valueOf(altQtdPortas));
                System.out.println("Quantidade Alterada");
            } else {
                System.out.println("Placa não Existe , Tente novamente!");
            }

        }
    }

    public static void alterarTipoAutomovel() throws HeadlessException {
        // ALTERAR TIPO AUTOMOVEL //

        String placaPesquisa2 = JOptionPane.showInputDialog("Digite a placa");

        for (int i = 0; i < AUTOMOVELS.size(); i++) {
            if (placaPesquisa2.equals(AUTOMOVELS.get(i).getPlaca())) {
                String altTipo = JOptionPane.showInputDialog("Digite o novo Tipo");
                AUTOMOVELS.get(i).setTipo(altTipo);
                System.out.println("Tipo Alterado");
            } else {
                System.out.println("Placa não Existe , Tente novamente!");
            }

        }
    }

    public static void alterarPlacaAutomovel() throws HeadlessException {
        // ALTERAR PLACA AUTOMOVEL //

        String placaPesquisa1 = JOptionPane.showInputDialog("Digite a placa");

        for (int i = 0; i < AUTOMOVELS.size(); i++) {
            if (placaPesquisa1.equals(AUTOMOVELS.get(i).getPlaca())) {
                String altPlaca = JOptionPane.showInputDialog("Digite a nova Placa");
                AUTOMOVELS.get(i).setPlaca(altPlaca);
                System.out.println("Placa Alterada");
            } else {
                System.out.println("Placa não Existe , Tente novamente!");
            }

        }
    }

    public static void alterarValorAutomovel() throws NumberFormatException, HeadlessException {
        // ALTERAR VALOR AUTOMOVEL //

        String placaPesquisa = JOptionPane.showInputDialog("Digite a placa");

        for (int i = 0; i < AUTOMOVELS.size(); i++) {
            if (placaPesquisa.equals(AUTOMOVELS.get(i).getPlaca())) {
                String altValor = JOptionPane.showInputDialog("Digite o novo valor");
                Double valor = Double.valueOf(altValor);
                AUTOMOVELS.get(i).setValor(valor);
                System.out.println("Valor Alterado");
            } else {
                System.out.println("Placa não Existe , Tente novamente!");
            }

        }
    }

    public static boolean interfaceExclusao() throws HeadlessException {
        // EXCLUIR VEICULO //

        String opcao3 = "";
        do {
            opcao3 = menuTipoVeiculo2();
            switch (opcao3) {
                case "1":
                    // Remocao de Veiculo //

                    String msgPlacaAut = JOptionPane.showInputDialog("Digite a placa do Automovel");
                    if (interfaceRemocaoAutomovel(msgPlacaAut)) {
                        return true;
                    }
                    break;
                case "2":
                    // Remocao de Moto  //

                    String msgPlacaMoto = JOptionPane.showInputDialog("Digite a placa do Automovel");
                    int retorno2 = 0;
                    if (interfaceRemocaoMoto(msgPlacaMoto, retorno2)) {
                        return true;
                    }
                    break;
                case "3":
                    // Remocao de Onibus //

                    String msgPlacaOnibus = JOptionPane.showInputDialog("Digite a placa do Onibus");
                    int retorno3 = 0;
                    if (interfaceRemocaoOnibus(msgPlacaOnibus, retorno3)) {
                        return true;
                    }
                    break;
                case "4":
                    // Remover Caminhao //

                    String msgPlacaCaminhao = JOptionPane.showInputDialog("Digite a placa do Caminhao");
                    int retorno4 = 0;
                    if (interfaceRemocaoCaminhao(msgPlacaCaminhao, retorno4)) {
                        return true;
                    }
                    break;
            }
        } while (!opcao3.equals("0"));
        return false;
    }

    public static String menuTipoVeiculo2() throws HeadlessException {
        String opcao3;
        opcao3 = JOptionPane.showInputDialog("###REMOVER VEICULO###\r\n"
                + "\r\n1) AUTOMOVEL"
                + "\r\n2) MOTO"
                + "\r\n3) ONIBUS"
                + "\r\n4) CAMINHAO "
                + "\r\n0) Sair\r\n");
        return opcao3;
    }

    public static boolean interfaceRemocaoCaminhao(String msgPlacaCaminhao, int retorno4) throws HeadlessException {
        for (int i = 0; i < CAMINHAOS.size(); i++) {
            if (msgPlacaCaminhao.equals(CAMINHAOS.get(i).getPlaca())) {
                retorno4 = JOptionPane.showConfirmDialog(null, "Deseja remover esse Caminhao?\r\n"
                        + "Marca: " + CAMINHAOS.get(i).getMarca() + "\r\nPlaca: " + CAMINHAOS.get(i).getPlaca());
                System.out.println(CAMINHAOS.get(i));
            } else {
                System.out.println("Caminhao não Encontrado , Tente novamente!");
            }
            if (retorno4 == 0) {
                ONIBUS.remove(ONIBUS.get(i));
                System.out.println("Caminhao removido com Sucesso");
            }
            if (retorno4 == 1) {
                System.out.println("Você decidiu não remover o Caminhao");
                return true;
            }
        }
        return false;
    }

    public static boolean interfaceRemocaoOnibus(String msgPlacaOnibus, int retorno3) throws HeadlessException {
        for (int i = 0; i < ONIBUS.size(); i++) {
            if (msgPlacaOnibus.equals(ONIBUS.get(i).getPlaca())) {
                retorno3 = JOptionPane.showConfirmDialog(null, "Deseja remover esse Onibus?\r\n"
                        + "Marca: " + ONIBUS.get(i).getMarca() + "\r\nPlaca: " + ONIBUS.get(i).getPlaca());
                System.out.println(ONIBUS.get(i));
            } else {
                System.out.println("Onibus não Encontrado , Tente novamente!");
            }
            if (retorno3 == 0) {
                ONIBUS.remove(ONIBUS.get(i));
                System.out.println("Onibus removido com Sucesso");
            }
            if (retorno3 == 1) {
                System.out.println("Você decidiu não remover o Onibus");
                return true;
            }
        }
        return false;
    }

    public static boolean interfaceRemocaoMoto(String msgPlacaMoto, int retorno2) throws HeadlessException {
        for (int i = 0; i < MOTOS.size(); i++) {
            if (msgPlacaMoto.equals(MOTOS.get(i).getPlaca())) {
                retorno2 = JOptionPane.showConfirmDialog(null, "Deseja remover essa Moto?\r\n"
                        + "Marca: " + MOTOS.get(i).getMarca() + "\r\nPlaca: " + MOTOS.get(i).getPlaca());
                System.out.println(MOTOS.get(i));
            } else {
                System.out.println("Moto não Encontrada , Tente novamente!");
            }
            if (retorno2 == 0) {
                AUTOMOVELS.remove(AUTOMOVELS.get(i));
                System.out.println("Moto removida com Sucesso");
            }
            if (retorno2 == 1) {
                System.out.println("Você decidiu não remover a Moto");
                return true;
            }
        }
        return false;
    }

    public static boolean interfaceRemocaoAutomovel(String msgPlacaAut) throws HeadlessException {
        int retorno = 0;
        for (int i = 0; i < AUTOMOVELS.size(); i++) {
            if (msgPlacaAut.equals(AUTOMOVELS.get(i).getPlaca())) {
                retorno = JOptionPane.showConfirmDialog(null, "Deseja remover este Automovel?\r\n"
                        + "Marca: " + AUTOMOVELS.get(i).getMarca() + "\r\nPlaca: " + AUTOMOVELS.get(i).getPlaca());
                System.out.println(AUTOMOVELS.get(i));
            } else {
                System.out.println("Veiculo não Encontrado , Tente novamente!");
            }
            if (retorno == 0) {
                AUTOMOVELS.remove(AUTOMOVELS.get(i));
                System.out.println("Veiculo removido com Sucesso");
            }
            if (retorno == 1) {
                System.out.println("Você decidiu não remover o Veiculo");
                return true;
            }
        }
        return false;
    }

    public static void interfacePesquisa() throws HeadlessException {
        // PESQUISAR VEICULO //

        String msgPlaca = JOptionPane.showInputDialog("PESQUISA POR PLACA");

        interfacePesquisaAutomovel(msgPlaca);
        interfacePesquisaMoto(msgPlaca);
        interfacePesquisaOnibus(msgPlaca);
        interfacePesquisaCaminhao(msgPlaca);
    }

    public static void interfacePesquisaCaminhao(String msgPlaca) {
        for (int i = 0; i < CAMINHAOS.size(); i++) {

            if (msgPlaca.equals(CAMINHAOS.get(i).getPlaca())) {
                System.out.println("Caminhao Pesquisado");
                System.out.println(CAMINHAOS.get(i));
            } else {
                System.out.println("Veiculo não Encontrado , Tente novamente!");
            }

        }
    }

    public static void interfacePesquisaOnibus(String msgPlaca) {
        for (int i = 0; i < ONIBUS.size(); i++) {

            if (msgPlaca.equals(ONIBUS.get(i).getPlaca())) {
                System.out.println("Onibus Pesquisado");
                System.out.println(ONIBUS.get(i));
            } else {
                System.out.println("Veiculo não Encontrado , Tente novamente!");
            }
        }
    }

    public static void interfacePesquisaMoto(String msgPlaca) {
        for (int i = 0; i < MOTOS.size(); i++) {

            if (msgPlaca.equals(MOTOS.get(i).getPlaca())) {
                System.out.println("Moto Pesquisada");
                System.out.println(MOTOS.get(i));
            } else {
                System.out.println("Veiculo não Encontrado , Tente novamente!");
            }
        }
    }

    public static void interfacePesquisaAutomovel(String msgPlaca) {
        for (int i = 0; i < AUTOMOVELS.size(); i++) {

            if (msgPlaca.equals(AUTOMOVELS.get(i).getPlaca())) {
                System.out.println("Automovel Pesquisado");
                System.out.println(AUTOMOVELS.get(i));
            } else {
                System.out.println("Veiculo não Encontrado , Tente novamente!");
            }
        }
    }

    public static void interfaceCadastro() throws HeadlessException, NumberFormatException {
        String opcao2;
        // CADASTRO OBRIGATORIO DE VEICULO //

        do {
            opcao2 = menuTipoVeiculo();
            switch (opcao2) {
                case "1": // Cadastrar Automovel
                    interfaceCadastroAutomovel();
                    break;

                case "2": // Cadastrar Moto
                    interfaceCadastroMoto();

                    break;

                case "3": // Cadastrar Onibus
                    interfaceCadastroOnibus();

                    break;

                case "4":
                    interfaceCadastroCaminhao();

                    break;
            }
        } while (!opcao2.equals("0"));
    }

    public static String menuTipoVeiculo() throws HeadlessException {
        String opcao2;
        opcao2 = JOptionPane.showInputDialog("###TIPO DE VEICULO###\r\n"
                + "\r\n1) AUTOMOVEL"
                + "\r\n2) MOTO"
                + "\r\n3) ONIBUS"
                + "\r\n4) CAMINHAO"
                + "\r\n0) SAIR\r\n");
        return opcao2;
    }

    public static void interfaceCadastroCaminhao() throws NumberFormatException, HeadlessException {
        // Cadastrar Caminhao //

        String mensagem4 = JOptionPane.showInputDialog("marca/modelo/ano/valor/placa");

        String msg4[] = mensagem4.split("/");

        CAMINHAOS.add(new Caminhao(msg4[0], msg4[1], Integer.valueOf(msg4[2]), Double.valueOf(msg4[3]), msg4[4]));
    }

    public static void interfaceCadastroOnibus() throws HeadlessException, NumberFormatException {
        // Cadastrar Onibus //

        String mensagem3 = JOptionPane.showInputDialog("marca/modelo/ano/valor/placa");

        String msg3[] = mensagem3.split("/");

        ONIBUS.add(new Onibus(msg3[0], msg3[1], Integer.valueOf(msg3[2]), Double.valueOf(msg3[3]), msg3[4]));
    }

    public static void interfaceCadastroMoto() throws NumberFormatException, HeadlessException {
        // Cadastrar Moto //
        String mensagem2 = JOptionPane.showInputDialog("marca/modelo/ano/valor/placa");

        String msg2[] = mensagem2.split("/");

        MOTOS.add(new Moto(msg2[0], msg2[1], Integer.valueOf(msg2[2]), Double.valueOf(msg2[3]), msg2[4]));
    }

    public static void interfaceCadastroAutomovel() throws NumberFormatException, HeadlessException {
        // Cadastrar Automovel //
        String mensagem = JOptionPane.showInputDialog("marca/modelo/ano/valor/placa");

        String msg[] = mensagem.split("/");

        AUTOMOVELS.add(new Automovel(msg[0], msg[1], Integer.valueOf(msg[2]), Double.valueOf(msg[3]), msg[4]));
    }

}
