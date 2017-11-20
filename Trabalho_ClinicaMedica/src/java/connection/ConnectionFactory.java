
package connection;

import org.hibernate.HibernateException;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;





public class ConnectionFactory {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
          
            sessionFactory = new AnnotationConfiguration().configure("connection/hibernate.cfg.xml").buildSessionFactory();
        } catch (HibernateException ex) {
           
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static Session getSessionFactory() {
        return sessionFactory.openSession();
    }
}
