package com.hendisantika.service.query;

import com.hendisantika.entity.AccountQueryEntity;
import com.hendisantika.repository.AccountRepository;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-axon-sample3
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/11/21
 * Time: 09.17
 */
@Service
public class AccountQueryServiceImpl implements AccountQueryService {

    private final EventStore eventStore;

    private final AccountRepository accountRepository;

    public AccountQueryServiceImpl(EventStore eventStore, AccountRepository accountRepository) {
        this.eventStore = eventStore;
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Object> listEventsForAccount(String accountNumber) {
        return eventStore.readEvents(accountNumber).asStream().map(s -> s.getPayload()).collect(Collectors.toList());
    }

    @Override
    public AccountQueryEntity getAccount(String accountNumber) {
        return accountRepository.findById(accountNumber).get();
    }
}
