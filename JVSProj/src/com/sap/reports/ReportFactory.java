package com.sap.reports;

/**
 * Created by Sumiran Chugh on 3/16/2016.
 *
 * @copyright atlas
 */
public class ReportFactory {



    public static IReport getReport(EnumReport enumReport){

        if(enumReport.equals(EnumReport.DEAL_REPORT))
            return new DealReport();
        if(enumReport.equals(EnumReport.PARTY_REPORT))
            return new PartyReport();
        if(enumReport.equals(EnumReport.PNL_REPORT))
            return new PnlReport();
        return null;
    }
}
