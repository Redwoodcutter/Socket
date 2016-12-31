/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket;

import java.io.DataInputStream; //veri girişi degişkeninin client kısmında tanımlanması
import java.io.DataOutputStream; //veri cıkışı degişkeninin client kısmında tanımlanması
import java.net.ServerSocket; //Server socket degişkeninin client kısmında tanımlanması
import java.net.Socket; //soket degişkeninin client kısmında tanımlanması

/**
 *
 * @author Oğuz
 */
public class Socket_Client extends javax.swing.JFrame { //jframe sınıfının socket_client adında cagirilmasi

    /**
     * Creates new form Socket_Client
     */
    
    static Socket s; // socket degişkeninin s olarak adı degiştirilmesi (typedef struct struct ogrenci gibi)
    static DataInputStream din; // data giriş kısmının din olarak kısaltılması
    static DataOutputStream dout; // veri cıkış kısmının dout olarak kısaltılması
    
    public Socket_Client() { 
        initComponents(); //degişkenlerin bulundugu fonksiyonun tanımlanması
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
        msj_area = new javax.swing.JTextArea();
        msj_text = new javax.swing.JTextField();
        msj_send = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        msj_area.setColumns(20);
        msj_area.setRows(5);
        jScrollPane1.setViewportView(msj_area);

        msj_text.setToolTipText("");
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
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(msj_text, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(msj_send, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msj_text, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msj_send))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//initcomponents yani form uygulamalarının yazıldıgı ve boyutlarının yerlerinin belirlendigi kısım üstteki parantez içidir.
    
    
    private void msj_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msj_textActionPerformed
        // TODO add your handling code here:
       //mesaj textt kısmının fonksiyonu.
    }//GEN-LAST:event_msj_textActionPerformed

    private void msj_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msj_sendActionPerformed
        // TODO add your handling code here:
        //yollanan kodun sendAction kısmında yollayacagı verilerin girilmesi fonksiyonu
         try { //try catch blogunun oluşturulması ve hafızada veri tutulması
            String msgout=""; //girilen yazının msgout olarak string seklinde alınması
            msgout = msj_text.getText().trim(); // msj_text ile yazılan string'in msgout kısmına atanması
            dout.writeUTF(msgout); //server kısmına gönderilecek verinin writeUTF ile yazilmasi.
        }catch(Exception e){
           
        }
    }//GEN-LAST:event_msj_sendActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) { // kod ana kısmı
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
            java.util.logging.Logger.getLogger(Socket_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Socket_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Socket_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Socket_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Socket_Client().setVisible(true);
            }
        });
            
        try{
            s = new Socket("127.0.0.1",1201);//  local ip adresini s soketine atiyoruz
            din = new DataInputStream(s.getInputStream()); //din degişkenine yeni data girişi atiyoruz
            dout = new DataOutputStream(s.getOutputStream()); //dout degişkenine cikiş degişkeni atiyoruz
            String msgin=""; //string boş mesaj
            while(!msgin.equals("exit")){ //mesaj dongusu oluşumu
                msgin = din.readUTF(); //giriş degişkenini okuyan kod satiri
                msj_area.setText(msj_area.getText().trim()+"\n Server: \t"+msgin); //mesaj area kısmına yazını bastıran kod satiri
            }
        }catch(Exception e){
            
        }
    }
//jframe || swing ile form kısmındaki text area ve butonların degişkenlere atanması kısmı alttadır.
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTextArea msj_area;
    private javax.swing.JButton msj_send;
    private javax.swing.JTextField msj_text;
    // End of variables declaration//GEN-END:variables
}
