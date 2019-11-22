package com.abhinavan.dto;

public class Product {
	private int productId;
	private String productName;
	private Double productCost;
	private String productCategory;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int productId , String productName ,Double productCost , String productCategory) {
		this.productId=productId;
		this.productName=productName;
		this.productCost=productCost;
		this.productCategory=productCategory;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getProductCost() {
		return productCost;
	}
	public void setProductCost(Double productCost) {
		this.productCost = productCost;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	
	@Override
	public String toString() {
		return productId+" "+productName+" "+productCost+" "+productCategory;
	}
}
