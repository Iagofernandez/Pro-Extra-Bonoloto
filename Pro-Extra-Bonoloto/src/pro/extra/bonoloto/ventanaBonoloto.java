/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro.extra.bonoloto;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author ifernandezblanco
 */
public class ventanaBonoloto extends javax.swing.JFrame {

    /**
     * Creates new form ventanaBonoloto
     */
    public ventanaBonoloto() {
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

        jPanel1 = new javax.swing.JPanel();
        NumeroJugador = new javax.swing.JTextField();
        Acierto = new javax.swing.JTextField();
        NumeroMaquina = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Suerte = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 255, 102));

        NumeroJugador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        NumeroJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroJugadorActionPerformed(evt);
            }
        });

        Acierto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        NumeroMaquina.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Abyssinica SIL", 1, 12)); // NOI18N
        jLabel1.setText("Números Jugador");

        jLabel2.setFont(new java.awt.Font("Abyssinica SIL", 1, 12)); // NOI18N
        jLabel2.setText("Numeros Maquina");

        jLabel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3.setFont(new java.awt.Font("Abyssinica SIL", 1, 12)); // NOI18N
        jLabel3.setText("Premio");

        Suerte.setBackground(new java.awt.Color(153, 153, 255));
        Suerte.setForeground(new java.awt.Color(0, 0, 0));
        Suerte.setText("Suerte!");
        Suerte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuerteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("URW Gothic L", 1, 12)); // NOI18N
        jLabel4.setText("Loteria El Gato de la Suerte");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(Suerte))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Acierto, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(NumeroJugador, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                                .addComponent(NumeroMaquina))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel4)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumeroJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Acierto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NumeroMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Suerte)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SuerteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuerteActionPerformed
        
        int num1 = 0, num2=0, num3=0, num4=0, num5=0, num6=0;
         num1=Integer.parseInt(JOptionPane.showInputDialog("Cual número es el primero?"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Cual número es el segundo?"));
        num3=Integer.parseInt(JOptionPane.showInputDialog("Cual número es el tercero?"));
        num4=Integer.parseInt(JOptionPane.showInputDialog("Cual número será el cuarto"));
        num5=Integer.parseInt(JOptionPane.showInputDialog("Cual número será el quinto?"));
        num6=Integer.parseInt(JOptionPane.showInputDialog("Cual número será el sexto?"));
        
        if(num1==num2||num1==num3||num1==num4||num1==num5||num1==num6){
            JOptionPane.showMessageDialog(null, "No repitas valores tontolculo");
            
        }else if(num2==num1||num2==num3||num2==num4||num2==num5||num2==num6){
            JOptionPane.showMessageDialog(null, "No repitas valores tontolculo");
        }else if(num3==num1||num3==num2||num3==num4||num3==num5||num3==num6){
            JOptionPane.showMessageDialog(null, "No repitas valores tontolculo");
             }else if(num4==num1||num4==num2||num4==num3||num4==num5||num4==num6){
            JOptionPane.showMessageDialog(null, "No repitas valores tontolculo");
            }else if(num5==num1||num5==num2||num5==num3||num5==num4||num5==num6){
            JOptionPane.showMessageDialog(null, "No repitas valores tontolculo");
             }else if(num6==num1||num6==num2||num6==num3||num6==num4||num6==num5){
            JOptionPane.showMessageDialog(null, "No repitas valores tontolculo");
             }
            if(num1>49||num1<0){
            JOptionPane.showMessageDialog(null, "No puede el numero 1 superar la cifra 49/ser inferior que 0");
        }else if(num2>49||num2<0){
            JOptionPane.showMessageDialog(null, "No puede el numero 2 superar la cifra 49/ser inferior que 0");
        }else if(num3>49||num3<0){
            JOptionPane.showMessageDialog(null, "No puede el numero 3 superar la cifra 49/ser inferior que 0");
        }else if(num4>49||num4<0){
            JOptionPane.showMessageDialog(null, "No puede el numero 4 superar la cifra 49/ser inferior que 0");
            }else if(num5>49||num5<0){
            JOptionPane.showMessageDialog(null, "No puede el numero 5 superar la cifra 49/ser inferior que 0");
            }else if(num6>49||num6<0){
            JOptionPane.showMessageDialog(null, "No puede el numero 6 superar la cifra 49/ser inferior que 0");
            }else{
        

        ArrayList numeroJ = new ArrayList<>();
        numeroJ.add(num1);
        numeroJ.add(num2);
        numeroJ.add(num3);
        numeroJ.add(num4);
        numeroJ.add(num5);
        numeroJ.add(num6);

        NumeroJugador.setText("[" + num1 + ", "+ num2 + ", " + num3 + ", " + num4 + ", " + num5 + ", " + num6+"]");
    int numM;
    ArrayList numerosM = new ArrayList<>();
        for(int i=0;i<=5;i++){
            numM = (int) (Math.random()*49+1);

            if (numerosM.contains(numM)){
                i--;
            }else{
                numerosM.add(numM);
            }
            for (Object n : numerosM) {
                Acierto.setText("" + numerosM);
                
                
            }
           
            }if(numeroJ==numerosM){
               NumeroMaquina.setText("Comprate una casa en Gandía, has ganado la loto!!!");
            }else{
                NumeroMaquina.setText("Para la próxima el ferrari, sigue intentándolo");
        }
        
        }
        
    }//GEN-LAST:event_SuerteActionPerformed

    private void NumeroJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroJugadorActionPerformed
        
    }//GEN-LAST:event_NumeroJugadorActionPerformed





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
            java.util.logging.Logger.getLogger(ventanaBonoloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaBonoloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaBonoloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaBonoloto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaBonoloto().setVisible(true);
            }
        });
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Acierto;
    private javax.swing.JTextField NumeroJugador;
    private javax.swing.JTextField NumeroMaquina;
    private javax.swing.JButton Suerte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

