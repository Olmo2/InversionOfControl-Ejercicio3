package com.olmo.ioC.Rutas;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.olmo.ioC.Beans.Dia.Dia;
import com.olmo.ioC.Servicio.Calendario;

@Controller
public class Rutas {
	
	
	@Autowired
	Dia dia;
	
	
	
	@Autowired
	Calendario calendario;
	
	@GetMapping("/")
	@ResponseBody
	public String rutaInicial() {
		System.out.println( "her lle");
		
		
		
		return   calendario.avanceDia().toString();
		
	}

}
