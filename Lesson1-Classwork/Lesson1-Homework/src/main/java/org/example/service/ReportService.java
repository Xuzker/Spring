package org.example.service;

import org.example.generator.ReportGenerator;
import org.example.model.Order;

import java.util.List;

public class ReportService {
    private ReportGenerator reportGenerator;

    public ReportService(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public void createReport(List<Order> orders) {
        String report = reportGenerator.generateReport(orders);
        System.out.println(report);
    }

}
