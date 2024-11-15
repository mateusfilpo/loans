package br.com.mateusfilpo.loans.dto;

import java.util.ArrayList;
import java.util.List;

public class CustomerLoansResponseDto {

    private String customer;
    private List<TypeLoanResponseDto> loans = new ArrayList<>();

    public CustomerLoansResponseDto() {
    }

    public CustomerLoansResponseDto(String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public List<TypeLoanResponseDto> getLoans() {
        return loans;
    }
}
