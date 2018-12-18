public class Appointment {
    private TimeInterval ti;

    public Appointment(TimeInterval ti)
    {
        this.ti=ti;
    }

    public TimeInterval getTime()
    {
         return this.ti;
    }

    public boolean conflictsWith(Appointment other)
    {
        return getTime().overlapsWith(other.getTime());
    }


}
