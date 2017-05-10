package br.edu.anotacoes;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Pessoa {

	private String nome;

	private Date dataNascimento;
        @Id
	private String cpf;

	private boolean sexo;

	private String rg;

	private Endereco endereco;

	private String telefone;

	private String raca;

    public Pessoa(String nome, Date dataNascimento, String cpf, boolean sexo, String rg, Endereco endereco, String telefone, String raca) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.sexo = sexo;
        this.rg = rg;
        this.endereco = endereco;
        this.telefone = telefone;
        this.raca = raca;
    }

        
}
