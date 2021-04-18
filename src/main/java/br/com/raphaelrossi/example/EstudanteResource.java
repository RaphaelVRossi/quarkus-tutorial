package br.com.raphaelrossi.example;

import java.util.List;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

@Path("/estudante")
public class EstudanteResource {

    List<Estudante> estudanteList = new ArrayList(0);
    
    public EstudanteResource() {
        Estudante estudante = new Estudante();
        estudante.setNome("Estudante 1");
        estudante.setNumeroChamada(1);
        estudanteList.add(estudante);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Estudante> listarEstudante() {
        return estudanteList;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Estudante inserirEstudante(Estudante estudante) {
        estudanteList.add(estudante);
        return estudante;
    }
}