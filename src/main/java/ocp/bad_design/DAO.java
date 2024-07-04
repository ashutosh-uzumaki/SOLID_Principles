package ocp.bad_design;

public class DAO {
    private Pen pen;
    public DAO(Pen pen){
        this.pen = pen;
    }

    public void saveToDB(){
        //save to DB
    }

    //now there is another option to save to local, we have to modify this class

    public void saveToFiles(){
        //save to Files
    }
}
