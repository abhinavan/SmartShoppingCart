package com.abhinavan.junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.abhinavan.dto.Product;
import com.abhinavan.operation.ShoppingCheckout;

public class ShoppingCheckoutTest {

	
	@Test
	public void testShoppingCheckout() {
		List<Product> products=Arrays.asList(new Product(1, "A", 100.00, "A"),new Product(2,"B",100.00, "B"),new Product(3, "C", 100.00, "C"));
		ShoppingCheckout shoppingCheckout=new ShoppingCheckout();
		Double actualTotalCost=330.00,totalCost=shoppingCheckout.getTotalCost(products),
				actualSalesCost=30.00,salesCost=shoppingCheckout.calculateSalesTax(products);
		assertEquals("Total cost matched",actualTotalCost,totalCost);
		assertEquals(actualSalesCost, salesCost);
		
	}
}
