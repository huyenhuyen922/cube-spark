package tik.test.cubespark.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import tik.test.cubespark.repository.Receiving_SlipRepository;
import tik.test.cubespark.repository.Product.ProductRepository;
import tik.test.cubespark.model.Receiving_Slip;
@Service
public class Receiving_SlipService{
	@Autowired
	private Receiving_SlipRepository receivingSlipRes;
	public List<Receiving_Slip> getReceivings(){
		return receivingSlipRes.findAll();
	}
	public Receiving_Slip saveReceiving_Slip(Receiving_Slip rec){
		return receivingSlipRes.save(rec);
	}
	
	public String deleteReceiving_Slip(String receivingid){
		receivingSlipRes.deleteById(receivingid);
		 return "Delete success"+receivingid;
	}
}
