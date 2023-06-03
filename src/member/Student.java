package member;

import lab.Lab;

public class Student extends Member{
    String major;

    public Student(int id , String name, Lab lab , String major){
        super(id,name,lab);
        this.major = major;
    }
    @Override
    public void showData(){
        System.out.println(id+"\t"+name+"\t"+lab.GetTitle()+"\t"+major);
    }

}
