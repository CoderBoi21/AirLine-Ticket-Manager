import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

class ui {
    //global declaration for details
    JTextField t_fname, t_lname, t_acc_no, t_mob;
    JRadioButton rb1, rb2;
    String[] nationality = {"Select Nationality", "North Korea", "Turkmenistan", "Tajikistan", "Azerbaijan"};
    JComboBox list_nationality = new JComboBox<>(nationality);
    String[] gender = {"Select a state", "Male", "Female", "Trans", "Others"};
    JComboBox list_gender = new JComboBox<>(gender);

    Client TempClient;
    ArrayList<Client> dataList;

    ui(ArrayList<Client> dataList){
        this.dataList = dataList;
        TempClient = new Client();
        // TempClient = new Client("undefined","undefined");
    }

    public void frame1() {
        //elements declaration
        JFrame f1 = new JFrame("Oasis Vacation");
        JTextField tf_id;
        JPasswordField pf_pass;
        JLabel l_id, l_pass;
        JButton b_login = new JButton("Login");
        JButton b_signup = new JButton("SignUp");

        //background
        f1.setContentPane(new JLabel(new ImageIcon("ab(1).jpg")));

        //labels
        l_id = new JLabel("User ID: ");
        l_pass = new JLabel("Password: ");
        l_id.setBounds(450, 300, 100, 50);
        l_pass.setBounds(450, 350, 100, 50);
        l_id.setForeground(Color.WHITE);
        l_pass.setForeground(Color.WHITE);

        //text field
        tf_id = new JTextField("");
        pf_pass = new JPasswordField();
        tf_id.setBounds(610, 315, 100, 25);
        pf_pass.setBounds(610, 365, 100, 25);

        //button
        b_login.setBounds(450, 410, 100, 50);
        b_login.setVisible(true);

        b_login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (tf_id.getText().hashCode() == 0 || pf_pass.getText().hashCode() == 0) {
                    System.out.println("Field can not be Empty");
                    JOptionPane.showMessageDialog(null, "Fields are empty!");
                }else if (tf_id.getText().equals("meet") && pf_pass.getText().equals("123")) {
                    f1.setVisible(false);
                    frame3();
                }
                else if (tf_id.getText().equals("user") && pf_pass.getText().equals("456")) {
                    f1.setVisible(false);
                    frame3();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Invalid Credentials!");
                }
            }
        });

        b_signup.setBounds(600, 410, 100, 50);
        b_signup.setVisible(true);

        b_signup.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f1.setVisible(false);
                frame2();
            }
        });

        //adding elements
        f1.add(l_id);
        f1.add(l_pass);
        f1.add(tf_id);
        f1.add(pf_pass);
        f1.add(b_login);
        f1.add(b_signup);
        f1.setVisible(true);
        f1.setResizable(false);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setBounds(180, 25, 1200, 800);
    }

    public void frame2() {
        JFrame f2 = new JFrame("Oasis Vacations");
        JLabel l_fname, l_lname, l_adr_no, l_mob, l_nat, l_gdr, l_ar_cmpy;
        JButton b_next;
        JLabel bt_right = new JLabel(new ImageIcon("Raising_Standards(4).png"));

        //background
        f2.setContentPane(new JLabel(new ImageIcon("ad(2).png")));

        //labels
        bt_right.setBounds(10,75,475,600);
        l_fname = new JLabel("First Name : ");
        l_fname.setBounds(500, 50, 75, 50);
        l_lname = new JLabel("Last  Name : ");
        l_lname.setBounds(500, 100, 75, 50);
        l_adr_no = new JLabel("Aadhar number : ");
        l_adr_no.setBounds(500, 150, 110, 50);
        l_ar_cmpy = new JLabel("Airline Company : ");
        l_ar_cmpy.setBounds(500, 200, 150, 50);
        l_mob = new JLabel("Mobile Number : ");
        l_mob.setBounds(500, 300, 100, 50);
        l_nat = new JLabel("Nationality : ");
        l_nat.setBounds(500, 350, 75, 50);
        l_gdr = new JLabel("Gender : ");
        l_gdr.setBounds(500, 450, 75, 50);
        JLabel l_ref = new JLabel("Reference :");
        l_ref.setBounds(500,520,100,50);

        l_fname.setForeground(Color.WHITE);
        l_lname.setForeground(Color.WHITE);
        l_adr_no.setForeground(Color.WHITE);
        l_ar_cmpy.setForeground(Color.WHITE);
        l_mob.setForeground(Color.WHITE);
        l_nat.setForeground(Color.WHITE);
        l_gdr.setForeground(Color.WHITE);
        l_ref.setForeground(Color.WHITE);

        //text-field
        t_fname = new JTextField("");
        t_fname.setBounds(625, 65, 100, 25);
        t_lname = new JTextField("");
        t_lname.setBounds(625, 115, 100, 25);
        t_acc_no = new JTextField("");
        t_acc_no.setBounds(625, 165, 100, 25);
        t_mob = new JTextField("");
        t_mob.setBounds(625, 315, 100, 25);


        //List
        DefaultListModel<String> l = new DefaultListModel<>();
        l.addElement("Friends");
        l.addElement("Advertisement");
        l.addElement("Others");
        JList<String> list = new JList<>(l);
        list.setBounds(625 ,535, 125,75);

        //checkbox
        JCheckBox checkbox1 = new JCheckBox("I give my consent to use the given details for future use.");
        checkbox1.setFont(new Font("monotype corsiva",Font.BOLD,20));
        checkbox1.setBounds(500,620,450,50);

        //radio-button
        rb1 = new JRadioButton("Emirates");
        rb2 = new JRadioButton("Etihad");
        rb1.setBounds(500, 265, 100, 30);
        rb2.setBounds(625, 265, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        //button
        b_next = new JButton("NEXT");
        b_next.setBounds(640, 685, 80, 30);
        b_next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (t_fname.getText().hashCode() == 0 || t_lname.getText().hashCode() == 0 || t_acc_no.getText().hashCode() == 0 || t_mob.getText().hashCode() == 0 || ! checkbox1.isSelected() || list.isSelectionEmpty()) {
                    System.out.println("Field can not be Empty");
                    JOptionPane.showMessageDialog(null, "Fields are empty!");
                } else {

                    TempClient.first_name = t_fname.getText();
                    TempClient.last_name = t_lname.getText();
                    TempClient.phone_no = t_mob.getText();
                    TempClient.nationality = (String) list_nationality.getSelectedItem();
                    TempClient.Gender = (String) list_gender.getSelectedItem();
                    TempClient.aadhar_number = t_acc_no.getText();
                    if(rb1.isSelected()){
                        TempClient.airline_company = "Emirates";
                    }
                    else {
                        TempClient.airline_company = "Etihad";
                    }
                    dataList.add(TempClient);
                    try{
                        FileManager.saveList(dataList);
                    }
                    catch(Exception a){
                        System.out.println("Error occurred : " + e);
                    }

                    if( TempClient.airline_company.equals("Etihad") ){
                        f2.setVisible(false);
                        frame4();
                    }
                    else if ( TempClient.airline_company.equals("Emirates") ){
                        f2.setVisible(false);
                        frame3();
                    }
                }
            }
        });

        //list
        list_nationality.setBounds(625, 365, 125, 50);
        list_nationality.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (nationality[0] == (String) list_nationality.getSelectedItem()) {
                    JOptionPane.showMessageDialog(null, "Select a Nationality");
                }
            }
        });

        list_gender.setBounds(625, 465, 125, 50);
        list_gender.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (gender[0] == (String) list_gender.getSelectedItem()) {
                    JOptionPane.showMessageDialog(null, "Select a Gender!");
                }
            }
        });

        //adding
        f2.setBounds(180, 25, 1200, 800);
        f2.add(bt_right);
        f2.add(l_fname);
        f2.add(l_lname);
        f2.add(l_adr_no);
        f2.add(l_ar_cmpy);
        f2.add(l_nat);
        f2.add(l_gdr);
        f2.add(l_mob);
        f2.add(l_ref);
        f2.add(list);
        f2.add(checkbox1);
        f2.add(t_fname);
        f2.add(t_lname);
        f2.add(t_acc_no);
        f2.add(t_mob);
        f2.add(rb1);
        f2.add(rb2);
        f2.add(list_nationality);
        f2.add(list_gender);
        f2.add(rb1);
        f2.add(rb2);
        f2.add(b_next);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setResizable(false);
        f2.setVisible(true);
    }

    public void frame3(){

        //Declared Elements
        JFrame f1 = new JFrame("Emirates Available Flights!");

        //Images
        JLabel bt_left = new JLabel(new ImageIcon("Emirates_logo(1).png"));
        JLabel bt_right = new JLabel(new ImageIcon("Emirates_red_logo(3).png"));
        JLabel ct_top = new JLabel(new ImageIcon("Emirates_SC(1).png"));
        JLabel ct_bottom = new JLabel(new ImageIcon("Getting_High(1).png"));

        //Position of all Labels
        bt_left.setBounds(0,535,400,300);
        bt_right.setBounds(900,535,400,300);
        ct_top.setBounds(130,-70,1000,600);
        ct_bottom.setBounds(346,450,600,350);

        //Configuring Elements
        f1.setBounds(100,20,1300,900);
        f1.add(new JLabel("ThanK You"), BorderLayout.SOUTH);
        f1.setVisible(true);

        //add elements
        f1.add(bt_left);
        f1.add(bt_right);
        f1.add(ct_top);
        f1.add(ct_bottom);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setResizable(false);
        f1.setLayout(null);
    }

    public void frame4(){
        //Declared Elements
        JFrame fr1 = new JFrame("Etihad Available Flights!");

        //background
        fr1.setContentPane(new JLabel(new ImageIcon("af.jpg")));

        //Images
        JLabel btm1 = new JLabel(new ImageIcon("Etihad_Logo(1).jpg"));
        JLabel btm2 = new JLabel(new ImageIcon("Quote_Etihad(2).png"));
        JLabel top = new JLabel(new ImageIcon("Etihad_SC(1).jpg"));

        //Position of all Labels
        btm1.setBounds(125,630,282,200);
        btm2.setBounds(420,630,653,200);
        top.setBounds(170,10,835,600);

        //Configuring Elements
        fr1.setBounds(100,20,1200,900);
        fr1.setVisible(true);

        //add elements
        fr1.add(btm1);
        fr1.add(btm2);
        fr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr1.setResizable(false);
        fr1.add(top);
        fr1.setLayout(null);
    }

}

class the_royal_seat {

    public static void main(String args[]) throws Exception {

        ArrayList<Client> list = FileManager.getList();
        ui s1 = new ui(list);
        s1.frame1();
    }
}

class Client implements Serializable {


    String first_name;
    String last_name;
    String phone_no;
    String nationality;
    String Gender;
    String aadhar_number;
    String airline_company;


}

class FileManager {

    static ArrayList<Client> getList() throws Exception {

        File file_checker = new File("DATA.txt");

        if (file_checker.exists()) {
            System.out.println("File already exists");
        } else {
            file_checker.createNewFile();

            ArrayList<Client> DATA = new ArrayList<>();

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file_checker));
            oos.writeObject(DATA);
            oos.close();

            System.out.println("File created");

        }

        ArrayList<Client> DATA;

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Data.txt"));
        DATA = (ArrayList<Client>) ois.readObject();
        ois.close();
        return DATA;
    }

    static void saveList(ArrayList<Client> DATA) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("DATA.txt"));
        oos.writeObject(DATA);
        oos.close();
    }
}