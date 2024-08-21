
//import org.apache.commons.lang3.RandomStringUtils;
public class GenerateRandomString {
public static String getRandomNumber(int numberLength) {
    // Calculate the upper limit based on the number of digits
    int upperLimit = (int) Math.pow(10, numberLength);

    // Generate a random number in the range [0, upperLimit)
    int randomNumber = (int) (Math.random() * upperLimit);
    System.out.println(upperLimit);

    // Convert to String
    return String.valueOf(randomNumber);
}

   
        public static void main(String[] args) {
            // Generate a random alphanumeric string of length 10
            //String randomString = RandomStringUtils.randomAlphanumeric(10);
          //  System.out.println("Random Alphanumeric String: " + randomString);
         //   System.out.println(u);
            System.out.println(getRandomNumber(2));

            
        }
    }