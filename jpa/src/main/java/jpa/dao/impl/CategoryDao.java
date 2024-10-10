package jpa.dao.impl;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jpa.configure.JPAConfigure;
import jpa.dao.ICategoryDao;
import jpa.entity.Category;

public class CategoryDao implements ICategoryDao {


	 @Override


	 public void insert(Category category) {


	 EntityManager enma = JPAConfigure.getentitymanager();


	 EntityTransaction trans = enma.getTransaction();


	 try {


	 trans.begin();


	 //gọi phuong thức để insert, update, delete


	 enma.persist(category);


	 trans.commit();


	 } catch (Exception e) {


	 e.printStackTrace();


	 trans.rollback();


	 throw e;


	 } finally {


	 enma.close();


	 }


	 }


	 @Override


	 public void update(Category category) {


	 EntityManager enma = JPAConfigure.getentitymanager();


	 EntityTransaction trans = enma.getTransaction();


	 try {


	 trans.begin();


	 //gọi phuong thức để insert, update, delete


	 enma.merge(category);


	 trans.commit();


	 } catch (Exception e) {


	 e.printStackTrace();


	 trans.rollback();


	 throw e;


	 } finally {


	 enma.close();


	 }


	 }


	 @Override


	 public void delete(int cateid) throws Exception {


	 EntityManager enma = JPAConfigure.getentitymanager();


	 EntityTransaction trans = enma.getTransaction();


	 try {


	 trans.begin();


	 //gọi phuong thức để insert, update, delete


	 Category category = enma.find(Category.class,cateid);


	 if(category != null) {


	 enma.remove(category);


	 }else {


	 throw new Exception("Không tìm thấy");


	 }


	 trans.commit();


	 } catch (Exception e) {


	 e.printStackTrace();


	 trans.rollback();


	 throw e;


	 } finally {


	 enma.close();


	 }


	 }


	 @Override


	 public Category findById(int cateid) {


	 EntityManager enma = JPAConfigure.getentitymanager();


	 Category category = enma.find(Category.class,cateid);


	 return category;


	 }


	 @Override


	 public List<Category> findAll() {


	 EntityManager enma = JPAConfigure.getentitymanager();


	 TypedQuery<Category> query= enma.createNamedQuery("Category.findAll", Category.class);


	 return query.getResultList();


	 }


	 @Override


	 public List<Category> findByCategoryname(String catname) {


	 EntityManager enma = JPAConfigure.getentitymanager();


	 String jpql = "SELECT c FROM Category c WHERE c.catename like :catname";


	 TypedQuery<Category> query= enma.createQuery(jpql, Category.class);


	 query.setParameter("catename", "%" + catname + "%");


	 return query.getResultList();


	 }


	 @Override


	 public List<Category> findAll(int page, int pagesize) {


	 EntityManager enma = JPAConfigure.getentitymanager();


	 TypedQuery<Category> query= enma.createNamedQuery("Category.findAll", Category.class);


	 query.setFirstResult(page*pagesize);


	 query.setMaxResults(pagesize);


	 return query.getResultList();


	 }


	 @Override


	 public int count() {


	 EntityManager enma = JPAConfigure.getentitymanager();


	 String jpql = "SELECT count(c) FROM Category c";


	 Query query = enma.createQuery(jpql);


	 return ((Long)query.getSingleResult()).intValue();


	 }


	}

