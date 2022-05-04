package com.spring2.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring2.orm.entities.Grocery;

public class GroceryDao {
	public HibernateTemplate hibernatetemp;
	@Transactional
	public int insert(Grocery b) {
		Integer r=(Integer) this.hibernatetemp.save(b);
		return r;
	}
	public Grocery getproduct(int productid) {
		Grocery b = this.hibernatetemp.get(Grocery.class,productid);
		return b;
	}
	
	public List<Grocery> getallproduct(){
		List<Grocery> loadall = this.hibernatetemp.loadAll(Grocery.class);
		return loadall;
	}
	@Transactional
	public void deleteproduct(int productid) {
		Grocery db = this.hibernatetemp.get(Grocery.class, productid);
		this.hibernatetemp.delete(db);
	}
	@Transactional
	public void deleteproductall() {
		List<Grocery> loadall = this.hibernatetemp.loadAll(Grocery.class);
		this.hibernatetemp.deleteAll(loadall);
	}
	@Transactional
	public void updateproduct(int productid, String productname,int productquantity,int productprice) {
		Grocery ub = this.hibernatetemp.get(Grocery.class, productid);
		ub.setProductName(productname);
		ub.setProductQuantity(productquantity);
		ub.setProductPrice(productprice);
		this.hibernatetemp.update(ub);
	}
	@Transactional
	public void updateproductname(int productid, String productname) {
		Grocery ub = this.hibernatetemp.get(Grocery.class, productid);
		ub.setProductName(productname);
		this.hibernatetemp.save(ub);
	}
	@Transactional
	public void updateproductquantity(int productid, int productquantity) {
		Grocery ub = this.hibernatetemp.get(Grocery.class, productid);
		ub.setProductQuantity(productquantity);
		this.hibernatetemp.save(ub);
	}
	@Transactional
	public void updateproductprice(int productid, int productprice) {
		Grocery ub = this.hibernatetemp.get(Grocery.class, productid);
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
