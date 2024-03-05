package com.CRUDOperation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRUDOperation.CustomExceptionHandler.CustomException1;
import com.CRUDOperation.DAO.EmpDAO;
import com.CRUDOperation.Entity.EmpEntity;

@Service
public class EmpService {

	@Autowired
	EmpDAO ed;

	public String postEmp(EmpEntity ee) {

		return ed.postEmp(ee);
	}

	public String postEmp(List<EmpEntity> ee) {

		return ed.postEmp(ee);
	}

	public EmpEntity getEmpId(Long a) throws CustomException1 {
		return ed.getEmpId(a);
	}

	public String updateEmp(Long id, EmpEntity ee) {
		ee.setId(id);
		return ed.postEmp(ee);
	}

	public String EmpPatching(Long id, EmpEntity ee) throws CustomException1 {
		EmpEntity empe = ed.getEmpId(id);
		if (ee.getName() != null) {
			empe.setName(ee.getName());
		}
		if (ee.getEmail() != null) {
			empe.setEmail(ee.getEmail());
		}

		return ed.postEmp(empe);

	}

	public List<String> get3Names() {

		return ed.get3Names();
	}

	public List<String> getNameOf(String name) {
		// 
		return ed.getNameOf(name); 
	}

}
