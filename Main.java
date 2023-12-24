import java.util.Scanner;
import java.io.IOException;
public class Main {
    public static int rack;
    public static Scanner input = new Scanner(System.in);
    public static int a, c, enter;
    public static int number, transferNumber = 00223344, c_accountNumber = 00224455, recieverNumber;
    private static String c_Password = "12345", c_newPin, newPin;
    private static double c_account = 67890;
    public static String bankLoginName, instName, p_Name = "SMITH";
    private static String transferName, recieverName;
    public static String b;


    public static int amount, bankLoginNumber, proceed;


    public static void main(String[] args){
        msg();
    }

    public static void msg() {
        System.out.println("\t\t\t\t\t\t\t\t WELCOME TO MY MINI BANKING SYSTEM \n\n\n\n");
        System.out.println("\t\t\t\t\t\tinstall our mobile App on playStore(For Andriod) and apple Store( For IOS) " + "\n\n" + "\t\t\t\t\t\tDail *894# to Enjoy My new Mobile banking System............   \n\n\t\t\t\t\t\tWe hope to Serve you Better by the professional services offered by our Staff \n\n");
        System.out.println("\n\t\t\t\t\t\t\t\t INSTRUCTION\n\n");
        System.out.println("Please Adhere To The Following Instruction in Order TO Have A Smooth User Expirence\n\n" + "*  To Go Back At Any Point In The Program Enter Zero(0).\n\n" + "*  Select Numbers From 0-9 ToNavigate To Any Option In Any Interface.\n\n" + "*  If The Option You Want To Select Is Not In A Paticular Interface You Can Select'Ohers.' \n\n" + "*  Select Verify To Verify If Your Account Is Active....\n\n");
        System.out.println("\t\t\t\t\t\t\t\tPlease Enter Your Pin\n\n");
        System.out.print("\t\t\t\t\t\t\t\t\t  ");
        c_Password = input.nextLine();
        clearScreen();
        switch (c_Password) {
            case "12345":
                p_account();
                welcMsg();
                break;
            default:
                System.out.print("\n\n\n\nThe Password Entered Is Invalid!!\n\n");
                msg();
        }
    }

