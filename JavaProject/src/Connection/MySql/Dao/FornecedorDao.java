package Connection.MySql.Dao;

import Classes.Fornecedor;
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

public class FornecedorDao {
    public void criarRegistroNoDb(Fornecedor f) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try{
            String sql = "insert into fornecedores (empresa, produto, preco) values (?, ?, ?)";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, f.getEmpresa());
            stmt.setString(2, f.getProduto());
            stmt.setString(3, f.getPreco());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso");

        } catch(SQLException e){            
            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados.\nErro: " + e.toString());
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }   
    }
    
    public List<Fornecedor> readBd(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null; 
        List<Fornecedor> fornecedores = new ArrayList();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM database.fornecedores");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Fornecedor product = new Fornecedor();
                product.setId(Integer.parseInt(rs.getString("id")));
                product.setEmpresa(rs.getString("empresa"));
                product.setProduto(rs.getString("produto"));
                product.setPreco(rs.getString("preco"));
              
                fornecedores.add(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return fornecedores;
    }
    
     public void Update(Fornecedor p) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        String sql = "UPDATE fornecedores SET empresa = ?, produto = ?, preco = ? WHERE id = ?";
        try{
            
            stmt = con.prepareStatement(sql);
            stmt.setString(1, p.getEmpresa());
            stmt.setString(2, p.getProduto());
            stmt.setString(3, p.getPreco());
            stmt.setInt(4, p.getId());
       
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!");

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar os dados.\n" + e.toString());
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }   
    }
     public void Delete(Fornecedor p) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        String sql = "DELETE FROM fornecedores WHERE id = ?";
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
