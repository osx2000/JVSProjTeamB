package com.sap.reports.exporter;

import com.sap.reports.EnumReport;
import com.sap.reports.common.FileExporter;

/**
 * Created by Sumiran Chugh on 3/16/2016.
 *
 * @copyright atlas
 */
public class CsvExporter extends FileExporter{

    @Override
    public int ExportReport(EnumReport enumReport)
    {
        String path = getFilePath(enumReport);
        return 0;
    }


}
