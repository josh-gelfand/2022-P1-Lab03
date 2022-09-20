// Lab03vst.java
// Student starting version of the Lab03 assignment.
// Resave this program as Lab03v80 for the 80 point version.
// Resave this program as Lab03v100 for the 100 point version.


public class Lab03vst
{
	public static void main(String[] args)
	{
		System.out.println("Lab03, 100 Point Version\n");
		int millisec = 10000123;
		System.out.println("Starting Milli Seconds:" +millisec);
		System.out.println("Hours :" +millisec/360000);
		int millisec2 = millisec%3600000;
		System.out.println("Minutes:" +millisec2/60000);
		int millisec3 = millisec2%60000;
		System.out.println("Seconds:" +millisec3/1000);
		System.out.println("Milli-seconds:" +millisec3%1000);


	}
}

