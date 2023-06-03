package member;
import lab.Lab;
public class Researcher extends Member{
    String org;

     public Researcher(int id , String name, Lab lab,String org){
        super(id,name,lab);
        this.org = org;
    }
@Override
    public void showData(){
    System.out.println(id+"\t" + name +"\t"+ lab.GetTitle()+"\t"+org);
    }
}
