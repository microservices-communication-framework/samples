package com.mca.samples.consumer;


import com.mca.samples.consumer.client.CalculationPayload;
import com.mca.samples.consumer.client.CalculationResultPayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsumerService {

    @Autowired
    private com.mca.samples.consumer.client.ProviderAPIClient ProviderAPIClient;

    public String callLowerCaseApi() {
        return this.ProviderAPIClient.lowercase("Hello world");
    }

    public CalculationResultPayload callCalculationApiUsingPathVariable() {
        CalculationPayload calculationPayload = new CalculationPayload();
        calculationPayload.setValue1(2);
        calculationPayload.setValue2(7);
        return this.ProviderAPIClient.calculationUsingPathVariable("+", calculationPayload);
    }

    public CalculationResultPayload callCalculationApiUsingRequestParams() {
        CalculationPayload calculationPayload = new CalculationPayload();
        calculationPayload.setValue1(3);
        calculationPayload.setValue2(6);
        return this.ProviderAPIClient.calculationUsingRequestParam("+", calculationPayload);
    }
}
