package ArgProg20;

import java.util.List;
import static ArgProg20.Act2.transformarStrings;


public class Main {

    //Main Actividad 1
    public static void main(String[] args) {
        //Main Act 1
        /*Act1.Materia algoritmos = new Act1.Materia("Algoritmos y Estructuras de Datos");
        Act1.Materia paradigmas = new Act1.Materia("Paradigmas de Programación");
        Act1.Materia disenoSistemas = new Act1.Materia("Diseño de Sistemas");

        paradigmas.getCorrelativas().add(algoritmos);
        disenoSistemas.getCorrelativas().add(paradigmas);

        Act1.Alumno alumno1 = new Act1.Alumno("Andres");
        alumno1.aprobarMateria(algoritmos);
        alumno1.aprobarMateria(paradigmas);

        Act1.Alumno alumno2 = new Act1.Alumno("Laura");
        alumno2.aprobarMateria(algoritmos);

        Act1.Inscripcion inscripcion1 = new Act1.Inscripcion(alumno1, disenoSistemas);
        Act1.Inscripcion inscripcion2 = new Act1.Inscripcion(alumno2, disenoSistemas);

        System.out.println(inscripcion1 + " - Aprobada: " + inscripcion1.aprobada());
        System.out.println(inscripcion2 + " - Aprobada: " + inscripcion2.aprobada());*/

        //Main Act 2
        List<String> listaOriginal = List.of("Hola", "Mundo", "Java");


        FuncionTransformarString toUpperCaseFunction = String::toUpperCase;

        // Aplica la transformación y muestra el resultado
        List<String> listaTransformada = transformarStrings(listaOriginal, toUpperCaseFunction);
        System.out.println("Lista original: " + listaOriginal);
        System.out.println("Lista transformada: " + listaTransformada);
    }

}