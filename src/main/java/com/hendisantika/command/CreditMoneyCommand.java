package com.hendisantika.command;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-axon-sample3
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/11/21
 * Time: 09.00
 */
public class CreditMoneyCommand extends BaseCommand<String> {

    public final double creditAmount;

    public final String currency;

    public CreditMoneyCommand(String id, double creditAmount, String currency) {
        super(id);
        this.creditAmount = creditAmount;
        this.currency = currency;
    }
}
