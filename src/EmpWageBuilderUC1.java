
public class EmpWageBuilderUC1 {
	
public static void main(String[] args)	
	{
	int isFullTime=1;
	int isPartTime=2;
	int WagePerHr=20;
	int FullDayHr=8;
	int empHr;
		
	double empCheck = Math.floor(Math.random()*10)%3;
	if(empCheck == isFullTime)
	{
		System.out.println("Employee is Present");
		int DailyEmpWage=WagePerHr*FullDayHr;
		System.out.println("DailyEmpWage::"+DailyEmpWage);
	empHr=8;
		
		
	}
	else if(empCheck == isPartTime)
	{
		System.out.println("Employee is Abscent");
		empHr=4;
	}else
	{
		empHr=0;
		
	}
	
	int DailyEmpWage=WagePerHr*empHr;
	System.out.println("dailywage" + DailyEmpWage);

}
}
