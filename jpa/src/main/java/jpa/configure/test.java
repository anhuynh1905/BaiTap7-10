package jpa.configure;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class test {
	public static void main(String[] args) {

		EntityManager enma = JPAConfigure.getentitymanager();

		EntityTransaction trans = enma.getTransaction();

		try {

			trans.begin();

			trans.commit();

		} catch (Exception e) {

			e.printStackTrace();

			trans.rollback();

			throw e;

		} finally {

			enma.close();

		}

	}
}
