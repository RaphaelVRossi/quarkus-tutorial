package br.com.raphaelrossi.example;

import java.util.List;
import java.util.UUID;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/estudante")
public class EstudanteResource {

    @Inject
    EstudanteService estudanteService;

    public EstudanteResource() {
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public List<Estudante> buscarEstudantePorId(@PathParam("id") UUID id) {
        return estudanteService.listarEstudantes();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Estudante> listarEstudante() {
        return estudanteService.listarEstudantes();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Estudante inserirEstudante(Estudante estudante) {
        estudanteService.inserirEstudante(estudante);
        return estudante;
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Response deletarEstudante(@PathParam("id") UUID id) {
        estudanteService.deletarEstudante(id);
        return Response.noContent().build();
    }
}