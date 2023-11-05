package conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import vista.FrmMenu;

public class consultas {
    public void guardarUsuario(String usuario, String password){ //registeruser
        Conexion db = new Conexion();
        String sql = "insert into tb_usuario(usuario, password) values ('" + usuario +"', '" + password +"');";
        Statement st;
        Connection conexion = db.conectar();
        try
        {
            st = conexion.createStatement();
            int rs = st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Guardado correctamente");
        }catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
   public void consultarUsuario(String user, String pass) { //login
    Conexion db = new Conexion();
    try {
        Connection cn = db.conectar();
        // Utiliza una consulta parametrizada para buscar un usuario por nombre
        String query = "SELECT usuario, password FROM tb_usuario WHERE usuario = ?";
        PreparedStatement pst = cn.prepareStatement(query);
        pst.setString(1, user);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            // Se encontró un usuario con el nombre de usuario ingresado
            String passCorrecto = rs.getString("password");

            if (pass.equals(passCorrecto)) {
                JOptionPane.showMessageDialog(null, "Login correcto. Bienvenido " + user);
                 FrmMenu menu = new FrmMenu();
                menu.setVisible(true);
              

            } else {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e);
    }
}

    
}
