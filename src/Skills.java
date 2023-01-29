public class Skills {
    boolean frontend;
    boolean backend;
    boolean database;
    boolean mobile;
    boolean wordpress;
    boolean prestashop;
    private String name;
    private int days;
    public Skills(String name, int days) {
        this.name = name;
        this.days = days;
    }

    public Skills(boolean frontend, boolean backend, boolean database, boolean mobile, boolean wordpress, boolean prestashop) {
        this.frontend = frontend;
        this.backend = backend;
        this.database = database;
        this.mobile = mobile;
        this.wordpress = wordpress;
        this.prestashop = prestashop;
    }
}
