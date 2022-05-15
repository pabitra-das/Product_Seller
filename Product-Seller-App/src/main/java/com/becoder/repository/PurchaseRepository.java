package com.becoder.repository;


import com.becoder.model.Purchase;
import com.becoder.repository.projection.PurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

    @Query("select prd.name as name, pur.price as price, pur.purchaseTime as purchaseTime from " +
            " Purchase pur left join Product prd on prd.id=pur.productId where pur.userId=:userId")
    List<PurchaseItem> findAllPurchaseOfUser(@Param("userId") Long userId);
}
