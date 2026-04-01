import javax.swing.JOptionPane;

public class bai2_2_5 {
    public static void main(String[] args) {
        String chuoiSo1 = JOptionPane.showInputDialog(null, 
            "Vui lòng nhập số thứ nhất: ", "Nhập dữ liệu", 
            JOptionPane.INFORMATION_MESSAGE);
            
        String chuoiSo2 = JOptionPane.showInputDialog(null, 
            "Vui lòng nhập số thứ hai: ", "Nhập dữ liệu", 
            JOptionPane.INFORMATION_MESSAGE);

        double so1 = Double.parseDouble(chuoiSo1);
        double so2 = Double.parseDouble(chuoiSo2);

        double tong = so1 + so2;
        double hieu = so1 - so2;
        double tich = so1 * so2;
        
        String thongBao = "Kết quả của " + so1 + " và " + so2 + ":\n" +
                          "Tổng: " + tong + "\n" +
                          "Hiệu: " + hieu + "\n" +
                          "Tích: " + tich + "\n";

        if (so2 != 0) {
            double thuong = so1 / so2;
            thongBao += "Thương: " + thuong;
        } else {
            thongBao += "Thương: Không thể chia cho số 0!";
        }

        JOptionPane.showMessageDialog(null, thongBao, 
            "Kết quả tính toán", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}