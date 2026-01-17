package com.ms.api_gateway_service.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                // Product Service Route
                .route("product-service", r -> r
                        .path("/products/**")
                        .uri("lb://PRODUCT-SERVICE"))

                // Order Service Route
                .route("order-price", r -> r
                        .path("/orders/**")
                        .uri("lb://ORDER-PRICE"))

                .build();
    }
}