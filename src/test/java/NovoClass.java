
import java.io.FileOutputStream;
import java.io.OutputStream;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab1
 */
public class NovoClass {
    public static void main(String[] args) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        dataset.addValue(10.1,"Maximo" , "Hora 1");
        dataset.addValue(20.1,"Maximo" , "Hora 2");
        dataset.addValue(30.1,"Maximo" , "Hora 3");
        dataset.addValue(40.1,"Maximo" , "Hora 4");
        dataset.addValue(70.1,"Maximo" , "Hora 5");
        
        JFreeChart chart = ChartFactory.createLineChart("Grafico Simpes", "Hora", "Valor", dataset, PlotOrientation.HORIZONTAL, true, true, false);
        
        try {
            System.out.println("Criando...");
            OutputStream png = new FileOutputStream("GraficoSimples.png");
            ChartUtilities.writeChartAsPNG(png, chart, 500, 400);
            png.close();
        } catch (Exception e) {
        }
    }
}
