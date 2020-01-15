package Connection.MySql.Dao;

import Classes.Produto;
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

public class ProdutoDao {
    
     public void criarRegistroNoDb(Produto p) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try{
            String sql = "insert into produtos (nome, preco, quantidade, idcategoria) values (?, ?, ?, ?)";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getPreco());
            stmt.setString(3, Integer.toString(p.getQuantidade()));
            stmt.setString(4, p.getCategoria());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso");

        } catch(SQLException e){            
            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados.\nErro: " + e.toString());
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }   
    }
    
    public List<Produto> readBd(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null; 
        List<Produto> produtos = new ArrayList();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM database.produtos");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto product = new Produto();
                product.setId(Integer.parseInt(rs.getString("id")));
                product.setNome(rs.getString("nome"));
                product.setPreco(rs.getString("preco"));
                product.setQuantidade(Integer.parseInt(rs.getString("quantidade")));
                product.setCategoria(rs.getString("idcategoria"));
              
                produtos.add(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
    }
    
     public void Update(Produto p) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        String sql = "UPDATE produtos SET nome = ?, preco = ?, quantidade = ?, idcategoria = ? WHERE id = ?";
        try{
            
            stmt = con.prepareStatement(sql);
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getPreco());
            stmt.setString(3, Integer.toString(p.getQuantidade()));
            stmt.setString(4, p.getCategoria());

            stmt.setInt(5, p.getId());
       
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!");

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar os dados.\n" + e.toString());
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }   
    }
     public void Delete(Produto p) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        String sql = "DELETE FROM produtos WHERE id = ?";
        try{
            
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, p.getId());

            stmt.executeUpdate();
           
            JOptionPane.showMessageDialog(null, "Dado excluído com sucesso!");

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao excluir os dados.\n" + e.toString());
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }   
    }
}
