public class Main {
    public static void main(String[] args) {
        System.out.println("your otp is : " + generateOtp());

    }
    public static String generateOtp(){
        int randomPin = (int) (Math.random() * 9000) + 1000;
        return String.valueOf( randomPin );
    }
}