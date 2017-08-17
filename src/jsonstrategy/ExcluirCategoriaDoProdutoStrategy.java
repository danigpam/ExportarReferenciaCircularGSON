package jsonstrategy;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;

/**
 *
 * @author danigpam
 */
public class ExcluirCategoriaDoProdutoStrategy implements ExclusionStrategy {

    @Override
    public boolean shouldSkipField(FieldAttributes fa) {
        String className = fa.getDeclaringClass().getName();
        String fieldName = fa.getName();
        
        boolean shouldSkipField = false;
        shouldSkipField = className.equals("entidade.Produto")
                && fieldName.equals("categoria");
        
        return shouldSkipField;
    }

    @Override
    public boolean shouldSkipClass(Class<?> type) {
        return false;
    }
    
}
