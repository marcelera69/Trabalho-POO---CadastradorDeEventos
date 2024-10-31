package controller;

import model.PessoaEvento;
import util.BD;
import view.AssociarPessoaEventoPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AssociacaoController implements ActionListener {
    private AssociarPessoaEventoPanel view;
    private BD bd;

    public AssociacaoController(AssociarPessoaEventoPanel view, BD bd) {
        this.view = view;
        this.bd = bd;
        this.view.getAssociarButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cpf = view.getCpfField().getText();
        String evento = view.getEventoField().getText();
        
        PessoaEvento pessoaEvento = new PessoaEvento(cpf, evento);
        bd.salvar(pessoaEvento);
        view.mostrarMensagem("Pessoa associada ao evento com sucesso!");
    }
}
