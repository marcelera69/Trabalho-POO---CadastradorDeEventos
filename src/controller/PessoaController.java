package controller;

import model.Pessoa;
import util.BD;
import view.CadastroPessoaPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PessoaController implements ActionListener {
    private CadastroPessoaPanel view;
    private BD bd;

    public PessoaController(CadastroPessoaPanel view, BD bd) {
        this.view = view;
        this.bd = bd;
        this.view.getSalvarButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nome = view.getNomeField().getText();
        String cpf = view.getCpfField().getText();
        String email = view.getEmailField().getText();
        
        Pessoa pessoa = new Pessoa(nome, cpf, email);
        bd.salvar(pessoa);
        view.mostrarMensagem("Pessoa cadastrada com sucesso!");
    }
}
