package controller.ctrl;

import java.util.ArrayList;

import model.business.EventoBo;
import model.data.business.Evento;
import model.data.business.Pessoa;

public class EventoController {

    private EventoBo eventoBo;
    
    public EventoController() {
        eventoBo = new EventoBo();
    }
    
    public boolean salvarEvento(Evento evento) {
        return eventoBo.incluirEvento(evento);
    }
    
    public boolean excluirEvento(Evento evento) {
        return eventoBo.excluirEvento(evento);
    }
    
    public ArrayList<Evento> pesquisarEventosCadastrados() {
        return eventoBo.pesquisarEventosCadastrados();
    }
    
    public ArrayList<Evento> pesquisarEventosPorPessoa(Pessoa pessoa) {
        return eventoBo.pesquisarEventoPorPessoa(pessoa);
    }
}
