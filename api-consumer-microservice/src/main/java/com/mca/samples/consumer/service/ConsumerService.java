package com.mca.samples.consumer.service;


import com.mca.samples.consumer.client.payload.CalculationPayload;
import com.mca.samples.consumer.client.payload.CalculationResultPayload;
import com.mca.samples.consumer.client.securedProviderApiClient.SecuredProviderAPIClient;
import com.mca.samples.consumer.client.simpleProviderApiClient.SimpleProviderAPIClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsumerService {

    @Autowired
    private SimpleProviderAPIClient simpleProviderAPIClient;

    @Autowired
    private SecuredProviderAPIClient securedProviderAPIClient;

    public String callLowerCaseApi() {
        return this.simpleProviderAPIClient.lowercase("Hello world");
    }

    public String callSecuredLowerCaseApi() {
        return this.securedProviderAPIClient.lowercase("Hello world");
    }

    public CalculationResultPayload callCalculationApiUsingPathVariable() {
        CalculationPayload calculationPayload = new CalculationPayload();
        calculationPayload.setValue1(2);
        calculationPayload.setValue2(7);
        return this.simpleProviderAPIClient.calculationUsingPathVariable("+", calculationPayload);
    }

    public CalculationResultPayload callCalculationApiUsingRequestParams() {
        CalculationPayload calculationPayload = new CalculationPayload();
        calculationPayload.setValue1(3);
        calculationPayload.setValue2(6);
        return this.simpleProviderAPIClient.calculationUsingRequestParam("+", calculationPayload);
    }
}
