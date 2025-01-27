package services;

import models.NonAcademicFacility;
import models.SupportStaff;

public interface SupportStaffService {
    void maintainFacility(int type, NonAcademicFacility NonacademicFacility, SupportStaff Supportstaff);
}