/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diary;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author thulasidevi
 */
public class MySqlConnect {
    Connection conn=null;
    public static Connection ConnectDB(){
        try{
           // Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/diary","root","password");
            JOptionPane.showMessageDialog(null,"Thank you");
            return conn;
        }
    catch(Exception e){
    JOptionPane.showMessageDialog(null,e );
    return null;
   }
   }
}