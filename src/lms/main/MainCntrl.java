package lms.main;

import lab.LabManager;
import member.MemberManager;

public class MainCntrl {
    public static void main(String[] args) {
        LabManager lm = new LabManager(50);
        lm.ini();
        MemberManager ma = new MemberManager(50);
        ma.ini(lm);
        MainMenu mm = new MainMenu();
        int sel;
        while (true) {
            switch (sel = mm.Issue()) {
                case 1:
                    ma.AddStudent(lm);
                    break;
                case 2:
                    ma.PrintStudentList();
                    break;
                case 3:
                    ma.AddResearcher(lm);
                    break;
                case 4:
                    ma.PrintResearcherList();
                    break;
                case 5:
                    ma.MemberView();
                    break;
                case 6:
                    ma.ShowMember();
                    break;
                case 7:
                    lm.AddLab();
                    break;
                case 8:
                    lm.ShowMemberList();
                    break;
                case 9:
                    lm.showLabId(ma);
                    break;
                case 0:
                    System.out.println("=> 시스템을 종료합니다...");
                    return;

            }

        }
    }
}
