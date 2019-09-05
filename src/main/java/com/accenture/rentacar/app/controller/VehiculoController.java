package com.accenture.rentacar.app.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.rentacar.app.entity.vehiculos;
import com.accenture.rentacar.app.service.IVehiculoService;
import com.accenture.rentacar.app.service.VehiculoServiceImpl;

@RestController
@RequestMapping("/api")

public class VehiculoController {
	
	@Autowired
	private IVehiculoService  vehiculoService;

	@GetMapping("/vehiculos")

	public List<vehiculos> listar(){
	return vehiculoService.listarTodosList();
	
	}
	

	@GetMapping("/vehiculos/(id)")

	public vehiculos buscarPoId( @PathVariable Long id) {
	return vehiculoService.buscarVehiculoPorId (id);


	}

	@PostMapping("/vehiculos")
	public vehiculos guardar (@RequestBody vehiculos vehiculo) {

	return vehiculoService.guardar(vehiculo);
	
	}
			
	
	
			
		   @PostMapping ("/actualizar")
			public vehiculos acualizar (@RequestBody vehiculos vehiculo)  (
					
					vehiculos VehiculoNuevo = new vehiculos();
					
					vehiculos vehiActualizar = vehiculoService.buscarVehiculoPorId.( vehiculo.getId());
					vehiActualizar.setId(vehiculo.getId());
					vehiActualizar.setColor( vehiculo.getColor());
					vehiActualizar.setLinea ( vehiculo.getLinea());
					vehiActualizar.setMarca ( vehiculo.getMarca());
					vehiActualizar.setModelo ( vehiculo.getModelo());
					
					
					return vehiculoService.guardar(vehiculos)
					
					
					
					
					
			
			
					
						
	}

}
