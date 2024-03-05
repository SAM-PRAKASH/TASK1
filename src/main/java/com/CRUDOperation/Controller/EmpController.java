package com.CRUDOperation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.CRUDOperation.CustomExceptionHandler.CustomException1;
import com.CRUDOperation.Entity.EmpEntity;
import com.CRUDOperation.Service.EmpService;

@RestController
@RequestMapping("/")
public class EmpController {
	@Autowired
	EmpService es;

	@PostMapping("emp") 
	public String postEmp(@RequestBody EmpEntity ee) {
		return es.postEmp(ee);
	}
	
	@PostMapping("empList")
	public String postEmp(@RequestBody List<EmpEntity> ee) {
		return es.postEmp(ee);
	}
	
   @GetMapping("getEmp/{a}")
   public String getAllemp(@PathVariable int a) {
	   int out = a/0;
	   return out+"";
   }
   
   @GetMapping("getEmpId/{a}")
   public EmpEntity getEmpId(@PathVariable Long a) throws CustomException1 {
	   
	   return es.getEmpId(a);
   }
   
   @GetMapping("getall")
   public ResponseEntity<Object> getNames() {
	   return new ResponseEntity<>("Sample",HttpStatus.BAD_GATEWAY);
   }
   
   @GetMapping("get3")
   public ResponseEntity<Object> get3Names() {
	   return new ResponseEntity<>( es.get3Names(),HttpStatus.ACCEPTED);
   }
   
//   @GetMapping("get/{id}")
//   public List<String> getNameOf(@PathVariable int id){
//	   return es.getNameOf(id);
//   }
   
   @GetMapping("get/{name}")
   public List<String> getNameOf(@PathVariable String name){
	   return es.getNameOf(name);
   }
   
   @PutMapping("get/{id}")
   public String updateEmp(@PathVariable Long id,@RequestBody EmpEntity ee) {
	return es.updateEmp(id,ee);
	   
   }
   
   
   
   @PatchMapping("empEdit/{id}")
   public String EmpPatching(@PathVariable Long id,@RequestBody EmpEntity ee) throws CustomException1 {
	return es.EmpPatching(id,ee);
   }
	   
   }


