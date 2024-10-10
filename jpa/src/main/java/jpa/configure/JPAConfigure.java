package jpa.configure;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAConfigure {
	public static EntityManager getentitymanager() {
		EntityManagerFactory factor = Persistence.createEntityManagerFactory("dataSource");
		return factor.createEntityManager();
	}
}
