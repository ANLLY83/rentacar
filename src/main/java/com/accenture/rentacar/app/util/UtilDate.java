package com.accenture.rentacar.app.util;

import java.util.Date;

public class UtilDate {
	

	
	public static int calcularDias(Date fechaInicio, Date fechaFin) {
		
		try {
			long diferencia = fechaFin.getTime() - fechaInicio.getTime();
			Long d = (diferencia / (1000*60*60*24));
			int dias = d.intValue();
			return dias;
			
			
		
		}
		catch(Exception e) {
			throw e;
			
		}
		
		
		
		catch(ExceptionInInitializerError e) {
			throw e;
			
			
		}
		finally {
		
	}
		
		
}
	
}