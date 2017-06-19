/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.util;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.util.HashMap;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Lab1
 */
public class Util {
    
    public static void imprimir(String caminhoRelatorio, HashMap parametros) {
        JasperReport pathjrxml;
        Connection connection = ConnectionFactory.getConnection();
        try {
            JDialog viewer = new JDialog(new javax.swing.JFrame(), "Visualização do Relatório", true);
            Toolkit tk = Toolkit.getDefaultToolkit();
            Dimension d = tk.getScreenSize();
            viewer.setSize(d.width, d.height);
            viewer.setLocationRelativeTo(null);
            viewer.setModal(true);
            File file = new File(caminhoRelatorio);
            FileInputStream is = new FileInputStream(file);
            pathjrxml = JasperCompileManager.compileReport(is);
            JasperPrint printReport = JasperFillManager.fillReport(pathjrxml, parametros,
                    connection);
            JasperViewer jv = new JasperViewer(printReport, false);
            viewer.getContentPane().add(jv.getContentPane());
            viewer.setVisible(true);
                //JasperExportManager.exportReportToPdfFile(printReport, "src/relatorios/RelAcervo.pdf");

            //jv.setVisible(true);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }
    
}
