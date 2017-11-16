package Model;

import java.sql.Date;

/**
 *
 * @author martin_ruediger
 */
public class Pedido {
    private int id;
    private Date data_pedido;
    private Cliente cliente_id;
    private int forma_pagamento;
    private boolean status;

    public Pedido() {
    }

    public Pedido(int id, Date data_pedido, Cliente cliente_id, int forma_pagamento, boolean status) {
        this.id = id;
        this.data_pedido = data_pedido;
        this.cliente_id = cliente_id;
        this.forma_pagamento = forma_pagamento;
        this.status = status;
    }
    
    public int getForma_pagamento() {
        return forma_pagamento;
    }

    public void setForma_pagamento(int forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData_pedido() {
        return data_pedido;
    }

    public void setData_pedido(Date data_pedido) {
        this.data_pedido = data_pedido;
    }

    public Cliente getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Cliente cliente_id) {
        this.cliente_id = cliente_id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
    
    
}
