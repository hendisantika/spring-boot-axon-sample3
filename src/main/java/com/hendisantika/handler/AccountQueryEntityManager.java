package com.hendisantika.handler;

import com.hendisantika.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-axon-sample3
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/11/21
 * Time: 08.57
 */
@Component
public class AccountQueryEntityManager {

    @Autowired
    private AccountRepository accountRepository;

}
