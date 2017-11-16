package Model;

/**
 *
 * @author martin_ruediger
 */
public class Produto {
    private int id;
    private String nome;
    private double quantidade;
    private double preco_referencia;
    private boolean status;

    public Produto() {
    }

    public Produto(int id, String nome, double quantidade, double preco_referencia, boolean status) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco_referencia = preco_referencia;
        this.status = status;
    }

    public double getPreco_referencia() {
        return preco_referencia;
    }

    public void setPreco_referencia(double preco_referencia) {
        this.preco_referencia = preco_referencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
           
}
