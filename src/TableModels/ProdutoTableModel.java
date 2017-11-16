package TableModels;

import Model.Produto;

/**
 *
 * @author martin_ruediger
 */
public class ProdutoTableModel extends GenericTableModel {

    public ProdutoTableModel(Class clazz) {
        super(clazz);
    }

    public ProdutoTableModel(Class clazz, String[] columns) {
        this(clazz);
        this.columns = columns;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object result;
        switch (getColumnName(columnIndex)) {
            case "Preço":
                result = "R$ "+((Produto) objectList.get(rowIndex)).getPreco_referencia();
                break;
            case "Status":
                result = (((Produto) objectList.get(rowIndex)).isStatus()) ? "Ativo" : "Inativo";
                break;
            default:
                result = super.getValueAt(rowIndex, columnIndex);
                break;
        }
        return result;
    }

}
