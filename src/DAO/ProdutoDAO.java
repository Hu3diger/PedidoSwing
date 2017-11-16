package DAO;

import Model.Cliente;
import Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author martin_ruediger
 */
public class ProdutoDAO {

    private static ConnectionManager mngr = ConnectionManager.getInstance();

    public static Produto findById(int id) {
        String sql = "SELECT * FROM produto WHERE id = ?";
        Produto produto = null;

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = mngr.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);

            rs = stmt.executeQuery();
            while (rs.next()) {
                produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setQuantidade(rs.getDouble("quantidade"));
                produto.setPreco_referencia(rs.getDouble("preco_referencia"));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            JDBCUtil.close(rs, stmt, conn);
        }

        return produto;
    }

    public static List<Produto> findActive() {
        String sql = "SELECT * FROM produto WHERE status=true";
        List<Produto> produtos = new ArrayList();

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = mngr.getConnection();
            stmt = conn.prepareStatement(sql);

            rs = stmt.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setQuantidade(rs.getDouble("quantidade"));
                produto.setPreco_referencia(rs.getDouble("preco_referencia"));
                produto.setStatus(rs.getBoolean("status"));
                produtos.add(produto);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            JDBCUtil.close(rs, stmt, conn);
        }

        return produtos;
    }

    public static List<Produto> findAll() {
        String sql = "SELECT * FROM produto";
        List<Produto> produtos = new ArrayList();

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = mngr.getConnection();
            stmt = conn.prepareStatement(sql);

            rs = stmt.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setQuantidade(rs.getDouble("quantidade"));
                produto.setPreco_referencia(rs.getDouble("preco_referencia"));
                produto.setStatus(rs.getBoolean("status"));
                produtos.add(produto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, stmt, conn);
        }

        return produtos;
    }

    public static void update(Produto produto) {
        String sql = "UPDATE produto SET nome=?, quantidade=?, preco_referencia=? WHERE id=?";

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = mngr.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getQuantidade());
            stmt.setDouble(3, produto.getPreco_referencia());
            stmt.setInt(4, produto.getId());

            stmt.executeUpdate();
            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(stmt);
            JDBCUtil.close(conn);
        }
    }

    public static void create(Produto produto) {
        String sql = "INSERT INTO produto (nome,quantidade,preco_referencia,status) VALUES (?,?,?, true)";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = mngr.getConnection();
            stmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getQuantidade());
            stmt.setDouble(3, produto.getPreco_referencia());

            stmt.executeUpdate();
            conn.commit();
            rs = stmt.getGeneratedKeys();
            while (rs.next()) {
                produto.setId(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, stmt, conn);
        }
    }

    public static void desable(Produto produto) {
        if (produto.isStatus() == true) {
            desable(produto.getId(), false);
        } else {
            desable(produto.getId(), true);
        }
    }

    public static void desable(int id, boolean status) {
        String sql = "UPDATE produto SET status=? WHERE id=?";

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = mngr.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setBoolean(1, status);
            stmt.setInt(2, id);

            stmt.executeUpdate();
            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(stmt);
            JDBCUtil.close(conn);
        }
    }

}
