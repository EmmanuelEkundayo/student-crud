package services.impl;

import models.NonAcademicFacility;
import models.SupportStaff;
import services.SupportStaffService;

public class SupportStaffServiceimpl implements SupportStaffService{
    public void maintainFacility( int type,NonAcademicFacility NonacademicFacility, SupportStaff Supportstaff) {
        switch (type) {
            case 1 -> System.out.println(Supportstaff.getName() + " is cleaning " + NonacademicFacility.getName());
            case 2 ->
                    System.out.println(Supportstaff.getName() + " is attending to parents at " + NonacademicFacility.getName());
            case 3 -> System.out.println(Supportstaff.getName() + " is guarding " + NonacademicFacility.getName());
            default -> System.out.println("Invalid staff role for maintaining facility.");
        }
    }
}
