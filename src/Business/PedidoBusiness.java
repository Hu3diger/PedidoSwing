package Business;

import DAO.ClienteDAO;
import DAO.PedidoDAO;
import Model.Pedido;
import java.util.List;

/**
 *
 * @author martin_ruediger
 */
public class PedidoBusiness {

    private static PedidoDAO pedidodao = new PedidoDAO();
    
    public static Pedido findById(int id){
        return pedidodao.findById(id);
    }
    
    public static Pedido findById(Pedido pedido) {
        return findById(pedido.getId());
    }

    public static List<Pedido> findAll() {
        return pedidodao.findAll();
    }
    
    public static Pedido create(Pedido pedido) {
        pedidodao.save(pedido);
        return pedido;
    }

    public static void update(Pedido pedido) {
        pedidodao.save(pedido);
    }
    
    public static void changeStatus(Pedido pedido){
        pedidodao.changeStatus(pedido);
    }
}
