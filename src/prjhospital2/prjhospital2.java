
package prjhospital2;

    import java.awt.HeadlessException;
    import java.sql.Connection;
    import java.sql.SQLException;
    import javax.swing.JOptionPane;
    import prjhospital.ConnectionFactory;

public class prjhospital2 {
    
    public static void main (String[] args) {
        
        try{
            try (Connection con = new ConnectionFactory().getConnection()) {
                JOptionPane.showMessageDialog(null, "Conectado ao banco! ");
            }
          
    }catch (HeadlessException | SQLException e){
    JOptionPane.showConfirmDialog(null, e);
    }
    }
}
    
         
    
