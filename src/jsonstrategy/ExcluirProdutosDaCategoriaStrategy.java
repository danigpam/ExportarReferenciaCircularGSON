package jsonstrategy;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;

/**
 *
 * @author danigpam
 */
public class ExcluirProdutosDaCategoriaStrategy implements ExclusionStrategy {

    @Override
    public boolean shouldSkipField(FieldAttributes fa) {
        String className = fa.getDeclaringClass().getName();
        String fieldName = fa.getName();
        
        return className.equals("entidade.Categoria")
                && fieldName.equals("produtos");
    }

    @Override
    public boolean shouldSkipClass(Class<?> type) {
        return false;
    }
    
}
