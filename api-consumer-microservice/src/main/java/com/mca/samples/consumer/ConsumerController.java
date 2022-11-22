package com.mca.samples.consumer;

import com.mca.samples.consumer.client.payload.CalculationResultPayload;
import com.mca.samples.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/lowercase")
    public String lowercase() {
        return this.consumerService.callLowerCaseApi();
    }

    @GetMapping("/secured/lowercase")
    public String securedLowercase() {
        return this.consumerService.callSecuredLowerCaseApi();
    }


    @GetMapping("/calculationPathVariable")
    public CalculationResultPayload calculationUsingPathVariable() {
        return this.consumerService.callCalculationApiUsingPathVariable();
    }

    @GetMapping("/calculationRequestParams")
    public CalculationResultPayload calculationUsingRequestParams() {
        return this.consumerService.callCalculationApiUsingRequestParams();
    }
}
