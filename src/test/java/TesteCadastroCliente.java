/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import br.edu.DAO.ClienteDAO2;
import br.edu.DAO.EnderecoDAO;
import br.edu.DAO.MedicoDAO;
import br.edu.anotacoes.Cliente;
import br.edu.anotacoes.Endereco;
import br.edu.anotacoes.Medico;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author Lab1
 */
public class TesteCadastroCliente {
    // <editor-fold defaultstate="collapsed" desc="Teste no cadastro do cliente">  
    public static void main(String[] args) {
        //criação do valor da classe endereço, para ser salvo em cliente
        Endereco endereco = new Endereco(
                "rua x",    //get do logradouro
                "bairro x",    //get do logradouro
                "cidade x",    //get do logradouro
                "estado x",    //get do logradouro
                "numero x",    //get do logradouro
                "complemento x",    //get do logradouro
                "cep x"
        );
        //pegar data para passar para o cliente
        Date  nascimento = null;
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            nascimento = (java.util.Date)format.parse("11/11/1999");
        } catch (ParseException e) {            
            System.out.println("Erro na conversao da data "+ e);;
        }
        //criação do cliente
        Cliente cliente = new Cliente(
                "alergia",
                Double.parseDouble("71.11"),
                Double.parseDouble("1.8"),
                endereco,
                "nome23",
                nascimento,
                true,
                //jC_Genero.getSelectedIndex()== -1,
                "telefone",
                "rg",
                "cpf"
                );
        
        ClienteDAO2 clienteDao = new ClienteDAO2();
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        enderecoDAO.salvar(endereco);
        if(clienteDao.salvar(cliente) == true){
            JOptionPane.showMessageDialog(null, "Cliente Cadastrado com sucesso");
        }else{
            JOptionPane.showMessageDialog(null, "Erro Fale com seu administrador");
        }
    }

    // </editor-fold >
}
