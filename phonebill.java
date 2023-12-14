import java.util.Scanner;
public class phonebill {
	// Ayush ayu1201
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, l, s, is, nbill = 0;
        float billamt = 200, fbill;
        char choice;
        System.out.println("\t\t\t\tBSNL");
        System.out.print("\nEnter Calls Consumed: ");
        a = scanner.nextInt();
        System.out.println("Your Calls are: " + a);
        System.out.print("\n\n\tDo You want call break-up....?? (Y/N): ");
        choice = scanner.next().charAt(0);

        if (choice == 'N' || choice == 'n') 
		{
            if (a <= 50) {
                billamt = billamt;
            } else if (a > 50 && a <= 100) {
                billamt += (a - 50) * 1.5;
            } else if (a > 100 && a <= 150) {
                billamt += (a - 100) * 3.5 + 75;
            } else if (a >= 150 && a <= 250) {
                billamt += (a - 150) * 6.5 + 75 + 175;
            } else if (a > 250) {
                billamt += (a - 250) * 8.5 + 75 + 175 + 650;
            }
            System.out.println("\n\n\tYour Bill Amount Is : " + billamt);
        }
		else if (choice == 'Y' || choice == 'y') 
		{
            System.out.print("\n\n\tEnter Local Calls Count: ");
            l = scanner.nextInt();
            System.out.print("\n\n\tEnter STD Calls Count: ");
            s = scanner.nextInt();
            System.out.print("\n\n\tEnter ISD Calls Count: ");
            is = scanner.nextInt();
            System.out.println("Your Local Calls are " + l);
            System.out.println("Your STD Calls are " + s);
            System.out.println("Your ISD Calls are " + is);
            if (a!=l+s+is) 
			{
                System.out.print("\n\n\tEnter Local Calls Count: ");
                l = scanner.nextInt();
                System.out.print("\n\n\tEnter STD Calls Count: ");
                s = scanner.nextInt();
                System.out.print("\n\n\tEnter ISD Calls Count: ");
                is = scanner.nextInt();
                if (a!=l+s+is) 
				{
                    System.out.println("\n\n\t\t\tError ");
                    System.out.print("\n\n\tEnter Local Calls Count: ");
                    l = scanner.nextInt();
                    System.out.print("\n\n\tEnter STD Calls Count: ");
                    s = scanner.nextInt();
                    System.out.print("\n\n\tEnter ISD Calls Count: ");
                    is = scanner.nextInt();
                    if (a!=l+s+is) 
					{
                        System.out.println("\t\t\t\tError");
                    } else 
					{
                        nbill = l * 2 + s * 6 + is * 16;
                        System.out.println("\t\nYour Bill is " + nbill);
                    }
                } else 
				{
                    nbill = l * 2 + s * 6 + is * 16;
                    System.out.println("\t\nYour Bill is " + nbill);
                }
            } else 
			{
                nbill = l * 2 + s * 6 + is * 16;
                System.out.println("\t\nYour Bill is " + nbill);
            }
            if (nbill > 5000) 
			{
                fbill = nbill + (nbill * 0.05f);
            } else 
			{
                fbill = nbill - (nbill * 0.05f);
            }
            System.out.println("\n\n\t\tYour Final Bill is " + fbill);
        }
    }
}
