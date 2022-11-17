package com.mca.samples.provider;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/calculation")
public class CalculationController {


    @PostMapping("/{operation}")
    public CalculationResultPayload calculationUsingPathVariable(@PathVariable String operation, @RequestBody CalculationPayload calculationPayload) {
        CalculationResultPayload calculationResultPayload = new CalculationResultPayload();
        calculationResultPayload.setResult(calculationPayload.getValue1() + calculationPayload.getValue2());
        return calculationResultPayload;
    }

    @PostMapping()
    public CalculationResultPayload calculationUsingRequestParam(@RequestParam("operation") String operation, @RequestBody CalculationPayload calculationPayload) {
        CalculationResultPayload calculationResultPayload = new CalculationResultPayload();
        calculationResultPayload.setResult(calculationPayload.getValue1() + calculationPayload.getValue2());
        return calculationResultPayload;
    }
}
