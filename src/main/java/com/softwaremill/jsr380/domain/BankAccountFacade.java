package com.softwaremill.jsr380.domain;

import com.softwaremill.jsr380.domain.dto.BankAccountData;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BankAccountFacade {

    private final List<BankAccount> bankAccounts = new ArrayList<>();

    public void save(BankAccountData data) {
        final BankAccount account = new BankAccount(data);
        bankAccounts.add(account);
    }
}
