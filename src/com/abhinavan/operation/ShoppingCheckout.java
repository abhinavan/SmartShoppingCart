package com.abhinavan.operation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.abhinavan.dto.Product;

public class ShoppingCheckout {
	
	private final static Logger LOGGER=Logger.getLogger(ShoppingCheckout.class.getName());

	public Double getTotalCost(List<Product> products) {
		Double totalCost = 0.00;
		for (Product product : products) {
			totalCost += product.getProductCost();
		}
		return totalCost + calculateSalesTax(products);
	}

	public Double calculateSalesTax(List<Product> products) {

		Double totalSalesTax = 0.00;
		for (Product product : products) {
			switch (product.getProductCategory().toUpperCase()) {
			case "A":
				totalSalesTax = totalSalesTax + (product.getProductCost() * 10 / 100);
				break;
			case "B":
				totalSalesTax = totalSalesTax + (product.getProductCost() * 20 / 100);
				break;
			default:
				totalSalesTax += 0;
			}
		}
		return totalSalesTax;
	}

	public static void main(String[] args) throws Exception {
		ShoppingCheckout shoppingCheckout = new ShoppingCheckout();
		String regex = "[a-dA-D]+$";
		List<Product> products = new ArrayList<Product>();
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
			System.out.println("Enter number of items you wish to checkout");
			int numberOfItems = Integer.parseInt(reader.readLine());
			int productId = 1;
			while (numberOfItems-- > 0) {

				Product product = new Product();

				System.out.println("Enter product name \n");
				String productName = reader.readLine();
				System.out.println("Enter product cost ");
				Double productCost = Double.valueOf(reader.readLine());
				System.out.println("Enter product category");
				String productCategory = reader.readLine();

				// setting the values in object
				product.setProductId(productId++);
				product.setProductName(productName);
				product.setProductCost(productCost);
				if (productCategory.matches(regex)) {
					product.setProductCategory(productCategory);
				} else {
					System.out.println("not accepted");
				}

				// adding object into list
				products.add(product);
			}
			// using java.util logging to log result as output
			LOGGER.info("Total Cost " + shoppingCheckout.getTotalCost(products) + "" + " \n Total Sales tax "
					+ shoppingCheckout.calculateSalesTax(products));

		} catch (NumberFormatException | NullPointerException e) {
			LOGGER.info(e.getMessage());
		}

	}
}
