package com.accenture.rentacar.app.service;


import java.util.List;

import com.accenture.rentacar.app.entity.vehiculos;

public class IPersonaService {
	
	
	public Persona guardar(persona persona);
	public void borrar(Long id);
	public persona buscarVehiculoPorId(Long id);
	
	
	public List <Persona> listarTodosList();
	
	

}
