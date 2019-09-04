package com.accenture.rentacar.app.dao;



import org.springframework.data.repository.CrudRepository;
import com.accenture.rentacar.app.entity.vehiculos;


public interface IVehiculoDao {
	

	 public interface IVhiculoDao extends CrudRepository <Vehiculos,long> 

		
		
}
