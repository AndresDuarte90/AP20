package ArgProg20;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Act2 {

    public static List<String> transformarStrings(List<String> strings, FuncionTransformarString funcionTransformar) {
        List<String> listaTransformada = new ArrayList<>();

        for (String str : strings) {
            String stringTransformado = funcionTransformar.apply(str);
            listaTransformada.add(stringTransformado);
        }

        return listaTransformada;
    }

}

@FunctionalInterface
interface FuncionTransformarString {
    String apply(String str);
}