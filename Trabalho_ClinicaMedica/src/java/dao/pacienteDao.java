
package dao;
import bean.Paciente;
import java.util.ArrayList;
import connection.ConnectionFactory;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Query;
import javax.swing.JOptionPane;
import org.hibernate.Transaction;




public class pacienteDao {
    Session session;
    Transaction transaction;
    
    List<paciente> listaPaciente =  new ArrayList<paciente>();
    
    public void salvar(Paciente paciente){
    
        try{
            session =  new ConnectionFactory().getSessionFactory();            
            transaction  = session.beginTransaction();
            session.save(paciente);
            transaction.commit();
            session.close();                       
        
        }catch(Exception  e){
            
            JOptionPane.showMessageDialog(null,"" + e.getMessage());
            transaction.rollback();
            session.close();
        }
    
    }
     public void alterar(Paciente paciente){
    
        try{
            session =  new ConnectionFactory().getSessionFactory();            
            transaction  = session.beginTransaction();
            session.update(paciente);
            transaction.commit();
            session.close();                       
        
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null,"" + e.getMessage());
            transaction.rollback();
            session.close();
        }
    
    }
     
     public paciente consultarForNome(String nome){
      session = new ConnectionFactory() .getSessionFactory();
      Query query = session.createSQLQuery("SELECT * FROM paciente WHERE pacnome = '"+nome+"'").addEntity(paciente.class);
      System.out.println("SELECT * FROM  paciente WHERE pacnome = '"+nome+"'");
             listaPaciente = query.list();
             return listaPaciente.get(0);
     
     }
     
     public List<paciente> listar(){
     session = new ConnectionFactory().getSessionFactory();
     listaPaciente = session.createCriteria(paciente.class).list();
     return  listaPaciente;
     }
     
     public paciente consultarPorId(int codigo){
         session = new ConnectionFactory().getSessionFactory();
         Query query  = session.createSQLQuery("SELECT * FROM paciente WHERE paccod = "+codigo+"").addEntity(paciente.class);
         listaPaciente = query.list();
         session.close();
         return listaPaciente.get(0);
     
     } 
     
     public void excluir(Paciente paciente){
     try{
         session = new ConnectionFactory().getSessionFactory();
         transaction =  session.beginTransaction();
         session.delete(paciente);
         transaction.commit();
         session.close();     
     }catch (Exception e){
         JOptionPane.showMessageDialog(null, ""+ e.getLocalizedMessage());
         transaction.rollback();
         session.close();
     }
     }
     
     
}
