package com.becoder.service;


import com.becoder.model.Purchase;
import com.becoder.repository.PurchaseRepository;
import com.becoder.repository.projection.PurchaseItem;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseServiceImpl implements  PurchaseService{

    private PurchaseRepository  purchaseRepository;

    public PurchaseServiceImpl(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    @Override
    public Purchase savePurchase(Purchase purchase){
        purchase.setPurchaseTime(LocalDateTime.now());
        return purchaseRepository.save(purchase);
    }

    @Override
    public List<PurchaseItem> findPurchaseByUserId(long userId){
        return purchaseRepository.findAllPurchaseOfUser(userId);
    }


}
