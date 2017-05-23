/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import br.edu.DAO.ClienteDAO2;
import br.edu.DAO.EnderecoDAO;
import br.edu.DAO.EspecialidadeDAO;
import br.edu.DAO.MedicoDAO;
import br.edu.anotacoes.Cliente;
import br.edu.anotacoes.Endereco;
import br.edu.anotacoes.Especialidade;
import br.edu.anotacoes.Medico;
import br.edu.util.Validacao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author Lab1
 */
public class TesteCadastroMedico {
     // <editor-fold defaultstate="collapsed" desc="Teste no cadastro do medico">  
    
    public static void main(String[] args) {
        //criação do valor da classe endereço, para ser salvo em Médico
        Endereco endereco = new Endereco(
                "rua x",    //get do logradouro
                "bairro x",    //get do logradouro
                "cidade x",    //get do logradouro
                "estado x",    //get do logradouro
                "numero x",    //get do logradouro
                "complemento x",    //get do logradouro
                "cep x"
        );
        //pegar data para passar para o medico
        Date  nascimento = null;
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            nascimento = (java.util.Date)format.parse("11/11/1999");
        } catch (ParseException e) {            
            System.out.println("Erro na conversao da data "+ e);;
        }
        
        Especialidade especialidade = new Especialidade("gesgs");
        Validacao teste = new Validacao();
        
        //criação do Médico
        Medico medico = new Medico(
              especialidade,
            "email",
            "123",
            endereco,
            "nome",
            teste.converterIdade("02/05/2017"),
            true,
            "(88)996746115",
            "nego",
            "rg",
            "cpf"
       );
        
        MedicoDAO medicoDAO = new MedicoDAO();
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        EspecialidadeDAO especialidadeDAO = new EspecialidadeDAO();
        //ele salva primeiro o endereço para depois salvar o Médico
        especialidadeDAO.salvar(especialidade);
        enderecoDAO.salvar(endereco);
        enderecoDAO.salvar(endereco);
        if(medicoDAO.salvar(medico) == true){
            JOptionPane.showMessageDialog(null, "Medico Cadastrado com sucesso");
        }else{
            JOptionPane.showMessageDialog(null, "Erro Fale com seu administrador");
        }
    }
    
     // </editor-fold>
}
