public class Main {
    public static void main(String[] args) {
        int credBal = 5000;
        double interestOne = 0;
        double interestTwo = 0;
        interestOne = credBal+(credBal*.17);
        interestTwo = interestOne+(interestOne*.17);
        System.out.println("Your initial balance is "+credBal);
        System.out.println("Your balance after one month is "+interestOne);
        System.out.println("Your balance after two months is "+interestTwo);
    }
}