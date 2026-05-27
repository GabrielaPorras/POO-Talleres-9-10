package taller10.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Persona personaGenerica = new Persona();
        Persona estudiante = new Estudiante();
        Persona profesor = new Profesor();

        personaGenerica.presentarse();
        estudiante.presentarse();
        profesor.presentarse();
    }
}