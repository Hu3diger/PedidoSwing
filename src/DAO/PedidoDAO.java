package DAO;

import Model.Pedido;

/**
 *
 * @author martin_ruediger
 */
public class PedidoDAO extends AbstractJPAdao<Pedido> {

    public void changeStatus(Pedido pedido) {
        JpaUtil.getEntityManager().getTransaction().begin();
        pedido.setStatus(!pedido.isStatus());
        JpaUtil.getEntityManager().merge(pedido);
        JpaUtil.getEntityManager().getTransaction().commit();
    }
}
