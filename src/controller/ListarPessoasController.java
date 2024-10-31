package controller;

import model.PessoaEvento;
import util.BD;
import view.ListarPessoasEventoPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListarPessoasController implements ActionListener {
    private ListarPessoasEventoPanel view;
    private BD bd;

    public ListarPessoasController(ListarPessoasEventoPanel view, BD bd) {
        this.view = view;
        this.bd = bd;
        this.view.getListarButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nomeEvento = view.getEventoField().getText();
        StringBuilder pessoasAssociadas = new StringBuilder();

        // Obtendo a lista de associações
        Object[] listaAssociacoes = bd.obterLista("PessoaEvento");
        for (Object obj : listaAssociacoes) {
            if (obj instanceof PessoaEvento) {
                PessoaEvento pessoaEvento = (PessoaEvento) obj;
                if (pessoaEvento.getEvento().equals(nomeEvento)) {
                    pessoasAssociadas.append(pessoaEvento.getCPF()).append("\n");
                }
            }
        }

        // Mostrando as pessoas associadas ou uma mensagem se não houver
        if (pessoasAssociadas.length() > 0) {
            view.mostrarPessoas(pessoasAssociadas.toString());
        } else {
            view.mostrarPessoas("Nenhuma pessoa associada a este evento.");
        }
    }
}
