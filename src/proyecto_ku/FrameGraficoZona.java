/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_ku;

import java.awt.Image;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author JHPAT
 */
public class FrameGraficoZona extends javax.swing.JFrame {

    String url;
    /**
     * Creates new form FrameGraficoZona
     */
    
    public FrameGraficoZona(){
        
    }
    
    //Sobrepongo la clase con ingreso de valores
    public FrameGraficoZona(int posicion) {
        initComponents();
        this.setLocationRelativeTo(null);
        //Instancio la clase Zonas
        int posicionNormal=posicion+1;
        Zonas zona = new Zonas(posicionNormal);
        zona.Interface();
        
        
        //Inserto los valores del titulo
        jLabel_Nombre.setText(zona.getNombre());
        //Inserto los valores del la imagen
        Icon icon = new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("Imagenes/Img" + posicionNormal + ".png")).getImage().getScaledInstance(294, 262, Image.SCALE_DEFAULT)); 
        jLabel_Imagenes.setIcon(icon);
        //Inserto los valores del texto
        jTextArea_Info.setText(zona.getInformacion());
        //Inserto los valores del texto
        jTextArea_Extra.setText(zona.getDatosExtra());
        //
        //Inserto los valores del la imagen del mapa
        Icon icon_mapa = new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("Imagenes/Mapa" + posicionNormal + ".png")).getImage().getScaledInstance(210, 178, Image.SCALE_DEFAULT)); 
        jLabel_Mapa.setIcon(icon_mapa);
        
        url = zona.getUrlMapa();
         //JOptionPane.showMessageDialog(null, posicion);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel_Imagenes = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_datos = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel_Mapa = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Extra = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jLabel_Nombre = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_Info = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_Imagenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ruina_ejemplo.png"))); // NOI18N
        jLabel_Imagenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ImagenesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Imagenes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Imagenes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 320, 290));

        jPanel3.setBackground(new java.awt.Color(255, 102, 51));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jLabel_datos.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel_datos.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_datos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_datos.setText("Datos curiosos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_datos)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_datos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 280, 70));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "\"VER EN EL MAPA\"", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel_Mapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mapa1.png"))); // NOI18N
        jLabel_Mapa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MapaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Mapa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Mapa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 240, 210));

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 380, 10));

        jTextArea_Extra.setEditable(false);
        jTextArea_Extra.setColumns(20);
        jTextArea_Extra.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea_Extra.setRows(5);
        jTextArea_Extra.setText("Hola como estas \nmira que alto estas");
        jScrollPane1.setViewportView(jTextArea_Extra);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 590, 130));

        jPanel6.setBackground(new java.awt.Color(255, 102, 51));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jLabel_Nombre.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Nombre.setText("Zona Arqueológica de Tulum");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Nombre)
                .addContainerGap())
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 580, 70));

        jTextArea_Info.setEditable(false);
        jTextArea_Info.setColumns(20);
        jTextArea_Info.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea_Info.setRows(5);
        jTextArea_Info.setText("Hola como estas \nmira que alto estas");
        jScrollPane2.setViewportView(jTextArea_Info);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 620, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Regresar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        jLabel_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_piedra.png"))); // NOI18N
        jPanel1.add(jLabel_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        //inciio el menu
        Menu_Principal Menu = new Menu_Principal();
        Menu.test_list();
        Menu.setVisible(true);
        
        //Cierro el Jframe
        FrameGraficoZona zonas = new FrameGraficoZona();
        zonas.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        super.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel_ImagenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ImagenesMouseClicked
        
    }//GEN-LAST:event_jLabel_ImagenesMouseClicked

    private void jLabel_MapaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MapaMouseClicked
        // TODO add your handling code here:
        
        if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
             
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri = new java.net.URI(url);
                    desktop.browse(uri);
                }catch(URISyntaxException | IOException ex){}
            }
        }
    }//GEN-LAST:event_jLabel_MapaMouseClicked

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
            java.util.logging.Logger.getLogger(FrameGraficoZona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameGraficoZona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameGraficoZona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameGraficoZona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameGraficoZona().setVisible(true);
            }
        });
    }

    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Fondo;
    private javax.swing.JLabel jLabel_Imagenes;
    private javax.swing.JLabel jLabel_Mapa;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_datos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea_Extra;
    private javax.swing.JTextArea jTextArea_Info;
    // End of variables declaration//GEN-END:variables
}
