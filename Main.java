import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // Yêu cầu người dùng nhập vào một số nguyên
            System.out.print("Nhập vào một số nguyên (nhập 'q' để thoát): ");
            String userInput = scanner.nextLine();
            
            // Kiểm tra nếu người dùng muốn thoát khỏi chương trình
            if (userInput.equalsIgnoreCase("q")) {
                System.out.println("Đã thoát khỏi chương trình.");
                break;
            }
            
            // Chuyển đổi chuỗi người dùng nhập vào thành số nguyên
            try {
                int number = Integer.parseInt(userInput);
                
                // Kiểm tra xem số nhập vào có phải là số chẵn hay số lẻ
                if (number % 2 == 0) {
                    System.out.println(number + " là số chẵn.");
                } else {
                    System.out.println(number + " là số lẻ.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Đây không phải là một số nguyên hợp lệ.");
            }
        }
        
        scanner.close();
    }
}
