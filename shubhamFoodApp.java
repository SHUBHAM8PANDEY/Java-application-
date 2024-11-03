import java.util.Scanner;
public class shubhamFoodApp {
    public static void main(String[] args) {
        System.out.println("Hello to The Welcome Food App");
        System.out.println("Please Create a Password :");
        Scanner Scan = new Scanner(System.in);
        String Pass1 = Scan.next();
        System.out.println("Your Password Is Now:" + Pass1);


        System.out.println("Please Enter Your Password");
        String Pass = Scan.next();

        while (!Pass.equals(Pass1)) {
            System.out.println("This Is Not The  Right Password PLease Try Again: ");
            Pass = Scan.next();
        }
        System.out.println("Access Granted");
        System.out.println("Are You Hungry Yes or No: ");
        String Ans1 = Scan.next();

        if (Ans1.equals("yes")) {
            System.out.println("Choose What You Want To Eat Between pizza,burger,fish ");
            String Ans2 = Scan.next();

            while (!Ans2.equals("pizza") && !Ans2.equals("burger") && !Ans2.equals("fish")) {
                System.out.println("Sorry We Do Not Eat Would You Like Between Pizza,Burger or Fish");
                Ans2=Scan.next();
            }
            if (!Ans2.equals("pizza") ||!Ans2.equals("burger") ||!Ans2.equals("fish")) {
                System.out.println("Do You Want Something To Drink? Yes OR NO :");
                String Ans3 = Scan.next();


                while (!Ans3.equals("yes") && !Ans3.equals("no")) {
                    System.out.println("Wrong comment Please Try Again");
                    Ans3 = Scan.next();
                }
                if (Ans3.equals("yes")) {
                    System.out.println("What Would You Like Drink Coke or Juice ? :");
                    String Ans4 = Scan.next();

                    while (!Ans4.equals("coke") && !Ans4.equals("juice")) {
                        System.out.println("Sorry we don't Have It What Would You Like Coke ans Juice : ");
                        Ans4 = Scan.next();
                    }
                    if (!Ans4.equals("coke") || !Ans4.equals("juice")) {
                        System.out.println("Great You Have Ordered " + Ans2 + "and" + Ans4);
                    }
                    System.out.println("Please Confirm Your Password");
                    Pass = Scan.next();

                    while (!Pass.equals(Pass1)) {
                        System.out.println("This Is Not The  Right Password PLease Try Again: ");
                        Pass = Scan.next();
                    }
                    System.out.println("Thank You Your Oder It's ON Way");

                } else {
                    System.out.println("You Have The Ordered " + Ans2);

                    System.out.println("Please Confirm Your Password");
                    Pass = Scan.next();

                    while (!Pass.equals(Pass1)) {
                        System.out.println("This Is Not The  Right Password PLease Try Again: ");
                        Pass = Scan.next();

                    }
                }


            }
        }else {
            System.out.println("Alright Have A Good Day");
        }

    }
}