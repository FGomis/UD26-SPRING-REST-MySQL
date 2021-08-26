package com.spring.springernn.service;

import java.util.List;
import com.spring.springernn.dto.Cientifico;

public interface ICientificoService {
	
	public List<Cientifico> listarCientificos();
	
	public Cientifico guardarCientifico(Cientifico cientifico);
	
	public Cientifico cientificoXID(String id);
	
	public Cientifico actualizarCientifico(Cientifico cientifico);
	
	public void eliminarCientifico(String id);
}
