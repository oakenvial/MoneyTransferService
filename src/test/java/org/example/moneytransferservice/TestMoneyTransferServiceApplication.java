package org.example.moneytransferservice;

import org.example.MoneyTransferServiceApplication;
import org.springframework.boot.SpringApplication;

public class TestMoneyTransferServiceApplication {

    public static void main(String[] args) {
        SpringApplication.from(MoneyTransferServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
