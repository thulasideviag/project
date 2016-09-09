/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diary;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;     
/**
 *
 * @author thulasidevi
 */
public class ProfController {
      public static int add(ProfModel m) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/diary","root","password");

        String query = "insert into prof values ('" + m.getNickName() + "','" + m.getOccupation() + "','"+m.getAge()+"','"+m.getFather()+"','"+m.getMother()+"','" + m.getAddress()+ "','" + m.getInterest()+ "','" + m.getHobbies()+ "','" + m.getSkills()+ "','" + m.getDOB()+ "','"+m.getUserName()+"')";
        Statement stm = connection.createStatement();
      

        int executeUpdate = stm.executeUpdate(query);
                

       

        return executeUpdate;
    
}
}