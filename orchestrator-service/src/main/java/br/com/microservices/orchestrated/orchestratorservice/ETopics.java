package br.com.microservices.orchestrated.orchestratorservice;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ETopics {

    START_SAGA("start-saga"),
    FINISH_SUCCESS("finish-success"),
    FINISH_FAIL("finish-fail"),
    PRODUCT_VALIDATION_SUCCESS("product_validation_success"),
    PRODUCT_VALIDATION_FAIL("product_validation_fail"),
    PAYMENT_VALIDATION_SUCCESS("payment_validation_success"),
    PAYMENT_VALIDATION_FAIL("payment_validation_fail"),
    INVENTORY_VALIDATION_SUCCESS("inventory_validation_success"),
    INVENTORY_VALIDATION_FAIL("inventory_validation_fail"),
    NOTIFY_ENDING("notify_ending"),
    BASE_ORCHESTRATOR("orchestrator");

    private String topic;
}
