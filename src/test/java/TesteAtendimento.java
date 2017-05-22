
import br.edu.DAO.AtendimentoDAO;
import br.edu.DAO.ClienteDAO2;
import br.edu.DAO.MedicoDAO;
import br.edu.anotacoes.Atendimento;
import br.edu.anotacoes.Cliente;
import br.edu.anotacoes.Medico;
import br.edu.util.Validacao;
import java.util.List;
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
public class TesteAtendimento {
        public static void main(String[] args) {
        AtendimentoDAO atendimentoDAO = new AtendimentoDAO();
        MedicoDAO medicoDAO = new MedicoDAO();
        ClienteDAO2 clienteDAO2 = new ClienteDAO2();
        Validacao validar = new Validacao();

        /*criação do medico, usando o campo de id, para pegar o id, criei uma lista que esta invisivel na aplicação com os ids
        quando o usuario seleciona o medico a busca pega o numero do campo que ele selecionou e vai buscar na comonbox invisivel
        pegando esse id ele o transforma de String para inteiro e passa pra busca, a busca retorna uma lista, onde pegamos apenas o primeiro resultado*/
        Medico medico = (medicoDAO.listarCampos("id", 1).get(0));
        Cliente cliente = (clienteDAO2.listarCampos("id", 32768).get(0));
        boolean teste = true;
        List<Atendimento> atendimentos = atendimentoDAO.listarCampos("data", validar.converterIdade("08/05/2017"));
        JOptionPane.showMessageDialog(null, atendimentos.get(3).getHoraConsulta());
        for (int i = 0; i < atendimentos.size(); i++) {
            if((atendimentos.get(i).getMedico().getId() == medico.getId()) && (atendimentos.get(i).getHoraConsulta() == 19)){
                JOptionPane.showMessageDialog(null, "Medico Ocupado");
                teste = false;
               break;
            }
        }
        if (teste) {
            Atendimento atendimento = new Atendimento(cliente, medico, validar.converterIdade("08/05/2017"), 19);
            try {
                atendimentoDAO.salvar(atendimento);
            } catch (Exception e) {
                System.out.println("Erro no cadastro de atendimento " + e);
                JOptionPane.showMessageDialog(null, "Erro na consulta");
            }
            JOptionPane.showMessageDialog(null, "Consulta salva com sucesso");
        }
        
    }
}
