package db;

public class ReportBuilder extends Авторизація {
    private БазаДаних db;
    public ReportBuilder() {

    }
    public boolean authorise(БазаДаних db) {
        return авторизуватися(db);
    }
    public void buildReport(БазаДаних db) {
        this.db = db;
    }
    public БазаДаних createDB() {
        БазаДаних db = new БазаДаних();
        return db;
    }
}
