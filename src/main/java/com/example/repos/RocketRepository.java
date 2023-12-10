package com.example.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.entities.Modele;
import com.example.entities.Rocket;
@RepositoryRestResource(path = "rest")

public interface RocketRepository extends JpaRepository<Rocket, Long> {
	List<Rocket> findByNomRocket(String nom);
	@Query("select r from Rocket r where r.nomRocket like %?1 and r.rocketbudget > ?2")
	List<Rocket> findByNomBudget (String nom, Double prix);
	@Query("select r from Rocket r where r.modele = ?1")
	List<Rocket> findByModele (Modele categorie);
	List<Rocket> findByModeleIdMod(Long id);
	List<Rocket> findByOrderByNomRocketAsc();
	@Query("select r from Rocket r order by r.nomRocket ASC, r.budgetRocket DESC")
	List<Rocket> trierRocketNomsbudget();
	List<Rocket> findByNomRocketContains(String nom);

}

