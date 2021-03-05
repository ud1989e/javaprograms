package com.example.demo.controller;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dao.ProductStockRepository;
import com.example.demo.dao.StockDetailsRepository;
import com.example.demo.modal.Product;
import com.example.demo.modal.ProductStock;
import com.example.demo.modal.StockDeatils;

@RestController
public class ProductStockController {
	@Autowired
	private ProductStockRepository productStockRepository;
	@Autowired
	private StockDetailsRepository stockDetailsRepository;

	/* method which handles the request to list all the avilable products */
	@GetMapping(path = "/producStocktList")
	public @ResponseBody Iterable<ProductStock> returnAll() {
		return productStockRepository.findAll();
	}

	@PostMapping(path = "/addStock") // Map ONLY POST Requests
	public @ResponseBody String savaStock(@RequestParam Integer productId, @RequestParam Date mfgDate,
			@RequestParam Date expDate, @RequestParam Integer totalQuantity, @RequestParam float totalPrice) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		ProductStock ps = new ProductStock();
		ps.setExpDate(expDate);
		ps.setProdMfgDate(mfgDate);
		Product pro= new  Product();
		pro.setProductId(productId);
		ps.setProduct(pro);
		
		ps.setProdQuantity(totalQuantity);
		ps.setTotalPrice(totalPrice);
		productStockRepository.save(ps);
		return "Saved";

	}

	@PostMapping(path = "/updateStock") // Map ONLY POST Requests
	public @ResponseBody String updateStock(@RequestParam Integer stockId, @RequestParam Integer productId,
			@RequestParam Date mfgDate, @RequestParam Date expDate, @RequestParam Integer totalQuantity,
			@RequestParam float totalPrice) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		ProductStock ps = new ProductStock();
		ps.setStockId(stockId);
		ps.setExpDate(expDate);
		ps.setProdMfgDate(mfgDate);
		ps.setProdQuantity(totalQuantity);
		ps.setTotalPrice(totalPrice);
		Product pro= new  Product();
		pro.setProductId(productId);
		ps.setProduct(pro);
		productStockRepository.save(ps);
		return "Saved";

	}

	@DeleteMapping(path = "/deleteStock")
	public @ResponseBody String deleteProductStock(@RequestParam int productStockId) {
		productStockRepository.deleteById(productStockId);
		return "deleted";
	}
	
	@GetMapping(path = "/productStockDetails")
	public @ResponseBody List<StockDeatils> returnStockDetails(@RequestParam int productId) {
		return stockDetailsRepository.getStocksByProductId(productId);
	}
}
