
import br.edu.util.Validacao;
import java.text.DateFormat;
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
     
        Validacao validar = new Validacao();

        if( validar.converterIdade("27/05/2017").compareTo(validar.converterIdade(java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(new Date()))) == 0){
           //se a data for igual, testa-se a se a hora é maior que a atuaç
            GregorianCalendar calendar = new GregorianCalendar();
            System.out.println(calendar.get(calendar.HOUR_OF_DAY));
            if(calendar.get(calendar.HOUR_OF_DAY) >= Integer.parseInt("10")){
                JOptionPane.showMessageDialog(null, "Hora do exame tem que ser maior do que a atual");
            }   
        }
      
    }
}