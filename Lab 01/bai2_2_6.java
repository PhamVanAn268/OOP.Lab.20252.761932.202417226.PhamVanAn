import javax.swing.JOptionPane;

public class bai2_2_6 {
    public static void main(String[] args) {
        String[] luachon = {"PT bậc nhất 1 ẩn", "Hệ PT bậc nhất 2 ẩn", "PT bậc hai 1 ẩn"};
        int loaipt = JOptionPane.showOptionDialog(null, "Chọn loại phương trình:",
                "Giải phương trình", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, luachon, luachon[0]);

        if (loaipt == 0) {
            giaiptbacnhat();
        } else if (loaipt == 1) {
            giaiheptbacnhat();
        } else if (loaipt == 2) {
            giaiptbachai();
        }
        System.exit(0);
    }

    public static void giaiptbacnhat() {
        String chua = JOptionPane.showInputDialog("Nhập a (ax + b = 0):");
        String chuob = JOptionPane.showInputDialog("Nhập b (ax + b = 0):");

        double a = Double.parseDouble(chua);
        double b = Double.parseDouble(chuob);

        if (a == 0) {
            if (b == 0) {
                JOptionPane.showMessageDialog(null, "Vô số nghiệm.");
            } else {
                JOptionPane.showMessageDialog(null, "Vô nghiệm.");
            }
        } else {
            double nghiem = -b / a;
            JOptionPane.showMessageDialog(null, "x = " + nghiem);
        }
    }

    public static void giaiheptbacnhat() {
        double a11 = Double.parseDouble(JOptionPane.showInputDialog("a11:"));
        double a12 = Double.parseDouble(JOptionPane.showInputDialog("a12:"));
        double b1 = Double.parseDouble(JOptionPane.showInputDialog("b1:"));
        double a21 = Double.parseDouble(JOptionPane.showInputDialog("a21:"));
        double a22 = Double.parseDouble(JOptionPane.showInputDialog("a22:"));
        double b2 = Double.parseDouble(JOptionPane.showInputDialog("b2:"));

        double d = a11 * a22 - a21 * a12;
        double d1 = b1 * a22 - b2 * a12;
        double d2 = a11 * b2 - a21 * b1;

        if (d != 0) {
            double x1 = d1 / d;
            double x2 = d2 / d;
            JOptionPane.showMessageDialog(null, "x1 = " + x1 + ", x2 = " + x2);
        } else {
            if (d1 == 0 && d2 == 0) {
                JOptionPane.showMessageDialog(null, "Vô số nghiệm.");
            } else {
                JOptionPane.showMessageDialog(null, "Vô nghiệm.");
            }
        }
    }

    public static void giaiptbachai() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("a (ax^2 + bx + c = 0):"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("c:"));

        if (a == 0) {
            if (b == 0) {
                if (c == 0) JOptionPane.showMessageDialog(null, "Vô số nghiệm.");
                else JOptionPane.showMessageDialog(null, "Vô nghiệm.");
            } else {
                JOptionPane.showMessageDialog(null, "x = " + (-c / b));
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                JOptionPane.showMessageDialog(null, "x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                JOptionPane.showMessageDialog(null, "x = " + (-b / (2 * a)));
            } else {
                JOptionPane.showMessageDialog(null, "Vô nghiệm.");
            }
        }
    }
}