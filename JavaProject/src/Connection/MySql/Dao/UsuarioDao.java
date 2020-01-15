package Connection.MySql.Dao;

import Classes.Usuario;
import Connection.MySql.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UsuarioDao {
     public void criarRegistroNoDb(Usuario u) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try{
            String sql = "insert into usuarios (login, senha, nome) values (?, ?, ?)";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, u.getLogin());
            stmt.setString(2, u.getSenha());
            stmt.setString(3, u.getNome());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso");

        } catch(SQLException e){
            
            JOptionPane.showConfirmDialog(null, "Erro ao salvar os dados.\n" + e.toString());
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }   
    }
    
    public List<Usuario> readBd(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null; 
        List<Usuario> usuarios = new ArrayList();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM database.usuarios");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Usuario user = new Usuario();
                user.setId(Integer.parseInt(rs.getString("id")));
                user.setLogin(rs.getString("login"));
                user.setSenha(rs.getString("senha"));
                user.setNome(rs.getString("nome"));

                usuarios.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios;
    }
    
     public void Update(Usuario u) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        String sql = "UPDATE usuarios SET login = ?, senha = ?, nome = ? WHERE id = ?";
        try{
            
            stmt = con.prepareStatement(sql);
            stmt.setString(1, u.getLogin());
            stmt.setString(2, u.getSenha());
            stmt.setString(3, u.getNome());

            stmt.setInt(7, u.getId());
       
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!");

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar os dados.\n" + e.toString());
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }   
    }
     public void Delete(Usuario u) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        String sql = "DELETE FROM usuarios WHERE id = ?";
        try{
            
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, u.getId());
            stmt.executeUpdate();
   
            JOptionPane.showMessageDialog(null, "Dado excluído com sucesso!");

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao excluir os dados.\n" + e.toString());
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }   
    }
}
