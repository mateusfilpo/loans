package br.com.mateusfilpo.loans.domain;

public enum LoanType {
    PERSONAL(4),
    GUARANTEED(3),
    CONSIGNMENT(2);

    private final int value;

    LoanType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
