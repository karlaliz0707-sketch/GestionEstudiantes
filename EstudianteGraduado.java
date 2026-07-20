//Actividad 3 - Herencia - Segunda clase derivada
public class EstudianteGraduado extends Estudiante {
  private String certificacon;

public EstudianteGraduado(int id, String nombre,String curso, String certificado){
  super(id, nombre, curso);
  this.certificacion = certificacion;
}

  @Override }
public void mostrarInfo() {
  super.mostrarInfo();
  System.out.prinIn(" -> Tipo Graduado,Cert: " +certificacion);
}

public void genearCetificado(){
  System.out.printIn("Certificado " + certificacion +" para " +nombre);
}
}
