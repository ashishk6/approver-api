package com.vim.test.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vim.test.entity.Promotion;
import com.vim.test.entity.User;
import com.vim.test.service.PromotionServiceImpl;
import com.vim.test.vo.ProductVO;
import com.vim.test.vo.PromotionVO;


@RestController
@CrossOrigin
@RequestMapping("/promotion")
public class PromotionController {

	
	private final Logger LOG = LoggerFactory.getLogger(getClass());

	@Autowired
	private PromotionServiceImpl promotionServiceImpl;

	@GetMapping("/getPromotionDetails")
	List<Promotion> fetchAllPromotion() {
		LOG.debug("Fetch all Promotion");
		return promotionServiceImpl.fetchAllProducts();
	}
	
	@PostMapping("/savePromotion")
	Promotion saveProduct(@RequestBody PromotionVO promotion) {
		LOG.debug("save Promotion");
		return promotionServiceImpl.saveProduct(promotion);
	}

	@GetMapping("/deletepPromotion/{id}")
	boolean delete(@PathVariable("id") String id) {
		LOG.debug("delete Promotion");
		return promotionServiceImpl.delete(id);
	}
	@PostMapping("/editPromotion")
	PromotionVO editProduct(@RequestBody PromotionVO promotionVO) {
		LOG.debug("Edit Promotion");
		return promotionServiceImpl.editPromotion(promotionVO);
	}
	
	@GetMapping("/getRequester/{emailId}")
	List<Promotion> getRequester(@PathVariable("emailId") String emailId) {
		LOG.debug("Fetch getRequester");
		return promotionServiceImpl.getRequester(emailId);
	}
	
	@GetMapping("/getBuyerApprover/{emailId}")
	List<Promotion> getBuyerApprover(@PathVariable("emailId") String emailId) {
		LOG.debug("Fetch getApprover");
		return promotionServiceImpl.getApprover(emailId);
	}
	
	@GetMapping("/getSupplierApprover/{emailId}")
	List<Promotion> getSupplierApprover(@PathVariable("emailId") String emailId) {
		LOG.debug("Fetch getApprover");
		return promotionServiceImpl.getSupplierApprover(emailId);
	}

	@GetMapping("/fetchPromotionRequest/{promotionID}")
	Promotion fetchPromotionRequest(@PathVariable("promotionID") String promotionID) {
		LOG.debug("fetchUser ");
		return promotionServiceImpl.fetchPromotionRequest(promotionID);
	}

}

