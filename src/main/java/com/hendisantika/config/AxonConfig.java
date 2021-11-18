package com.hendisantika.config;

import com.hendisantika.aggregate.AccountAggregate;
import org.axonframework.eventsourcing.EventSourcingRepository;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-axon-sample3
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/11/21
 * Time: 09.10
 */
@Configuration
public class AxonConfig {

    @Bean
    EventSourcingRepository<AccountAggregate> accountAggregateEventSourcingRepository(EventStore eventStore) {
        EventSourcingRepository<AccountAggregate> repository =
                EventSourcingRepository.builder(AccountAggregate.class).eventStore(eventStore).build();
        return repository;
    }
}
