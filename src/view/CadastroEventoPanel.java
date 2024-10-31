package view;

import javax.swing.*;
import java.awt.*;

public class CadastroEventoPanel extends JPanel {
    private JTextField nomeField;
    private JTextField tipoField;
    private JTextField localField;
    private JButton salvarButton;

    public CadastroEventoPanel() {
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Nome do Evento:"));
        nomeField = new JTextField();
        add(nomeField);

        add(new JLabel("Tipo do Evento:"));
        tipoField = new JTextField();
        add(tipoField);

        add(new JLabel("Local do Evento:"));
        localField = new JTextField();
        add(localField);

        salvarButton = new JButton("Salvar");
        add(salvarButton);
    }

    public JTextField getNomeField() {
        return nomeField;
    }

    public JTextField getTipoField() {
        return tipoField;
    }

    public JTextField getLocalField() {
        return localField;
    }

    public JButton getSalvarButton() {
        return salvarButton;
    }

    // Método para exibir uma mensagem para o usuário
    public void mostrarMensagem(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem);
    }
}
