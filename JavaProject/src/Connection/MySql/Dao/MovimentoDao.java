package Connection.MySql.Dao;

import Classes.Movimento;
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

public class MovimentoDao {
     public void criarRegistroNoDb(Movimento m) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try{
            String sql = "insert into movimentos (tipo, preco, cliente, produto, data) values (?, ?, ?, ?, ?)";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, m.getTipo());
            stmt.setString(2, m.getPreco());
            stmt.setString(3, m.getCliente());
            stmt.setString(4, m.getProduto());
            stmt.setString(5, m.getData());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Movimento registrado com sucesso");

        } catch(SQLException e){            
            JOptionPane.showMessageDialog(null, "Erro ao registrar o movimento.\n" + e.toString());
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }   
    }
    
    public List<Movimento> readBd(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null; 
        List<Movimento> movimentos = new ArrayList();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM database.movimentos");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Movimento registro = new Movimento();
                registro.setId(Integer.parseInt(rs.getString("id")));
                registro.setTipo(rs.getString("tipo"));
                registro.setPreco(rs.getString("preco"));
                registro.setCliente(rs.getString("cliente"));
                registro.setProduto(rs.getString("produto"));
                registro.setData(rs.getString("data"));
              
                movimentos.add(registro);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MovimentoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return movimentos;
    }
    public List<Movimento> buscaCliente(String c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null; 
        List<Movimento> movimentos = new ArrayList();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM database.movimentos WHERE cliente LIKE ?");
            stmt.setString(1, "%"+c+"%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Movimento registro = new Movimento();
                registro.setId(Integer.parseInt(rs.getString("id")));
                registro.setTipo(rs.getString("tipo"));
                registro.setPreco(rs.getString("preco"));
                registro.setCliente(rs.getString("cliente"));
                registro.setProduto(rs.getString("produto"));
                registro.setData(rs.getString("data"));
              
                movimentos.add(registro);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MovimentoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return movimentos;
    }
    
     public void Update(Movimento m) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        String sql = "UPDATE movimentos SET tipo = ?, preco = ?, cliente = ?, produto = ?, data = ? WHERE id = ?";
        try{
            
            stmt = con.prepareStatement(sql);
            stmt.setString(1, m.getTipo());
            stmt.setString(2, m.getPreco());
            stmt.setString(3, m.getCliente());
            stmt.setString(4, m.getProduto());
            stmt.setString(5, m.getData());
            stmt.setInt(6, m.getId());
       
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Movimento atualizados com sucesso!");

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar o movimento.\n" + e.toString());
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }   
    }
     public void Delete(Movimento m) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        String sql = "DELETE FROM movimentos WHERE id = ?";
        try{
            
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, m.getId());

            stmt.executeUpdate();
           
            JOptionPane.showMessageDialog(null, "Dado excluído com sucesso!");

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao excluir os dados.\n" + e.toString());
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }   
    }
}
