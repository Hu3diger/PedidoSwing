package Business;

import DAO.ClienteDAO;
import Model.Cliente;
import java.util.List;

/**
 *
 * @author martin_ruediger
 */
public class ClienteBusiness {

    private static ClienteDAO clidao = new ClienteDAO();
    
    public static Cliente findById(int id) {
        return clidao.findById(id);
    }
    
    public static List<Cliente> findActive(){
        return clidao.findActive();
    }
    public static Cliente findById(Cliente cliente) {
        return findById(cliente.getId());
    }

    public static List<Cliente> findAll() {
        return clidao.findAll();
    }
    
    public static void create(Cliente cliente) {
        clidao.save(cliente);
    }

    public static void update(Cliente cliente) {
        clidao.save(cliente);
    }
    
    public static void changeStatus(Cliente cliente) {
        clidao.changeStatus(cliente);
    }
    
    
}
