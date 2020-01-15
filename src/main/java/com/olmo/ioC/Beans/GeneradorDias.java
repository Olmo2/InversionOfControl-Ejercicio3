package com.olmo.ioC.Beans;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.olmo.ioC.Beans.Dia.Dia;

@Configuration
public class GeneradorDias {

	
	@Bean
	@Scope("prototype")
	public Dia dia(){
		
		Dia dia = new Dia();
		Calendar diaDeHoy = Calendar.getInstance();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		dia.setFecha(formato.format(diaDeHoy.getTime()));
		
		
		return dia;
		
	}
}
