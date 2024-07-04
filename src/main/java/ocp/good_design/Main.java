package ocp.good_design;

public class Main {
    public static void main(String[] args) {
        Pen pen = new Pen("Hauser", "Blue", 2024, 10.0);
        DAO dao = new SaveToDB();
        dao.save(pen);
        dao = new SaveToLocal();
        dao.save(pen);
    }
}
