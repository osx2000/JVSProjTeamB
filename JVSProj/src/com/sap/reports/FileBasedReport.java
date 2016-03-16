package com.sap.reports;

import com.sap.reports.exporter.IReportExporter;

import java.util.List;

/**
 * Created by Sumiran Chugh on 3/16/2016.
 *
 * @copyright atlas
 */
public abstract class FileBasedReport  implements IReport{

    private EnumReport enumReport;

    @Override
    public int createReport(List<IReportExporter> exporters, EnumReport enumReport) {
         getData();
         generateReport();
         formatReport();
         exportReport(exporters,enumReport);
        return 1;
    }

    protected abstract int getData();
    protected abstract int generateReport();
    protected abstract int formatReport();

    protected int exportReport(List<IReportExporter> reportExporter, EnumReport enumReport){
        int result=0;
        for (IReportExporter iReportExporter : reportExporter) {
            result =iReportExporter.ExportReport(enumReport);
        }
        return result;
    }



}
