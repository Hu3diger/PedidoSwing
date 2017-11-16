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

    public static Pedido findById(int id){
        return PedidoDAO.findById(id);
    }
    
    public static Pedido findById(Pedido pedido) {
        return findById(pedido.getId());
    }

    public static List<Pedido> findAll() {
        return PedidoDAO.findAll();
    }
    
    public static Pedido create(Pedido pedido) {
        return PedidoDAO.create(pedido);
    }

    public static void update(Pedido pedido) {
        PedidoDAO.update(pedido);
    }
    
    public static void desable(Pedido pedido){
        PedidoDAO.desable(pedido);
    }
}
