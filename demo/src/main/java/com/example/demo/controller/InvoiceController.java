package com.example.demo.controller;
import java.util.Date;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dao.InvoiceRepository;
import com.example.demo.dao.ProductStockRepository;
import com.example.demo.modal.Invoice;
import com.example.demo.modal.ProductStock;


@RestController
public class InvoiceController {
	@Autowired
	private InvoiceRepository invoiceRepository;
	@Autowired
	private ProductStockRepository productStockRepository;

	/* method which handles the request to list all the avilable products */
	@GetMapping(path = "/productInvoiceList")
	public @ResponseBody Iterable<Invoice> returnAll() {
		return invoiceRepository.findAll();
	}

	@PostMapping(path = "/addInvoice") // Map ONLY POST Requests
	public @ResponseBody String createInvoice(@RequestParam Integer stockId,
			@RequestParam Integer totalQuantity, @RequestParam float totalPrice,  @RequestParam Integer invoiceNumber, @RequestParam Date invoiceDate) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		Invoice invoice = new Invoice();
		invoice.setInvoiceDate(invoiceDate);
		invoice.setInvoiceNumber(invoiceNumber);
		invoice.setProdQuantity(totalQuantity);
		invoice.setTotalPrice(totalPrice);
		//ProductStock ps = new ProductStock();
		Optional<ProductStock> ps = productStockRepository.findById(stockId);
		ps.get().setStockId(stockId);
		ps.get().setStockId(stockId);
		ps.get().setTotalQuantitySold(totalQuantity);
		ps.get().setTotalPriceSold(totalPrice);
		invoice.setProductStock(ps.get());
		invoiceRepository.save(invoice);
		productStockRepository.save(ps.get());
		return "Saved";

	}
	
	@PostMapping(path = "/updateInvoice") // Map ONLY POST Requests
	public @ResponseBody String updateInvoice(@RequestParam Integer stockId,@RequestParam Integer invoceId,
			@RequestParam Integer totalQuantity, @RequestParam float totalPrice,  @RequestParam Integer invoiceNumber, @RequestParam Date invoiceDate) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		Invoice invoice = new Invoice();
		invoice.setInvoiceDate(invoiceDate);
		invoice.setInvoiceId(invoceId);
		invoice.setInvoiceNumber(invoiceNumber);
		invoice.setProdQuantity(totalQuantity);
		invoice.setTotalPrice(totalPrice);
		Optional<ProductStock> ps = productStockRepository.findById(stockId);
		ps.get().setStockId(stockId);
		ps.get().setStockId(stockId);
		ps.get().setTotalQuantitySold(totalQuantity);
		ps.get().setTotalPriceSold(totalPrice);
		invoice.setProductStock(ps.get());
		invoiceRepository.save(invoice);
		productStockRepository.save(ps.get());
		return "updated";
   }

	@DeleteMapping(path = "/deleteInvoice")
	public @ResponseBody String deleteInvoice(@RequestParam int invoiceId) {
		invoiceRepository.deleteById(invoiceId);
		return "deleted";
	}
}
