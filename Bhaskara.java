/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bhaskara;
import javax.swing.JOptionPane;

/**
 *
 * @author melis
 */
public class Bhaskara {

    public static void main(String[] args) {
        
          double a = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o valor de a:")
        );

        double b = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o valor de b:")
        );

        double c = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o valor de c:")
        );

        if (a == 0) {
            JOptionPane.showMessageDialog(null,
                    "Não é uma equação do segundo grau");
        } else {

            double delta = Math.pow(b, 2) - (4 * a * c);

            if (delta < 0) {
                JOptionPane.showMessageDialog(null,
                        "Delta = " + delta +
                        "\nA equação não possui raízes reais.");
            } else {

                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                JOptionPane.showMessageDialog(null,
                        "Delta = " + delta +
                        "\nX1 = " + x1 +
                        "\nX2 = " + x2);
            }
        }
    }
}
