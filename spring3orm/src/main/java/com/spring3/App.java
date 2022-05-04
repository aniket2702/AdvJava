package com.spring3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring3.orm.dao.FoodDao;
import com.spring3.orm.entities.Food;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext bcontext= new ClassPathXmlApplicationContext("config.xml");
        FoodDao foodDao= bcontext.getBean("mydao",FoodDao.class);
        
        Scanner sc=new Scanner(System.in); 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        		
        boolean go=true;
        while(go) {
        	System.out.println("Welcome to Online Food Ordering System");
        	System.out.println("1.Insert Food Product");
        	System.out.println("2.View Record of Food");
        	System.out.println("3.View all Record");
        	System.out.println("4.Delete Food");
        	System.out.println("5.DeleteAll Food");
        	System.out.println("6.Update Food");
        	System.out.println("7.Exit");
        	
        	try {
        		System.out.println("Enter choice: ");
				Integer ch=sc.nextInt();
				
				switch (ch) {
					case 1:
						System.out.println("Enter ProductId: ");
						Integer id=sc.nextInt();
						System.out.println("Enter Product Name: ");
						String name=br.readLine();
						System.out.println("Enter Product Quantity (in count): ");
						Integer quantity=sc.nextInt();
						System.out.println("Enter Product Price: ");
						Integer price=sc.nextInt();
						Food b=new Food(id,name,quantity,price);
						int r=foodDao.insert(b);
						System.out.println("Record inserted.."+r);
						break;
					case 2:
						System.out.println("Enter productId: ");
						Integer id1=sc.nextInt();
						Food record=foodDao.getproduct(id1);
						System.out.println(" ");
						
						System.out.println("Name: "+record.getProductName());
						System.out.println("Quantity: "+record.getProductQuantity());
						System.out.println("Price: "+record.getProductPrice());
						System.out.println(" ");
						break;
					case 3:				
						List<Food> allproduct=foodDao.getallproduct();
						for(Food bb:allproduct ) {
							System.out.println("Id: "+bb.getProductId());
							System.out.println("Name: "+bb.getProductName());
							System.out.println("Quantity: "+bb.getProductQuantity());
							System.out.println("Price: "+bb.getProductPrice());
							System.out.println(" ");
						}
						break;
					case 4:
						System.out.println("Enter product id: ");
						Integer bid=sc.nextInt();
						foodDao.deleteproduct(bid);
						break;
					case 5:
						foodDao.deleteproductall();
						break;
					case 6:
						boolean x=true;
						while(x) {
							System.out.println("1.Update Name");
				        	System.out.println("2.Update Quantity");
				        	System.out.println("3.Update Price");
				        	System.out.println("4.Update All Fields");
							System.out.println("Enter choice: ");
							Integer ch1=sc.nextInt();
							switch(ch1) {
								case 1:
									System.out.println("Enter ProductId to be updated: ");
									Integer upproductid=sc.nextInt();
									System.out.println("Enter Product Name: ");
									String upproductname=br.readLine();
									foodDao.updateproductname(upproductid, upproductname);
									break;
									
								case 2:
									System.out.println("Enter ProductId to be updated: ");
									Integer upproductid1=sc.nextInt();
									System.out.println("Enter Product Quantity (in count): ");
									Integer upproductquantity=sc.nextInt();
									foodDao.updateproductquantity(upproductid1, upproductquantity);
									break;
									
								case 3:
									System.out.println("Enter ProductId to be updated: ");
									Integer upproductid3=sc.nextInt();
									System.out.println("Enter Product Price: ");
									Integer upproductprice=sc.nextInt();
									foodDao.updateproductprice(upproductid3, upproductprice);
									break;
								case 4:
									System.out.println("Enter ProductId to be updated: ");
									Integer uid=sc.nextInt();
									System.out.println("Enter Product Name: ");
									String uname=br.readLine();
									System.out.println("Enter Product Quantity (in count): ");
									Integer uquantity=sc.nextInt();
									System.out.println("Enter Product Price: ");
									Integer uprice=sc.nextInt();
									foodDao.updateproduct(uid, uname, uquantity ,uprice);
									break;
								default:
									x=false;
							}
						}
					case 7:
						go=false;
						break;						
					default:
						go=false;
						break;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
        }

    }
}
