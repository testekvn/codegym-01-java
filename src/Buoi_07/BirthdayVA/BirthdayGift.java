package Buoi_07.BirthdayVA;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class BirthdayGift {

    public static void main(String[] args) {
        // Khởi tạo số tiền ban đầu của V.Anh là 1 triệu
        int money = 1000000;
        // Khởi tạo đối tượng Random để sinh số ngẫu nhiên
        Random random = new Random();
        // Khởi tạo một map để lưu số tiền mà V.Anh nhận được hàng năm
        Map<Integer, Integer> map = new HashMap<>();
        // Lặp từ năm 2001 đến năm 2021
        for (int year = 2001; year <= 2021; year++) {
            // Tính tuổi của V.Anh vào năm hiện tại
            int age = year - 2001;
            // Nếu tuổi của V.Anh là số chẵn
            if (age % 2 == 0 && age > 0) {
                // Sinh số tiền mà V.Anh được tặng sinh nhật ngẫu nhiên trong khoảng từ 1 triệu đến 10 triệu
                int gift = random.nextInt(9000000) + 1000000;
                // Cộng số tiền tặng vào số tiền hiện có của V.Anh
                money += gift;
                // Lưu số tiền tặng vào map với key là năm và value là số tiền
                map.put(year, gift);
            }
        }
        // In ra thông tin số tiền mà V.Anh được tặng hàng năm
        System.out.println("Số tiền mà V.Anh được tặng hàng năm là:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Năm " + entry.getKey() + ": " + entry.getValue() + " đồng");
        }
        // In ra thông tin số tiền hiện có của V.Anh sau 10 năm
        System.out.println("Số tiền hiện có của V.Anh sau 10 năm là: " + money + " đồng");
    }
}