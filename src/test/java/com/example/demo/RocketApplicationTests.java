package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.entities.Modele;
import com.example.entities.Rocket;
import com.example.repos.RocketRepository;
import java.util.List;
import java.util.List;

@SpringBootTest
class RocketApplicationTests {

	private RocketRepository rocketRepository;
	@Test
	public void testCreateRocket() {
	Rocket rock = new Rocket("Falcon9",2200.500,new Date());
	rocketRepository.save(rock);
	}
	@Test
	public void testFindRocket()
	{
	Rocket r = rocketRepository.findById(1L).get();
	System.out.println(r);
	}
	@Test
	public void testUpdateRocket()
	{
	Rocket r = rocketRepository.findById(1L).get();
	r.setbudget(1000.0);
	rocketRepository.save(r);
	}
	@Test
	public void testDeleteRocket()
	{
	rocketRepository.deleteById(1L);;
	}

	@Test
	public void testListerTousRockets()
	{
	List<Rocket> rocks = rocketRepository.findAll();
	for (Rocket r : rocks)
	{
	System.out.println(r);
	}
	}
	
	@Test
	public void testFindByNomRocket()
	{
	List<Rocket> rocks = rocketRepository.findByNomRocket("falcon9");
	for (Rocket p : rocks)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testFindByNomProduitContains ()
	{
	List<Rocket> rocks=rocketRepository.findByNomRocketContains("falcon");
	for (Rocket p : rocks)
	{
	System.out.println(p);
	} }
	
	@Test
	public void testfindByNomPrix()
	{
	List<Rocket> prods = rocketRepository.findByNomBudget("falcon 9", 1000.0);
	for (Rocket p : prods)
	{
	System.out.println(p);
	}
	}
	
	@Test
	public void testfindByModele()
	{
	Modele mod = new Modele();
	mod.setIdMod(1L);
	List<Rocket> rocks = rocketRepository.findByModele(mod);
	for (Rocket p : rocks)
	{
	System.out.println(p);
	}
	}
	@Test
	public void findByModeleIdMod()
	{
	List<Rocket> prods = rocketRepository.findByModeleIdMod(1L);
	for (Rocket p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testfindByOrderByNomRocketAsc()
	{
	List<Rocket> prods =
	rocketRepository.findByOrderByNomRocketAsc();
	for (Rocket p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testTrierProduitsNomsbudget()
	{
	List<Rocket> prods = rocketRepository.trierRocketNomsbudget();
	for (Rocket p : prods)
	{
	System.out.println(p);
	}
	}


	 


}
