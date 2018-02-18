package com.example.zorro;




import java.util.Arrays;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class OsService {

	@Autowired
	private OsDemoRepository carRepository;
	
//	@Autowired
//	RestTemplate restTemplate;
//
//	@Value("${insuranceAPI.uri}")
//	private String uriInsuranceAPI;
//	
//	@Value("${insuranceAPI.key}")
//	private String insuranceAPI_key;
//	
//	@Autowired
//	private HttpHeaders httpHeaders;
	
	public Iterable<Osdemo> insertCar(Osdemo car){		
		
//		Insurance insurance_orig = new Insurance();
//		insurance_orig.setRegNo(car.getRegNo());	
//
//		System.out.println("Insurance API URI  >>> "+uriInsuranceAPI+"/insert");
//		System.out.println("Insurance API KEY  >>> "+insuranceAPI_key);
//		System.out.println("Insurance API HEADERS  >>> "+httpHeaders.values().iterator().toString());
//		HttpEntity<Insurance> httpEntity = new HttpEntity<Insurance>(insurance_orig,httpHeaders);		
//		Insurance response = restTemplate.postForObject(uriInsuranceAPI+"/insert",httpEntity, Insurance.class);				
		
		carRepository.save(car);
//		System.out.println("Cars DB Inserted >>>>" + " " + response.toString());
		return carRepository.findAll();
	}
	
	public Iterable<Osdemo> findCars(){
		return carRepository.findAll();
	}
	
	public Osdemo findCar(Integer regno){
		return carRepository.findOne(regno);
	}
	
	public Osdemo removeCar(Integer regno) {
		Osdemo removeCar = new Osdemo();
		removeCar = carRepository.findOne(regno);
		carRepository.delete(removeCar);
		return removeCar;
	}	
	
	
}
	

