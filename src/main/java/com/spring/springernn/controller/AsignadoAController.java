package com.spring.springernn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springernn.dto.AsignadoA;
import com.spring.springernn.service.AsignadoAServiceImpl;

@RestController
@RequestMapping("/api")
public class AsignadoAController {
	
	@Autowired
	AsignadoAServiceImpl asignadoAServiceImpl;
	
	@GetMapping("/asignadoa")
	public List<AsignadoA> listarAsignadoA(){
		return asignadoAServiceImpl.listarAsignadoA();
	}
	
	@PostMapping("/asignadoa")
	public AsignadoA guardarAsignadoA(@RequestBody AsignadoA asignadoa) {
		
		return asignadoAServiceImpl.guardarAsignadoA(asignadoa);
	}
	
	@GetMapping("/asignadoa/{id}")
	public AsignadoA asignadoAXID(@PathVariable(name="id") int id) {
		
		AsignadoA asignadoa_xid= new AsignadoA();
		
		asignadoa_xid=asignadoAServiceImpl.asignadoAXID(id);
		
		System.out.println("Cientifico XID: "+asignadoa_xid);
		
		return asignadoa_xid;
	}
	
	@PutMapping("/asignadoa/{id}")
	public AsignadoA actualizarAsignadoA(@PathVariable(name="id")int id,@RequestBody AsignadoA asignadoa) {
		
		AsignadoA asignadoa_seleccionado= new AsignadoA();
		AsignadoA asignadoa_actualizado= new AsignadoA();
		
		asignadoa_seleccionado= asignadoAServiceImpl.asignadoAXID(id);
		asignadoa_seleccionado.setId(asignadoa.getId());
		asignadoa_seleccionado.setCientifico(asignadoa.getCientifico());
		asignadoa_seleccionado.setProyecto(asignadoa.getProyecto());
		
		asignadoa_actualizado = asignadoAServiceImpl.actualizarAsignadoA(asignadoa_seleccionado);
		
		System.out.println("La asignación actualizada es: "+ asignadoa_actualizado);
		
		return asignadoa_actualizado;
	}
	
	@DeleteMapping("/asignadoa/{id}")
	public void eliminarAsignadoA(@PathVariable(name="id")int id) {
		asignadoAServiceImpl.eliminarAsignadoA(id);
	}
	
}
