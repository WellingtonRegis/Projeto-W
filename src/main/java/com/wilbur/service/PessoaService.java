package com.wilbur.service;

import com.wilbur.entity.Pessoa;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
public class PessoaService {

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
}
