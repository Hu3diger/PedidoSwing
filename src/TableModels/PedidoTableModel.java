package TableModels;

import Model.Pedido;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author martin_ruediger
 */
public class PedidoTableModel extends GenericTableModel {

    public PedidoTableModel(Class clazz) {
        super(clazz);
    }

    public PedidoTableModel(Class clazz, String[] columns) {
        this(clazz);
        this.columns = columns;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object result;
        switch (getColumnName(columnIndex)){
            case "Data Pedido":
                Date data = ((Pedido)objectList.get(rowIndex)).getData_pedido();
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                result = (String)formato.format(data);
                break;
            case "Cliente":
                result = ((Pedido)objectList.get(rowIndex)).getCliente_id();
                break;
            case "Forma Pagamento":
                result = (((Pedido)objectList.get(rowIndex)).getForma_pagamento() == 0)? "Cartão de Crédito" : "Dinheiro (à vista)";
                break;
            case "Status":
               result = (((Pedido)objectList.get(rowIndex)).isStatus())? "Finalizado" : "Cancelado";
                break;
            default:
                result = super.getValueAt(rowIndex, columnIndex);
                break;
        }
        return result;
    }
    
    

}
