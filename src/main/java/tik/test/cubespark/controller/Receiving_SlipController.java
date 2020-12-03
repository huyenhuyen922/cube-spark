package tik.test.cubespark.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import tik.test.cubespark.model.Receiving_Slip;
import tik.test.cubespark.service.Receiving_SlipService;

@Controller
@RequestMapping("/ReceivingSlip")
public class Receiving_SlipController{
	
	 @Autowired
	     private Receiving_SlipService service;
	     @GetMapping("/Receiving_Slips")
	     public List<Receiving_Slip> findAll() {
	         return service.getReceivings();
	     }
	     @PostMapping("/addReceiving_Slip")
	     public Receiving_Slip addCustomer(@RequestBody Receiving_Slip receivingslip){
	         return service.saveReceiving_Slip(receivingslip);
	     }
	     
	     @DeleteMapping("/delete")
	     public String deleteReceiving_Slip(@PathVariable String id){
	         return  service.deleteReceiving_Slip(id);
	    }
}