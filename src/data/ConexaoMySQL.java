 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Guilherme
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoMySQL {
    //variaveis de conexao com o MySql
    public Connection con;
    public Statement stmt;
    public ResultSet rs;
    public PreparedStatement prep_stmt;
    
    //argumentos do driver de conexao
    String url = "jdbc:mysql://localhost:3306/bd_reflorestar";
    String user = "admin";
    String password = "admin";
    String driver = "com.mysql.jdbc.Driver";
    
    public void openConnectionMySql() {
        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url, user, password);
            //cria uma variavel Statement
            stmt = con.createStatement();
        }
        catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                    "Erro na conexão com o banco de dados (ClassNotFoud)", "ERRO",
                    JOptionPane.ERROR_MESSAGE, null);
        }//fim do Catch
        catch (InstantiationException e) {
            JOptionPane.showMessageDialog(null,
                    "Erro na conexão com o banco de dados (InstantiationException)", "ERRO",
                    JOptionPane.ERROR_MESSAGE, null);
        }//fim do Catch
        catch (IllegalAccessException e) {
            JOptionPane.showMessageDialog(null,
                    "Erro na conexão com o banco de dados (IllegalAccessException)", "ERRO",
                    JOptionPane.ERROR_MESSAGE, null);
        }//fim do Catch
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    e.getSQLState(), "ERRO",
                    JOptionPane.ERROR_MESSAGE, null);
        }//fim do Catch
    }//Fim do metodo que abre a conexao com o MySQL
    
    public void closeConnectionMySql(Connection con) {
                try {
                    if(con != null) 
                        con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ConexaoMySQL.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    
    public void closeConnectionMySql(Connection con, Statement stmt) {
        closeConnectionMySql(con);
            try {
                if(stmt != null) 
                    stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConexaoMySQL.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
        public void closeConnectionMySql(Connection con, PreparedStatement stmt) {
        closeConnectionMySql(con);
            try {
                if(stmt != null) 
                    stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConexaoMySQL.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
        
}//Fim da Classe ConexaoMySQL
