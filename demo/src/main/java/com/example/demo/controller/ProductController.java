package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dao.ProductRepository;
import com.example.demo.modal.Product;

@RestController
public class ProductController {
	@Autowired
	private ProductRepository productRepository;

	/* method which handles the request to list all the avilable products */
	@GetMapping(path = "/productList")
	public @ResponseBody Iterable<Product> returnAll() {
		return productRepository.findAll();
	}

	@PostMapping(path = "/addProduct") // Map ONLY POST Requests
	public @ResponseBody String saveProduct(@RequestParam String productName, @RequestParam float productCost) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		Product product = new Product();
		product.setProductName(productName);
		product.setUnitCost(productCost);
		productRepository.save(product);
		return "Saved";

	}
	@DeleteMapping(path="/deleteProduct")
	public @ResponseBody String deleteProduct(@RequestParam int productId) {
		productRepository.deleteById(productId);
		return "deleted";
	}
	@PostMapping(path="/updateProduct")
	public @ResponseBody String updateProduct(@RequestParam Integer productId, @RequestParam String productName, @RequestParam float productCost) {
		Product product = new Product();
		product.setProductId(productId);
		product.setProductName(productName);
		product.setUnitCost(productCost);
		productRepository.save(product);
		return "updated";
	}
	
	
	
}
