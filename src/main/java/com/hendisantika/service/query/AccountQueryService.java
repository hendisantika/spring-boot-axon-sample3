package com.hendisantika.service.query;

import com.hendisantika.entity.AccountQueryEntity;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-axon-sample3
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/11/21
 * Time: 09.17
 */
public interface AccountQueryService {
    List<Object> listEventsForAccount(String accountNumber);

    AccountQueryEntity getAccount(String accountNumber);
}
