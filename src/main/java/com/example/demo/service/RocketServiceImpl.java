package com.example.demo.service;

import java.util.List;

import com.example.entities.Modele;
import com.example.entities.Rocket;
import com.example.repos.RocketRepository;

public class RocketServiceImpl  implements RocketService  {
	
	RocketRepository rocketRepository;

	public Rocket saveRocket(Rocket r) {
	return rocketRepository.save(r);
	}
	@Override
	public Rocket updateRocket(Rocket r) {
	return rocketRepository.save(r);
	}
	@Override
	public void deleteRocket(Rocket r) {
		rocketRepository.delete(r);
	}
	 @Override
	public void deleteRocketById(Long id) {
		 rocketRepository.deleteById(id);
	}
	@Override
	public Rocket getRocket(Long id) {
	return rocketRepository.findById(id).get();
	}
	@Override
	public List<Rocket> getAllRockets() {
	return rocketRepository.findAll();
	}
	@Override
	public List<Rocket> findByNomRocket(String nom) {
	return rocketRepository.findByNomRocket(nom);
	}
	@Override
	public List<Rocket> findByNomRocketContains(String nom) {
	return rocketRepository.findByNomRocketContains(nom);
	}
	@Override
	public List<Rocket> findByNomBudget(String nom, Double prix) {
	return rocketRepository.findByNomBudget(nom, prix);
	}
	@Override
	public List<Rocket> findByModele(Modele modele) {
	return rocketRepository.findByModele(modele);
	}
	@Override
	public List<Rocket> findByModeleIdMod(Long id) {
	return rocketRepository.findByModeleIdMod(id);
	}
	@Override
	public List<Rocket> findByOrderByNomRocketAsc() {
	return rocketRepository.findByOrderByNomRocketAsc();
	}
	
}

