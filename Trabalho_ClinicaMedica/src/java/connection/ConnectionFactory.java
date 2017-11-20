
package connection;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;




public class ConnectionFactory {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
          
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
