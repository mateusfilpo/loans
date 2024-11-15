package br.com.mateusfilpo.loans.dto;

import br.com.mateusfilpo.loans.domain.LoanType;

public class TypeLoanResponseDto {

    private LoanType type;
    private Integer interestRate;

    public TypeLoanResponseDto() {
    }

    public TypeLoanResponseDto(LoanType type) {
        this.type = type;
        this.interestRate = type.getValue();
    }

    public LoanType getType() {
        return type;
    }

    public void setType(LoanType type) {
        this.type = type;
    }

    public Integer getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Integer interestRate) {
        this.interestRate = interestRate;
    }
}
