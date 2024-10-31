package view;

import javax.swing.*;
import java.awt.*;

public class CadastroPessoaPanel extends JPanel {
    private JTextField nomeField;
    private JTextField cpfField;
    private JTextField emailField;
    private JButton salvarButton;

    public CadastroPessoaPanel() {
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Nome:"));
        nomeField = new JTextField();
        add(nomeField);

        add(new JLabel("CPF:"));
        cpfField = new JTextField();
        add(cpfField);

        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);

        salvarButton = new JButton("Salvar");
        add(salvarButton);
    }

    public JTextField getNomeField() {
        return nomeField;
    }

    public JTextField getCpfField() {
        return cpfField;
    }

    public JTextField getEmailField() {
        return emailField;
    }

    public JButton getSalvarButton() {
        return salvarButton;
    }

    // Método para exibir uma mensagem para o usuário
    public void mostrarMensagem(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem);
    }
}
