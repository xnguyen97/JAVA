/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuchanh3;

import java.util.ArrayList;
import javax.swing.*;

public class Bai3 extends javax.swing.JFrame {

    /**
     * Creates new form Bai3
     */
    public Bai3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        ctrai = new javax.swing.JButton();
        tctrai = new javax.swing.JButton();
        cphai = new javax.swing.JButton();
        tcphai = new javax.swing.JButton();
        btnthem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bài 3");

        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jList2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList2ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        ctrai.setText(">");
        ctrai.setEnabled(false);
        ctrai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctraiActionPerformed(evt);
            }
        });

        tctrai.setText(">>");
        tctrai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tctraiActionPerformed(evt);
            }
        });

        cphai.setText("<");
        cphai.setEnabled(false);
        cphai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cphaiActionPerformed(evt);
            }
        });

        tcphai.setText("<<");
        tcphai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcphaiActionPerformed(evt);
            }
        });

        btnthem.setText("+");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        jLabel2.setText("DS Môn Thể Thao");

        jLabel4.setText("Môn Yêu Thích");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(btnthem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(10, 10, 10)))
                                .addGap(35, 35, 35))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tctrai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ctrai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cphai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(tcphai, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(182, 182, 182))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(ctrai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tctrai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cphai)
                        .addGap(18, 18, 18)
                        .addComponent(tcphai)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnthem)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        String sthethao=JOptionPane.showInputDialog(this,"Nhập môn thể thao");
        ListModel mten = jList1.getModel();
        ArrayList<String> arrten = new ArrayList<>();
        for (int i=0; i<mten.getSize();i++)
        { 
            String ten=(mten.getElementAt(i).toString());
            arrten.add(ten); 
        }
        arrten.add(sthethao);
        String[] data = arrten.toArray(new String[0]);
        jList1.setListData(data);     
        
    }//GEN-LAST:event_btnthemActionPerformed

    private void ctraiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctraiActionPerformed
        //Lấy về model
        ListModel mTrai = jList1.getModel();
        ArrayList<String> arrTrai = new ArrayList<>();
        ListModel mPhai= jList2.getModel();
        ArrayList<String> arrPhai = new ArrayList<>();
        //lấy vị trí chọn
        int i = jList1.getSelectedIndex(); 
        //Xử lý danh sách trái
        for (int j=0; j<mTrai.getSize(); j++)
        {   
            String ten =mTrai.getElementAt(j).toString();
            arrTrai.add(ten);
        }
        //xóa khỏi arr  trai
        arrTrai.remove(i);
        String[] dataLeft = arrTrai.toArray(new String[0]);
        jList1.setListData(dataLeft);
         //Xử lý danh sách phải
        for (int z=0; z<mPhai.getSize(); z++)
        {   
            String ten =mPhai.getElementAt(z).toString();
            arrPhai.add(ten);
        }
        arrPhai.add(mTrai.getElementAt(i).toString());
        String[] dataPhai = arrPhai.toArray(new String[0]);
        jList2.setListData(dataPhai);
       
        
    }//GEN-LAST:event_ctraiActionPerformed

    private void tctraiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tctraiActionPerformed
        //Lấy về model
        ListModel mTrai = jList1.getModel();
        ListModel mPhai= jList2.getModel();
        ArrayList<String> arr = new ArrayList<>();
        //Xử lý danh sách phải
        for (int i=0; i<mPhai.getSize(); i++)
        {   
            String ten =mPhai.getElementAt(i).toString();
            arr.add(ten);
        }
        //Xử lý danh sách Trái
        for (int i=0; i<mTrai.getSize(); i++)
        {   
            String ten =mTrai.getElementAt(i).toString();
            arr.add(ten);
        }
        String[] data = arr.toArray(new String[0]);
        jList2.setListData(data);
        arr.removeAll(arr);
        data = arr.toArray(new String[0]);
        jList1.setListData(data);
    }//GEN-LAST:event_tctraiActionPerformed

    private void cphaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cphaiActionPerformed
   //Lấy về model
        ListModel mTrai = jList1.getModel();
        ArrayList<String> arrTrai = new ArrayList<>();
        ListModel mPhai= jList2.getModel();
        ArrayList<String> arrPhai = new ArrayList<>();
        //lấy vị trí chọn
        int i = jList2.getSelectedIndex();
         //Xử lý danh sách phải
        for (int j=0; j<mTrai.getSize(); j++)
        {   
            String ten =mTrai.getElementAt(j).toString();
            arrTrai.add(ten);
        }
        arrTrai.add(mPhai.getElementAt(i).toString());
        String[] dataTrai = arrTrai.toArray(new String[0]);
        jList1.setListData(dataTrai);
        //Xử lý danh sách trái
        for (int j=0; j<mPhai.getSize(); j++)
        {   
            String ten =mPhai.getElementAt(j).toString();
            arrPhai.add(ten);
        }
        //xóa khỏi arr  trai
        arrPhai.remove(i);
        String[] dataPhai = arrPhai.toArray(new String[0]);
        jList2.setListData(dataPhai);
    }//GEN-LAST:event_cphaiActionPerformed

    private void tcphaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcphaiActionPerformed
        //Lấy về model
        ListModel mTrai = jList1.getModel();
        ListModel mPhai= jList2.getModel();
        ArrayList<String> arr = new ArrayList<>();
        //Xử lý danh sách trái
        for (int i=0; i<mTrai.getSize(); i++)
        {   
            String ten =mTrai.getElementAt(i).toString();
            arr.add(ten);
        }
        //Xử lý danh sách phair
        for (int i=0; i<mPhai.getSize(); i++)
        {   
            String ten =mPhai.getElementAt(i).toString();
            arr.add(ten);
        }
        String[] data = arr.toArray(new String[0]);
        jList1.setListData(data);
        arr.removeAll(arr);
        data = arr.toArray(new String[0]);
        jList2.setListData(data);
    }//GEN-LAST:event_tcphaiActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        // TODO add your handling code here:
        ctrai.setEnabled(true);
        
    }//GEN-LAST:event_jList1ValueChanged

    private void jList2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList2ValueChanged
        // TODO add your handling code here:
        
        cphai.setEnabled(true);
    }//GEN-LAST:event_jList2ValueChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnthem;
    private javax.swing.JButton cphai;
    private javax.swing.JButton ctrai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton tcphai;
    private javax.swing.JButton tctrai;
    // End of variables declaration//GEN-END:variables
}
