package com.hendisantika.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-axon-sample3
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/11/21
 * Time: 08.55
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountQueryEntity {
    @Id
    private String id;

    private double accountBalance;

    private String currency;

    private String status;

    @Override
    public String toString() {
        return "AccountQueryEntity{" +
                "id='" + id + '\'' +
                ", accountBalance=" + accountBalance +
                ", currency='" + currency + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
