package com.vim.test.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vim.test.entity.Promotion;
import com.vim.test.entity.User;
import com.vim.test.repository.PromotionRepository;
import com.vim.test.vo.PromotionVO;

@Service
public class PromotionServiceImpl {

	@Autowired
	private PromotionRepository promotionRepository;
	
	public List<Promotion> fetchAllProducts() {
		return promotionRepository.findAll();
	}
	public Promotion saveProduct(PromotionVO promotionVO){
		ModelMapper modelMapper = new ModelMapper();
		Promotion savedPromotion = modelMapper.map(promotionVO, Promotion.class);
		savedPromotion = promotionRepository.save(savedPromotion);
		return savedPromotion;
	}

	public boolean delete(String id) {
		promotionRepository.deleteById(id);
		return true;
	}
	
	
	public PromotionVO editPromotion(PromotionVO promotionVO) {
		Promotion updatePromotion=null;
		
		Optional<Promotion> promotion = promotionRepository.findById(promotionVO.getPromotionId());
		if(promotion.isPresent()){
			updatePromotion = promotion.get();
			updatePromotion.setPromotionId(promotionVO.getPromotionId());
			updatePromotion.setPromotionType(promotionVO.getPromotionType());
			updatePromotion.setDepartmentId(promotionVO.getDepartmentId());
			updatePromotion.setCostPrice(promotionVO.getCostPrice());
			updatePromotion.setSellingPrice(promotionVO.getSellingPrice());
			updatePromotion.setMarginLost(promotionVO.getMarginLost());
			updatePromotion.setMsShare(promotionVO.getMsShare());
			updatePromotion.setSupplierShare(promotionVO.getSupplierShare());
			updatePromotion.setStartDate(promotionVO.getStartDate());
			updatePromotion.setEndDate(promotionVO.getEndDate());
			updatePromotion.setCreatedBy(promotionVO.getCreatedBy());
			updatePromotion.setCreatedByUserEmailId(promotionVO.getCreatedByUserEmailId());
			updatePromotion.setMsUser(promotionVO.getMsUser());
			updatePromotion.setMsUserEmailId(promotionVO.getMsUserEmailId());
			updatePromotion.setSupplierUser(promotionVO.getSupplierUser());
			updatePromotion.setSupplierUserEmailId(promotionVO.getSupplierUserEmailId());
			updatePromotion.setStatus(promotionVO.getStatus());
			updatePromotion.setIsActive(promotionVO.getIsActive());
			updatePromotion.setComment(promotionVO.getComment());
			updatePromotion = promotionRepository.save(updatePromotion);
		}
		return setPromotionVO(updatePromotion);
	}
	
	private PromotionVO setPromotionVO(Promotion updatePromotion) {
		PromotionVO promotionVO=new PromotionVO();
		
		promotionVO.setPromotionId(updatePromotion.getPromotionId());
		promotionVO.setPromotionType(updatePromotion.getPromotionType());
		promotionVO.setDepartmentId(updatePromotion.getDepartmentId());
		promotionVO.setCostPrice(updatePromotion.getCostPrice());
		promotionVO.setSellingPrice(updatePromotion.getSellingPrice());
		promotionVO.setMarginLost(updatePromotion.getMarginLost());
		promotionVO.setMsShare(updatePromotion.getMsShare());
		promotionVO.setSupplierShare(updatePromotion.getSupplierShare());
		promotionVO.setStartDate(updatePromotion.getStartDate());
		promotionVO.setEndDate(updatePromotion.getEndDate());
		promotionVO.setCreatedBy(updatePromotion.getCreatedBy());
		promotionVO.setCreatedByUserEmailId(updatePromotion.getCreatedByUserEmailId());
		promotionVO.setMsUser(updatePromotion.getMsUser());
		promotionVO.setMsUserEmailId(updatePromotion.getMsUserEmailId());
		promotionVO.setSupplierUser(updatePromotion.getSupplierUser());
		promotionVO.setSupplierUserEmailId(updatePromotion.getSupplierUserEmailId());
		promotionVO.setStatus(updatePromotion.getStatus());
		promotionVO.setIsActive(updatePromotion.getIsActive());
		promotionVO.setComment(updatePromotion.getComment());
		return promotionVO;
		

		
	}
	public List<Promotion> getRequester(String emailId) {
		// TODO Auto-generated method stub
		List<Promotion> promotions = promotionRepository.findByCreatedByUserEmailId(emailId);
		return promotions;
	}
	public List<Promotion> getApprover(String emailId) {
		// Buyer Approver
		// TODO Auto-generated method stub
		List<Promotion> promotions = promotionRepository.findByMsUserEmailId(emailId);
		return promotions;
	}
	public Promotion fetchPromotionRequest(String promotionID) {
		// TODO Auto-generated method stub
		return promotionRepository.findByPromotionId(promotionID);
	}
	public List<Promotion> getSupplierApprover(String emailId) {
		// Supplier Approver
		List<Promotion> promotions = promotionRepository.findBySupplierUserEmailId(emailId);
		return promotions;
	}
}


