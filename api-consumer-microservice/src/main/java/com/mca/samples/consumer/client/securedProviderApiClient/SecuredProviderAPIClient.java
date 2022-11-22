package com.mca.samples.consumer.client.securedProviderApiClient;

import com.mca.client.annotation.apiConsumer.httpApiConsumer.HttpApiConsumer;
import com.mca.client.annotation.mcaClient.McaClient;
import com.mca.samples.consumer.client.payload.CalculationPayload;
import com.mca.samples.consumer.client.payload.CalculationResultPayload;
import io.swagger.oas.models.PathItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@McaClient(serviceName = "secured-api-provider")
public interface SecuredProviderAPIClient {

    @HttpApiConsumer(method = PathItem.HttpMethod.GET, path = "/api/v1/string/lowercase/{value}")
    String lowercase(@PathVariable("value") String value);

    @HttpApiConsumer(method = PathItem.HttpMethod.POST, path = "/api/v1/calculation/{operation}")
    CalculationResultPayload calculationUsingPathVariable(@PathVariable("operation") String operation, @RequestBody CalculationPayload value);

    @HttpApiConsumer(method = PathItem.HttpMethod.POST, path = "/api/v1/calculation")
    CalculationResultPayload calculationUsingRequestParam(@RequestParam("operation") String operation, @RequestBody CalculationPayload value);
}
