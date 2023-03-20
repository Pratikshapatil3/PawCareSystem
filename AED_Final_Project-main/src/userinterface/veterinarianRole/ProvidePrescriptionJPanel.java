package userinterface.veterinarianRole;
import model.taskbuffer.PawPatientTreatmentWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import model.enterprise.Enterprise;
import model.userAccount.User;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ProvidePrescriptionJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private User userAccount;
    private Enterprise enterprise;
    private PawPatientTreatmentWorkRequest request;

    
    public ProvidePrescriptionJPanel(JPanel userProcessContainer, User userAccount, Enterprise enterprise, PawPatientTreatmentWorkRequest workRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.request = workRequest;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        text2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        text5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        btn4 = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setEnabled(false);
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Provide Paw Prescription ");
        add(jLabel1);
        jLabel1.setBounds(283, 30, 307, 29);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("PAW PATIENT Details");
        add(jLabel6);
        jLabel6.setBounds(320, 140, 210, 15);

        txtFirstName.setEditable(false);
        add(txtFirstName);
        txtFirstName.setBounds(320, 180, 131, 23);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("First Name :");
        add(jLabel7);
        jLabel7.setBounds(240, 180, 71, 15);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Last Name :");
        add(jLabel10);
        jLabel10.setBounds(240, 230, 71, 15);

        text2.setEditable(false);
        add(text2);
        text2.setBounds(320, 230, 131, 23);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Allocated Doctor Details :");
        add(jLabel8);
        jLabel8.setBounds(150, 370, 183, 15);

        txtAge.setEditable(false);
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        add(txtAge);
        txtAge.setBounds(320, 280, 131, 23);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Age :");
        add(jLabel27);
        jLabel27.setBounds(280, 280, 32, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Prescription :");
        add(jLabel3);
        jLabel3.setBounds(220, 450, 94, 15);

        txt1.setColumns(20);
        txt1.setRows(5);
        jScrollPane1.setViewportView(txt1);

        add(jScrollPane1);
        jScrollPane1.setBounds(320, 430, 400, 86);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Patient Medical Condition :");
        add(jLabel4);
        jLabel4.setBounds(150, 330, 166, 15);

        text5.setEditable(false);
        add(text5);
        text5.setBounds(320, 330, 130, 23);

        txt6.setEditable(false);
        add(txt6);
        txt6.setBounds(320, 370, 131, 23);

        btn4.setBackground(new java.awt.Color(102, 102, 0));
        btn4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("Submit");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        add(btn4);
        btn4.setBounds(350, 550, 110, 40);

        backJButton.setBackground(new java.awt.Color(102, 102, 0));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(29, 11, 90, 21);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dog9.jpg"))); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(590, 70, 500, 350);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        String prescription = txt1.getText();
        if (prescription.equals("")) {
            JOptionPane.showMessageDialog(null, "Prescription is required");
            return;
        } else {
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed further?");
            if (dialogResult == JOptionPane.YES_OPTION) {
                request.setPrescription(prescription);
                request.setStatus("Prescription Provided");
                JOptionPane.showMessageDialog(null, "Prescription submitted successfully");
                btn4.setEnabled(false);
            }
        }        
    }//GEN-LAST:event_btn4ActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        VeterinarianWorkAreaJPanel dwjp = (VeterinarianWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btn4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text5;
    private javax.swing.JTextArea txt1;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtFirstName;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        txtFirstName.setText(request.getPatient().getPatientFirstName());
        text2.setText(request.getPatient().getPatientLastName());
      
        txtAge.setText(String.valueOf(request.getPatient().getPatientAge()));
        text5.setText(request.getReasonForVisit());
        txt6.setText(request.getAssignedDoctor().getEmployee().getName());

    }
}