package Main;

/**
 *
 * @author kelompok
 */

import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;
import Login.login;
import java.text.NumberFormat;
import java.util.Locale;

public class home extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int Xmouse;
    int Ymouse;
    /**
     * Creates new form home
     */
    public home() {
        initComponents();     
    }
 // Variables declaration 
    private JPanel body;
    private JPanel jPanel1;
    private JPanel items;
    private JPanel taskbar;
    private JButton getrecipt;
    private JButton Reset;
    private JButton printrecipt;
    private JButton total;
    private JButton getRecipt;
    private JButton printRecipt;
    private JButton resetButton;
    private JLabel NIM;
    private JLabel Departement;
    private JLabel Smtr;
    private JLabel Jurusan;
    private JLabel Student_Name;
    private JLabel developer;
    private JLabel jLabel1;
    private JLabel logout;
    private JLabel minimize;
    private JLabel x;
    private JLabel text;
    private JLabel sks;
    private JTextField inputSks;
    private JTextField bn;
    private JTextField d;
    private JTextField rln;
    private JTextField rn;
    private JTextField sn;
    private JTextField tc;
    private JTextField totalcost;
    private JTextArea area;
    private JScrollPane print_area;
    private JScrollPane Bg_ScrollPane2;
    private ScrollPane scrollPane1;
    private JLabel logo;
    // End of variables declaration
    
 // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        taskbar = new JPanel();
        body = new JPanel();
        items = new JPanel();
        logout = new JLabel();
        developer = new JLabel();
        Student_Name = new JLabel();
        NIM = new JLabel();
        Smtr = new JLabel();
        Jurusan = new JLabel();
        Departement = new JLabel();
        minimize = new JLabel();
        x = new JLabel();
        text = new JLabel();
        jLabel1 = new JLabel();
        scrollPane1 = new ScrollPane();
        print_area = new JScrollPane();
        Bg_ScrollPane2 = new JScrollPane();
     
        sn = new JTextField();
        rn = new JTextField();
        bn = new JTextField();
        d = new JTextField();
        rln = new JTextField();
        totalcost = new JTextField();
        tc = new JTextField();
        Reset = new JButton();
        total = new JButton();
        getrecipt = new JButton();
        printrecipt = new JButton();
        area = new JTextArea();
        sks = new JLabel();
        inputSks = new JTextField();
        getRecipt = new JButton();
        printRecipt = new JButton();
        resetButton = new JButton();
        logo = new JLabel();
        

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(0, 0, 0));
        setUndecorated(false);
        setVisible(true);
        setLocationRelativeTo(null);

        jPanel1.setBackground(new Color(192, 192, 192));
        jPanel1.setBorder(BorderFactory.createLineBorder(new Color(0, 142, 142), 5));
        jPanel1.setLayout(null);

        taskbar.setBackground(new Color(0,46,46));
        taskbar.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                taskbarMousePressed(evt);
            }
        });
        taskbar.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent evt) {
                taskbarMouseDragged(evt);
            }
        });
        taskbar.setLayout(null);

        minimize.setIcon(new ImageIcon(getClass().getResource("/images/-.png")));
        minimize.setCursor(new Cursor(Cursor.HAND_CURSOR));
        minimize.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        taskbar.add(minimize);
        minimize.setBounds(1102, 0, 30, 60);

        x.setIcon(new ImageIcon(getClass().getResource("/images/x.png")));
        x.setCursor(new Cursor(Cursor.HAND_CURSOR));
        x.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                xMouseClicked(evt);
            }
        });
        taskbar.add(x);
        x.setBounds(1150, 0, 30, 60);

        text.setForeground(new Color(255,255,255));
        text.setFont(new Font("Arial Rounded MT Bold", 0, 24));
        text.setText("Sistem Pembayaran Mahasiswa UMS");
        taskbar.add(text);
        text.setBounds(350, 0, 468, 60);

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/images/gotoback.png")));
        jLabel1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        taskbar.add(jLabel1);
        jLabel1.setBounds(1050, 0, 50, 60);

        jPanel1.add(taskbar);
        taskbar.setBounds(0, 0, 1200, 60);

        body.setBackground(new Color(0,128,128));

        sks.setForeground(new Color(0, 0, 0));
        sks.setFont(new Font("Arial Rounded MT Bold", 0, 16));
        sks.setText("Inputkan Jumlah SKS yang anda ambil pada semester ini");
        body.add(sks);
        sks.setBounds(50, 390, 450, 30);
        
        
        inputSks.setBackground(new Color(255, 255, 255));
        inputSks.setFont(new Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        inputSks.setForeground(new Color(51, 51, 51));
        inputSks.setBounds(50, 430, 100, 30);
        body.add(inputSks);
        


        Bg_ScrollPane2.setViewportView(items);


        Student_Name.setFont(new Font("Arial Rounded MT Bold", 1, 20));
        Student_Name.setForeground(new Color(255, 255, 255));
        Student_Name.setText("Nama");

        NIM.setFont(new Font("Arial Rounded MT Bold", 1, 20));
        NIM.setForeground(new Color(255, 255, 255));
        NIM.setText("NIM ");

        Smtr.setFont(new Font("Arial Rounded MT Bold", 1, 20));
        Smtr.setForeground(new Color(255, 255, 255));
        Smtr.setText("Semester ");

	Jurusan.setFont(new Font("Arial Rounded MT Bold", 1, 20));
        Jurusan.setForeground(new Color(255, 255, 255));
        Jurusan.setText("Jurusan ");

        Departement.setFont(new Font("Arial Rounded MT Bold", 1, 20));
        Departement.setForeground(new Color(255, 255, 255));
        Departement.setText("Fakultas ");

        sn.setFont(new Font("Arial Rounded MT Bold", 0, 18));
        sn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                snActionPerformed(evt);
            }
        });
        
        d.setFont(new Font("Arial Rounded MT Bold", 0, 18));

        rn.setFont(new Font("Arial Rounded MT Bold", 0, 18));
        rn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                rnActionPerformed(evt);
            }
        });

        bn.setFont(new Font("Arial Rounded MT Bold", 0, 18));
        bn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                bnActionPerformed(evt);
            }
        });


        rln.setFont(new Font("Arial Rounded MT Bold", 0, 18));
        rln.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                rlnActionPerformed(evt);
            }
        });

        totalcost.setVisible(false);
        tc.setVisible(false);
        Reset.setVisible(false);
        total.setVisible(false);
        
        getRecipt.setFont(new Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        getRecipt.setText("Get Recipt");
        getRecipt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                getreciptActionPerformed(evt);
            }
        });
        getRecipt.setBounds(230, 480, 140, 40);
        body.add(getRecipt);
        
        
   
        getrecipt.setVisible(false);
        printrecipt.setVisible(false);

        printRecipt.setFont(new Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        printRecipt.setText("Print Receipt");
        printRecipt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                printreciptActionPerformed(evt);
            }
        });
        printRecipt.setBounds(380, 480, 170, 40);
        body.add(printRecipt);
        
        resetButton.setFont(new Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        resetButton.setText("Reset All Field");
        resetButton.setForeground(new Color(255,255,255));
        resetButton.setBackground(Color.red);
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               ResetActionPerformed(evt);
            }
        });
        resetButton.setBounds(50, 480, 170, 40);
        body.add(resetButton);

        // print nota
        area.setColumns(20);
        area.setEditable(false);
        area.setFont(new Font("Monospaced", 0, 18)); 
        area.setRows(8);
        print_area.setViewportView(area);

        GroupLayout bodyLayout = new GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(// Horizontal setting
            bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(15, 26, 45)
                .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(NIM, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Student_Name, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Smtr, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
                                .addComponent(Bg_ScrollPane2, GroupLayout.PREFERRED_SIZE, 520, GroupLayout.PREFERRED_SIZE)
                                .addGroup(bodyLayout.createSequentialGroup()
                                    .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(Jurusan, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Departement, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(sn)
                                        .addComponent(rn)
                                        .addComponent(bn)
                                        .addComponent(rln)
                                        .addComponent(d, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE))))
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addComponent(Reset)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(total, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.LEADING, bodyLayout.createSequentialGroup()
                                .addComponent(totalcost, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tc, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)))
                        .addGap(98, 98, 98)
                        .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(logout)
                            .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(print_area, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
                                .addGroup(bodyLayout.createSequentialGroup()
                                    .addComponent(getrecipt)
                                    .addGap(100, 100, 100)
                                    .addComponent(printrecipt, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                        .addComponent(developer, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        bodyLayout.setVerticalGroup(//vertical setting
            bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(Student_Name))
                            .addComponent(sn, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(rn, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                            .addComponent(Smtr))
                        .addGap(22, 22, 22)
                        .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(bn, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                            .addComponent(NIM))
                        .addGap(18, 18, 18)
                        .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(Jurusan)
                            .addComponent(rln, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(Departement)
                            .addComponent(d, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(Bg_ScrollPane2, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(tc, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalcost, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(Reset)
                            .addGroup(bodyLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(total))))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addComponent(print_area, GroupLayout.PREFERRED_SIZE, 562, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bodyLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(printrecipt, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                            .addComponent(getrecipt, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logout, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(developer)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        // </editor-fold>//GEN-END:initComponents
        scrollPane1.add(body);

        jPanel1.add(scrollPane1);
        scrollPane1.setBounds(0, 60, 1195, 860);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 1195, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 860, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rlnActionPerformed(ActionEvent evt) {
    	
    }
    private void bnActionPerformed(ActionEvent evt) {

    }
    private void rnActionPerformed(ActionEvent evt) {
    	
    }
    private void snActionPerformed(ActionEvent evt) {
        
    }
    private void tcActionPerformed(ActionEvent evt) {
       
    }
    private void ResetActionPerformed(ActionEvent evt) {
        
        if (JOptionPane.showConfirmDialog(frame, "Do you want to reset all?", "Reset", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {    
         // reset
        //area null
        area.setText(null);
        bn.setText(null);
        rln.setText(null);
        sn.setText(null);
        d.setText(null);        
        rn.setText(null);        
        inputSks.setText(null);
        area.setText(null);
        }
    }//GEN-LAST:event_ResetActionPerformed

    

    @SuppressWarnings("deprecation")
	private void logoutMouseClicked(MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to Logout !", "Logout", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            login log = new login();
            this.dispose();
            log.show();
        }
    }//GEN-LAST:event_logoutMouseClicked

    private void printreciptActionPerformed(ActionEvent evt) {//GEN-FIRST:event_printreciptActionPerformed
         if (JOptionPane.showConfirmDialog(frame, "Yakin untuk di print ?", "Print Recipt", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {   
             if(area.getText().isEmpty()){
               JOptionPane.showMessageDialog(null, "Print Area Kosong");
             } else {
                 try {
                area.print();
                } catch (Exception e) {
                    }
             }
        }
    }//GEN-LAST:event_printreciptActionPerformed

    private void getreciptActionPerformed(ActionEvent evt) {//GEN-FIRST:event_getreciptActionPerformedto
        Locale locale = new Locale("id", "ID");
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        String result;
        double hrgaPerSks = 300000;
        int numSks = numSks = Integer.parseInt(inputSks.getText());
        
               
        if(numSks > 24){
            result = "0";
            inputSks.setText(null);
            area.setText(null);
            JOptionPane.showMessageDialog(null, "Maksimal SKS yang bisa diambil yaitu 24");
        }
        
        else {
            double totalAll = Double.parseDouble(inputSks.getText()) * hrgaPerSks;
            result = numberFormat.format(totalAll);
            
            // decoration
        area.setText("*********************************\n");
        area.setText(area.getText() + "******   Payment Recipt   *******\n");
        area.setText(area.getText() + "*********************************\n");

        //Date
        Date obj = new Date();
        String date = obj.toString();
        area.setText(area.getText() + "" + date + "\n");
        
        area.setText(area.getText() + "---------------------------------\n");

        area.setText(area.getText() + "---------------------------------\n");
        // items
        
        area.setText(area.getText() + " Nama     : " + sn.getText() + "\n");
        area.setText(area.getText() + " Semester : " + rn.getText() + "\n");
        area.setText(area.getText() + " NIM      : " + bn.getText() + "\n");
        area.setText(area.getText() + " Jurusan  : " + rln.getText() + "\n");
        area.setText(area.getText() + " Fakultas : " + d.getText() + "\n\n");
        area.setText(area.getText() + " Discription              Amounts\n");
        area.setText(area.getText() + "---------------------------------\n");        
        area.setText(area.getText() + " SKS                         " + " " + numSks + "\n");
        
  
        area.setText(area.getText() + "---------------------------------\n");

        //bill
     
        area.setText(area.getText() + " Jumlah yang harus dibayar \n" + " Rp."+ result + "\n");
        area.setText(area.getText() + "---------------------------------\n\n");
        }
              
       
        

        
    }//GEN-LAST:event_getreciptActionPerformed

    private void xMouseClicked(MouseEvent evt) {
        if (JOptionPane.showConfirmDialog(frame, "Do you want to exit?", "Exit", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {    
        System.exit(0);
        }
    }

    private void minimizeMouseClicked(MouseEvent evt) {
        this.setState(JFrame.ICONIFIED);
    }

    private void taskbarMouseDragged(MouseEvent evt) {
        int x = evt.getXOnScreen();
        int y = evt.getXOnScreen();
        //System.out.println(x+","+y);
        this.setLocation(x /*- Xmouse*/, y /*-Ymouse*/);
    }

    private void taskbarMousePressed(MouseEvent evt) {
//        Xmouse = evt.getX();
//        Ymouse = evt.getY();
    }//GEN-LAST:event_taskbarMousePressed

    @SuppressWarnings("deprecation")
	private void jLabel1MouseClicked(MouseEvent evt) {
             frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Apakah kamu yakin untuk Logout !", "Logout", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            login log = new login();
            this.dispose();
            log.show();
        }
    }
    
    private JFrame frame;   //cofirm exit yes no
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
   
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Optimus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        EventQueue.invokeLater(new Runnable() {

            public void run() {
                new home().setVisible(true);
            }
        });
    }
}
