/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;



/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author MAPINGUARY
 */
public class ConnectionFactory {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure("C:\\Users\\MAPINGUARY\\Desktop\\trabWeb\\TecWebRepository\\Trabalho_ClinicaMedica\\src\\java\\connection\\hibernate.cfg.xml").buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static Session getSessionFactory() {
        return sessionFactory.openSession();
    }
}
