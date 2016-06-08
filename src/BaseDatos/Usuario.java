package BaseDatos;



import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author werner
 */




public class Usuario extends javax.swing.JFrame {


    /**
     * Creates new form Usuario
     */
    String usuario;
    String contraseña;
    
    
    Parametros p = new Parametros();
   EstudioEstadistico e= new EstudioEstadistico();
   
   
    public Usuario() {
        initComponents();
    }
    
    
    public void obtenerDatos(){
        this.usuario=this.txt_Usuario.getText();
        this.contraseña=this.txt_Contraseña.getText();
    }
    /*
    Creamos el metodo para validar el usuario
    */
    
    
    public void validar(){
        this.obtenerDatos();
         String sql ="select * from usuario where Nombre=? and Contraseña=?";
    try{
       p.prepararConexion(sql);
       p.pst.setString(1, this.usuario);
      
       p.pst.setString(2, this.contraseña);
       
       p.ejecutar();
       if(p.rs.next()){
           JOptionPane.showMessageDialog(rootPane, "Usuario y contraseña correctos");
            e.ObtenerUsuario(usuario);
//            e.jTextField1.setText(usuario); //Establece la variable usuario en el formulario EE
            e.setVisible(true);
           
            
//           Datos d = new Datos();
//           d.setVisible(true);
           this.setVisible(false);
           
       }
       else{
           JOptionPane.showMessageDialog(rootPane, "El usuario o la contraseña son incorrectos");
         
       }
    
    }catch(Exception e){
        JOptionPane.showMessageDialog(rootPane, e);
    }
    }//Finaliza el metodo que valida el usuario

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_Usuario = new javax.swing.JTextField();
        Ingresar = new javax.swing.JButton();
        txt_Contraseña = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Usuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 310, 50));

        Ingresar.setBackground(new java.awt.Color(147, 60, 79));
        Ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iniciar.png"))); // NOI18N
        Ingresar.setBorderPainted(false);
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });
        getContentPane().add(Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 110, 60));

        txt_Contraseña.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_Contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_ContraseñaKeyPressed(evt);
            }
        });
        getContentPane().add(txt_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 310, 50));

        jButton1.setBackground(new java.awt.Color(147, 60, 79));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrar.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 110, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logine.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
        this.validar();
      
       
        
    }//GEN-LAST:event_IngresarActionPerformed

    private void txt_ContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ContraseñaKeyPressed
         int key = evt.getKeyCode();
    if (key == KeyEvent.VK_ENTER) {  
        this.validar();
        }else{
     
      // JOptionPane.showMessageDialog(rootPane, "Dato Guardado Exitosamente");
       
    
}
        
// TODO add your handling code here:
    }//GEN-LAST:event_txt_ContraseñaKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     RegistrarUsuario u = new RegistrarUsuario();
     u.setVisible(true);
    this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ingresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txt_Contraseña;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}
