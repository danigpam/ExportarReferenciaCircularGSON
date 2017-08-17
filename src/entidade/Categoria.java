package entidade;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danigpam
 */
public class Categoria {
    
    private String nome;
    private List<Produto> produtos;

    public Categoria(String nome) {
        this.nome = nome;
    }
    
    public void addProduto(Produto produto) {
        if (produtos == null) {
            produtos = new ArrayList<Produto>();
        }
        
        produtos.add(produto);
    }
    
    
    
}
