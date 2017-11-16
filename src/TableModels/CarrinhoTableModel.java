package TableModels;

import Model.Ped_Prod;

/**
 *
 * @author martin_ruediger
 */
public class CarrinhoTableModel extends GenericTableModel {

    public CarrinhoTableModel(Class clazz) {
        super(clazz);
    }

    public CarrinhoTableModel(Class clazz, String[] columns) {
        this(clazz);
        this.columns = columns;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object result;
        switch(getColumnName(columnIndex)){
            case "Produto":
                result = ((Ped_Prod)objectList.get(rowIndex)).getProduto().getNome();
                break;
            case "Preço Unitário":
                result = ((Ped_Prod)objectList.get(rowIndex)).getPreco_item();
                break;
            case "Quantidade":
                result = ((Ped_Prod)objectList.get(rowIndex)).getQuantidade();
                break;
            case "Preço Total":
                result = ((Ped_Prod)objectList.get(rowIndex)).getPrecoTotal();
                break;
            default:
                result = super.getValueAt(rowIndex, columnIndex);
                break;
        }
        return result;
    }
    
    
}
