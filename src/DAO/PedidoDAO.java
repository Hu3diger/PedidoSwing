package DAO;

import static DAO.ProdutoDAO.desable;
import Model.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author martin_ruediger
 */
public class PedidoDAO {

    private static ConnectionManager mngr = ConnectionManager.getInstance();

    public static Pedido findById(int id) {
        String sql = "SELECT * FROM pedido WHERE id = ?";
        Pedido pedido = null;

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = mngr.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);

            rs = stmt.executeQuery();
            while (rs.next()) {
                pedido = new Pedido();
                pedido.setId(rs.getInt("id"));
                pedido.setData_pedido(rs.getDate("data_pedido"));
                pedido.setCliente_id(ClienteDAO.findById(rs.getInt("cliente_id")));
                pedido.setForma_pagamento(rs.getInt("forma_pagamento"));
                pedido.setStatus(rs.getBoolean("status"));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            JDBCUtil.close(rs, stmt, conn);
        }

        return pedido;
    }

    public static List<Pedido> findAll() {
        String sql = "SELECT * FROM pedido";
        List<Pedido> pedidos = new ArrayList();

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = mngr.getConnection();
            stmt = conn.prepareStatement(sql);

            rs = stmt.executeQuery();
            while (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setId(rs.getInt("id"));
                pedido.setData_pedido(rs.getDate("data_pedido"));
                pedido.setCliente_id(ClienteDAO.findById(rs.getInt("cliente_id")));
                pedido.setForma_pagamento(rs.getInt("forma_pagamento"));
                pedido.setStatus(rs.getBoolean("status"));
                pedidos.add(pedido);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, stmt, conn);
        }

        return pedidos;
    }
    
    public static void update(Pedido pedido){
        String sql = "UPDATE pedido SET data_pedido=?, cliente_id=?, forma_pagamento=? WHERE id=?";
        
        Connection conn = null;
        PreparedStatement stmt = null;
        
        try {
            conn = mngr.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setDate(1, pedido.getData_pedido());
            stmt.setInt(2, pedido.getCliente_id().getId());
            stmt.setInt(3, pedido.getForma_pagamento());
            stmt.setInt(4, pedido.getId());
            stmt.setBoolean(5, pedido.isStatus());
            
            stmt.executeUpdate();
            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(stmt);
            JDBCUtil.close(conn);
        }
    }
    
    public static Pedido create (Pedido pedido){
        String sql = "INSERT INTO pedido (data_pedido,cliente_id,forma_pagamento,status) VALUES (?,?,?,true)";
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = mngr.getConnection();
            stmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setDate(1, pedido.getData_pedido());
            stmt.setInt(2, pedido.getCliente_id().getId());
            stmt.setInt(3, pedido.getForma_pagamento());

            stmt.executeUpdate();
            conn.commit();
            rs = stmt.getGeneratedKeys();
            while (rs.next()) {
                pedido.setId(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, stmt, conn);
        }
        
        return pedido;
    }
    
    public static void desable(Pedido pedido) {
           if (pedido.isStatus() == true) {
            desable(pedido.getId(), false);
        } else {
            desable(pedido.getId(), true);
        }
    }

    public static void desable(int id,boolean status) {
        String sql = "UPDATE pedido SET status=? WHERE id=?";
        
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
