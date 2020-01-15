package Connection.MySql.Dao;

import Classes.Pessoa;
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

public class PessoaDao {
    public void criarRegistroNoDb(Pessoa p) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try{
            String sql = "insert into clientes (nome, email, telefone, celular, endereco, tipopessoa) values (?, ?, ?, ?, ?, ?)";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getEmail());
            stmt.setString(3, p.getTelefone());
            stmt.setString(4, p.getCelular());
            stmt.setString(5, p.getEndereco());
            stmt.setString(6, p.getTipoPessoa());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso");

        } catch(SQLException e){
            
            JOptionPane.showConfirmDialog(null, "Erro ao salvar os dados.\nErro: " + e.toString());
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }   
    }
    
    public List<Pessoa> readBd(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null; 
        List<Pessoa> pessoas = new ArrayList();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM database.clientes");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Pessoa people = new Pessoa();
                people.setId(Integer.parseInt(rs.getString("id")));
                people.setNome(rs.getString("nome"));
                people.setEmail(rs.getString("email"));
                people.setTelefone(rs.getString("telefone"));
                people.setCelular(rs.getString("celular"));
                people.setEndereco(rs.getString("endereco"));
                people.setTipoPessoa(rs.getString("tipopessoa"));
                pessoas.add(people);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return pessoas;
    }
    
     public void Update(Pessoa p) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        String sql = "UPDATE clientes SET nome = ?, email = ?, telefone = ?, celular = ?, endereco = ?, tipopessoa = ? WHERE id = ?";
        try{
            stmt = con.prepareStatement(sql);
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getEmail());
            stmt.setString(3, p.getTelefone());
            stmt.setString(4, p.getCelular());
            stmt.setString(5, p.getEndereco());
            stmt.setString(6, p.getTipoPessoa());
            stmt.setInt(7, p.getId());
       
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!");

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar os dados.\n" + e.toString());
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }   
    }
     public void Delete(Pessoa p) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        String sql = "DELETE FROM clientes WHERE id = ?";
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