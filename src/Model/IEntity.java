package Model;

import java.io.Serializable;

/**
 *
 * @author martin_ruediger
 */
public interface IEntity extends Serializable{

    public int getId();
    public void setId(int id);
    
}
