package br.com.mateusfilpo.loans.service;

import br.com.mateusfilpo.loans.domain.LoanType;
import br.com.mateusfilpo.loans.domain.State;
import br.com.mateusfilpo.loans.dto.CustomerLoansRequestDto;
import br.com.mateusfilpo.loans.dto.CustomerLoansResponseDto;
import br.com.mateusfilpo.loans.dto.TypeLoanResponseDto;
import org.springframework.stereotype.Service;

@Service
public class CustomerLoansService {

    public CustomerLoansResponseDto getLoanTypes(CustomerLoansRequestDto customerLoansRequestDto) {
        CustomerLoansResponseDto responseDto = new CustomerLoansResponseDto();
        responseDto.setCustomer(customerLoansRequestDto.getName());

        addLoanTypeIfApplicable(customerLoansRequestDto, responseDto);

        return responseDto;
    }

    private void addLoanTypeIfApplicable(CustomerLoansRequestDto customerLoansRequestDto, CustomerLoansResponseDto responseDto) {
        if (isPersonal(customerLoansRequestDto)) {
            responseDto.getLoans().add(new TypeLoanResponseDto(LoanType.PERSONAL));
        }

        if (isGuaranteed(customerLoansRequestDto)) {
            responseDto.getLoans().add(new TypeLoanResponseDto(LoanType.GUARANTEED));
        }

        if (isConsignment(customerLoansRequestDto)) {
            responseDto.getLoans().add(new TypeLoanResponseDto(LoanType.CONSIGNMENT));
        }
    }

    private boolean isPersonal(CustomerLoansRequestDto customerLoansRequestDto) {
        return customerLoansRequestDto.getIncome() <= 3000.0 ||
                customerLoansRequestDto.getIncome() < 5000.0 && customerLoansRequestDto.getAge() < 30 && customerLoansRequestDto.getLocation().equals(State.SP);

    }

    private boolean isConsignment(CustomerLoansRequestDto customerLoansRequestDto) {
        return customerLoansRequestDto.getIncome() >= 5000.0;
    }

    private boolean isGuaranteed(CustomerLoansRequestDto customerLoansRequestDto) {
        return customerLoansRequestDto.getIncome() <= 3000.0 ||
                customerLoansRequestDto.getIncome() < 5000.0 && customerLoansRequestDto.getAge() < 30 && customerLoansRequestDto.getLocation().equals(State.SP);
    }



}
