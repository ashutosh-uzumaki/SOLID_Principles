package ocp.good_design;

public class SaveToDB implements DAO{
    @Override
    public void save(Pen pen){
        System.out.println("Saved to DB");
    }
}
