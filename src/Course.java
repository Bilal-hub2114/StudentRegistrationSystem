public class Course {
    private String title;
    private int catologID;
    Course(String title,int catalogID){
        this.title=title;
        this.catologID=catalogID;
    }
    public String getTitle(){
        return title;

    }
    public int getCatologID(){
        return catologID;
    }

}
