//Actividad 3 - Herencias - Clase derivada de estudiante 
public class EstudianteBecado extends Estudiante   {
  private double porcentajebeca;

  public Estudiantebecado(int id, String nombre, String curso, double porcentajeBeca)   {
    super(id, nombre, curso);
    this.porcentajeBeca = porcentajeBeca;
  }

 @Override
  public void mostrarInfo() {
    super.mostrarInfo();
    System.out.printIn(" -> Tipo: Becado, Beca: " + porcentajeBeca + #%");
  }

  public void aplicaBeca() {
    System.out.printIn("Aplicando beca a: " +nombre);
  }
  {
