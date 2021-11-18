package com.hendisantika.repository;

import com.hendisantika.entity.AccountQueryEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-axon-sample3
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/11/21
 * Time: 08.56
 */
public interface AccountRepository extends CrudRepository<AccountQueryEntity, String> {
}
