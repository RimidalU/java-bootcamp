// Exception - runtime error:

// https://www.geeksforgeeks.org/exceptions-in-java/

// 1.checked (Exception by compiler)
// 2.unchecked (Exception checked by JVM)

// 1.Build-In Exception
// 2. User Exception

// create

import java.io.IOException;

class ExceptionHandling extends Exception {

    ExceptionHandling(String error) {
        super(error);
    }

    public static void main(String[] args) throws Exception {

        boolean check = true;
        try {
            if (check) {
                ExceptionHandling myException = new ExceptionHandling("Error!");
                throw myException;
            } else {
                throw new Exception("Exception");
            }

        } catch (ExceptionHandling myException) {
            myException.printStackTrace();
        } catch (Exception exception) {
            System.out.println(exception);
        } finally {
            System.out.println("I am finally block!");
        }
    }

    // Handing exception

}