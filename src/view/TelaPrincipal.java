package view;

import javax.swing.*;
import java.awt.*;
import controller.PessoaController;
import controller.EventoController;
import controller.AssociacaoController;
import controller.ListarPessoasController; // Importando o controlador
import util.BD;

public class TelaPrincipal extends JFrame {
    public TelaPrincipal() {
        String path = "src/util/BD.java";
        BD bd = new BD(path);

        CadastroPessoaPanel panelCadastroPessoa = new CadastroPessoaPanel();
        CadastroEventoPanel panelCadastroEvento = new CadastroEventoPanel();
        AssociarPessoaEventoPanel panelAssociarPessoa = new AssociarPessoaEventoPanel();
        ListarPessoasEventoPanel panelListarPessoas = new ListarPessoasEventoPanel();

        new PessoaController(panelCadastroPessoa, bd);
        new EventoController(panelCadastroEvento, bd);
        new AssociacaoController(panelAssociarPessoa, bd);
        new ListarPessoasController(panelListarPessoas, bd); // Conectando o controlador

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Cadastrar Pessoa", panelCadastroPessoa);
        tabbedPane.addTab("Cadastrar Evento", panelCadastroEvento);
        tabbedPane.addTab("Associar Pessoa a Evento", panelAssociarPessoa);
        tabbedPane.addTab("Listar Pessoas do Evento", panelListarPessoas);

        add(tabbedPane, BorderLayout.CENTER);
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}




