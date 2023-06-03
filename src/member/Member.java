package member;
import lab.Lab;
public class Member {
    int id;
    String name;
    Lab lab;
    public Member(int id,String name,Lab lab){
        this.id = id;
        this.name = name;
        this.lab = lab;
    }
    public String GetName(){return name;}
    public int GetId(){return id;}

    public Lab LabName() {return lab;}
    public void showData() {};

}
