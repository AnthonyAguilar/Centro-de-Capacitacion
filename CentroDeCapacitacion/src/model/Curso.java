package model;

public class Curso {

	private int codigo;
	private String nombre;
	private String edicion;
	private String aula;
	private int cupos;
	private ProfesorTitular profesorTitular;
	private ProfesorAdjunto profesorAdjunto;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEdicion() {
		return edicion;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	public String getAula() {
		return aula;
	}
	public void setAula(String aula) {
		this.aula = aula;
	}
	public int getCupos() {
		return cupos;
	}
	public void setCupos(int cupos) {
		this.cupos = cupos;
	}
	public ProfesorTitular getProfesorTitular() {
		return profesorTitular;
	}
	public void setProfesorTitular(ProfesorTitular profesorTitular) {
		this.profesorTitular = profesorTitular;
	}
	public ProfesorAdjunto getProfesorAdjunto() {
		return profesorAdjunto;
	}
	public void setProfesorAdjunto(ProfesorAdjunto profesorAdjunto) {
		this.profesorAdjunto = profesorAdjunto;
	}

	
	
}
