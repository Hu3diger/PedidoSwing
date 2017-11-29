package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author martin_ruediger
 */
@Entity
public class Ped_Prod implements IEntity{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Pedido pedido;
    @ManyToOne
    private Produto produto;
    private double preco_item;
    private double quantidade;

    public Ped_Prod() {
    }

    public Ped_Prod(int id, Pedido pedido, Produto produto, double preco_item, double quantidade) {
        this.id = id;
        this.pedido = pedido;
        this.produto = produto;
        this.preco_item = preco_item;
        this.quantidade = quantidade;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getPreco_item() {
        return preco_item;
    }

    public void setPreco_item(double preco_item) {
        this.preco_item = preco_item;
    }

    public double getPrecoTotal() {
        return preco_item * quantidade;
    }
    
    public double getDesconto(){
        if(pedido.getForma_pagamento() == 0){
            return getPrecoTotal();
        }else if(pedido.getForma_pagamento() == 1){
            return getPrecoTotal() - (getPrecoTotal()*0.05);
        }else{
            return getPrecoTotal();
        }
    }

}
