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
		int startingMilli =  millisec;
		int hours = millisec /3600000;
		millisec = millisec % 3600000;
		int minutes = millisec / 60000;
		millisec = millisec % 60000;
		int seconds = millisec / 1000;
		millisec = millisec % 1000;




		System.out.println("Starting Milli Seconds:\t" +startingMilli);
		System.out.println("Hours :\t\t\t\t\t" + hours);


		System.out.println("Minutes:\t\t\t\t" + minutes);

		System.out.println("Seconds:\t\t\t\t" + seconds);
		System.out.println("Milli-seconds:\t\t\t" +millisec);


	}
}

