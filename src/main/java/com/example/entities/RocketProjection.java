package com.example.entities;
import org.springframework.data.rest.core.config.Projection;
@Projection(name = "nomRocket", types = { Rocket.class })
public interface RocketProjection {
	public String getNomRocket();
}
