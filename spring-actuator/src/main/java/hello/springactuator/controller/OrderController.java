package hello.springactuator.controller;

import hello.springactuator.order.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/order")
    public String order() {
        log.info("ORDER");

        orderService.order();

        return "order";
    }

    @GetMapping("/cancel")
    public String cancel() {
        log.info("CANCEL");

        orderService.cancel();

        return "cancel";
    }

    @GetMapping("/stock")
    public int stock() {
        log.info("STOCK");

        return orderService.getStock().get();
    }
}
