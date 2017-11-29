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

    private static ProdutoDAO produtoDao = new ProdutoDAO();
    
    public static Produto findById(int id){
        return produtoDao.findById(id);
    }
    
    public static Produto findById(Produto produto) {
        return findById(produto.getId());
    }

    public static List<Produto> findAll() {
        return produtoDao.findAll();
    }
    
    public static List<Produto> findActive() {
        return produtoDao.findActive();
    }
    
    public static void create(Produto produto) {
        produtoDao.save(produto);
    }

    public static void update(Produto produto) {
        produtoDao.save(produto);
    }
    
    public static void desable(Produto produto) {
        produtoDao.changeStatus(produto);
    }
    
}
