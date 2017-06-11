

public class Strt extends javax.swing.JFrame 
{
    public Strt() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ans = new javax.swing.JTextArea();
        clr = new javax.swing.JButton();
        calc = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dist = new javax.swing.JTextField();
        mass = new javax.swing.JTextField();
        point = new javax.swing.JTextField();
        rot = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tim1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tim2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Linear Rotation");
        setBackground(java.awt.Color.white);
        setName("strt"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ans.setColumns(20);
        ans.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        ans.setRows(5);
        ans.setName(""); // NOI18N
        jScrollPane1.setViewportView(ans);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 330, 200));

        clr.setFont(new java.awt.Font("Centaur", 0, 20)); // NOI18N
        clr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recycle Bin Full.png"))); // NOI18N
        clr.setText("Clear solution");
        clr.setActionCommand("");
        clr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrActionPerformed(evt);
            }
        });
        jPanel1.add(clr, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 331, 50));

        calc.setFont(new java.awt.Font("Centaur", 0, 20)); // NOI18N
        calc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/math4.png"))); // NOI18N
        calc.setText("Calculate Parameters");
        calc.setActionCommand("");
        calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcActionPerformed(evt);
            }
        });
        jPanel1.add(calc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 390, 50));

        jLabel2.setBackground(java.awt.Color.white);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/load4.gif"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 40, 50, 50));

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Script MT Bold", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Linear Rotation");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 40));

        dist.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        dist.setText("3");
        jPanel1.add(dist, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 130, 30));

        mass.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        mass.setText("0.2");
        jPanel1.add(mass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 130, 30));

        point.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        point.setText("0.075");
        jPanel1.add(point, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 130, 30));

        rot.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        rot.setText("10");
        jPanel1.add(rot, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 130, 30));

        jLabel3.setBackground(java.awt.Color.white);
        jLabel3.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("d = ");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 50, 30));

        jLabel4.setBackground(java.awt.Color.white);
        jLabel4.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("m = ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 50, 30));

        jLabel5.setBackground(java.awt.Color.white);
        jLabel5.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("r = ");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 50, 30));

        jLabel6.setBackground(java.awt.Color.white);
        jLabel6.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("n = ");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 50, 30));

        tim1.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        tim1.setText("2");
        jPanel1.add(tim1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 130, 30));

        jLabel7.setBackground(java.awt.Color.white);
        jLabel7.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("t1 = ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 50, 30));

        jLabel8.setBackground(java.awt.Color.white);
        jLabel8.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("t2 = ");
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 50, 30));

        tim2.setFont(new java.awt.Font("Cambria Math", 0, 20)); // NOI18N
        tim2.setText("0.5");
        jPanel1.add(tim2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 130, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrActionPerformed
       ans.setText(null);    
       mass.requestFocus();
       
        
    }//GEN-LAST:event_clrActionPerformed

    private void calcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcActionPerformed
        
        
        double m = Double.parseDouble(mass.getText());
        double r = Double.parseDouble(point.getText());
        double d = Double.parseDouble(dist.getText());
        double t1 = Double.parseDouble(tim1.getText());
        double t2 = Double.parseDouble(tim2.getText());
        double n = Double.parseDouble(rot.getText());
        double l = 2*r;
       //Force Calculation_______________________
        double u = (2*Math.PI*r*r)/(3*t2*t2);
        double x = d/(t1*t1);
        double z = x+(n*u);
        double force = m*z;
      
        //Arc length calculation_________________
         
        
        double y = d/(2*n);
        double a = (d*d)/(16*l*n*n);
        
        double t = Math.sqrt((y*y)+(4*a*a));
        
        double h1 = n/(2*a);
        
        double h2 = y*t;
        double h3 = (y+t)/(2*a);
        //double logger = Math.log(h3);
        double logger = Math.log(h3);
        double l2 = (4*a*a)*logger;
        double l3 = (h2+l2);
        double s = h1*l3;
        
        
        //Object ratio
        double rho = m/l;
              
        
       ans.setText(null);
       ans.setText("F = " + force + " N\n" + "S = " + s + " m\n" + "R = " + rho + " kg/m\n");
    }//GEN-LAST:event_calcActionPerformed
    
    
    
    public static void main(String args[]) 
    {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Strt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Strt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Strt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Strt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Strt().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea ans;
    private javax.swing.JButton calc;
    private javax.swing.JButton clr;
    private javax.swing.JTextField dist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mass;
    private javax.swing.JTextField point;
    private javax.swing.JTextField rot;
    private javax.swing.JTextField tim1;
    private javax.swing.JTextField tim2;
    // End of variables declaration//GEN-END:variables
}
