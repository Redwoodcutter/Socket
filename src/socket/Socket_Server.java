/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket; //socket.java programı Socket_Server.java dosyasına tanıtıldı

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//java.net den ve java.io dan input outpu degişkenleri tanımlandı. server ve soket dosyaları belgeye import edildi.

/**
 *
 * @author Oğuz
 */
public class Socket_Server extends javax.swing.JFrame { //jframe olarak Socket_Server oluşturuldu.

    /**
     * Creates new form Socket_Server
     */
    
        static ServerSocket ss;
        static Socket s;
        static DataInputStream din;
        static DataOutputStream dout;
    public Socket_Server() { //Socket_Server adında bir fonksiyonda inherit componentsler fonksiyonu çaliştiriyor.
        initComponents();
    }

    //bu kısımları NetBeans Kendi otomatik olarak oluşturuyor ve dikkat edilmesi gereken yerleri hatirlatiyor.
    /**   
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        msj_area = new javax.swing.JTextArea();
        msj_text = new javax.swing.JTextField();
        msj_send = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        msj_area.setColumns(20);
        msj_area.setRows(5);
        jScrollPane2.setViewportView(msj_area);

        msj_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msj_textActionPerformed(evt);
            }
        });

        msj_send.setText("Gönder");
        msj_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msj_sendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(msj_text, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(msj_send, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msj_text, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(msj_send))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//ust kısım form application kismi olup NetBeans bu kısımları erişimi sadece desing kısmında veriyor burada yapilan işlem
// text alanlarının belirlenmesi ve butonların yapilandırılmasıdır.
    private void msj_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msj_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_msj_textActionPerformed

    private void msj_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msj_sendActionPerformed
        // TODO add your handling code here:
       try{
            String msgout=""; //string'in alınması için oluşturuan msgout komutana tanımlanan kod
            msgout = msj_text.getText().trim(); //server mesajını msgout satirina atayan komut
            dout.writeUTF(msgout); //server mesajını client gönderen komut.
       
       }catch(Exception e){
           //Exception komutunun işlenecegi yer.
       }
        
    }//GEN-LAST:event_msj_sendActionPerformed

//PREFERRED_SIZE olarak setvertical ve sethorizontal kısımlarında alanların boyutlandırılması kodları mevcut.
    
    
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
            java.util.logging.Logger.getLogger(Socket_Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Socket_Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Socket_Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Socket_Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Socket_Server().setVisible(true);
            }
        });
     
        String msgin="";//msgin'in boş olarak tanımlanması
     try{
         ss = new ServerSocket(1201); //Server Socket 1201 nolu porta oluşturuldu
         s =  ss.accept(); // oluşturulan port sokette kabul edildi.
         
         din = new DataInputStream(s.getInputStream()); //din degişkeninde yeni bir string alinması
         dout = new DataOutputStream(s.getOutputStream()); //cıkış kısmı için dout kısmında yeni stringlik yer alinması
         
         while(!msgin.equals("exit")){ //mesaj ekranı döngüsü oluşumu
             msgin = din.readUTF();// //gelen mesajin okunması
             msj_area.setText(msj_area.getText().trim()+"\n client: \t"+msgin); //msj_area (mesaj bölümü) de client'ten gönderilen mesajin gösterilmesini saglayan kod satiri.
         }
         
         
     }catch(Exception e){
         
     }
      
         
      
    }
 //yollanan kodun sendAction kısmında yollayacagı verilerin girilmesi fonksiyonu
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTextArea msj_area;
    private javax.swing.JButton msj_send;
    private javax.swing.JTextField msj_text;
    // End of variables declaration//GEN-END:variables


}
