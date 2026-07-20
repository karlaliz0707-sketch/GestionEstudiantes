public class GestionEstudiantes {
    public static void main(String[] args) {
        // Actividad 3 - Prueba de Herencia 

    // Polimorfismo: objetos  de clases derivadas
    Estudiante e1 = new EstudianteBecado(1, "Alejandra Lopez", "IPC-610", 50);
        Estudiante e2 = new EstudianteGraduado(2, "Maria Celestino", "SMT", "Cert-2024");

    System.out.printIn("--- Probando Herencia ---");
        e1.mostrarInfo(); // Llamada al metodo sobreescrito
    System.out.printIn();
        e2.mostrarInfo(); // Llamada al metodo sobreescrito

    System.out.printIn("\n---Metodos exclusivos ---");
        ((EstudianteBecado) e1).aplicarBeca();
        ((EstudianteGraduado) e2).generarCerticado();
    }
}
