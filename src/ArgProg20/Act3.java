package ArgProg20;

import java.util.List;
import java.util.stream.Collectors;

public class Act3 {
    public static List<String> stringMayusc(List<String> strings) {
        return strings.stream().map(String::toUpperCase).collect(Collectors.toList());
    }
    public static String filtrarPorCaracter(List<String> listaStrings, int n){
        return listaStrings.stream().filter(palabra -> palabra.length() >= n).collect(Collectors.joining(", "));
    }
}
