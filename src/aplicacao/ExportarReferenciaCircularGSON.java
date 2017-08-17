package aplicacao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entidade.Categoria;
import jsonstrategy.ExcluirCategoriaDoProdutoStrategy;
import entidade.Produto;
import jsonstrategy.ExcluirProdutosDaCategoriaStrategy;

/**
 *
 * @author danigpam
 */
public class ExportarReferenciaCircularGSON {

    public static void main(String[] args) {
       
        Categoria cat = new Categoria("comidas");
        Produto prod = new Produto("chocolate", 10.0, cat);
        Produto prod2 = new Produto("abacate", 5.0, cat);
        
        Gson gson = new GsonBuilder()
                .addSerializationExclusionStrategy(new ExcluirCategoriaDoProdutoStrategy())
                .create();
        String jsonCategoria = gson.toJson(cat);
        System.out.println("JSON da categoria: " + jsonCategoria);
        
        //IMPRIME:
        //JSON da categoria: {"nome":"comidas","produtos":[{"nome":"chocolate","preco":10.0},{"nome":"abacate","preco":5.0}]}
        
        Gson gson2 = new GsonBuilder()
                .addSerializationExclusionStrategy(new ExcluirProdutosDaCategoriaStrategy())
                .create();
        String jsonProduto = gson2.toJson(prod);
        System.out.println("JSON do produto: " + jsonProduto);
        
        //IMPRIME:
        //JSON do produto: {"nome":"chocolate","preco":10.0,"categoria":{"nome":"comidas"}}
        
    }  
}
