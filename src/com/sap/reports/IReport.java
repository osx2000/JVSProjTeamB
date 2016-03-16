package com.sap.reports;

import com.sap.reports.exporter.IReportExporter;

import java.util.List;

/**
 * Created by Sumiran Chugh on 3/16/2016.
 *
 * @copyright atlas
 */
public interface IReport {



    int createReport(List<IReportExporter> exporters, EnumReport enumReport);
}
