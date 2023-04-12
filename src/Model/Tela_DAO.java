package Model;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Borges
 * @since 11/04/2023
 */
public class Tela_DAO {

    /**
     * Solicita a operação
     */
    public static void Solicitaroperacao() {
        Model.ClasseX_DAO.operacao = JOptionPane.showInputDialog(null,
                  "[ 1 ] Adição\n"
                + "[ 2 ] Subtração\n"
                + "[ 3 ] Multiplicação\n"
                + "[ 4 ] Divisão\n",
                "Escolha", -1);

        if (Model.ClasseX_DAO.operacao.equals("1")) {
            Model.ClasseX_DAO.soma();
        } else if (Model.ClasseX_DAO.operacao.equals("2")) {
            Model.ClasseX_DAO.subtracao();
        } else if (Model.ClasseX_DAO.operacao.equals("3")) {
            Model.ClasseX_DAO.multiplicacao();
        } else if (Model.ClasseX_DAO.operacao.equals("4")) {
            Model.ClasseX_DAO.divisao();
        }
    }

}
