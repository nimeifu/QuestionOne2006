public class Runner {
    public static void main(String[] args)
    {
        TimeInterval one=new TimeInterval(8,10);
        TimeInterval two=new TimeInterval(9,12);

        Appointment OneA=new Appointment(one);
        Appointment TwoB=new Appointment(two);

        System.out.println(OneA.conflictsWith(TwoB));
        DailySchedule today=new DailySchedule();
    }
}
