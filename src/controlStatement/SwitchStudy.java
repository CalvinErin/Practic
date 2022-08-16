package controlStatement;

public class SwitchStudy {

	public static void main(String[] args) 
	{
		// if today is Monday then this is 1st day of week
    String day="fri";
    switch (day) {
	case "mon":System.out.println("1 day of week");
    break;
	case "tue":System.out.println("2 day of week");
    break;
	case "wen":System.out.println("3 day of week");
	break;
	case "thu":System.out.println("4 day of week");
	break;
	case "fri":System.out.println("5 day of week");
	break;
	case "sat":System.out.println("6 day of week");
	break;
	case "sun":System.out.println("7 day of week");
	break;
	default:System.out.println("No such a day in week");
		break;
	}
	}

}
