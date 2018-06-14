package Interfaz;

import Codigo.*;

public class Panel_Visual extends javax.swing.JFrame {

    boolean SiEs = false;
    String[][] tabla = new String[8][8];

    public Panel_Visual() {
        initComponents();
        ErrorTxt.setVisible(false);
        for (int i = 0; i < UbicacionTable.getRowCount(); i++) {
            for (int j = 0; j < UbicacionTable.getColumnCount(); j++) {
                UbicacionTable.setValueAt(null, i, j);

            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CantidadTxt = new javax.swing.JTextField();
        BorrarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        UbicacionTable = new javax.swing.JTable();
        ResetearBtn = new javax.swing.JButton();
        ResolverBtn = new javax.swing.JButton();
        ErrorTxt = new javax.swing.JTextArea();
        ErrorTxt1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CantidadTxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        BorrarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BorrarBtn.setText("Borrar Reina");
        BorrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarBtnActionPerformed(evt);
            }
        });

        UbicacionTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UbicacionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(UbicacionTable);
        if (UbicacionTable.getColumnModel().getColumnCount() > 0) {
            UbicacionTable.getColumnModel().getColumn(0).setResizable(false);
            UbicacionTable.getColumnModel().getColumn(1).setResizable(false);
            UbicacionTable.getColumnModel().getColumn(2).setResizable(false);
            UbicacionTable.getColumnModel().getColumn(3).setResizable(false);
            UbicacionTable.getColumnModel().getColumn(4).setResizable(false);
            UbicacionTable.getColumnModel().getColumn(5).setResizable(false);
            UbicacionTable.getColumnModel().getColumn(6).setResizable(false);
            UbicacionTable.getColumnModel().getColumn(7).setResizable(false);
        }

        ResetearBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ResetearBtn.setText("Reiniciar");
        ResetearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetearBtnActionPerformed(evt);
            }
        });

        ResolverBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ResolverBtn.setText("Resolver");
        ResolverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResolverBtnActionPerformed(evt);
            }
        });

        ErrorTxt.setEditable(false);
        ErrorTxt.setBackground(new java.awt.Color(214, 217, 223));
        ErrorTxt.setColumns(20);
        ErrorTxt.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        ErrorTxt.setRows(5);
        ErrorTxt.setText("Digite una ubicación valida,\nrecuerde que es \"fila, columna\",\nSi no, no digite números mayores\na 8 y no intente hacer mas de 3\ncoordenadas!!!");
        ErrorTxt.setBorder(null);
        ErrorTxt.setFocusable(false);

        ErrorTxt1.setEditable(false);
        ErrorTxt1.setBackground(new java.awt.Color(214, 217, 223));
        ErrorTxt1.setColumns(20);
        ErrorTxt1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        ErrorTxt1.setRows(5);
        ErrorTxt1.setText("Bienvenido al problema de las \nreinas, digite coordenadas (\"n,m\")\npara ubicar a la reina, puedes\nubicarlas manualmente o pulsa el \nboton de resolver... :D");
        ErrorTxt1.setBorder(null);
        ErrorTxt1.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ResolverBtn)
                                    .addComponent(BorrarBtn))
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(ResetearBtn)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CantidadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ErrorTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ErrorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ErrorTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CantidadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BorrarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ResolverBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ResetearBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 23, Short.MAX_VALUE)
                .addComponent(ErrorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BorrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarBtnActionPerformed
        String[] coordenadas = CantidadTxt.getText().trim().split(",");
        int i = 0, j = 0, ubf = 0, ubc = 0;
        try {
            for (i = 0; i < coordenadas.length; i++) {
                SiEs = Integer.parseInt(coordenadas[i]) >= 0 && Integer.parseInt(coordenadas[i]) < 8;
            }
            if (SiEs == true && coordenadas.length == 2) {
                ProcesosR proceso = new ProcesosR();
                ErrorTxt.setVisible(false);
                ubf = Integer.parseInt(coordenadas[0]);
                ubc = Integer.parseInt(coordenadas[1]);
                proceso.borrarReina(ubf, ubc, tabla);

                //Ubicar en la tabla
                for (i = 0; i < tabla.length; i++) {
                    for (j = 0; j < tabla.length; j++) {
                        UbicacionTable.setValueAt(tabla[i][j], i, j);
                    }

                }
            } else {
                ErrorTxt.setVisible(true);
            }
        } catch (Exception e) {
            ErrorTxt.setVisible(true);
        }

    }//GEN-LAST:event_BorrarBtnActionPerformed

    private void ResetearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetearBtnActionPerformed
        for (int i = 0; i < UbicacionTable.getRowCount(); i++) {
            for (int j = 0; j < UbicacionTable.getColumnCount(); j++) {
                UbicacionTable.setValueAt(null, i, j);
                tabla[i][j] = null;
            }
        }
    }//GEN-LAST:event_ResetearBtnActionPerformed

    private void ResolverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResolverBtnActionPerformed
        String[] coordenadas = CantidadTxt.getText().trim().split(",");
        int i = 0, j = 0, ubf = 0, ubc = 0;
        try {
            for (i = 0; i < coordenadas.length; i++) {
                SiEs = Integer.parseInt(coordenadas[i]) >= 0 && Integer.parseInt(coordenadas[i]) < 8;
            }
            if (SiEs == true && coordenadas.length == 2) {
                ErrorTxt.setVisible(false);
                ProcesosR proceso = new ProcesosR();
                ubf = Integer.parseInt(coordenadas[0]);
                ubc = Integer.parseInt(coordenadas[1]);
                proceso.resolverReina(tabla, ubf, ubc);
                //Ubicar en la tabla
                for (i = 0; i < tabla.length; i++) {
                    for (j = 0; j < tabla.length; j++) {
                        UbicacionTable.setValueAt(tabla[i][j], i, j);
                    }

                }
            } else {
                ErrorTxt.setVisible(true);
            }
        } catch (Exception e) {
            ErrorTxt.setVisible(true);
        }
    }//GEN-LAST:event_ResolverBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Panel_Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel_Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel_Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel_Visual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel_Visual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BorrarBtn;
    private javax.swing.JTextField CantidadTxt;
    private javax.swing.JTextArea ErrorTxt;
    private javax.swing.JTextArea ErrorTxt1;
    private javax.swing.JButton ResetearBtn;
    private javax.swing.JButton ResolverBtn;
    private javax.swing.JTable UbicacionTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
