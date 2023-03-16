package com.wilbur.resource;

import com.wilbur.entity.Pessoa;
import com.wilbur.service.PessoaService;
import org.json.JSONObject;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/usuario")
public class PessoaResource {

    @Inject
    private PessoaService pessoaService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String recebendoUsuarioDoPost(String json) {
        JSONObject jsonObj = new JSONObject(json);

        Pessoa pessoa = new Pessoa();
        pessoa.setNome(jsonObj.getString("nome"));
        pessoa.setCpf(jsonObj.getString("cpf"));
        pessoa.setEmail(jsonObj.getString("email"));
        pessoa.setTelefone(jsonObj.getString("telefone"));

        pessoaService.cadastrarPessoaNoBanco(pessoa);
        return "Pessoa " + pessoa.getNome() + " cadastrada com sucesso!";
    }

    @GET
    @Path("/{nomePessoa}")
    @Produces(MediaType.TEXT_PLAIN)
    public String buscarUmUsuarioParaGet(@PathParam("nomePessoa") String nome) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);

        Pessoa pessoaPegaNoBanco = pessoaService.buscarUmaPessoaNoBanco(pessoa);
        return pessoaPegaNoBanco.getNome();
    }

}