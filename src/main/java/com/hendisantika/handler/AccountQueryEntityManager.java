package com.hendisantika.handler;

import com.hendisantika.aggregate.AccountAggregate;
import com.hendisantika.entity.AccountQueryEntity;
import com.hendisantika.event.BaseEvent;
import com.hendisantika.repository.AccountRepository;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.eventsourcing.EventSourcingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

    @Autowired
    @Qualifier("accountAggregateEventSourcingRepository")
    private EventSourcingRepository<AccountAggregate> accountAggregateEventSourcingRepository;

    @EventSourcingHandler
    void on(BaseEvent event) {
        persistAccount(buildQueryAccount(getAccountFromEvent(event)));
    }

    private AccountAggregate getAccountFromEvent(BaseEvent event) {
        return accountAggregateEventSourcingRepository.load(event.id.toString()).getWrappedAggregate().getAggregateRoot();
    }

    private AccountQueryEntity findExistingOrCreateQueryAccount(String id) {
        return accountRepository.findById(id).isPresent() ? accountRepository.findById(id).get() :
                new AccountQueryEntity();
    }
}
