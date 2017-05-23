
import br.edu.DAO.EnderecoDAO;
import br.edu.DAO.EspecialidadeDAO;
import br.edu.DAO.MedicoDAO;
import br.edu.DAO.RecepcionistaDAO;
import br.edu.anotacoes.Endereco;
import br.edu.anotacoes.Especialidade;
import br.edu.anotacoes.Medico;
import br.edu.anotacoes.Recepcionista;
import br.edu.util.Validacao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab1
 */
public class TesteRecepcionista {
    // <editor-fold defaultstate="collapsed" desc="Teste no cadastro do recepcionista">  
    
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
        
        Validacao teste = new Validacao();
        
        //criação do rece
        Recepcionista recepcionista = new Recepcionista(
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
        
        RecepcionistaDAO recepcionistaDAO = new RecepcionistaDAO();
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        
        enderecoDAO.salvar(endereco);
        if(recepcionistaDAO.salvar(recepcionista) == true){
            JOptionPane.showMessageDialog(null, "Medico Cadastrado com sucesso");
        }else{
            JOptionPane.showMessageDialog(null, "Erro Fale com seu administrador");
        }
    }
    
     // </editor-fold>
}
