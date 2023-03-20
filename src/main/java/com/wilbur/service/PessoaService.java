package com.wilbur.service;

import com.wilbur.entity.Pessoa;
import org.json.JSONObject;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class PessoaService {

    @Inject
    private PessoaService pessoaService;

    @Transactional
    public void cadastrarPessoaNoBanco(Pessoa pessoa) {
        pessoa.persist(pessoa);
        System.out.println(pessoa);
    }

    @Transactional
    public Pessoa buscarUmaPessoaNoBanco(Pessoa pessoa) {
        Pessoa pessoaVindaDoBanco = pessoa.find("nome", pessoa.getNome()).firstResult();
        System.out.println(pessoaVindaDoBanco.getNome());
        return pessoaVindaDoBanco;
    }
//    @Transactional
//    public List<Pessoa> findAll(Pessoa pessoa){
//        return pessoaService.findAll(pessoa);
//    }






}
