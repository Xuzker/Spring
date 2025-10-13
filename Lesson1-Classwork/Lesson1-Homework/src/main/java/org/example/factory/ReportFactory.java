package org.example.factory;

import org.example.impl.PdfReportGenerator;
import org.example.service.ReportService;

public class ReportFactory {
    public static ReportService getReportService() {
        PdfReportGenerator pdfReportGenerator = new PdfReportGenerator();
        ReportService reportService = new ReportService(pdfReportGenerator);
        return reportService;
    }
}
