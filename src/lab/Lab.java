package lab;

public class Lab {
    int id;
    String title;

    public Lab(int id , String title){
        this.id = id;
        this.title = title;
    }
    public String GetTitle(){ return title;}

    public void showData(){
        System.out.println(id+"\t"+title);
    }

}
