import java.util.ArrayList;

public class DailySchedule {
    private ArrayList apptList;

    public DailySchedule()
    {
        apptList=new ArrayList();
    }

    public void clearConflicts(Appointment appt)
    {
        for (int i = apptList.size()-1; i >= 0; i--)
        {
            if (appt.conflictsWith((Appointment)apptList.get(i)))
            {
                apptList.remove(i);
            }
        }
    }

    public boolean addAppt(Appointment appt, boolean emergency)
    {
        if (emergency)
        {
            clearConflicts(appt);
        }
        else
        {
            for (int i = 0; i < apptList.size(); i++)
            {
                if (appt.conflictsWith((Appointment)apptList.get(i)))
                {
                    return false;
                }
            }
        }
        return apptList.add(appt);
    }
}
