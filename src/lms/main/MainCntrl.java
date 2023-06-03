package lms.main;

import lab.LabManager;
import member.MemberManager;

public class MainCntrl{
    MemberManager ma = new MemberManager(50);  ma.ini(); // 여기부분 ini 매서드를 실행시켜줄수없음... 왜그럴까?
    LabManager lm = new LabManager(50);  lm.ini(); // 여기부분도 ini 매서드 실행불가..




}
