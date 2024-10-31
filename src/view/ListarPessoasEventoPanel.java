package view;

import javax.swing.*;
import java.awt.*;

public class ListarPessoasEventoPanel extends JPanel {
    private JTextField eventoField;
    private JButton listarButton;
    private JTextArea pessoasTextArea;

    public ListarPessoasEventoPanel() {
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(2, 2));
        inputPanel.add(new JLabel("Nome do Evento:"));
        eventoField = new JTextField();
        inputPanel.add(eventoField);

        listarButton = new JButton("Listar Pessoas");
        inputPanel.add(listarButton);

        add(inputPanel, BorderLayout.NORTH);

        pessoasTextArea = new JTextArea();
        pessoasTextArea.setEditable(false);
        add(new JScrollPane(pessoasTextArea), BorderLayout.CENTER);
    }

    public JTextField getEventoField() {
        return eventoField;
    }

    public JButton getListarButton() {
        return listarButton;
    }

    public JTextArea getPessoasTextArea() {
        return pessoasTextArea;
    }

    // Método para exibir pessoas associadas a um evento
    public void mostrarPessoas(String pessoas) {
        pessoasTextArea.setText(pessoas);
    }
}
