package member;
import lab.Lab;
import lab.LabManager;
import java.util.Scanner;
public class MemberManager {
    Member[] mList;
    int index;
    Scanner sc;

    public MemberManager(int n) {
        mList = new Member[n];
        sc = new Scanner(System.in);
    }

    public void ini(LabManager lm) {
        mList[index++] = new Student(index, "홍학생", lm.findMemberByLid(1), "소프트웨어");
        mList[index++] = new Student(index, "김학생", lm.findMemberByLid(2), "게임공학");
        mList[index++] = new Student(index, "박학생", lm.findMemberByLid(1), "컴퓨터 공학");
        mList[index++] = new Researcher(index, "홍연구", lm.findMemberByLid(1), "Happy co.");
        mList[index++] = new Researcher(index, "박연구", lm.findMemberByLid(3), "(주) 행복");
    }

    public void AddStudent(LabManager lm) {
        int id = index + 1;
        String name, major;
        int Lid = 100;
        Lab l;

        System.out.println("<1. 학생 멤버 추가>");
        System.out.println("-id:" + id);
        System.out.print("-이름: ");
        name = sc.next();
        System.out.println("-전공: ");
        major = sc.next();
        lm.ShowAll();
        while (Lid != 0) {
            System.out.println("-Lab ID :");
            Lid = sc.nextInt();
            l = lm.findMemberByLid(Lid);
            if (l != null) {
                mList[index++] = new Student(id, name, l, major);
                System.out.println("=>" + name + "학생을 추가했습니다.");
                return;
            }
        }
        mList[index++] = new Student(id, name, null, major);
        System.out.println("=>" + name + "학생을 추가했습니다.");
    }

    public void AddResearcher(LabManager lm) {
        int id = index + 1;
        String name, major;
        int Lid = 100;
        Lab l;

        System.out.println("<3. 연구원 멤버 추가>");
        System.out.println("-id:" + id);
        System.out.print("-이름: ");
        name = sc.next();
        System.out.println("-전공: ");
        major = sc.next();
        lm.ShowAll();
        while (Lid != 0) {
            System.out.println("-Lab ID :");
            Lid = sc.nextInt();
            l = lm.findMemberByLid(Lid);
            if (l != null) {
                mList[index++] = new Researcher(id, name, l, major);
                System.out.println("=>" + name + "연구원을 추가했습니다.");
                return;
            }
        }
        mList[index++] = new Researcher(id, name, null, major);
        System.out.println("=>" + name + "연구원을 추가했습니다.");
    }
        public void ShowAll(){
            for (int i = 0; i < index; i++) {
                if (mList[i] instanceof Student)
                    System.out.println("<2. 학생 멤버 목록 출력>");
                else
                    System.out.println("<4.연구원 멤버 목록 출력>");
                mList[i].showData();
            }
        }
    public void WhatIsType(){
        for (int i = 0; i < index; i++) {
            if (mList[i] instanceof Student)
                System.out.println("학생");
            else
                System.out.println("연구원");

        }
    }

        public Member FindMemberByName(String name){
            for(int i=0; i<index; i++)
            {
                if(mList[i].GetName().equals(name)) return mList[i];
            }

            return null;
    }

        public void MemberView(){
            Member m;
            String name;
            System.out.println("<5. 멤버 조회>");
            System.out.print("-이름: ");  name = sc.next();
            m = FindMemberByName(name);
            if(m==null)
                System.out.println("=>"+name+"그런 멤버 없음.");
            else
            {
                System.out.println("<찾은 멤버>");
                System.out.println("------------------------------");
                System.out.println("구분  ID  이름  Lab     전공/회사");
                System.out.println(WhatIsType()+"\t"+m.GetId()+"\t"+m.GetName()+"\t"+m.lab.GetTitle()+"\t"+
            }

        }
}
