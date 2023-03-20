package singleton;

public class Admin {

    private boolean isRoot;

    private static Admin admin;

    private Admin() {
        isRoot = true;
    }

    public static Admin getInstance() {
        if (admin == null) {
            admin = new Admin();
        }
        return admin;
    }

    public boolean isRoot() {
        return isRoot;
    }

    public static void main(String[] args) {

        Admin admin = Admin.getInstance();

        admin = null;

        System.out.println("admin.isRoot() = " + admin.isRoot());

        throw new IllegalArgumentException("admin can`t be null");

    }
}
