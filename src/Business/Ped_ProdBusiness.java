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
    
    private static ped_prodDAO ppdao = new ped_prodDAO();
    
    public static Ped_Prod findById(int id) {
        return ppdao.findById(id);
    }
    
    public static Ped_Prod findById(Ped_Prod pedzin) {
        return findById(pedzin.getId());
    }
    
    public static List<Ped_Prod> findByPedido(Pedido pedido) {
        return ppdao.findByPedido(pedido);
    }

    public static List<Ped_Prod> findAll() {
        return ppdao.findAll();
    }
    
    public static void create(Ped_Prod pedzao) {
        ppdao.save(pedzao);
    }

    
    
}
