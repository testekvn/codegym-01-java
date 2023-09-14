package Buoi_12.Bai1;

public class NguyenAm {
    public static void main(String[] args) {
        String str = "Software testing is the process of evaluating and verifying that a software product or application does what it is supposed to do.";
        int nguyenAmA = 0;
        int nguyenAmE = 0;
        int nguyenAmI = 0;
        int nguyenAmO = 0;
        int nguyenAmU = 0;
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a') {
                nguyenAmA++;
            }
            if(ch =='e'){
                nguyenAmE++;
            }if(ch =='i'){
                nguyenAmI++;
            }if(ch =='o'){
                nguyenAmO++;
            }if(ch =='u'){
                nguyenAmU++;
            }

        }
        System.out.println("Số lượng nguyên âm a trong chuỗi: " + nguyenAmA);
        System.out.println("Số lượng nguyên âm e trong chuỗi: " + nguyenAmE);
        System.out.println("Số lượng nguyên âm i trong chuỗi: " + nguyenAmI);
        System.out.println("Số lượng nguyên âm o trong chuỗi: " + nguyenAmO);
        System.out.println("Số lượng nguyên âm u trong chuỗi: " + nguyenAmU);
        System.out.println("Tổng số nguyên âm trong chuỗi là: "+(nguyenAmA+nguyenAmE+nguyenAmI+nguyenAmO+nguyenAmU));
    }
}
