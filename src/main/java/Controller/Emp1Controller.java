package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
//@RequestMapping("/rest2")
public class Emp1Controller {

	@Autowired
	RestTemplate et;
	
	@GetMapping(path="/ddf")
	public String welcom() {
		return "GOOD";
	}
	
	@GetMapping(path="/getEE")
	public List<Object> getdetils(){
		
		String getURL = "http://localhost:8080/getall";
ResponseEntity<List<Object>>  l1 = et.exchange(getURL, HttpMethod.GET,null,new ParameterizedTypeReference<List<Object>>() {});
		return l1.getBody();
	}
	
}
