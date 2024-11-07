package JDBC_java;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Frame extends JFrame {
    private JTextField txtMaSV, txtHoTen, txtLop, txtGPA;
    private JTable tableSinhVien;
    private JButton btnHienThi, btnThem, btnCapNhat, btnXoa, btnReset;
    private DefaultTableModel tableModel;

    public Frame() {
        setTitle("Quản lý sinh viên");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelMain = new JPanel(new BorderLayout());

        JPanel panelInput = new JPanel(new GridLayout(4, 2, 10, 10));
        panelInput.setBorder(BorderFactory.createTitledBorder("Thông tin sinh viên"));

        panelInput.add(new JLabel("Mã SV:"));
        txtMaSV = new JTextField();
        panelInput.add(txtMaSV);

        panelInput.add(new JLabel("Họ Tên:"));
        txtHoTen = new JTextField();
        panelInput.add(txtHoTen);

        panelInput.add(new JLabel("Lớp:"));
        txtLop = new JTextField();
        panelInput.add(txtLop);

        panelInput.add(new JLabel("GPA:"));
        txtGPA = new JTextField();
        panelInput.add(txtGPA);

        panelMain.add(panelInput, BorderLayout.NORTH);

        tableModel = new DefaultTableModel(new String[]{"Mã SV", "Họ Tên", "Lớp", "GPA"}, 0);
        tableSinhVien = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(tableSinhVien);
        panelMain.add(scrollPane, BorderLayout.CENTER);

        JPanel panelButtons = new JPanel(new GridLayout(1, 5, 10, 0));
        btnHienThi = new JButton("Hiển Thị");
        btnThem = new JButton("Thêm");
        btnCapNhat = new JButton("Cập Nhật");
        btnXoa = new JButton("Xóa");
        btnReset = new JButton("Reset");

        panelButtons.add(btnHienThi);
        panelButtons.add(btnThem);
        panelButtons.add(btnCapNhat);
        panelButtons.add(btnXoa);
        panelButtons.add(btnReset);

        panelMain.add(panelButtons, BorderLayout.SOUTH);

        add(panelMain);

        Database db = new Database();

        btnHienThi.addActionListener(e -> displayData(db));
        btnThem.addActionListener(e -> addStudent(db));
        tableSinhVien.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                int row = tableSinhVien.getSelectedRow();
                if (row >= 0) {
                    txtMaSV.setText(tableModel.getValueAt(row, 0).toString());
                    txtHoTen.setText(tableModel.getValueAt(row, 1).toString());
                    txtLop.setText(tableModel.getValueAt(row, 2).toString());
                    txtGPA.setText(tableModel.getValueAt(row, 3).toString());
                }
            }
        });
        btnCapNhat.addActionListener(e -> updateStudent(db));
        btnXoa.addActionListener(e -> deleteStudent(db));
        btnReset.addActionListener(e -> resetFields());
    }

    private void displayData(Database db) {
        try (Connection conn = db.getConnection()) {
            String query = "SELECT * FROM SinhVien";
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            tableModel.setRowCount(0);

            while (rs.next()) {
                tableModel.addRow(new Object[]{
                        rs.getString("student_id"),
                        rs.getString("name"),
                        rs.getString("class_name"),
                        rs.getFloat("GPA")
                });
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Lỗi hiển thị dữ liệu: " + ex.getMessage());
        }
    }

    private void addStudent(Database db) {
        try (Connection conn = db.getConnection()) {
            String student_id = txtMaSV.getText();
            String name = txtHoTen.getText();
            String class_name = txtLop.getText();
            String gpaText = txtGPA.getText();

            if (student_id.isEmpty() || name.isEmpty() || class_name.isEmpty() || gpaText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin.");
                return;
            }

            float gpa = Float.parseFloat(gpaText);

            String query = "INSERT INTO SinhVien (student_id, name, class_name, GPA) VALUES (?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, student_id);
            pst.setString(2, name);
            pst.setString(3, class_name);
            pst.setFloat(4, gpa);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Thêm mới thành công.");
            displayData(db);
        } catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(this, "Mã SV đã tồn tại.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Lỗi thêm dữ liệu: " + ex.getMessage());
        }
    }

    private void updateStudent(Database db) {
        try (Connection conn = db.getConnection()) {
            String student_id = txtMaSV.getText();
            String name = txtHoTen.getText();
            String class_name = txtLop.getText();
            String gpaText = txtGPA.getText();

            if (student_id.isEmpty() || name.isEmpty() || class_name.isEmpty() || gpaText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin.");
                return;
            }

            float gpa = Float.parseFloat(gpaText);

            String query = "UPDATE SinhVien SET name = ?, class_name = ?, GPA = ? WHERE student_id = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, name);
            pst.setString(2, class_name);
            pst.setFloat(3, gpa);
            pst.setString(4, student_id);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Cập nhật thành công.");
            displayData(db);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Lỗi cập nhật dữ liệu: " + ex.getMessage());
        }
    }

    private void deleteStudent(Database db) {
        try (Connection conn = db.getConnection()) {
            String student_id = txtMaSV.getText();

            String query = "DELETE FROM SinhVien WHERE student_id = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, student_id);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Xóa thành công.");
            displayData(db);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Lỗi xóa dữ liệu: " + ex.getMessage());
        }
    }

    private void resetFields() {
        txtMaSV.setText("");
        txtHoTen.setText("");
        txtLop.setText("");
        txtGPA.setText("");
    }
}
