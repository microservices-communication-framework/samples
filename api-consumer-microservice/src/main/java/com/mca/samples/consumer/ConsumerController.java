package com.mca.samples.consumer;

import com.mca.samples.consumer.client.CalculationResultPayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/lowercase")
    public String lowercase() {
        return this.consumerService.callLowerCaseApi();
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
