/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1luisleonardoriveratierrafria19030342;

import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * Luis Leonardo Rivera Tierrafría 
 */
public class GraphicalInterface extends javax.swing.JFrame {

    
    public GraphicalInterface() {
       
        initComponents();
        ArrayList<Games> games = new ArrayList<>();
        games.add(new Games ("Touhou project","PC","Digital",LocalDate.ofYearDay(1996, 305),Company.TEAM_SHANGAI_ALICE));
        games.add(new Games ("Undertale","PC","Digital",LocalDate.ofYearDay(2015, 158),Company.INDIE_DEVELOPER));
        games.add(new Games ("Fallout 3","Varios","Físico",LocalDate.ofYearDay(2008, 301),Company.BETHESDA));
        games.add(new Games ("Team Fortress","PC","Digital",LocalDate.ofYearDay(1996, 301),Company.STEAM));
        ArrayList<Developer> devs = new ArrayList<>();
        devs.add(new Developer("ZUN", "Japanese",LocalDate.ofYearDay(1977, 77), Developer.Company.TEAM_SHANGAI_ALICE));
        devs.add(new Developer("Toby Fox", "American",LocalDate.ofYearDay(1991, 284), Developer.Company.INDIE_DEVELOPER));
        devs.add(new Developer("Todd Howard", "American",LocalDate.ofYearDay(1971, 115), Developer.Company.BETHESDA));
        devs.add(new Developer("Gabe Newell", "American",LocalDate.ofYearDay(2007, 283), Developer.Company.STEAM));     
        
        
        btn.addActionListener((ActionEvent ae)-> {
            txtResult.setText("");
        devs.stream().forEach((t) -> {  
            txtResult.append(t.toString() +"\n");
        });
        
    });    
        btnConsultarJuegos.addActionListener((ActionEvent ae)-> {
            txtResult.setText("");
            games.stream().forEach((t) -> {
            txtResult.append(t.toString() + "\n");
            
        });
    });            
        btnConsultByNameCompany.addActionListener((ActionEvent ae)-> {
            txtResult.setText("");
            devs.stream().forEach((t) -> {
               if (t.getCompany().toString().equals(txtConsultByNameCompany.getText())) 
               txtResult.append("El desarrollador "+ t.toString() + " trabaja en "+t.getCompany()+"\n" );
               
               else
                   System.out.println("");
           });
            games.stream().forEach((t) -> {
               if (t.getCompany().toString().equals(txtConsultByNameCompany.getText())) 
               txtResult.append("El juego "+t.toString() + "lo desarrollo "+t.getCompany()+"\n");
               else
                   System.out.println("");
           });            

     });  
       btnDeveloperAdd.addActionListener((ActionEvent ae)-> {
            devs.add(new Developer(txtName.getText(), txtNacionalidad.getText(), LocalDate.parse(txtDate.getText()), Developer.Company.valueOf(txtCompañia.getText().toUpperCase())));
           
       });
           btnGameAdd.addActionListener((ActionEvent ae)-> {   
           games.add(new Games(txtName2.getText(), txtPlataform.getText(), txtFormato2.getText(), LocalDate.parse(txtDate.getText()), Company.valueOf(txtCompañia2.getText().toUpperCase())));
           });    
    }  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        btnConsultarJuegos = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        txtConsultByNameCompany = new javax.swing.JTextField();
        btnConsultByNameCompany = new javax.swing.JButton();
        txtResult = new java.awt.TextArea();
        btnDeveloperAdd = new javax.swing.JToggleButton();
        btnGameAdd = new javax.swing.JToggleButton();
        txtName = new javax.swing.JTextField();
        txtName2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        txtFecha2 = new javax.swing.JTextField();
        txtCompañia = new javax.swing.JTextField();
        txtCompañia2 = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        txtFormato2 = new javax.swing.JTextField();
        txtPlataform = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn.setText("Consultar Desarrolladores");
        btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn.setFocusable(false);

        jLabel1.setText("Bienvenido usuario,¿Que desea hacer?");

        btnConsultarJuegos.setText("Consultar juegos");
        btnConsultarJuegos.setFocusPainted(false);

        jLabel2.setText("Consultar por Nombre de Compañia");

        btnConsultByNameCompany.setText("Consultar");

        btnDeveloperAdd.setText("Agregar Desarrollador");

        btnGameAdd.setText("Agregar Juego");

        jLabel3.setText("Nombre");

        jLabel4.setText("Fecha");

        jLabel5.setText("Compañia");

        jLabel6.setText("Nacionalidad");

        jLabel7.setText("Formato");

        jLabel8.setText("Plataforma");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnConsultarJuegos))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtConsultByNameCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnConsultByNameCompany))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDeveloperAdd)
                                    .addComponent(btnGameAdd))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(txtName2))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                    .addComponent(txtFecha2))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCompañia)
                                    .addComponent(txtCompañia2, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtFormato2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPlataform, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLabel3)
                .addGap(74, 74, 74)
                .addComponent(jLabel4)
                .addGap(45, 45, 45)
                .addComponent(jLabel5)
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(0, 67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeveloperAdd)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCompañia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGameAdd)
                    .addComponent(txtName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCompañia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFormato2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlataform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsultarJuegos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtConsultByNameCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultByNameCompany))
                .addGap(17, 17, 17)
                .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            java.util.logging.Logger.getLogger(GraphicalInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraphicalInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraphicalInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraphicalInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraphicalInterface().setVisible(true);
        
            }
        });

    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn;
    private javax.swing.JButton btnConsultByNameCompany;
    private javax.swing.JToggleButton btnConsultarJuegos;
    private javax.swing.JToggleButton btnDeveloperAdd;
    private javax.swing.JToggleButton btnGameAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtCompañia;
    private javax.swing.JTextField txtCompañia2;
    private javax.swing.JTextField txtConsultByNameCompany;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtFecha2;
    private javax.swing.JTextField txtFormato2;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtName2;
    private javax.swing.JTextField txtPlataform;
    private java.awt.TextArea txtResult;
    // End of variables declaration//GEN-END:variables
}