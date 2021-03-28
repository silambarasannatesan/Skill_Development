package com.peace.transaction.repository;

import com.peace.transaction.entity.PaymentInfo;
import org.springframework.data.repository.CrudRepository;

public interface PaymentInfoRepository extends CrudRepository<PaymentInfo, String> {
}
