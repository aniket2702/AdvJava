package com.spring3.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring3.orm.entities.Food;

public class FoodDao {
	public HibernateTemplate hibernatetemp;
	@Transactional
	public int insert(Food b) {
		Integer r=(Integer) this.hibernatetemp.save(b);
		return r;
	}
	public Food getproduct(int productid) {
		Food b = this.hibernatetemp.get(Food.class,productid);
		return b;
	}
	
	public List<Food> getallproduct(){
		List<Food> loadall = this.hibernatetemp.loadAll(Food.class);
		return loadall;
	}
	@Transactional
	public void deleteproduct(int productid) {
		Food db = this.hibernatetemp.get(Food.class, productid);
		this.hibernatetemp.delete(db);
	}
	@Transactional
	public void deleteproductall() {
		List<Food> loadall = this.hibernatetemp.loadAll(Food.class);
		this.hibernatetemp.deleteAll(loadall);
	}
	@Transactional
	public void updateproduct(int productid, String productname,int productquantity,int productprice) {
		Food ub = this.hibernatetemp.get(Food.class, productid);
		ub.setProductName(productname);
		ub.setProductQuantity(productquantity);
		ub.setProductPrice(productprice);
		this.hibernatetemp.update(ub);
	}
	@Transactional
	public void updateproductname(int productid, String productname) {
		Food ub = this.hibernatetemp.get(Food.class, productid);
		ub.setProductName(productname);
		this.hibernatetemp.save(ub);
	}
	@Transactional
	public void updateproductquantity(int productid, int productquantity) {
		Food ub = this.hibernatetemp.get(Food.class, productid);
		ub.setProductQuantity(productquantity);
		this.hibernatetemp.save(ub);
	}
	@Transactional
	public void updateproductprice(int productid, int productprice) {
		Food ub = this.hibernatetemp.get(Food.class, productid);
		ub.setProductPrice(productprice);
		this.hibernatetemp.save(ub);
	}
	public HibernateTemplate getHibernatetemp() {
		return hibernatetemp;
	}

	public void setHibernatetemp(HibernateTemplate hibernatetemp) {
		this.hibernatetemp = hibernatetemp;
	}

}
