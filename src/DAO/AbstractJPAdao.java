package DAO;

import Model.IEntity;
import Model.Produto;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 *
 * @author Martin.Ruediger
 */
public abstract class AbstractJPAdao<T extends IEntity> implements IDao<T>{

    private Class<T> clazz;

    public AbstractJPAdao() {
        clazz = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];;
    } 

    @Override
    public void save(T t) {
        JpaUtil.getEntityManager().getTransaction().begin();
        if (t.getId() == 0) {
            JpaUtil.getEntityManager().persist(t);
        } else {
            JpaUtil.getEntityManager().merge(t);
        }
        JpaUtil.getEntityManager().getTransaction().commit();
    }

    @Override
    public T findById(int id) {
        return JpaUtil.getEntityManager().find(clazz, id);
    }

    @Override
    public List<T> findAll() {
        return JpaUtil.getEntityManager()
                .createQuery("select c from "+clazz.getSimpleName()+" c")
                .getResultList();
    }

    @Override
    public void delete(int id) {
        JpaUtil.getEntityManager().remove(
                JpaUtil.getEntityManager()
                .getReference(clazz, id));
    }

    @Override
    public void delete(T t) {
        delete(t.getId());
    }
    
     public List<T> findActive(){
        return JpaUtil.getEntityManager().createQuery("select c from"+clazz.getSimpleName()+" c where c.status = true").getResultList();
    }
    
}