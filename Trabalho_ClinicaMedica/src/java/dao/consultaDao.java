
package dao;

import bean.Consulta;
import bean.Paciente;
import connection.ConnectionFactory;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class consultaDao {

    Session session;
    Transaction transaction;
    
    List<Consulta> listaconsulta =  new ArrayList<Consulta>();
    
    public void salvar(Consulta consulta){
    
        try{
            session =  new ConnectionFactory().getSessionFactory();            
            transaction  = session.beginTransaction();
            session.save(consulta);
            transaction.commit();
            session.close();                       
        
        }catch(Exception  e){
            
            JOptionPane.showMessageDialog(null,"" + e.getMessage());
            transaction.rollback();
            session.close();
        }
    
    }
     public void alterar(Consulta consulta){
    
        try{
            session =  new ConnectionFactory().getSessionFactory();            
            transaction  = session.beginTransaction();
            session.update(consulta);
            transaction.commit();
            session.close();                       
        
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null,"" + e.getMessage());
            transaction.rollback();
            session.close();
        }
    
    }
     
     public Consulta consultarForNome(String nome){
      session = new ConnectionFactory() .getSessionFactory();
      Query query = session.createSQLQuery("SELECT * FROM consulta WHERE consserv = '"+nome+"'").addEntity(Consulta.class);
      System.out.println("SELECT * FROM  paciente WHERE consserv = '"+nome+"'");
             listaconsulta = query.list();
             return listaconsulta.get(0);
     
     }
     
     public List<Consulta> listar(){
     session = new ConnectionFactory().getSessionFactory();
     listaconsulta = session.createCriteria(Consulta.class).list();
     return  listaconsulta;
     }
     
     public Consulta consultarPorId(int codigo){
         session = new ConnectionFactory().getSessionFactory();
         Query query  = session.createSQLQuery("SELECT * FROM consulta WHERE conscod = "+codigo+"").addEntity(Consulta.class);
         listaconsulta = query.list();
         session.close();
         return listaconsulta.get(0);
     
     } 
     
     public void excluir(Consulta consulta){
     try{
         session = new ConnectionFactory().getSessionFactory();
         transaction =  session.beginTransaction();
         session.delete(consulta);
         transaction.commit();
         session.close();     
     }catch (Exception e){
         JOptionPane.showMessageDialog(null, ""+ e.getLocalizedMessage());
         transaction.rollback();
         session.close();
     }
     }

    /**
     *
     * @param consulta
     */
    public void salvar(consulta consulta) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
     
}
