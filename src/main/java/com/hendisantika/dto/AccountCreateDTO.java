package com.hendisantika.dto;

import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-axon-sample3
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/11/21
 * Time: 08.53
 */
@Data
public class AccountCreateDTO {
    private double startingBalance;

    private String currency;
}
