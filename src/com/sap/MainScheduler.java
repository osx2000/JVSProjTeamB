package com.sap;

import com.olf.openjvs.IContainerContext;
import com.olf.openjvs.IScript;
import com.olf.openjvs.OException;
import com.sap.reports.EnumReport;
import com.sap.reports.IReport;
import com.sap.reports.ReportFactory;
import com.sap.reports.exporter.CsvExporter;
import com.sap.reports.exporter.IReportExporter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sumiran Chugh on 3/16/2016.
 *
 * @copyright atlas
 */
public class MainScheduler implements IScript {

    List<IReportExporter> exporters = new ArrayList<>();

    public MainScheduler(){
        exporters.add(new CsvExporter());
    }

    void getReport(EnumReport enumReport,List<IReportExporter> exporter){
        IReport report = ReportFactory.getReport(enumReport);
        report.createReport(exporter,enumReport);

    };

    @Override
    public void execute(IContainerContext iContainerContext) throws OException {


        for (EnumReport enumReport : EnumReport.values()) {
            getReport(enumReport,exporters );
        }
    }
}
