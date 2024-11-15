package br.com.mateusfilpo.loans.controller;

import br.com.mateusfilpo.loans.dto.CustomerLoansRequestDto;
import br.com.mateusfilpo.loans.dto.CustomerLoansResponseDto;
import br.com.mateusfilpo.loans.service.CustomerLoansService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerLoansController {

    private final CustomerLoansService customerLoansService;

    public CustomerLoansController(CustomerLoansService customerLoansService) {
        this.customerLoansService = customerLoansService;
    }

    @PostMapping("/customer-loans")
    public ResponseEntity<CustomerLoansResponseDto> getLoanTypes(@RequestBody CustomerLoansRequestDto customerLoansRequestDto) {
        CustomerLoansResponseDto result = customerLoansService.getLoanTypes(customerLoansRequestDto);
        return ResponseEntity.ok(result);
    }
}
