package userinterface.InsuranceFinanceRole;

import model.enterprise.Enterprise;
import model.userAccount.User;
import model.taskbuffer.InsuranceWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class InsuranceFinanceProcessRequest extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private User userAccount;
    private InsuranceWorkRequest insuranceWorkRequest;

    /**
     * Creates new form InsuranceFinanceProcessRequest
     */
    InsuranceFinanceProcessRequest(JPanel userProcessContainer, User userAccount, InsuranceWorkRequest insuranceWorkRequest, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.insuranceWorkRequest = insuranceWorkRequest;
        txtPolicyNumber.setText(insuranceWorkRequest.getPolicyNumber());
        txtSSN.setText(insuranceWorkRequest.getSsn());
        txtPolicyName.setText(insuranceWorkRequest.getPolicyName());
        txtClaimAmount.setText(String.valueOf(insuranceWorkRequest.getClaimAmount()));
        txtBillingAmount.setText(String.valueOf(insuranceWorkRequest.getBillAmount()));
        txtCoverage.setText(String.valueOf(insuranceWorkRequest.getInsuranceCustomer().getInsurance().getCoverage()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDisburse = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        txtPolicyNumber = new javax.swing.JTextField();
        txtPolicyName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtBillingAmount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtClaimAmount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCoverage = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        btnDisburse.setBackground(new java.awt.Color(102, 102, 0));
        btnDisburse.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDisburse.setForeground(new java.awt.Color(255, 255, 255));
        btnDisburse.setText("Disburse Amount");
        btnDisburse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisburseActionPerformed(evt);
            }
        });
        add(btnDisburse);
        btnDisburse.setBounds(460, 220, 127, 32);

        btnReject.setBackground(new java.awt.Color(102, 102, 0));
        btnReject.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReject.setForeground(new java.awt.Color(255, 255, 255));
        btnReject.setText("Reject Claim");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject);
        btnReject.setBounds(600, 220, 101, 32);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Insurance Finance Request Process area ");
        add(jLabel3);
        jLabel3.setBounds(130, 17, 510, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Policy Number");
        add(jLabel4);
        jLabel4.setBounds(130, 90, 100, 15);

        backBtn.setBackground(new java.awt.Color(102, 102, 0));
        backBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(10, 23, 72, 29);

        txtPolicyNumber.setEditable(false);
        add(txtPolicyNumber);
        txtPolicyNumber.setBounds(278, 86, 116, 23);

        txtPolicyName.setEditable(false);
        add(txtPolicyName);
        txtPolicyName.setBounds(550, 110, 116, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Policy Name");
        add(jLabel1);
        jLabel1.setBounds(440, 120, 80, 15);

        txtBillingAmount.setEditable(false);
        add(txtBillingAmount);
        txtBillingAmount.setBounds(280, 160, 116, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Billing Amount");
        add(jLabel6);
        jLabel6.setBounds(140, 160, 90, 15);

        txtClaimAmount.setEditable(false);
        txtClaimAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaimAmountActionPerformed(evt);
            }
        });
        add(txtClaimAmount);
        txtClaimAmount.setBounds(550, 150, 116, 23);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Claim Amount");
        add(jLabel7);
        jLabel7.setBounds(440, 160, 86, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Owner's SSN");
        add(jLabel8);
        jLabel8.setBounds(440, 90, 80, 10);

        txtSSN.setEditable(false);
        add(txtSSN);
        txtSSN.setBounds(550, 80, 116, 23);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Conerage%");
        add(jLabel9);
        jLabel9.setBounds(150, 130, 72, 15);

        txtCoverage.setEditable(false);
        add(txtCoverage);
        txtCoverage.setBounds(280, 120, 116, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDisburseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisburseActionPerformed

        btnDisburse.setEnabled(true);
        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed further?");
        if (dialogResult == JOptionPane.YES_OPTION) {
            insuranceWorkRequest.setStatus("Insurance Claim Approved");
            JOptionPane.showMessageDialog(null, "Claim Approved!!!");
            btnDisburse.setEnabled(false);
            btnReject.setEnabled(false);
        }
    }//GEN-LAST:event_btnDisburseActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed

        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed further?");
        if (dialogResult == JOptionPane.YES_OPTION) {
            insuranceWorkRequest.setStatus("Insurance Claim Declined");
            btnReject.setEnabled(false);
            btnDisburse.setEnabled(false);
        }

    }//GEN-LAST:event_btnRejectActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        InsuranceFinanceWorkAreaJPanel iwjp = (InsuranceFinanceWorkAreaJPanel) component;
        iwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void txtClaimAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaimAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaimAmountActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnDisburse;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBillingAmount;
    private javax.swing.JTextField txtClaimAmount;
    private javax.swing.JTextField txtCoverage;
    private javax.swing.JTextField txtPolicyName;
    private javax.swing.JTextField txtPolicyNumber;
    private javax.swing.JTextField txtSSN;
    // End of variables declaration//GEN-END:variables
}