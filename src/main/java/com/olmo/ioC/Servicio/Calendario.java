package com.olmo.ioC.Servicio;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.olmo.ioC.Beans.GeneradorDias;
import com.olmo.ioC.Beans.Dia.Dia;

@Service
@Scope
public class Calendario {
	
	@Autowired
	GeneradorDias gen;
	
	
	public ArrayList<Dia> avanceDia() {
		
		
		Calendar diaDeHoy = Calendar.getInstance();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		ArrayList<Dia> dias = new ArrayList<Dia>();
		
		for(int i = 0 ; i<21 ; i++) {
			Dia dia= gen.dia();			
			
			
			diaDeHoy.add(Calendar.DATE, 1);
			dia.setFecha(formato.format(diaDeHoy.getTime()));
			dias.add(dia);
			
		}
		System.out.println(dias);
		

	return dias;
}
	
	
	
}
