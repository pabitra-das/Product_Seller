package com.becoder.service;


import com.becoder.model.Purchase;
import com.becoder.repository.projection.PurchaseItem;

import java.util.List;

public interface PurchaseService {
    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> findPurchaseByUserId(long userId);
}
