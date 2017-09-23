
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.Timer;

public class DashBoard extends javax.swing.JFrame {
    ButtonGroup grp=new ButtonGroup();

    DashBoard(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    


  
     public void tickTock() {
            DateTimelbl.setText(DateFormat.getDateTimeInstance().format(new Date()));
        }
    public void DateTimeSet() 
    {
        Timer timer = new Timer(500, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tickTock();
                }
            });
            timer.setRepeats(true);
            timer.setCoalesce(true);
            timer.setInitialDelay(0);
            timer.start();

    }
    public DashBoard() {
        initComponents();
        DateTimeSet();
        setResizable(false);
                grp.add(RBOnline);
        grp.add(jRadioButton2);
        
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DateTimelbl = new javax.swing.JLabel();
        RBOnline = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        mainPanel = new javax.swing.JTabbedPane();
        upload = new javax.swing.JTabbedPane();
        mail = new javax.swing.JTabbedPane();
        alert = new javax.swing.JTabbedPane();
        dashboard = new javax.swing.JTabbedPane();
        offers = new javax.swing.JTabbedPane();
        settings = new javax.swing.JTabbedPane();
        festival = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("INVENTORY CONTROL SYSTEM");

        DateTimelbl.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        RBOnline.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        RBOnline.setText("Online");

        jRadioButton2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jRadioButton2.setText("Offline");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(RBOnline)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addGap(158, 158, 158)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                .addComponent(DateTimelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateTimelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(RBOnline)
                        .addComponent(jRadioButton2))))
        );

        mainPanel.setVerifyInputWhenFocusTarget(false);
        mainPanel.addTab("     UPLOAD FILE     ", upload);
        mainPanel.addTab("     SEND MAIL     ", mail);
        mainPanel.addTab("     NOTIFICATIONS    ", alert);
        mainPanel.addTab("        DASHBOARD        ", dashboard);
        mainPanel.addTab("  OFFERS     ", offers);
        mainPanel.addTab("    SETTINGS     ", settings);
        mainPanel.addTab("     FESTIVAL DETAILS    ", festival);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );

        mainPanel.getAccessibleContext().setAccessibleName("upload");

        setSize(new java.awt.Dimension(942, 696));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DateTimelbl;
    private javax.swing.JRadioButton RBOnline;
    private javax.swing.JTabbedPane alert;
    private javax.swing.JTabbedPane dashboard;
    private javax.swing.JTabbedPane festival;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTabbedPane mail;
    private javax.swing.JTabbedPane mainPanel;
    private javax.swing.JTabbedPane offers;
    private javax.swing.JTabbedPane settings;
    private javax.swing.JTabbedPane upload;
    // End of variables declaration//GEN-END:variables
}
