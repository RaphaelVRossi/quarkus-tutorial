package br.com.raphaelrossi.example;

import java.util.List;
import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional
public class EstudanteService {

    public EstudanteService() {
    }

    public Estudante inserirEstudante(Estudante estudante) {
        Estudante.persist(estudante);
        return estudante;
    }
    
    public List<Estudante> listarEstudantes() {
        return Estudante.listAll();
    }

    public void deletarEstudante(UUID id) {
        Estudante.deleteById(id);
    }
}
