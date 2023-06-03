package lms.main;

import lab.LabManager;
import member.MemberManager;

public class MainCntrl{
    MemberManager ma = new MemberManager(50);  ma.ini();
    LabManager lm = new LabManager(50);  lm.ini();




}
