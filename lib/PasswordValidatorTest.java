package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("------ Running Password Validator Tests ------");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        PasswordStrength result1 = PasswordValidator.validate("123");
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result1);
        }

        // Test Case 2 : รหัสผ่านเป็น ตัวพิมพ์เล็ก, ตัวพิมพ์ใหญ่, ตัวเลข, อักษรพิเศษ อย่างใดอย่างหนึ่ง จะเป็น WEAK
        PasswordStrength result2 = PasswordValidator.validate("baiimonn");
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 Passed: Short password is WEAK.");
        } else {
            System.out.println("Test Case 2 FAILED: Expected INVALID but got " + result2);
        }

        // Test Case 3 : รหัสผ่านเป็น ตัวพิมพ์เล็ก, ตัวพิมพ์ใหญ่, ตัวเลข, อักษรพิเศษ 2อย่าง จะเป็น MEDIUM
        PasswordStrength result3 = PasswordValidator.validate("BaiiMonn");
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 Passed: Short password is MEDIUM.");
        } else {
            System.out.println("Test Case 3 FAILED: Expected INVALID but got " + result3);
        }

        // Test Case 3 : รหัสผ่านเป็น ตัวพิมพ์เล็ก, ตัวพิมพ์ใหญ่, ตัวเลข, อักษรพิเศษ มากกว่า3อย่าง จะเป็น STRONG
        PasswordStrength result4 = PasswordValidator.validate("BaiiMon123#");
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 Passed: Short password is STRONG.");
        } else {
            System.out.println("Test Case 4 FAILED: Expected INVALID but got " + result4);
        }





        System.out.println("----------------------------------------------");
    }
}
