/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frame;

import java.sql.Connection;
import DBconnect.Koneksi;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

/**
 *
 * @author Jaconiah
 */
public class MenuUtama extends javax.swing.JFrame {

    private Connection conn;
    
    public MenuUtama() {
        initComponents();
        conn = Koneksi.getConnection();
        getData();
        nonAktifButton();
    }
    
    private void getData(){
        DefaultTableModel model =(DefaultTableModel) tbl_data.getModel();
        model.setRowCount(0);
        
        try {
            String sql = "Select * From movie";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                String judul = rs.getString("judul");
                int alur    = rs.getInt("alur");
                int penokohan   = rs.getInt("penokohan");
                int akting  = rs.getInt("akting");
                int nilai   = rs.getInt("nilai");
                
                Object[] rowData = {judul, alur, penokohan, akting, nilai};
                model.addRow(rowData);
            }
            rs.close();
            st.close();
            
        }catch (Exception e) {
            Logger.getLogger(MenuUtama.class.getName()).log(Level.SEVERE, null, e);
        }
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
        tbl_data = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        t_judul = new javax.swing.JTextField();
        t_alur = new javax.swing.JTextField();
        t_penokohan = new javax.swing.JTextField();
        t_akting = new javax.swing.JTextField();
        btn_tambah = new javax.swing.JButton();
        btn_perbarui = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Judul", "Alur", "Penokohan", "Akting", "Nilai"
            }
        ));
        tbl_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_dataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_data);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("INFO FILM");

        jLabel2.setText("Judul");

        jLabel3.setText("Alur");

        jLabel4.setText("Penokohan");

        jLabel5.setText("Akting");

        t_akting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_aktingActionPerformed(evt);
            }
        });

        btn_tambah.setText("Tambah");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_perbarui.setText("Perbarui");
        btn_perbarui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_perbaruiActionPerformed(evt);
            }
        });

        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_batal.setText("Batal");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        jTextField1.setText("Search...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_tambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_perbarui)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_batal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_hapus))
                            .addComponent(t_judul)
                            .addComponent(t_alur)
                            .addComponent(t_penokohan)
                            .addComponent(t_akting))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel1)
                        .addGap(141, 141, 141))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_alur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(t_penokohan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_akting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_tambah)
                            .addComponent(btn_perbarui)
                            .addComponent(btn_batal)
                            .addComponent(btn_hapus)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_aktingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_aktingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_aktingActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        String judul = t_judul.getText();
        String alur = t_alur.getText();
        String penokohan = t_penokohan.getText();
        String akting = t_akting.getText();
        
        Double pembagi = 3.0;
        Double doubleNilai = (Double.parseDouble(alur)+Double.parseDouble(penokohan)+Double.parseDouble(akting))/pembagi;
        String nilai = String.valueOf(doubleNilai);
        
        if(judul.isEmpty() || alur.isEmpty() || penokohan.isEmpty() || akting.isEmpty()){
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi", "Peringatan", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try{
            String sql = "INSERT INTO movie (judul, alur, penokohan, akting, nilai) VALUES (?,?,?,?,?)";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, judul);
            st.setString(2, alur);
            st.setString(3, penokohan);
            st.setString(4, akting);
            st.setString(5, nilai);
            
            int rowInserted = st.executeUpdate();
            if(rowInserted > 0){
                JOptionPane.showMessageDialog(this, "Data Berhasil Tertambah!");
                resetForm();
                getData();
            }
            
            st.close();
            
        }catch(Exception e){
             Logger.getLogger(MenuUtama.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_perbaruiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_perbaruiActionPerformed
        int selectedRow = tbl_data.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih Baris!");
            return;
        }

        String judul = t_judul.getText();
        String alur = t_alur.getText();
        String penokohan = t_penokohan.getText();
        String akting = t_akting.getText();

        double pembagi = 3.0;
        double doubleNilai = (Double.parseDouble(alur) + Double.parseDouble(penokohan) + Double.parseDouble(akting)) / pembagi;
        String nilai = String.valueOf(doubleNilai);

        if (judul.isEmpty() || alur.isEmpty() || penokohan.isEmpty() || akting.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi", "Peringatan", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String sql = "UPDATE movie SET alur=?, penokohan=?, akting=?, nilai=? WHERE judul=?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, alur);
            st.setString(2, penokohan);
            st.setString(3, akting);
            st.setString(4, nilai);
            st.setString(5, judul);

            int rowUpdated = st.executeUpdate();
            if (rowUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Diperbarui!");
                resetForm();
                getData();
            }

            st.close();
        } catch (Exception e) {
            Logger.getLogger(MenuUtama.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btn_perbaruiActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        int selectedRow = tbl_data.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih Baris!");
            return;
        }
        
        int confirm = JOptionPane.showConfirmDialog(this, "yakin ingin dihapus?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        
        if(confirm == JOptionPane.YES_OPTION) {
            String judul = tbl_data.getValueAt(selectedRow, 0).toString();
            
            try{
                String sql = "DELETE FROM movie WHERE judul=?";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, judul);
                
                int rowDelete = st.executeUpdate();
                if(rowDelete > 0){
                    JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
                    resetForm();
                    getData();
                }
            } catch (Exception e) {
            Logger.getLogger(MenuUtama.class.getName()).log(Level.SEVERE, null, e);
        } 
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        resetForm();
        btn_tambah.setEnabled(true);
    }//GEN-LAST:event_btn_batalActionPerformed

    private void tbl_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dataMouseClicked
        int selectedRow = tbl_data.getSelectedRow();
        if(selectedRow != -1){
            String judul = tbl_data.getValueAt(selectedRow, 0).toString();
            String alur = tbl_data.getValueAt(selectedRow, 1).toString();
            String penokohan = tbl_data.getValueAt(selectedRow, 2).toString();
            String akting = tbl_data.getValueAt(selectedRow, 3).toString();
            
            t_judul.setText(judul);
            t_alur.setText(alur);
            t_penokohan.setText(penokohan);
            t_akting.setText(akting);
            
        }
        t_judul.setEnabled(false);
        btn_tambah.setEnabled(false);
        btn_perbarui.setEnabled(true);
        btn_hapus.setEnabled(true);
    }//GEN-LAST:event_tbl_dataMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_perbarui;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField t_akting;
    private javax.swing.JTextField t_alur;
    private javax.swing.JTextField t_judul;
    private javax.swing.JTextField t_penokohan;
    private javax.swing.JTable tbl_data;
    // End of variables declaration//GEN-END:variables
    
    private void resetForm(){
        t_judul.setText("");
        t_akting.setText("");
        t_alur.setText("");
        t_penokohan.setText("");
        
    }
    
    private void nonAktifButton(){
        btn_perbarui.setEnabled(false);
        btn_hapus.setEnabled(false);
    }
}
