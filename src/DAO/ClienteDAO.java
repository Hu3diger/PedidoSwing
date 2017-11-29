package DAO;

import Model.Cliente;

/**
 *
 * @author martin_ruediger
 */

public class ClienteDAO extends AbstractJPAdao<Cliente> {

    public void changeStatus(Cliente cliente) {
        JpaUtil.getEntityManager().getTransaction().begin();
        cliente.setStatus(!cliente.isStatus());
        JpaUtil.getEntityManager().merge(cliente);
        JpaUtil.getEntityManager().getTransaction().commit();
    }

}
