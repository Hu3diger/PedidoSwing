package Business;

import static Business.ClienteBusiness.findById;
import DAO.ClienteDAO;
import DAO.ProdutoDAO;
import Model.Cliente;
import Model.Produto;
import java.util.List;

/**
 *
 * @author martin_ruediger
 */
public class ProdutoBusiness {

    public static Produto findById(int id){
        return ProdutoDAO.findById(id);
    }
    
    public static Produto findById(Produto produto) {
        return findById(produto.getId());
    }

    public static List<Produto> findAll() {
        return ProdutoDAO.findAll();
    }
    
    public static List<Produto> findActive() {
        return ProdutoDAO.findActive();
    }
    
    public static void create(Produto produto) {
        ProdutoDAO.create(produto);
    }

    public static void update(Produto produto) {
        ProdutoDAO.update(produto);
    }
    
    public static void desable(Produto produto) {
        ProdutoDAO.desable(produto);
    }
    
}
