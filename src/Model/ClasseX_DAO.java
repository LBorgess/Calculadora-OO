package Model;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Borges
 * @since 11/04/2023
 */
public class ClasseX_DAO {

    public static double valor1;
    public static double valor2;
    public static String operacao;
    
    /**
     * Realiza a soma das váriaveis valor1 e valor2
     */
    public static void soma() {
        String v1 = JOptionPane.showInputDialog(null, "1o. Valor", "Primeiro valor",
                -1);
        valor1 = Double.parseDouble(v1);

        String v2 = JOptionPane.showInputDialog(null, "2o. Valor", "Segundo valor",
                -1);
        valor2 = Double.parseDouble(v2);

        JOptionPane.showMessageDialog(null,
                String.format("%.2f + %.2f = %.2f", valor1, valor2, (valor1 + valor2)),
                "Soma", -1);
    }

    public static void subtracao() {
        String v1 = JOptionPane.showInputDialog(null, "1o. Valor", "Primeiro valor",
                -1);
        valor1 = Double.parseDouble(v1);

        String v2 = JOptionPane.showInputDialog(null, "2o. Valor", "Segundo valor",
                -1);
        valor2 = Double.parseDouble(v2);

        JOptionPane.showMessageDialog(null,
                String.format("%.2f - %.2f = %.2f", valor1, valor2, (valor1 - valor2)),
                "Subtração", -1);
    }

    public static void multiplicacao() {
        String v1 = JOptionPane.showInputDialog(null, "1o. Valor", "Primeiro valor",
                -1);
        valor1 = Double.parseDouble(v1);

        String v2 = JOptionPane.showInputDialog(null, "2o. Valor", "Segundo valor",
                -1);
        valor2 = Double.parseDouble(v2);

        JOptionPane.showMessageDialog(null,
                String.format("%.2f x %.2f = %.2f", valor1, valor2, (valor1 * valor2)),
                "Multiplicação", -1);
    }

    public static void divisao() {
        String v1 = JOptionPane.showInputDialog(null, "1o. Valor", "Primeiro valor",
                -1);
        valor1 = Double.parseDouble(v1);

        String v2 = JOptionPane.showInputDialog(null, "2o. Valor", "Segundo valor",
                -1);
        valor2 = Double.parseDouble(v2);

        if (valor2 == 0) {
            JOptionPane.showMessageDialog(null, "Impossível calcular.", "ERRO", 2);
        } else {
            JOptionPane.showMessageDialog(null,
                    String.format("%.2f / %.2f = %.2f", valor1, valor2, (valor1 / valor2)),
                    "Divisão", -1);
        }
    }

}
