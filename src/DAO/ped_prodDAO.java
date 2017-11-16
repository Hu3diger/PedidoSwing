package DAO;

import Model.Ped_Prod;
import Model.Pedido;
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
public class ped_prodDAO {

    private static ConnectionManager mngr = ConnectionManager.getInstance();

    public static Ped_Prod findById(int id) {
        String sql = "SELECT * FROM ped_prod WHERE id = ?";
        Ped_Prod pedprod = null;

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = mngr.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);

            rs = stmt.executeQuery();
            while (rs.next()) {
                pedprod = new Ped_Prod();
                pedprod.setId(rs.getInt("id"));
                pedprod.setPedido(PedidoDAO.findById(rs.getInt("pedido_id")));
                pedprod.setProduto(ProdutoDAO.findById(rs.getInt("produto_id")));
                pedprod.setQuantidade(rs.getDouble("quantidade"));
                pedprod.setPreco_item(rs.getDouble("preco_item"));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            JDBCUtil.close(rs, stmt, conn);
        }

        return pedprod;
    }

    public static List<Ped_Prod> findByPedido(Pedido pedido) {
        String sql = "SELECT * FROM ped_prod WHERE pedido_id=?";
        List<Ped_Prod> pedProds = new ArrayList();

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = mngr.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, pedido.getId());

            rs = stmt.executeQuery();
            while (rs.next()) {
                Ped_Prod pedprod = new Ped_Prod();
                pedprod.setId(rs.getInt("id"));
                pedprod.setPedido(PedidoDAO.findById(rs.getInt("pedido_id")));
                pedprod.setProduto(ProdutoDAO.findById(rs.getInt("produto_id")));
                pedprod.setQuantidade(rs.getDouble("quantidade_item"));
                pedprod.setPreco_item(rs.getDouble("preco_item"));
                pedProds.add(pedprod);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            JDBCUtil.close(rs, stmt, conn);
        }

        return pedProds;
    }

    public static void findByProduto(Produto produto) {
        findByProduto(produto.getId());
    }

    public static Ped_Prod findByProduto(int id) {
        String sql = "SELECT * FROM ped_prod WHERE produto_id=?";
        Ped_Prod pedprod = null;

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = mngr.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);

            rs = stmt.executeQuery();
            while (rs.next()) {
                pedprod = new Ped_Prod();
                pedprod.setId(rs.getInt("id"));
                pedprod.setPedido(PedidoDAO.findById(rs.getInt("pedido_id")));
                pedprod.setProduto(ProdutoDAO.findById(rs.getInt("produto_id")));
                pedprod.setQuantidade(rs.getDouble("quantidade"));
                pedprod.setPreco_item(rs.getDouble("preco_item"));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            JDBCUtil.close(rs, stmt, conn);
        }

        return pedprod;
    }

    public static List<Ped_Prod> findAll() {
        String sql = "SELECT * FROM ped_prod";
        List<Ped_Prod> pedprods = new ArrayList();

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = mngr.getConnection();
            stmt = conn.prepareStatement(sql);

            rs = stmt.executeQuery();
            while (rs.next()) {
                Ped_Prod pedprod = new Ped_Prod();
                pedprod.setId(rs.getInt("id"));
                pedprod.setPedido(PedidoDAO.findById(rs.getInt("pedido_id")));
                pedprod.setProduto(ProdutoDAO.findById(rs.getInt("produto_id")));
                pedprod.setQuantidade(rs.getDouble("quantidade_item"));
                pedprod.setPreco_item(rs.getDouble("preco_item"));
                pedprods.add(pedprod);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, stmt, conn);
        }

        return pedprods;
    }

    public static void create(Ped_Prod pedprod) {
        String sql = "INSERT INTO ped_prod (pedido_id,produto_id,preco_item,quantidade_item) VALUES (?,?,?,?)";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = mngr.getConnection();
            stmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, pedprod.getPedido().getId());
            stmt.setInt(2, pedprod.getProduto().getId());
            stmt.setDouble(3, pedprod.getPreco_item());
            stmt.setDouble(4, pedprod.getQuantidade());

            stmt.executeUpdate();
            conn.commit();
            rs = stmt.getGeneratedKeys();
            while (rs.next()) {
                pedprod.setId(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, stmt, conn);
        }
    }
}
