
import com.sun.faces.el.ELUtils;
import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

    
public class NewClass {
     
     customer cus=new customer();
     @ManagedBean
     @SessionScoped
       
    public void saveCustomer(){
        
        
        customer i = new customer();
        i.setFristName(First);
        i.setLastName(Last);
        i.setEmail(email);
        String msg = "your data insert";
        i.setMsg(msg);
        
        customerDeo a = new customerDeo();
        a.addcustomer(i);
        
        
        
        request.setAttribute("msg", msg);
        req.getRequestDispatcher("/add.jsp").forward(req, res);

        
        
        
        
        
        i.clearAll();
    }
}
