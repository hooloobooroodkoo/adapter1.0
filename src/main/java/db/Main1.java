package db;

public class Main1 {
    public static void main(String[] args) {
        ReportBuilder reportBuilder = new ReportBuilder();
        БазаДаних db = reportBuilder.createDB();
        if (reportBuilder.authorise(db)) {
         reportBuilder.buildReport(db);
        }
    }
}
