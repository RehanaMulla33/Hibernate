package com.xworkz.product.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.SingletonEMFUtil;
import com.xworkz.product.entity.ProductEntity;

public class ProductDAOImpl implements ProductDAO {

	public void save(ProductEntity prodEntity) {
		EntityManager manager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(prodEntity);
		transaction.commit();

	}

	public ProductEntity saveAll(List<ProductEntity> entities) {
		EntityManager manager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			int flushcount = 0;
			for (ProductEntity productEntity : entities) {
				manager.persist(productEntity);

				if (flushcount == 10) {
					manager.flush();
					System.out.println("flushingdata");
					flushcount = 0;
					manager.clear();
					System.out.println("cleardata");
				}
				flushcount++;

			}
			transaction.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		}

		return null;
	}

	@Override
	public List<ProductEntity> getAll() {
		EntityManager manager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = manager.createNamedQuery("getAll");

			return (List<ProductEntity>) query.getResultList();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}

		return null;
	}

	@Override
	public List<ProductEntity> getBypriceGreaterThan(float price) {
		EntityManager manager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getBypriceGreaterThan");
			query.setParameter("cutoffprice", price);
			return (List<ProductEntity>) query.getResultList();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}

		return null;
	}

	@Override
	public List<ProductEntity> getByPriceLesserThan(float price) {
		EntityManager manager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getBypriceLesserThan");
			query.setParameter("cutoffprice", price);

			return (List<ProductEntity>) query.getResultList();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
		return null;
	}

	@Override
	public ProductEntity getByNameandId(String name, int id) {
		EntityManager manager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = manager.createNamedQuery("getByNameAndId");

			query.setParameter("setname", name);
			query.setParameter("setid", id);

			return (ProductEntity) query.getSingleResult();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
		return null;
	}

	@Override
	public List<String> getTotalName() {
		EntityManager manager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = manager.createNamedQuery("getTotalNames");

			return (List<String>) query.getResultList();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}

		return null;
	}

	@Override
	public float getMaxPrice() {
		EntityManager manager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = manager.createNamedQuery("getMaxPrice");

			return (float) query.getSingleResult();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
		return 0;
	}

	@Override
	public float getTotalPrice() {
		EntityManager manager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = manager.createNamedQuery("getTotalPrice");

			return (float) query.getSingleResult();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
		return 0;
	}

	@Override
	public String getByNameLike(String like) {
		String name = null;
		EntityManager manager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = manager.createNamedQuery("getByNamelike");

			query.setParameter("setname", name);

			return (String) query.getSingleResult();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
		return null;
	}

	@Override
	public Object getQuantityByName(String name) {
		EntityManager manager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = manager.createNamedQuery("getQuantityByName");

			query.setParameter("setname", name);

			return query.getSingleResult();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
		return null;
	}

	@Override
	public Object[] getQuantityAndpriceByName(String name) {
		EntityManager manager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getQuantityAndPriceByName");

			query.setParameter("setname", name);

			Object result = query.getSingleResult();
			Object[] entity = (Object[]) result;

			System.out.println("Quantity=" + entity[0]);
			System.out.println("Price=" + entity[1]);

			return entity;

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}

		return null;
	}

	@Override
	public Object[] getQuantityAndpriceByNameAndId(String name, int id) {
		EntityManager manager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = manager.createNamedQuery("getQuantityAndPriceByNameAndId");

			query.setParameter("setname", name);
			query.setParameter("setid", id);

			Object result = query.getSingleResult();
			Object[] entity = (Object[]) result;

			System.out.println("Quantity=" + entity[0]);
			System.out.println("Price=" + entity[1]);

			return entity;

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
		return null;
	}

	@Override
	public String getByBrand(String brand) {
		EntityManager manager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = manager.createNamedQuery("getByBrand");

			query.setParameter("setbrand", brand);

			return (String) query.getSingleResult();

			} catch (PersistenceException e) {
			e.printStackTrace();
			} finally {
			if (manager != null) {
			manager.close();
			}
			}

		return null;
	}

	@Override
	public String getBrand(String name) {
		EntityManager manager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = manager.createNamedQuery("getBrand");

			query.setParameter("setname", name);

			return (String) query.getSingleResult();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}

		return null;
	}

	@Override
	public List<Object[]> getNameAndPrice() {
		EntityManager manager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("getNameAndPrice");

			List<Object[]> result = query.getResultList();

			for (Object[] objects : result) {
				String name = (String) objects[0];
				float price = (float) objects[1];

				System.out.println(name);
				System.out.println(price);
				System.out.println("    ");
			}
			return result;
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
		return null;
	}

	@Override
	public Object[] getNameAndPriceByBrand(String brand) {
		EntityManager manager = SingletonEMFUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = manager.createNamedQuery("getNameAndPriceByBrand");

			query.setParameter("setbrand", brand);

			Object result = query.getSingleResult();
			Object[] entity = (Object[]) result;

			System.out.println("Name=" + entity[0]);
			System.out.println("Price=" + entity[1]);

			return entity;

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			if (manager != null) {
				manager.close();
			}
		}
		return null;
	}

}
