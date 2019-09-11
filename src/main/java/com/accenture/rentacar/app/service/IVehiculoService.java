package com.accenture.rentacar.app.service;

import java.util.List;

import com.accenture.rentacar.app.entity.vehiculos;



public interface IVehiculoService {
	
	
	public vehiculos guardar(vehiculos vehiculos);
	public void borrar(Long id);
	public vehiculos buscarVehiculoPorId(Long id);
	
	
	public List <vehiculos> listarTodosList();
	
	public List <vehiculos> listrTodosList();
}
