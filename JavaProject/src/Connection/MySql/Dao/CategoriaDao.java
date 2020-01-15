package Connection.MySql.Dao;

import Classes.Categorias;
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

public class CategoriaDao {
    public void criarRegistroNoDb(Categorias c) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try{
            String sql = "insert into categorias (nome) values (?)";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, c.getNome());

            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Categoria registrada com sucesso");

        } catch(SQLException e){            
            JOptionPane.showMessageDialog(null, "Erro ao registrar a categoria.\n" + e.toString());
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }   
    }
    
    public List<Categorias> readBd(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null; 
        List<Categorias> categorias = new ArrayList();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM database.categorias");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Categorias registro = new Categorias();
                registro.setId(Integer.parseInt(rs.getString("id")));
                registro.setNome(rs.getString("nome"));
              
                categorias.add(registro);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return categorias;
    }
    
     public void Update(Categorias m) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        String sql = "UPDATE categorias SET nome = ? WHERE id = ?";
        try{
            
            stmt = con.prepareStatement(sql);
            stmt.setString(1, m.getNome());
            stmt.setInt(2, m.getId());
       
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Categorias atualizados com sucesso!");

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar a Categoria.\n" + e.toString());
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }   
    }
     public void Delete(Categorias m) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        String sql = "DELETE FROM categorias WHERE id = ?";
        try{
            
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, m.getId());

            stmt.executeUpdate();
           
            JOptionPane.showMessageDialog(null, "Categoria excluída com sucesso!");

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao excluir a categoria.\n" + e.toString());
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }   
    }
}
