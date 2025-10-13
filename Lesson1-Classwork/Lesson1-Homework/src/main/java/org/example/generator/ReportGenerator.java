package org.example.generator;

import org.example.model.Order;

import java.util.List;

public interface ReportGenerator {
    String generateReport(List<Order> orders);
}
