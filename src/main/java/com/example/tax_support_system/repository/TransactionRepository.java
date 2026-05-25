package com.example.tax_support_system.repository;

import com.example.tax_support_system.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    // ユーザーごとに取引明細を日付の新しい順（降順）で取得するメソッド
    List<Transaction> findByUserIdOrderByTransactionDateDesc(Integer userId);
}