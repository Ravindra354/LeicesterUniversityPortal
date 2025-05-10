//
//package university.management.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import com.toedter.calendar.JDateChooser;
//
//public class main_class extends JFrame implements ActionListener {
//    main_class(){
//
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/third.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(1540,750, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel img = new JLabel(i3);
//        add(img);
//
//        JMenuBar mb = new JMenuBar();
//
//        // new Information
//
//        JMenu newInfo = new JMenu("New Information");
//        newInfo.setForeground(Color.BLACK);
//        mb.add(newInfo);
//
//        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
//        facultyInfo.setBackground(Color.WHITE);
//        facultyInfo.addActionListener(this);
//        newInfo.add(facultyInfo);
//
//        JMenuItem studentInfo = new JMenuItem("New Student Information");
//        studentInfo.setBackground(Color.WHITE);
//        studentInfo.addActionListener(this);
//        newInfo.add(studentInfo);
//
//        // Details
//
//        JMenu details = new JMenu("View Details");
//        details.setForeground(Color.BLACK);
//        details.addActionListener(this);
//        mb.add(details);
//
//        JMenuItem facultydetails = new JMenuItem("View Faculty Details");
//        facultydetails.setBackground(Color.WHITE);
//        facultydetails.addActionListener(this);
//        details.add(facultydetails);
//
//        JMenuItem studentdetails = new JMenuItem("View Student Details");
//        studentdetails.setBackground(Color.WHITE);
//        studentdetails.addActionListener(this);
//        details.add(studentdetails);
//
//        // Leave
//        JMenu leave = new JMenu("Apply Leave");
//        leave.setForeground(Color.BLACK);
//        leave.addActionListener(this);
//        mb.add(leave);
//
//        JMenuItem facultyLeave = new JMenuItem("Faculty Leave");
//        facultyLeave.setBackground(Color.WHITE);
//        facultyLeave.addActionListener(this);
//        leave.add(facultyLeave);
//
//        JMenuItem studentLeave = new JMenuItem("Student Leave");
//        studentLeave.setBackground(Color.WHITE);
//        studentLeave.addActionListener(this);
//        leave.add(studentLeave);
//
//        // Leave Details
//        JMenu leaveDetails = new JMenu("Leave Details");
//        leaveDetails.setForeground(Color.BLACK);
//        studentdetails.addActionListener(this);
//        mb.add(leaveDetails);
//
//        JMenuItem facultyleaveDetails = new JMenuItem("Faculty Leave Details");
//        facultyleaveDetails.setBackground(Color.WHITE);
//        facultyleaveDetails.addActionListener(this);
//        leaveDetails.add(facultyleaveDetails);
//
//        JMenuItem studentleaveDetails = new JMenuItem("Student Leave Details");
//        studentleaveDetails.setBackground(Color.WHITE);
//        studentleaveDetails.addActionListener(this);
//        leaveDetails.add(studentleaveDetails);
//
//        // Exams
//        JMenu exam = new JMenu("Examination");
//        exam.setForeground(Color.BLACK);
//        exam.addActionListener(this);
//        mb.add(exam);
//
//        JMenuItem ExaminationDetails = new JMenuItem("Examination Results");
//        ExaminationDetails.setBackground(Color.WHITE);
//        ExaminationDetails.addActionListener(this);
//        exam.add(ExaminationDetails);
//
//        JMenuItem EnterMarks = new JMenuItem("Enter Marks");
//        EnterMarks.setBackground(Color.WHITE);
//        EnterMarks.addActionListener(this);
//        exam.add(EnterMarks);
//
//        // update Info
//
//        JMenu updateInfo = new JMenu("Update Details");
//        updateInfo.setForeground(Color.BLACK);
//        updateInfo.addActionListener(this);
//        mb.add(updateInfo);
//
//        JMenuItem updatefacultyinfo = new JMenuItem("Update Faculty Details");
//        updatefacultyinfo.setBackground(Color.WHITE);
//        updatefacultyinfo.addActionListener(this);
//        updateInfo.add(updatefacultyinfo);
//
//        JMenuItem updatestudentinfo = new JMenuItem("Update Student Details");
//        updatestudentinfo.setBackground(Color.WHITE);
//        updatestudentinfo.addActionListener(this);
//        updateInfo.add(updatestudentinfo);
//
//        // fee
//
//        JMenu fee = new JMenu("Fee Details");
//        fee.setForeground(Color.BLACK);
//        fee.addActionListener(this);
//        mb.add(fee);
//
//        JMenuItem feestructure = new JMenuItem("Fee Structure");
//        feestructure.setBackground(Color.WHITE);
//        feestructure.addActionListener(this);
//        fee.add(feestructure);
//
//        JMenuItem feeForm = new JMenuItem("Student Fee Form");
//        feeForm.setBackground(Color.WHITE);
//        feeForm.addActionListener(this);
//        fee.add(feeForm);
//
//        // utility
//        JMenu utility = new JMenu("Utility");
//        utility.setForeground(Color.BLACK);
//
//        mb.add(utility);
//
//        JMenuItem ca = new JMenuItem("Calculator");
//        ca.setBackground(Color.WHITE);
//        ca.addActionListener(this);
//        utility.add(ca);
//
//        JMenuItem Notepad = new JMenuItem("Notepad");
//        Notepad.setBackground(Color.WHITE);
//        Notepad.addActionListener(this);
//        utility.add(Notepad);
//
//        // about
//
//        JMenu about = new JMenu("About");
//        about.setForeground(Color.BLACK);
//        mb.add(about);
//
//        JMenuItem About = new JMenuItem("About");
//        About.setBackground(Color.WHITE);
//        About.addActionListener(this);
//        about.add(About);
//
//        // exit
//
//        JMenu exit = new JMenu("Exit");
//        exit.setForeground(Color.BLACK);
//        mb.add(exit);
//
//        JMenuItem Exit = new JMenuItem("Exit");
//        Exit.setBackground(Color.WHITE);
//        Exit.addActionListener(this);
//        exit.add(Exit);
//
//        setJMenuBar(mb);
//
//
//        setSize(1540,850);
//        setVisible(true);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        String sm = e.getActionCommand();
//        if (sm.equals("Exit")){
//            System.exit(15);
//        } else if (sm.equals("Calculator")){
//            try {
//                Runtime.getRuntime().exec("calc.exe");
//            }catch (Exception E){
//                E.printStackTrace();
//            }
//        } else if (sm.equals("Notepad")) {
//            try {
//                Runtime.getRuntime().exec("notepad.exe");
//            }catch (Exception E){
//                E.printStackTrace();
//            }
//        } else if (sm.equals("New Faculty Information")) {
//            new AddFaculty();
//        }else if (sm.equals("New Student Information")){
//            new AddStudent();
//        } else if (sm.equals("View Faculty Details")) {
//            new TeacherDetails();
//        } else if (sm.equals("View Student Details")) {
//            new StudentDetails();
//        } else if (sm.equals("Faculty Leave")) {
//            new TeacherLeave();
//        } else if (sm.equals("Student Leave")) {
//            new StudentLeave();
//        } else if (sm.equals("Faculty Leave Details")) {
//            new TeacherLeaveDetails();
//        } else if (sm.equals("Student Leave Details")) {
//            new StudentLeaveDetails();
//        } else if (sm.equals("Update Faculty Details")) {
//            new UpdateTeacher();
//        } else if (sm.equals("Update Student Details")) {
//            new updateStudent();
//        } else if (sm.equals("Enter Marks")) {
//            new EnterMarks();
//        } else if (sm.equals("Examination Results")) {
//            new ExaminationDetails();
//        } else if (sm.equals("Fee Structure")) {
//            new FreeStructure();
//        }else if (sm.equals("Student Fee Form")){
//            new StudentFeeForm();
//        } else if (sm.equals("About")) {
//            new About();
//        }
//
//
//    }
//
//    public static void main(String[] args) {
//        new main_class();
//    }
//}



package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class main_class extends JFrame implements ActionListener {

    JMenuBar mb;

    public main_class() {
        // Set layout to null for custom positioning
        setLayout(null);

        // Background Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1540, 850, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel background = new JLabel(i3);
        background.setBounds(0, 0, 1540, 850);
        add(background);

        // Heading
        JLabel heading = new JLabel("Leicester University");
        heading.setBounds(500, 30, 800, 70);
        heading.setFont(new Font("Serif", Font.BOLD, 48));
        heading.setForeground(Color.BLACK);
        background.add(heading);

        JLabel subHeading = new JLabel("Where dreams turn into reality");
        subHeading.setBounds(530, 90, 800, 40);
        subHeading.setFont(new Font("Serif", Font.ITALIC, 26));
        subHeading.setForeground(Color.DARK_GRAY);
        background.add(subHeading);


        // Menu Bar
        mb = new JMenuBar();
        mb.setBackground(Color.WHITE);

        Font menuFont = new Font("SansSerif", Font.BOLD, 16);

        // Menus
        JMenu newInfo = new JMenu("New Information");
        newInfo.setFont(menuFont);
        newInfo.setForeground(Color.BLACK);

        JMenu details = new JMenu("View Details");
        details.setFont(menuFont);
        details.setForeground(Color.BLACK);

        JMenu leave = new JMenu("Apply Leave");
        leave.setFont(menuFont);
        leave.setForeground(Color.BLACK);

        JMenu leaveDetails = new JMenu("Leave Details");
        leaveDetails.setFont(menuFont);
        leaveDetails.setForeground(Color.BLACK);

        JMenu exam = new JMenu("Examination");
        exam.setFont(menuFont);
        exam.setForeground(Color.BLACK);

        JMenu updateInfo = new JMenu("Update Details");
        updateInfo.setFont(menuFont);
        updateInfo.setForeground(Color.BLACK);

        JMenu fee = new JMenu("Fee Details");
        fee.setFont(menuFont);
        fee.setForeground(Color.BLACK);

        JMenu utility = new JMenu("Utility");
        utility.setFont(menuFont);
        utility.setForeground(Color.BLACK);

        JMenu about = new JMenu("About");
        about.setFont(menuFont);
        about.setForeground(Color.BLACK);

        JMenu exit = new JMenu("Exit");
        exit.setFont(menuFont);
        exit.setForeground(Color.BLACK);

        // Menu Items with Styling
        styleAndAdd(newInfo, "New Faculty Information");
        styleAndAdd(newInfo, "New Student Information");

        styleAndAdd(details, "View Faculty Details");
        styleAndAdd(details, "View Student Details");

        styleAndAdd(leave, "Faculty Leave");
        styleAndAdd(leave, "Student Leave");

        styleAndAdd(leaveDetails, "Faculty Leave Details");
        styleAndAdd(leaveDetails, "Student Leave Details");

        styleAndAdd(exam, "Examination Results");
        styleAndAdd(exam, "Enter Marks");

        styleAndAdd(updateInfo, "Update Faculty Details");
        styleAndAdd(updateInfo, "Update Student Details");

        styleAndAdd(fee, "Fee Structure");
        styleAndAdd(fee, "Student Fee Form");

        styleAndAdd(utility, "Calculator");
        styleAndAdd(utility, "Notepad");

        styleAndAdd(about, "About");
        styleAndAdd(exit, "Exit");

        // Add menus to menubar
        mb.add(newInfo);
        mb.add(details);
        mb.add(leave);
        mb.add(leaveDetails);
        mb.add(exam);
        mb.add(updateInfo);
        mb.add(fee);
        mb.add(utility);
        mb.add(about);
        mb.add(exit);

        setJMenuBar(mb);

        setSize(1540, 850);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Helper method for styling JMenuItems
    private void styleAndAdd(JMenu menu, String title) {
        JMenuItem item = new JMenuItem(title);
        item.setFont(new Font("SansSerif", Font.PLAIN, 14));
        item.setForeground(Color.BLACK);
        item.setBackground(Color.WHITE);
        item.setOpaque(true);
        item.addActionListener(this);

        // Hover effect
        item.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                item.setBackground(Color.BLACK);
                item.setForeground(Color.WHITE);
            }

            public void mouseExited(MouseEvent evt) {
                item.setBackground(Color.WHITE);
                item.setForeground(Color.BLACK);
            }
        });

        menu.add(item);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String sm = e.getActionCommand();
        switch (sm) {
            case "Exit":
                System.exit(0);
                break;
            case "Calculator":
                try {
                    Runtime.getRuntime().exec("calc.exe");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                break;
            case "Notepad":
                try {
                    Runtime.getRuntime().exec("notepad.exe");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                break;
            case "New Faculty Information":
                new AddFaculty();
                break;
            case "New Student Information":
                new AddStudent();
                break;
            case "View Faculty Details":
                new TeacherDetails();
                break;
            case "View Student Details":
                new StudentDetails();
                break;
            case "Faculty Leave":
                new TeacherLeave();
                break;
            case "Student Leave":
                new StudentLeave();
                break;
            case "Faculty Leave Details":
                new TeacherLeaveDetails();
                break;
            case "Student Leave Details":
                new StudentLeaveDetails();
                break;
            case "Update Faculty Details":
                new UpdateTeacher();
                break;
            case "Update Student Details":
                new updateStudent();
                break;
            case "Enter Marks":
                new EnterMarks();
                break;
            case "Examination Results":
                new ExaminationDetails();
                break;
            case "Fee Structure":
                new FreeStructure();
                break;
            case "Student Fee Form":
                new StudentFeeForm();
                break;
            case "About":
                new About();
                break;
        }
    }

    public static void main(String[] args) {
        new main_class();
    }
}


