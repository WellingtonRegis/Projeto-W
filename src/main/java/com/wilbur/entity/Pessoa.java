package com.wilbur.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Pessoa extends PanacheEntity {

    public String nome;
    public String cpf;
    public String email;
    public String telefone;

    public Pessoa() {
    }

    public Pessoa( String nome, String cpf, String email, String telefone) {

        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }                                                                                                                                                                                                                                                                                                                                     

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
