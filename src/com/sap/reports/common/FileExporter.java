package com.sap.reports.common;

import com.sap.reports.EnumReport;
import com.sap.reports.exporter.IReportExporter;

/**
 * Created by Sumiran Chugh on 3/16/2016.
 *
 * @copyright atlas
 */
public abstract class FileExporter implements IReportExporter {

    public static String getFilePath(EnumReport enumReport) {
        return "C:\\ReportsTB\\"+enumReport.name()+"\\";
    }
}
