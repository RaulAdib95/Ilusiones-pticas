import java.awt.Color;
import java.awt.Graphics;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author raula
 */
public class set3 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public set3() {
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

        jPanel1 = new javax.swing.JPanel(){
            protected void paintComponent(Graphics g) {
                super.paintComponent (g);
                int h = jPanel1.getHeight();
                int w = jPanel1.getWidth();
                for (int i =0; i <= w/2; i+=7){
                    // g.drawLine(w,0,w,h/2 );
                    // g.drawLine(w/2 -i,h, 0,h-i);
                    g.drawLine(0,h/2-i,i,0);
                    g.drawLine(0,h/2+i,i,h);

                    g.drawLine(w,h/2-i,w-i,0);
                    g.drawLine(w,h/2+i,w-i,h);

                    g.drawLine(i,h/2-i,w/2,i);
                    g.drawLine(w-i,h/2-i,w/2,i);
                    //Estrella
                    // g.drawLine(w/2,h/2+i,w/2+i,h/2+20);

                    //  g.drawLine(w/2,h/2+50,w/4,h-50);
                }
                for (int i =0; i <= w/4; i+=7){
                    g.drawLine(w/2,h/2+i,w/2-i,3*h/4);
                    g.drawLine(w/2,h/2+i,w/2+i,3*h/4);

                    g.drawLine(w/2,h-i,w/2-i,3*h/4);
                    g.drawLine(w/2,h-i,w/2+i,3*h/4);
                }

            }
        };
        jPanel2 = new javax.swing.JPanel(){
            protected void paintComponent(Graphics g) {
                super.paintComponent (g);
                int h = jPanel1.getHeight();
                int w = jPanel1.getWidth();

                for (int i = 0; i <= w/2; i+=7){
                    g.drawLine(i,h, w/2, h-i);
                    g.drawLine(w-i,h,w/2,h-i);
                    g.drawLine(i,0,w/2,i);
                    g.drawLine(w-i,0,w/2,i);
                    g.drawLine(0,i,i,h/2);
                    g.drawLine(0,h-i,i,h/2);
                    g.drawLine(w,h-i,w-i,h/2);
                    g.drawLine(w,i,w-i,h/2);
                }
            }
        };
        jPanel3 = new javax.swing.JPanel(){
            protected void paintComponent(Graphics g) {
                super.paintComponent (g);
                int h = jPanel3.getHeight();
                int w = jPanel3.getWidth();
                for (int i = 0; i <= w/2; i+=7){
                    g.drawLine(w/2,i, w/2+i, h/2-i);
                    g.drawLine(w/2,i, w/2-i, h/2-i);
                    //g.drawLine(w-i,h,w/2,h-i);

                    g.drawLine(w/2,h-i, w/2-i, h/2+i);
                    g.drawLine(w/2,h-i, w/2+i, h/2+i);
                    //g.drawLine(i,0,w/2,i);
                    //g.drawLine(w-i,0,w/2,i);

                    g.drawLine(0,i,i,h/2);
                    g.drawLine(0,h-i,i,h/2);
                    g.drawLine(w,h-i,w-i,h/2);
                    g.drawLine(w,i,w-i,h/2);
                }
            }
        };
        jPanel4 = new javax.swing.JPanel(){
            protected void paintComponent(Graphics g) {
                super.paintComponent (g);
                int h = jPanel4.getHeight();
                int w = jPanel4.getWidth();
                for (int i =0; i <= w/2; i+=7){

                    g.drawLine(0,h/2+i,i,h);
                    g.drawLine(w,h/2+i,w-i,h);

                    g.drawLine(w/2,i, w/2+i, h/2-i);
                    g.drawLine(w/2,i, w/2-i, h/2-i);
                }
                for (int i =0; i <= w/4; i+=7){
                    g.drawLine(w/2,h/2+i,w/2-i,3*h/4);
                    g.drawLine(w/2,h/2+i,w/2+i,3*h/4);

                    g.drawLine(w/2,h-i,w/2-i,3*h/4);
                    g.drawLine(w/2,h-i,w/2+i,3*h/4);
                }

            }
        };
        jPanel5 = new javax.swing.JPanel(){
            protected void paintComponent(Graphics g) {
                super.paintComponent (g);
                int h = jPanel5.getHeight();
                int w = jPanel5.getWidth();

                for (int i =0; i <= w/4; i+=7){

                }

                for (int i =0; i <= w/2; i+=7){
                    g.drawLine(i,h, w/2, h-i);
                    g.drawLine(w-i,h,w/2,h-i);
                    g.drawLine(i,0,w/2,i);
                    g.drawLine(w-i,0,w/2,i);

                    //lateral derecho
                    g.drawLine(i,i,w/2-i,h/2+i);

                    //Lateral izquierdo
                    g.drawLine(w-i,i,w/2+i,h/2+i);
                }

            }
        };
        jPanel6 = new javax.swing.JPanel(){
            protected void paintComponent(Graphics g) {
                super.paintComponent (g);
                int h = jPanel6.getHeight();
                int w = jPanel6.getWidth();

                for (int i =0; i <= w; i+=10){
                    g.drawLine(0,h-i,i,0);

                    g.drawLine(i,h,w,h-i);

                }

            }
        };
        jPanel7 = new javax.swing.JPanel(){
            protected void paintComponent(Graphics g) {
                super.paintComponent (g);
                int h = jPanel7.getHeight();
                int w = jPanel7.getWidth();

                for (int i =0; i <= w/2; i+=10){
                    g.drawLine(0,h/2-i,i,0);
                    g.drawLine(w,h/2-i,w-i,0);

                    g.drawLine(i,h-i,w/2,h/2-i);
                    g.drawLine(w-i,h-i,w/2,h/2-i);

                    g.drawLine(i,h-i,w/2+i,h/2+i);
                }
                for (int i =0; i <= w/4; i+=10){
                    g.drawLine(w/2,3*h/4+i,w/2-i,h);
                    g.drawLine(w/2,3*h/4+i,w/2+i,h);
                }

            }
        };
        jPanel8 = new javax.swing.JPanel(){
            protected void paintComponent(Graphics g) {
                super.paintComponent (g);
                int h = jPanel8.getHeight();
                int w = jPanel8.getWidth();

                for (int i =0; i <= w/2; i+=10){
                    g.drawLine(w/2-i,h/2,i,h/2-i);
                    g.drawLine(w/2-i,h/2,i,h/2+i);

                    g.drawLine(w/2+i,h/2,w-i,h/2-i);
                    g.drawLine(w/2+i,h/2,w-i,h/2+i);

                    g.drawLine(i,0,w/2-i,i);
                    g.drawLine(w-i,0,w/2+i,i);

                    g.drawLine(i,h,w/2-i,h-i);
                    g.drawLine(w-i,h,w/2+i,h-i);
                }

            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));  jPanel3.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel4.setPreferredSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel5.setPreferredSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel6.setPreferredSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel7.setPreferredSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel8.setPreferredSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(set3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(set3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(set3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(set3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new set3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
