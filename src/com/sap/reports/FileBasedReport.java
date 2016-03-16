package com.sap.reports;

import com.sap.reports.common.FileManagerHelper;
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
    public int createReport(List<IReportExporter> reportExporter, EnumReport enumReport) {
         getData();
         generateReport();
         formatReport();
        return 0;
    }

    protected abstract int getData();
    protected abstract int generateReport();
    protected abstract int formatReport();


    protected  String createFile(){
      return   FileManagerHelper.getFilePath(enumReport);
    }
}