    public static void welcMsg() {

        System.out.print("\n1. Cash transactions" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2. Inquiry " + "\n\n\n\n\n\n");
        System.out.print("3. Check balance  " + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t4. help " + "\n\n\n\n\n\n5. Change pin.  " + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t0.Exit" + "\n\n\n\n\n\n");
        System.out.print("\t\t\t\t\t\t\t\t\t");
        number = input.nextInt();
        clearScreen();
        switch (number) {
            case 1:
                accType();
                cashTranaction();
                break;
            case 2:
                System.out.println("OOps, The Option You Chose Is Not Currently Avaliable For The Moment,Please Try Again Letter");
                break;
            case 3:
                checkBalance();
                System.out.println("\n\n\n");
                break;
            case 4:
                System.out.println("OOps, The Option You Chose Is Not Currently Avaliable For The Moment,Please Try Again Letter");
                break;
            case 5:
                changePin();
                cashTranaction();
                break;
            case 0:
                // System.exit(0); //change made here
                msg();
                break;
            default:
                System.out.println("the number Entered is Invalid.. please Enter a Correct Number");
                welcMsg();
        }
    }

    private static void cashTranaction() {

        for (; ; ) {
            System.out.print("\n1. Deposite" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  2. Withdrawal " + "\n\n\n\n\n\n");
            System.out.print("3. Check balance  " + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t  4. Pay bills  " + "\n\n\n\n\n\n");
            System.out.print("5. Transfer  " + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  6. Others  " + "\n\n\n\n\n\n");
            System.out.print("0. Exit " + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  0. Cancel  " + "\n\n\n\n\n\n");
            System.out.print("\t\t\t\t\t\t\t\t\t\t");
            a = input.nextInt();
            clearScreen();

            switch (a) {
                case 1:
                    deposite();
                    break;
                case 2:
                    Withdrawal();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    paybill();
                    break;
                case 5:
                    transfer();
                    break;
                case 6:
                    System.out.println("OOps, The Option You Chose Is Not Currently Avaliable For The Moment,Please Try Again Letter");
                    break;
                case 0:
                    welcMsg();
                default:
                    System.out.println("The Number Entered Is Invalid");
            }
            System.out.println("\n\nDo You Want to perform Another Transaction...." + "(Y/N)\n\n");
            System.out.print("\t\t\t\t\t\t\t\t\t\t");
            b = input.next();
            clearScreen();

            switch (b) {
                case "y":
                    continue;
                case "n":
                    welcMsg(); //to go back to welcmsg 2
                    break;
                case "Y":
                    continue;
                case "N":
                    welcMsg();
                    break;
                default:
                    System.out.println("Please Enter A Valid Character");
                    cashTranaction();
            }
        }
    }


    public static void amount() {
        System.out.println("\t\t\t\t\t\t\t\t\tENTER   AMOUNT\n\n");
        System.out.print("\t\t\t\t\t\t\t\t\t      ");
        amount = input.nextInt();
        System.out.print("");

        if (c_account >= amount) {
            c_account -= amount;
			clearScreen();
            letter();
            System.out.println("Transaction Successful..!!");

        } else {
            System.out.println("Insufficent Fund..!!");

        }
    }

    private static void deposite() {
        System.out.print("\n1. 1,000" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  2. 2,000 " + "\n\n\n\n\n\n");
        System.out.print("3. 5,000  " + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  4. 10,000  " + "\n\n\n\n\n");
        System.out.print("\n5. 15,000" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  6. Others " + "\n\n\n\n\n\n");
        System.out.print("\t\t\t\t\t\t\t\t\t");
        enter = input.nextInt();
        clearScreen();

        switch (enter) {
            case 1:
                c_account += 1000;
                letter();
                System.out.println("Transaction Successful. !!");
                break;
            case 2:
                c_account += 2000;
                letter();
                System.out.println("Transaction Successful. !!");
                break;
            case 3:
                c_account += 5000;
                letter();
                System.out.println("Transaction Successful. !!");
                break;
            case 4:
                c_account += 10000;
                letter();
                System.out.println("Transaction Successful. !!");
                break;
            case 5:
                c_account += 15000;
                letter();
                System.out.println("Transaction Successful. !!");
                break;
            case 6:
                amount();
                break;
            default:
                System.out.println("My friend Select a Correct Option...!!");
        }
    }

    private static void Withdrawal() {
        System.out.print("\n1. 1,000" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   2. 2,000 " + "\n\n\n\n\n\n");
        System.out.print("3. 5,000  " + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   4. 10,000  " + "\n\n\n\n\n");
        System.out.print("\n5. 15,000" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  6. Others " + "\n\n\n\n\n\n");
        // System.out.print("\n0. Bac");
        System.out.print("\t\t\t\t\t\t\t\t\t\t");
        enter = input.nextInt();
        clearScreen();

        switch (enter) {
            case 1:
                if (c_account >= 1000) {
                    c_account -= 1000;
                    letter();
                    System.out.println("Transaction Successful");
                } else {

                    System.out.println("Insufficient Fund!!");
                }
                break;
            case 2:
                if (c_account >= 1000) {
                    letter();
                    c_account -= 2000;
                    System.out.println("Transaction Successful");
                } else {
                    System.out.println("Insufficient Fund!!");
                }
                break;
            case 3:
                if (c_account >= 1000) {
                    c_account -= 5000;
                    letter();
                    System.out.println("Transaction Successful");
                } else {
                    System.out.println("Insufficient Fund!!");
                }
                break;
            case 4:
                if (c_account >= 1000) {
                    c_account -= 10000;
                    letter();
                    System.out.println("Transaction Successful");
                } else {
                    System.out.println("Insufficient Fund!!");
                }
                break;
            case 5:
                if (c_account >= 1000) {
                    c_account -= 15000;
                    letter();
                    System.out.println("Transaction Successful");
                } else {
                    System.out.println("Insufficient Fund!!");
                }
                break;
            case 6://change this later
                amount();
                break;
            default:
                System.out.println("not good");
        }

    }

    public static void bankLogin() {
        System.out.println("\t\t\t\t\t\t\t\t\tENTER ACCOUNT NAME\n");
        System.out.print("\t\t\t\t\t\t\t\t\t\t");
        bankLoginName = input.next();
        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t\t\t\tENTER ACCOUNT NUMBER\n");
        System.out.print("\t\t\t\t\t\t\t\t\t\t");

        bankLoginNumber = input.nextInt();
        System.out.println("\n");

        amount();
        clearScreen();



    }

    public static void transfer() {
        System.out.print("\n\n\n");

        System.out.print("\t\t\t\t\t\t\t\t");
        System.out.print("PLEASE SELECT A BANK....");
        System.out.print("\n\n\n");
        System.out.print("\n1. Firstbank" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2. Skye " + "\n\n\n\n\n");
        System.out.print("\n3. oceanic" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t4. UBA " + "\n\n\n\n\n");
        System.out.print("\n5. Fcmb" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t6. Sterling" + "\n\n\n\n\n");
        System.out.print("\n7. Diamond" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t8. Fidelity " + "\n\n\n\n\n");
        System.out.print("\n9. Others" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 0. Exit " + "\n\n\n\n\n");
        System.out.print("\t\t\t\t\t\t\t\t\t");

        number = input.nextInt();
        clearScreen();
        if (number == 1 || number == 2 || number == 3 || number == 4 || number == 5 || number == 6 || number == 7 || number == 8 || number == 9) {
            System.out.print("\n\n\n");
            bankLogin();


        } else if (number == 0) {
            cashTranaction();
        }else{
            System.out.print("Invalid Input");
        }
    }

    public static void schoolName() {
        System.out.print("\n1. Tetiary institution" + "\t\t\t\t\t\t\t\t\t\t\t2. Secondary Institution " + "\n\n\n");
        System.out.print("\n3. primary institution" + "\t\t\t\t\t\t\t\t\t\t\t4. Others " + "\n\n\n");
        System.out.print("\t\t\t\t\t\t\t\t\t\t");
        enter = input.nextInt();
        clearScreen();
        switch (enter) {
            case 1:
                tetiaryName();  //new change made here
                break;
        }
    }

    public static void tetiaryName() {
        System.out.print("\n1. University" + "\t\t\t\t\t\t\t\t\t\t\t\t2. Polytechnic " + "\n\n\n");
        System.out.print("\n3. College " + "\t\t\t\t\t\t\t\t\t\t\t\t4. Others " + "\n\n\n");
        System.out.print("\n0. exit ");
        System.out.print("\t\t\t\t\t\t\t\t\t\t");
        enter = input.nextInt();
        clearScreen();
        if (enter == 1 || enter == 2 || enter == 3) {
            transfer();
        } else if (enter == 4) {
            inst_Name();

        } else if (enter == 0) {
            cashTranaction();
        } else {
            System.out.println("  The Number You Entered Is Incorrect....");
        }

    }

    public static void inst_Name() {
        System.out.println("\t\t\t\t\t\t\t\tENTER NAME OF INSTITUTION\n\n");
        System.out.print("\t\t\t\t\t\t\t\t\t");
        instName = input.next();
        clearScreen();
        System.out.println("\n");
        amount();

    }

    //don't add clear Screen
    private static void p_account() {
        System.out.println("\n\n\tWelcome mr " + p_Name);
    }

    public static void clearScreen() {
        // System.out.print("\033\143");
        // System.out.flush();
        //for(int i = 0; i<40; ++i) {System.out.println();}

        try {

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }catch (IOException | InterruptedException err){
            System.out.println(err);
        }

    }

    public static void b_Name() {
        System.out.println("\t\t\t\t\t\t\t\tENTER NAME OF Your Bank\n\n");
        System.out.print("\t\t\t\t\t\t\t\t\t");
        instName = input.next();
        clearScreen();
        bankLogin();

    }

    static void letter() {
        System.out.println("Please Wait While Your Transaction Is Processing.\n");
        String msg = ".........................\n";


        try {
            char[] arr = msg.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                Thread.sleep(500);
            }
        } catch (InterruptedException err) {
            System.out.println("Error Thread didn't complete" + err.getMessage());
        }
    }

    public static void accType() {
        System.out.print("\n\nPlease Select An Account Type \n\n\n\n\n");
        System.out.print("\n1. Savings" + "\t\t\t\t\t\t\t\t\t2. Current " + "\t\t\t\t\t\t\t\t3. Others\n\n\n\n\n\n");
        System.out.print("\t\t\t\t\t\t\t\t\t\t   ");
        number = input.nextInt();
        clearScreen();
        switch (number) {

            case 1:
                cashTranaction();
                break;
            case 2:
                cashTranaction2();
                break;
            case 3:
                System.out.println("The option you selected is not currently avaliable for the moment, try again later thank you");
                accType();
                break;
            default:
                System.out.println("please select a correct option");
        }
        clearScreen();
    }


    private static void checkBalance() {

        System.out.print("\n\n");


        System.out.print("your balance is N" + c_account+"\n\n");




    }

    private static void paybill() {
        System.out.print("\n1. Light" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2. Water " + "\n\n\n\n\n\n");
        System.out.print("3. Tax  " + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t4. Atm maintainance  " + "\n\n\n\n\n");
        System.out.print("\n5. School fee" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t6. Others " + "\n\n\n\n\n\n");
        System.out.print("\t\t\t\t\t\t\t\t\t");
        enter = input.nextInt();
        clearScreen();
        switch (enter) {
            case 5:
                schoolName();  //new change made here
                break;
            default:
                if (enter == 1 || enter == 2 || enter == 3 || enter == 4 || enter == 6) {
                    System.out.println("(V_V)  Sorry, the option you chose is currently unavaliable for the moment, Please try again later Thank you......");
                } else {
                    System.out.println("The Option You Chose Is Incorrect!!");
                }

        }

    }


    private static void changePin() {

        System.out.print("\n\n");

        System.out.println("Enter new Password");
        String newPin = input.next();
        System.out.println("Confirm Password");
        c_newPin = input.next();
        if (newPin == c_newPin) {
            newPin = c_Password;
            System.out.print("Change Password successfull!!");

            cashTranaction();

        } else {
            System.out.println("the password entered does not correspond");
        }



    }



    private static void current_deposite() {
        System.out.print("\n1. 10,000" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  2. 20,000 " + "\n\n\n\n\n\n");
        System.out.print("3. 30,000  " + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  4. 40,000  " + "\n\n\n\n\n");
        System.out.print("\n5. 50,000" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  6. Others " + "\n\n\n\n\n\n");
        System.out.print("\t\t\t\t\t\t\t\t\t");
        enter = input.nextInt();
        clearScreen();

        switch (enter) {
            case 1:
                c_account += 10000;
                letter();
                System.out.println("Transaction Successful. !!");
                break;
            case 2:
                c_account += 20000;
                letter();
                System.out.println("Transaction Successful. !!");
                break;
            case 3:
                c_account += 30000;
                letter();
                System.out.println("Transaction Successful. !!");
                break;
            case 4:
                c_account += 40000;
                letter();
                System.out.println("Transaction Successful. !!");
                break;
            case 5:
                c_account += 50000;
                letter();
                System.out.println("Transaction Successful. !!");
                break;
            case 6:
                amount();
                break;
            default:
                System.out.println("My friend Select a Correct Option...!!");
        }
    }
        private static void current_Withdrawal() {
            System.out.print("\n1. 10,000" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   2. 20,000 " + "\n\n\n\n\n\n");
            System.out.print("3. 30,000  " + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   4. 40,000  " + "\n\n\n\n\n");
            System.out.print("\n5. 50,000" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  6. Others " + "\n\n\n\n\n\n");
            // System.out.print("\n0. Back");
            System.out.print("\t\t\t\t\t\t\t\t\t\t");
            enter = input.nextInt();
            clearScreen();

            switch (enter) {
                case 1:
                    if (c_account >= 1000) {
                        c_account -= 10000;
                        letter();
                        System.out.println("Transaction Successful");
                    } else {

                        System.out.println("Insufficient Fund!!");
                    }
                    break;
                case 2:
                    if (c_account >= 1000) {
                        letter();
                        c_account -= 20000;
                        System.out.println("Transaction Successful");
                    } else {
                        System.out.println("Insufficient Fund!!");
                    }
                    break;
                case 3:
                    if (c_account >= 1000) {
                        c_account -= 30000;
                        letter();
                        System.out.println("Transaction Successful");
                    } else {
                        System.out.println("Insufficient Fund!!");
                    }
                    break;
                case 4:
                    if (c_account >= 1000) {
                        c_account -= 40000;
                        letter();
                        System.out.println("Transaction Successful");
                    } else {
                        System.out.println("Insufficient Fund!!");
                    }
                    break;
                case 5:
                    if (c_account >= 1000) {
                        c_account -= 50000;
                        letter();
                        System.out.println("Transaction Successful");
                    } else {
                        System.out.println("Insufficient Fund!!");
                    }
                    break;
                case 6://change this later
                    amount();
                    break;
                default:
                    System.out.println("not good");
            }

        }
        private static void cashTranaction2(){

            for (; ; ) {
                System.out.print("\n1. Deposite" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  2. Withdrawal " + "\n\n\n\n\n\n");
                System.out.print("3. Check balance  " + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t  4. Pay bills  " + "\n\n\n\n\n\n");
                System.out.print("5. Transfer  " + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  6. Others  " + "\n\n\n\n\n\n");
                System.out.print("0. Exit " + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  0. Cancel  " + "\n\n\n\n\n\n");
                System.out.print("\t\t\t\t\t\t\t\t\t\t");
                a = input.nextInt();
                clearScreen();

                switch (a) {
                    case 1:
                        current_deposite();
                        break;
                    case 2:
                        current_Withdrawal();
                        break;
                    case 3:
                        checkBalance();
                        break;
                    case 4:
                        paybill();
                        break;
                    case 5:
                        transfer();
                        break;
                    case 6:
                        System.out.println("OOps, The Option You Chose Is Not Currently Avaliable For The Moment,Please Try Again Letter");
                        break;
                    case 0:
                        welcMsg();
                    default:
                        System.out.println("The Number Entered Is Invalid");
                }
                System.out.println("\n\nDo You Want to perform Another Transaction...." + "(Y/N)\n\n");
                System.out.print("\t\t\t\t\t\t\t\t\t\t");
                b = input.next();
                clearScreen();

                switch (b) {
                    case "y":
                        continue;
                    case "n":
                        welcMsg(); //to go back to welcmsg 2
                        break;
                    case "Y":
                        continue;
                    case "N":
                        welcMsg();
                        break;
                    default:
                        System.out.println("Please Enter A Valid Character");
                        cashTranaction();
                }
            }
        }
    }
