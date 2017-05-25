
import br.edu.DAO.ClienteDAO2;
import br.edu.DAO.EnderecoDAO;
import br.edu.DAO.MedicoDAO;
import br.edu.anotacoes.Cliente;
import br.edu.anotacoes.Endereco;
import br.edu.anotacoes.Medico;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cra-dti-04
 */
public class Teste {
    public static void main(String[] args) {
        //pegar data
        JOptionPane.showMessageDialog(null,  java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(new Date()));
        //pegar hora
        GregorianCalendar calendar = new GregorianCalendar();
        JOptionPane.showMessageDialog(null,   calendar.get(calendar.HOUR_OF_DAY));
      
    }
}