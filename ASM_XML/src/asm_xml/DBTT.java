/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm_xml;

import static asm_xml.ASM_XML.writefile;
import java.awt.BorderLayout;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author MacOS
 */
public class DBTT extends javax.swing.JFrame {

    /**
     * Creates new form DBTT
     */
    public DBTT() {
        initComponents();
        loadDatatable();
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
        tblTT = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtstatus = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        txtlocation = new javax.swing.JTextField();
        txtimage = new javax.swing.JTextField();
        btnimage = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtlocations = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtdates = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblTT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "name", "status", "date", "location", "image"
            }
        ));
        jScrollPane1.setViewportView(tblTT);

        jLabel1.setText("statustt");

        jLabel2.setText("namett");

        jLabel3.setText("datett");

        jLabel4.setText("llocationtt");

        jLabel5.setText("image");

        btnimage.setText("image");
        btnimage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimageActionPerformed(evt);
            }
        });

        btnadd.setText("add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        jLabel6.setText("search");

        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        jLabel7.setText("date");

        jLabel8.setText("location");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(36, 36, 36))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(32, 32, 32)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnadd)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtstatus)
                                    .addComponent(txtname)
                                    .addComponent(txtdate)
                                    .addComponent(txtlocation, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(txtimage, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnimage)
                                        .addGap(27, 27, 27)
                                        .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 149, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txtdates, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtlocations, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(btnsearch)))
                                        .addGap(71, 71, 71))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(206, 206, 206))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtlocations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsearch)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtdates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtlocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtimage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(btnimage))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnadd)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnimageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimageActionPerformed
        JFileChooser fc = new JFileChooser();
        int result = fc.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            String sname = file.getAbsolutePath();
            txtimage.setText(sname);

            try {
                image.setIcon(new ImageIcon(ImageIO.read(file)));
            } catch (IOException ex) {
                Logger.getLogger(DBTT.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnimageActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        String name = txtname.getText();
        String status = txtstatus.getText();
        String date = txtdate.getText();
        String location = txtlocation.getText();
        String image = txtimage.getText();

        writefile("tt", "TrangThaiThoiTiet", "ThoiTiet", "name", "status", "date", "location", "image", name, status, date, location, image);

        loadDatatable();

    }//GEN-LAST:event_btnaddActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        if (txtdates.getText().length() > 0) {
            ArrayList<Node> searchdate = new ASM_XML().searchdate(txtdates.getText());
            loadData(searchdate);
        } else if (txtlocations.getText().length() > 0) {
            ArrayList<Node> searchlocation = new ASM_XML().searchlocation(txtlocations.getText());
            loadData(searchlocation);
        } else {
            loadDatatable();
        }

    }//GEN-LAST:event_btnsearchActionPerformed

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
            java.util.logging.Logger.getLogger(DBTT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DBTT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DBTT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DBTT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DBTT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnimage;
    private javax.swing.JButton btnsearch;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTT;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtdates;
    private javax.swing.JTextField txtimage;
    private javax.swing.JTextField txtlocation;
    private javax.swing.JTextField txtlocations;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtstatus;
    // End of variables declaration//GEN-END:variables

    final void loadDatatable() {
        Document doc = ASM_XML.parserData();
        DefaultTableModel model = (DefaultTableModel) tblTT.getModel();
        model.getDataVector().clear();
        NodeList products = doc.getElementsByTagName("ThoiTiet");
        for (int i = 0; i < products.getLength(); i++) {
            Vector row = new Vector();
            Node p = products.item(i);
            for (int j = 0; j < p.getChildNodes().getLength(); j++) {
                if (!p.getChildNodes().item(j).getNodeName().equals("#text")) {
                    row.addElement(p.getChildNodes().item(j).getTextContent());
                }
            }
            model.addRow(row);
        }
        tblTT.setModel(model);
    }

    final void loadData(ArrayList<Node> list) {
        Document doc = ASM_XML.parserData();
        DefaultTableModel model = (DefaultTableModel) tblTT.getModel();
        model.getDataVector().clear();

        for (int i = 0; i < list.size(); i++) {
            Vector row = new Vector();
            Node p = list.get(i);
            System.out.println(p);
            for (int j = 0; j < p.getChildNodes().getLength(); j++) {
                if (!p.getChildNodes().item(j).getNodeName().equals("#text")) {
                    row.addElement(p.getChildNodes().item(j).getTextContent());
                }
            }
            model.addRow(row);
            tblTT.setModel(model);
        }
    }

}
