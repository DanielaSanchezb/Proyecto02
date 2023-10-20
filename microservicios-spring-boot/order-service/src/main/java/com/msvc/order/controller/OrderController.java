package com.msvc.order.controller;

import com.msvc.order.dto.OrderRequest;
import com.msvc.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    //@CircuitBreaker(name = "inventario",fallbackMethod = "fallBackMethod")
    //@TimeLimiter(name = "inventario")
    //@Retry(name = "inventario")
    public String realizarPedido(@RequestBody OrderRequest orderRequest){
        orderService.placeOrder(orderRequest);
        return "pedido realizado con exito";
    }

    //public CompletableFuture<String> fallBackMethod(OrderRequest orderRequest,RuntimeException runtimeException){
        //return CompletableFuture.supplyAsync(() -> "Oops! Ha ocurrido un error al realizar el pedido");
    //}
}
