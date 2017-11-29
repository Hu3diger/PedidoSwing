package DAO;

import Model.Produto;

/**
 *
 * @author martin_ruediger
 */
public class ProdutoDAO extends AbstractJPAdao<Produto> {

    public void changeStatus(Produto produto) {
        JpaUtil.getEntityManager().getTransaction().begin();
        produto.setStatus(!produto.isStatus());
        JpaUtil.getEntityManager().merge(produto);
        JpaUtil.getEntityManager().getTransaction().commit();
    }
}
