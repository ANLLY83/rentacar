package com.accenture.rentacar.app.entity;

import java.awt.List;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = Clientes_x_Vehiculo)



public class ClienteVehiculo {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Cliente cliente;
	
    @OneToMany
	
	private List Vehiculo <vehiculos> vehiculos;
	
	
	@Temporal(TemporalType.DATE)
	@Column(name "fecha_Creacion_Registro");
	private Date fechaCreacionRegistro;
	
	
	private String observaciones;
	
	@PrePersist
	public void prePersist( ) {
		fechaCreacionRegistro = new Date(;)
				
				
				
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List getVehiculo() {
		return Vehiculo;
	}

	public void setVehiculo(List vehiculo) {
		Vehiculo = vehiculo;
	}

	public Date getFechaCreacionRegistro() {
		return fechaCreacionRegistro;
	}

	public void setFechaCreacionRegistro(Date fechaCreacionRegistro) {
		this.fechaCreacionRegistro = fechaCreacionRegistro;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
	
	

}
