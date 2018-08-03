
import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class customer {
    private int custId;
    private String firstName,lastName,email,msg;
    public customer() {
    }
    public customer(String firstName, String lastName, String email, String msg) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.msg = msg;
    }
    @Id
    @TableGenerator(initialValue=1,name="de",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.TABLE ,generator="de")
    public int getCustId() {
        return custId;
    }
    public void setCustId(int custId) {
        this.custId = custId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
      public void clearAll(){
        firstName="";
        lastName="";
        email="";
        custId=0;
            }
    /*
    public void saveCustomer(){
        customerDeo cd=new customerDeo();
        cd.addcustomer(this);
        msg="Member info saved successffull!";
        clearAll();
    }  */
}
