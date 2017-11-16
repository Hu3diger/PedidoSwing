package Business;

import DAO.ClienteDAO;
import DAO.ped_prodDAO;
import Model.Cliente;
import Model.Ped_Prod;
import Model.Pedido;
import java.util.List;

/**
 *
 * @author martin_ruediger
 */
public class Ped_ProdBusiness {
    
    public static Ped_Prod findById(int id) {
        return ped_prodDAO.findById(id);
    }
    
    public static Ped_Prod findById(Ped_Prod pedzin) {
        return findById(pedzin.getId());
    }
    
    public static List<Ped_Prod> findByPedido(Pedido pedido) {
        return ped_prodDAO.findByPedido(pedido);
    }

    public static List<Ped_Prod> findAll() {
        return ped_prodDAO.findAll();
    }
    
    public static void create(Ped_Prod pedzao) {
        ped_prodDAO.create(pedzao);
    }

    
    
}
