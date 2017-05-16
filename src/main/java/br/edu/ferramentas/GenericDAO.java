
package br.edu.ferramentas;
   
import br.edu.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;


public abstract class GenericDAO<T> implements DAO <T> {
    
    private Session sessao;
    private Transaction transaction;
    
    
    @Override
        public boolean salvar(T t) {
           
            try{
                this.sessao = HibernateUtil.getSessionFactory().openSession();
                this.transaction = sessao.beginTransaction();
                this.sessao.save(t);
                this.transaction.commit();
                return true;
            }catch(Exception e){
                System.out.println(e.getMessage());
                return false;
            }finally{
                this.sessao.close();
            }
           
        }

    public boolean excluir(T t) {
try{
                this.sessao = HibernateUtil.getSessionFactory().openSession();
                this.transaction = sessao.beginTransaction();
                this.sessao.delete(t);
                this.transaction.commit();
                return true;
            }catch(Exception e){
                System.out.println(e.getMessage());
                return false;
            }finally{
                this.sessao.close();
            }    }

    public boolean editar(T t) {
try{
                this.sessao = HibernateUtil.getSessionFactory().openSession();
                this.transaction = sessao.beginTransaction();
                this.sessao.update(t);
                this.transaction.commit();
                return true;
            }catch(Exception e){
                System.out.println(e.getMessage());
                return false;
            }finally{
                this.sessao.close();
            }    }

    public List listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
   
  }
    
    
    

