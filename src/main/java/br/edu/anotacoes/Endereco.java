package br.edu.anotacoes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Endereco {
        
    @Id
    @GeneratedValue
    private int id;
    
    private String logradouro;

    private String bairro;

    private String cidade;

    private String estado;

    private String numero;

    private String complemento;

    private String cep;

    public Endereco(String logradouro, String bairro, String cidade, String estado, String numero, String complemento, String cep) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
    }


        
}
