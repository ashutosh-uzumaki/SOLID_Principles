package ocp.good_design;

public class SaveToLocal implements DAO{
    @Override
    public void save(Pen pen){
        System.out.println("Saved to local");
    }
}
