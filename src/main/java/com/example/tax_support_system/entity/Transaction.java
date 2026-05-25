package com.example.tax_support_system.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "transactions")
@Data // Lombok機能：Getter/Setterを自動生成
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "transaction_date", nullable = false)
    private LocalDate transactionDate;

    @Column(name = "transaction_type", nullable = false, length = 10)
    private String transactionType;

    // 就活アピールポイント：金額の誤差を出さないために BigDecimal を使用
    @Column(name = "amount", nullable = false, precision = 12, scale = 2)
    private BigDecimal amount;

    @Column(name = "category", nullable = false, length = 50)
    private String category;

    @Column(name = "description")
    private String description;
}