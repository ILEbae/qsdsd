package lab;
import java.util.Scanner;

public class LabManager {
    Lab[] lList;
    int index = 0;
    Scanner sc;

    public LabManager(int n){
        lList = new Lab[n];
        sc = new Scanner(System.in);
    }

    public void ini(){
        lList[index++] = new Lab(1,"oo Lab");
        lList[index++] = new Lab(2,"cpp PBL");
        lList[index++] = new Lab(3,"웹 Lab");
        lList[index++] = new Lab(4,"Java 1st");
        lList[index++] = new Lab(5,"객체지향 EH");


    }

    public void AddLab(){
        int id = index+1;
        String title;
        System.out.println("<7. Lab 추가");
        System.out.println("-id:" + id);
        System.out.print("-타이틀: "); title = sc.next();
        lList[index++] = new Lab(id , title);
        System.out.println(">>"+title+"Lab 추가 성공");
    }

    public void ShowAll(){
        System.out.println("--------------------------");
        System.out.println("ID  Lab 이름");
        System.out.println("--------------------------");
        for(int i=0; i<index; i++)
            lList[i].showData();
        System.out.println("--------------------------");
    }

    public Lab findMemberByLid(int Lid){
        for(int i=0; i<index; i++){
            if(lList[i].id == Lid)  return lList[i];
        }
        return null;
    }

    public void showLabId(){
       int Lid;
       Lab l;
       ShowAll();
        System.out.print("- LabId: "); Lid = sc.nextInt();
       l=findMemberByLid(Lid);
        System.out.println("<"+l.GetTitle()+": 멤버 목록");
        System.out.println("-------------------------------");
        System.out.println("구분  ID 이름  Lab  전공/회사");

    }
}
