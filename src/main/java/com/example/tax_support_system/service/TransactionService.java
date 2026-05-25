package com.example.tax_support_system.service;

import com.example.tax_support_system.entity.Transaction;
import com.example.tax_support_system.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> getAllTransactions(Integer userId) {
        return transactionRepository.findByUserIdOrderByTransactionDateDesc(userId);
    }

    public Transaction saveTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    // 削除機能をしっかり追加して保存します
    public void deleteTransaction(Long id) {
        transactionRepository.deleteById(id);
    }
}