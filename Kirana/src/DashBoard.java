
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
        btnUpload = new javax.swing.JButton();
        btnAnalysis = new javax.swing.JButton();
        btnFestival = new javax.swing.JButton();
        btnSendMail = new javax.swing.JButton();
        btnSetting = new javax.swing.JButton();
        btnOffer = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("INVENTORY CONTROL SYSTEM");

        DateTimelbl.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        RBOnline.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        RBOnline.setText("Online");

        jRadioButton2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jRadioButton2.setText("Offline");

        btnUpload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Editing-Attach-icon-1.png"))); // NOI18N
        btnUpload.setText("Upload a File");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        btnAnalysis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_inline_edit_new.gif"))); // NOI18N
        btnAnalysis.setText("Notifications");
        btnAnalysis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalysisActionPerformed(evt);
            }
        });

        btnFestival.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Distributor-report-icon-1.png"))); // NOI18N
        btnFestival.setText("Festival Details");
        btnFestival.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFestivalActionPerformed(evt);
            }
        });

        btnSendMail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mail-icon-3.png"))); // NOI18N
        btnSendMail.setText("Send Mail");

        btnSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Text-Edit-icon.png"))); // NOI18N
        btnSetting.setText("Settings");
        btnSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingActionPerformed(evt);
            }
        });

        btnOffer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_required.gif"))); // NOI18N
        btnOffer.setText("Offers");

        jButton1.setText("DASHBOARD");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RBOnline)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addGap(201, 201, 201)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DateTimelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnUpload)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSendMail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAnalysis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnFestival)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSetting)
                        .addGap(252, 252, 252))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateTimelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(RBOnline)
                        .addComponent(jRadioButton2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpload)
                    .addComponent(btnSendMail)
                    .addComponent(btnAnalysis)
                    .addComponent(jButton1)
                    .addComponent(btnFestival)
                    .addComponent(btnOffer)
                    .addComponent(btnSetting))
                .addContainerGap(563, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(942, 696));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFestivalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFestivalActionPerformed
   
        
    }//GEN-LAST:event_btnFestivalActionPerformed

    private void btnSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingActionPerformed
      
    }//GEN-LAST:event_btnSettingActionPerformed

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUploadActionPerformed

    private void btnAnalysisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalysisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnalysisActionPerformed

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
    private javax.swing.JButton btnAnalysis;
    private javax.swing.JButton btnFestival;
    private javax.swing.JButton btnOffer;
    private javax.swing.JButton btnSendMail;
    private javax.swing.JButton btnSetting;
    private javax.swing.JButton btnUpload;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton2;
    // End of variables declaration//GEN-END:variables
}
