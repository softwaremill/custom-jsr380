package com.softwaremill.jsr380;

import com.softwaremill.jsr380.validation.BankAccountNumber;
import com.softwaremill.jsr380.validation.Bic;
import com.softwaremill.jsr380.validation.Iban;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class CreateBankAccountRequest {

    @Iban
    private String iban;

    @Bic
    private String bic;

    @BankAccountNumber
    private String bankAccountNumber;

}
