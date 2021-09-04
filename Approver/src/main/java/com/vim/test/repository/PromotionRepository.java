package com.vim.test.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.vim.test.entity.Promotion;


public interface PromotionRepository extends MongoRepository<Promotion, String> {

	List<Promotion> findByCreatedByUserEmailId(String emailId);

	List<Promotion> findBySupplierUserEmailId(String emailId);

	Promotion findByPromotionId(String promotionID);

	List<Promotion> findByMsUserEmailId(String emailId);

}
