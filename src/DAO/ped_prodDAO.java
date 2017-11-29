package DAO;

import Model.Ped_Prod;
import Model.Pedido;
import java.util.List;

/**
 *
 * @author martin_ruediger
 */
public class ped_prodDAO extends AbstractJPAdao<Ped_Prod>{
    
    public static List<Ped_Prod> findByPedido(Pedido pedido) {
        int id = pedido.getId();
        return JpaUtil.getEntityManager().
                createQuery("select c from"+ped_prodDAO.class.getSimpleName()+" c where pedido_id ="+id).
                getResultList();
    }

}
