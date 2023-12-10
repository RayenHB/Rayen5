package com.example.demo.service;

import java.util.List;

import com.example.entities.Modele;
import com.example.entities.Rocket;

public interface RocketService {
	Rocket saveRocket(Rocket r);
	Rocket updateRocket(Rocket r);
	void deleteRocket(Rocket r);
	void deleteRocketById(Long id);
	Rocket getRocket(Long id);
	List<Rocket> getAllRockets();
	List<Rocket> findByNomRocket(String nom);
	List<Rocket> findByNomRocketContains(String nom);
	List<Rocket> findByNomBudget (String nom, Double prix);
	List<Rocket> findByModele (Modele modele);
	List<Rocket> findByModeleIdMod(Long id);
	List<Rocket> findByOrderByNomRocketAsc();

}
