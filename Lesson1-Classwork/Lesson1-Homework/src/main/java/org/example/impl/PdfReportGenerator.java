package org.example.impl;

import org.example.generator.ReportGenerator;
import org.example.model.Order;

import java.util.List;

public class PdfReportGenerator implements ReportGenerator {
    @Override
    public String generateReport(List<Order> orders) {
        return "PDF отчет: " + orders.size() + " заказов";
    }
}
