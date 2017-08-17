package entidade;

/**
 *
 * @author danigpam
 */
public class Produto {
    
    private String nome;
    private double preco;
    private Categoria categoria;

    public Produto(String nome, double preco, Categoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.categoria.addProduto(this);
    }
    
    
}
