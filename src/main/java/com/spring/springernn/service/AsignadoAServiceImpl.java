package com.spring.springernn.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.springernn.dao.IAsignadoADAO;
import com.spring.springernn.dto.AsignadoA;

@Service
public class AsignadoAServiceImpl implements IAsignadoAService{
	
	@Autowired
	IAsignadoADAO iAsignadoADAO;
	
	@Override
	public List<AsignadoA> listarAsignadoA() {
		return iAsignadoADAO.findAll();
	}

	@Override
	public AsignadoA guardarAsignadoA(AsignadoA asignadoa) {
		return iAsignadoADAO.save(asignadoa);
	}

	@Override
	public AsignadoA asignadoAXID(int id) {
		return iAsignadoADAO.findById(id).get();
	}

	@Override
	public AsignadoA actualizarAsignadoA(AsignadoA asignadoa) {
		return iAsignadoADAO.save(asignadoa);
	}

	@Override
	public void eliminarAsignadoA(int id) {
		iAsignadoADAO.deleteById(id);		
	}
}
