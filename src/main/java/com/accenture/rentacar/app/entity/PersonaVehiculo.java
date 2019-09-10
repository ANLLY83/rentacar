package com.accenture.rentacar.app.entity;


import java.awt.List;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.accenture.rentacar.app.service.PersonaService;


@Entity
@Table(name = PersonaService_x_Vehiculo)


public class PersonaVehiculo {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private PersonaVehiculo persona;
	
    @OneToMany
	
	private List personaList <personas> personas;
	
	
	@Temporal(TemporalType.DATE)
	@Column(name =  "fecha_Creacion_Registro")
	private Date fechaCreacionRegistro;
	
	
	private String observaciones;
	
	@PrePersist
	public void prePersist( ) {
		fechaCreacionRegistro = new Date();
				

}

}