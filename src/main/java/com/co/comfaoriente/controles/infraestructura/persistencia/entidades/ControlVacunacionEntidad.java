package com.co.comfaoriente.controles.infraestructura.persistencia.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "controlvac", schema = "controles")
public class ControlVacunacionEntidad implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_control_vac", nullable = false)
	private int id;

	@Column(name = "id_usuario", nullable = false)
	private int idUsuario;

	@Column(name = "fecha_aplic", nullable = false)
	private Date fechaAplicacion;

	@Column(name = "dosis", nullable = false)
	private int dosis;
	
	@Column(name = "nombre_vacuna", nullable = true)
	private String nombreVacuna;

	@Column(name = "edad_gestacional", nullable = false)
	private int edadGestacional;

	@Column(name = "vigente", columnDefinition = "tinyint(1) default 1", nullable = false)
	private boolean vigente;
	
	@Column(name = "lote", nullable = true)
	private String lote;
	
	@Column(name = "institucion", nullable = true)
	private String institucion;
	
	@Column(name = "profesional_salud", nullable = true)
	private String profesionalSalud;	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Date getFechaAplicacion() {
		return fechaAplicacion;
	}

	public void setFechaAplicacion(Date fechaAplicacion) {
		this.fechaAplicacion = fechaAplicacion;
	}

	public int getDosis() {
		return dosis;
	}

	public void setDosis(int dosis) {
		this.dosis = dosis;
	}

	public int getEdadGestacional() {
		return edadGestacional;
	}

	public void setEdadGestacional(int edadGestacional) {
		this.edadGestacional = edadGestacional;
	}

	public boolean isVigente() {
		return vigente;
	}

	public void setVigente(boolean vigente) {
		this.vigente = vigente;
	}

	public String getNombreVacuna() {
		return nombreVacuna;
	}

	public void setNombreVacuna(String nombreVacuna) {
		this.nombreVacuna = nombreVacuna;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	public String getProfesionalSalud() {
		return profesionalSalud;
	}

	public void setProfesionalSalud(String profesionalSalud) {
		this.profesionalSalud = profesionalSalud;
	}
	
	
	

}
