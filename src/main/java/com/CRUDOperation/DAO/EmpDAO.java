package com.CRUDOperation.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.CRUDOperation.CustomExceptionHandler.CustomException1;
import com.CRUDOperation.Entity.EmpEntity;
import com.CRUDOperation.Repository.EmpRepository;

@Repository
public class EmpDAO {
	@Autowired
	EmpRepository rr;

	public String postEmp(EmpEntity ee) {

		rr.save(ee);
		return "Done";
	}

	public String postEmp(List<EmpEntity> ee) {
		rr.saveAll(ee);
		return "EMP SAVED";
	}

	public EmpEntity getEmpId(Long a) throws CustomException1 {

		Optional<EmpEntity> tt = rr.findById(a);
		if (tt.isEmpty()) {
			throw new CustomException1("ss");
		}
		return tt.get();
	}

	public List<String> get3Names() {
		
		return rr.get3Names();
	}

	public List<String> getNameOf(String name) {
		
		return rr.getNameOf(name);
	}

}
