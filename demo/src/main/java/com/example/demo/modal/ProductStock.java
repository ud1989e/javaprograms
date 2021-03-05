package com.example.demo.modal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name = "Product_Stock")
public class ProductStock {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer stockId;
	public Integer getStockId() {
		return stockId;
	}
	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@ManyToOne
	private Product product;
	private Integer productId;
	
    @Temporal(TemporalType.DATE)
	private Date prodMfgDate;
    private Integer totalQuantitySold;
    private float totalPriceSold;
	public float getTotalPriceSold() {
		return totalPriceSold;
	}
	public void setTotalPriceSold(float totalPriceSold) {
		this.totalPriceSold = totalPriceSold;
	}
	public Integer getTotalQuantitySold() {
		return totalQuantitySold;
	}
	public void setTotalQuantitySold(Integer totalQuantitySold) {
		this.totalQuantitySold = totalQuantitySold;
	}
	public List<Invoice> getInvoices() {
		return invoices;
	}
	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}
	private Integer prodQuantity;
	private float totalPrice;
	@Temporal(TemporalType.DATE)
	private Date expDate;
	
	@OneToMany(mappedBy = "productStock")
	private List<Invoice> invoices;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Date getProdMfgDate() {
		return prodMfgDate;
	}
	public void setProdMfgDate(Date prodMfgDate) {
		this.prodMfgDate = prodMfgDate;
	}
	public Integer getProdQuantity() {
		return prodQuantity;
	}
	public void setProdQuantity(Integer prodQuantity) {
		this.prodQuantity = prodQuantity;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Date getExpDate() {
		return expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
}
