package view;

import javax.swing.*;
import java.awt.*;

public class AssociarPessoaEventoPanel extends JPanel {
    private JTextField cpfField;
    private JTextField eventoField;
    private JButton associarButton;

    public AssociarPessoaEventoPanel() {
        setLayout(new GridLayout(3, 2));

        add(new JLabel("CPF da Pessoa:"));
        cpfField = new JTextField();
        add(cpfField);

        add(new JLabel("Nome do Evento:"));
        eventoField = new JTextField();
        add(eventoField);

        associarButton = new JButton("Associar");
        add(associarButton);
    }

    public JTextField getCpfField() {
        return cpfField;
    }

    public JTextField getEventoField() {
        return eventoField;
    }

    public JButton getAssociarButton() {
        return associarButton;
    }

    // Método para exibir uma mensagem para o usuário
    public void mostrarMensagem(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem);
    }
}
