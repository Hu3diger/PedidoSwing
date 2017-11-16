package TableModels;

import Model.Cliente;

/**
 *
 * @author martin_ruediger
 */
public class ClienteTableModel extends GenericTableModel {

    public ClienteTableModel(Class clazz) {
        super(clazz);
    }

    public ClienteTableModel(Class clazz, String[] columns) {
        this(clazz);
        this.columns = columns;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object result;
        switch(getColumnName(columnIndex)){
            case "Status":
                result = (((Cliente)objectList.get(rowIndex)).isStatus())? "Ativo" : "Inativo" ;
                break;
            default:
                result = super.getValueAt(rowIndex, columnIndex);
                break;
            }
        return result;
    }
    
    
}