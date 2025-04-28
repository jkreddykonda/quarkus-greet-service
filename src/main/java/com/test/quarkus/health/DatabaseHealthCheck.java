package com.test.quarkus.health;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

public class DatabaseHealthCheck implements HealthCheck {

	@Override
	public HealthCheckResponse call() {
		// Simulate database connectivity check
		boolean dbUp = pingDatabase(); // Replace with actual check if needed

		return HealthCheckResponse.named("database").status(dbUp).withData("connection", dbUp ? "UP" : "DOWN").build();
	}

	private boolean pingDatabase() {
		// Simulated DB check
		return true;
	}

}
