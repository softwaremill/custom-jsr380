package com.softwaremill.jsr380.domain;

import com.softwaremill.jsr380.domain.dto.BankAccountData;
import com.softwaremill.jsr380.validation.BankAccountNumber;
import com.softwaremill.jsr380.validation.Bic;
import com.softwaremill.jsr380.validation.Iban;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
class BankAccount {

    @Id
    private long id;

    @Column
    @Iban
    private String iban;

    @Column
    @Bic
    private String bic;

    @Column
    @BankAccountNumber
    private String bankAccountNumber;

    BankAccount(BankAccountData data) {
        this.iban = data.getIban();
        this.bic = data.getBic();
        this.bankAccountNumber = data.getBankAccountnumber();
    }
}
