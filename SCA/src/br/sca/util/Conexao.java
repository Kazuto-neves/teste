package br.sca.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

public class Conexao {

    private static Conexao conexao = null;
    private Connection conn;

    private Conexao() {
        try {
            ResourceBundle prop = ResourceBundle.getBundle("br.sca.util.bdPostGreSQL");

            String driver = prop.getString("driver");
            String bd = prop.getString("bd");
            String usuario = prop.getString("usuario");
            String senha = prop.getString("senha");

            Class.forName(driver);
            conn = DriverManager.getConnection(bd, senha, senha);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        } catch (MissingResourceException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public static Connection getConnection() {
        if (conexao == null) {
            conexao = new Conexao();
        }
        return conexao.conn;
    }

    public void close() {
        try {
            conn.close();
        } catch (SQLException e) {

        }
    }
}
