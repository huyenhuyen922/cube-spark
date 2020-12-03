package tik.test.cubespark.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tik.test.cubespark.model.Receiving_Slip;

public interface Receiving_SlipRepository extends JpaRepository <Receiving_Slip, String>{
	
}