package Business;

import DAO.ClienteDAO;
import Model.Cliente;
import java.util.List;

/**
 *
 * @author martin_ruediger
 */
public class ClienteBusiness {

    public static Cliente findById(int id) {
        return ClienteDAO.findById(id);
    }
    
    public static List<Cliente> findActive(){
        return ClienteDAO.findActive();
    }
    public static Cliente findById(Cliente cliente) {
        return findById(cliente.getId());
    }

    public static List<Cliente> findAll() {
        return ClienteDAO.findAll();
    }
    
    public static void create(Cliente cliente) {
        ClienteDAO.create(cliente);
    }

    public static void update(Cliente cliente) {
        ClienteDAO.update(cliente);
    }
    
    public static void desable(Cliente cliente) {
        ClienteDAO.desable(cliente);
    }
    
    
}
