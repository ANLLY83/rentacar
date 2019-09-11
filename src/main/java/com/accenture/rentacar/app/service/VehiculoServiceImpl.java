package com.accenture.rentacar.app.service;


import java.util.ArrayList;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.rentacar.app.dao.IVehiculoDao;
import com.accenture.rentacar.app.entity.vehiculos;

@Service
public class VehiculoServiceImpl implements IVehiculoService{

@Autowired
private IVehiculoDao vehiculoDao;


@Override
public vehiculos guardar(vehiculos vehiculo) {

return vehiculoDao.save(vehiculo);
}

@Override
public void borrar(Long id) {
vehiculoDao.deleteById(id);
}


@Override
public vehiculos buscarVehiculoPorId(Long id) {

return vehiculoDao.findById(id).orElse(null);


}

@Override
public List<vehiculos> listarTodosList() {

return (List<vehiculos>) vehiculoDao.findAll();

}


@Override
public List<vehiculos> guardarVarios(Vehiculo[] vehiculos) {
	List<vehiculos> retorno = new ArrayList<vehiculos>();
	

	for ( vehiculos vehiculos : vehiculos) {
		retorno.add (vehiculoDao.save(vehiculos) );
		
		
	}
	for( int i = 0; i < vehiculos.length; i++ )
	{
		
		retorno.add(vehiculoDao.save(vehiculos[i]));
	}
	}
	
	return retorno;
}

}

