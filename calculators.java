public class calculators {
        public static void main(String[] args) {
            int principal = 1200; // principal amount
            int ratePer100 = 6; //  rate: $6 per $100
            int months = 15; //   months

            // Call static method
            int methodStatic = calculateInterestStatic(principal, ratePer100, months);
            System.out.println("Interest amount for " + months + " months (static): $" + methodStatic);
            calculators calculator = new calculators();
            // Call non-static method
            int methodNonStatic = calculator.calculateInterestNonStatic(principal, ratePer100, months);
            System.out.println("Interest amount for " + months + " months (non-static): $" + methodNonStatic);
        }

        // Static method
        public static int calculateInterestStatic(int principal, int ratePer100, int months) {

            int yearlyRate = (principal / 100) * ratePer100;

return yearlyRate;
        }

        // Non-static method
        public int calculateInterestNonStatic(int principal, int ratePer100, int months) {

            int yearlyRate = (principal / 100) * ratePer100;
            return yearlyRate;
        }


}
