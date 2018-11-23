package br.com.negocio;

import br.com.entidade.Onibus;
import br.com.entidade.Caminhao;
import br.com.entidade.Automovel;
import br.com.entidade.Moto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class Principal {

    public static List<Automovel> AUTOMOVELS = new ArrayList<>();
    public static List<Moto> MOTOS = new ArrayList<>();
    public static List<Onibus> ONIBUS = new ArrayList<>();
    public static List<Caminhao> CAMINHAOS = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        String opcao = "";
        String opcao2 = "";

        do {
            opcao = ManterInterfaceNegocio.menuPrincipal();
            switch (opcao) {
                case "1": // CADASTRANDO
                    ManterInterfaceNegocio.interfaceCadastro();
                    break;

                case "2": // PESQUISANDO
                    ManterInterfaceNegocio.interfacePesquisa();
                    break;

                case "3": // EXCLUINDO
                    if (ManterInterfaceNegocio.interfaceExclusao()) {
                        return;
                    }
                    break;

                case "4": // ALTERANDO ATRIBUTOS
                    ManterInterfaceNegocio.alterarAtributos();
                    break;

                case "5":
                    ManterInterfaceNegocio.imprimindoLista();
                    break;

            }

        } while (!opcao.equals("0"));

    }

}
