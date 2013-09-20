package controller;

import java.util.ArrayList;

import model.business.EventoBo;
import model.data.business.Evento;

public class EventoController {

    private EventoBo eventoBo;
    
    public EventoController() {
        eventoBo = new EventoBo();
    }
    
    public boolean salvarEvento() {
        Evento evento = new Evento();
        return eventoBo.incluirEvento(evento);
    }
    
    public boolean excluirEvento(Evento evento) {
        return eventoBo.excluirEvento(evento);
    }
    
    public ArrayList<Evento> pesquisarEventosCadastrados() {
        return eventoBo.pesquisarEventosCadastrados();
    }
}
