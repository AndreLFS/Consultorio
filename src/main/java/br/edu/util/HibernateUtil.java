package br.edu.util;

import javax.swing.JOptionPane;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    private static SessionFactory sessionFactory
            = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            Configuration cfg
                    = new Configuration();
            
            cfg.configure("hibernate.cfg.xml");
            return cfg.buildSessionFactory();
        } catch (Throwable e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, "Criação inicial do objeto"
                    + " SessionFactory falhou. Erro: " + e);
            throw new ExceptionInInitializerError(e);
        }
    }

}
