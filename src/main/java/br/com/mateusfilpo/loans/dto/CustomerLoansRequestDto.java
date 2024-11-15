package br.com.mateusfilpo.loans.dto;

import br.com.mateusfilpo.loans.domain.State;

public class CustomerLoansRequestDto {

    private Integer age;
    private String cpf;
    private String name;
    private Double income;
    private State location;

    public CustomerLoansRequestDto() {
    }

    public CustomerLoansRequestDto(Integer age, String cpf, String name, Double income, State location) {
        this.age = age;
        this.cpf = cpf;
        this.name = name;
        this.income = income;
        this.location = location;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public State getLocation() {
        return location;
    }

    public void setLocation(State location) {
        this.location = location;
    }
}
