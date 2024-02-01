package com.hansanhha.spring.shop.order;

import com.hansanhha.spring.shop.order.Order.OrderIdentifier;
import org.jmolecules.event.types.DomainEvent;

public record OrderCompletedEvent(OrderIdentifier orderId) implements DomainEvent {
}
