package controller;

import model.Evento;
import util.BD;
import view.CadastroEventoPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoController implements ActionListener {
    private CadastroEventoPanel view;
    private BD bd;

    public EventoController(CadastroEventoPanel view, BD bd) {
        this.view = view;
        this.bd = bd;
        this.view.getSalvarButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nome = view.getNomeField().getText();
        String tipo = view.getTipoField().getText();
        String local = view.getLocalField().getText();
        
        Evento evento = new Evento(nome, tipo, local);
        bd.salvar(evento);
        view.mostrarMensagem("Evento cadastrado com sucesso!");
    }
}
