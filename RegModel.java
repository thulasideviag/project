/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diary;

/**
 *
 * @author thulasidevi
 */
public class RegModel {
    static private String Name;
    static private String UserName;
    static private String Password;
    static private String EmailId;
    static private String PhoneNumber;
    
     static private String N;
     
    
    
    public RegModel(){
       
    }
    public RegModel(String Name,String UserName,String Password,String EmailId,String PhoneNumber){
        this.Name=Name;
        this.UserName=UserName;
        this.Password=Password;
        this.EmailId=EmailId;
        this.PhoneNumber=PhoneNumber;
        
        
    }

    public String getEmailId() {
        return EmailId;
    }

    public String getName() {
        return Name;
    }

    public String getPassword() {
        return Password;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getUserName() {
        return UserName;
    }

    public void setEmailId(String EmailId) {
        this.EmailId = EmailId;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public RegModel(String N){
        this.N=N;
        
    }

    public static String getN() {
        return N;
    }

    public static void setN(String N) {
        RegModel.N = N;
    }
  
    
    
}
