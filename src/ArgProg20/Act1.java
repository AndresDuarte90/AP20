package ArgProg20;

import java.util.HashSet;
import java.util.Set;

public class Act1 {


    static class Materia {
        private String nombre;
        private Set<Materia> correlativas;

        public Materia(String nombre) {
            this.nombre = nombre;
            this.correlativas = new HashSet<>();
        }

        public String getNombre() {
            return nombre;
        }

        public Set<Materia> getCorrelativas() {
            return correlativas;
        }
    }

    static class Alumno {
        private String nombre;
        private Set<Materia> materiasAprobadas;

        public Alumno(String nombre) {
            this.nombre = nombre;
            this.materiasAprobadas = new HashSet<>();
        }

        public String getNombre() {
            return nombre;
        }

        public void aprobarMateria(Materia materia) {
            materiasAprobadas.add(materia);
        }

        public Set<Materia> getMateriasAprobadas() {
            return materiasAprobadas;
        }
    }

    static class Inscripcion {
        private Alumno alumno;
        private Materia materia;

        public Inscripcion(Alumno alumno, Materia materia) {
            this.alumno = alumno;
            this.materia = materia;
        }

        public boolean aprobada() {
            return alumno.getMateriasAprobadas().containsAll(materia.getCorrelativas());
        }

        @Override
        public String toString() {
            return "Inscripción: " + alumno.getNombre() + " en " + materia.getNombre();
        }
    }




}
