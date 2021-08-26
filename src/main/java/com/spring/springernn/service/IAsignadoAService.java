package com.spring.springernn.service;

import java.util.List;
import com.spring.springernn.dto.AsignadoA;

public interface IAsignadoAService {

	public List<AsignadoA> listarAsignadoA();
	
	public AsignadoA guardarAsignadoA(AsignadoA asignadoa);
	
	public AsignadoA asignadoAXID(int id);
	
	public AsignadoA actualizarAsignadoA(AsignadoA asignadoa);
	
	public void eliminarAsignadoA(int id);
	
}
