package services.impl;

import models.SupportStaff;
import services.SupportStaffService;

public class SupportStaffServiceimpl implements SupportStaffService{
    public void maintainFacility(String facility, int type, SupportStaff Supportstaff) {
        switch (type) {
            case 1:
                System.out.println(Supportstaff.getName() + " is cleaning " + facility);
                break;
            case 2:
                System.out.println(Supportstaff.getName() + " is attending to parents at " + facility);
                break;
            case 3:
                System.out.println(Supportstaff.getName() + " is guarding " + facility);
                break;
            default:
                System.out.println("Invalid staff role for maintaining facility.");
        }
    }
}
