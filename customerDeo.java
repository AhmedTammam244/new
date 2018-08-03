
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


class customerDeo {
    public void addcustomer(customer cust){
        Transaction trns=null;
        SessionFactory sf=new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session se=sf.openSession();
        try{
            trns=se.beginTransaction();
            se.save(cust);
            se.getTransaction().commit();
        }
        catch(RuntimeException e){
            if(trns !=null){ trns.rollback();}
            e.printStackTrace();
        }
        finally{
            se.flush();
            se.close();
        }
    }
}
