package com.example.demo.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.RocketService;
import com.example.entities.Rocket;
@RestController
@RequestMapping("/api")
@CrossOrigin

public class RocketRestController {
	@Autowired
	RocketService rocketService;
	@RequestMapping(method = RequestMethod.GET)
	public List<Rocket> getAllRockets() {
	return rocketService.getAllRockets();
	}

	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Rocket getRocketById(@PathVariable("id") Long id) {
	return rocketService.getRocket(id);
	 }
	
	@RequestMapping(method = RequestMethod.POST)
	public Rocket createRocket(@RequestBody Rocket rocket) {
	return rocketService.saveRocket(rocket);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Rocket updateProduit(@RequestBody Rocket rocket) {
	return rocketService.updateRocket(rocket);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteRocket(@PathVariable("id") Long id)
	{
	rocketService.deleteRocketById(id);
	}
	
	@RequestMapping(value="/prodscat/{idMod}",method = RequestMethod.GET)
	public List<Rocket> getProduitsByCatId(@PathVariable("idMod") Long idMod) {
	return rocketService.findByModeleIdMod(idMod);
	}
}
