package br.edu.anotacoes;

import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Cliente extends Pessoa {

	private String alergias;

	private double altura;

	private double peso;

    public Cliente(String alergias, double altura, double peso, String nome, Date dataNascimento, String cpf, boolean sexo, String rg, Endereco endereco, String telefone, Raca raca) {
        super(nome, dataNascimento, cpf, sexo, rg, endereco, telefone, raca);
        this.alergias = alergias;
        this.altura = altura;
        this.peso = peso;
    }
        
        
}