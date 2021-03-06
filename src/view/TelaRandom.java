/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.EventQueue;
import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Timer;
import java.util.TimerTask;
import static view.TelaRodadas.qtdRod;



/**
 *
 * @author Igor
 */
public class TelaRandom extends javax.swing.JFrame {
    
    Minuto minuto;
    Segundo segundo;
    Milesimos milesimo;
    Thread Tmin, Tsec, Tmil;
    

    /**
     * Creates new form TelaRandom
     */
    public TelaRandom() {
        initComponents();
        milesimo = new Milesimos();
        Tmil = new Thread(milesimo);
        
        minuto = new Minuto();
        Tmin = new Thread(minuto);
        
        segundo = new Segundo();
        Tsec = new Thread(segundo);
        
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
        lblRandom = new javax.swing.JLabel();
        btmRelatorio = new javax.swing.JToggleButton();
        bmrStartar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSegundos = new javax.swing.JTextField();
        txtMinutos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMilesimos = new javax.swing.JTextField();
        btm0 = new javax.swing.JButton();
        btm1 = new javax.swing.JButton();
        btm2 = new javax.swing.JButton();
        btm3 = new javax.swing.JButton();
        btm4 = new javax.swing.JButton();
        btm5 = new javax.swing.JButton();
        btm6 = new javax.swing.JButton();
        btm7 = new javax.swing.JButton();
        btm8 = new javax.swing.JButton();
        btm9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PRAEGRESSUS");

        lblRandom.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblRandom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btmRelatorio.setText("Relat??rio");
        btmRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmRelatorioActionPerformed(evt);
            }
        });

        bmrStartar.setText("Startar Rodadas");
        bmrStartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmrStartarActionPerformed(evt);
            }
        });

        jLabel5.setText(":");

        jLabel6.setText("Tempo:");

        txtSegundos.setText("0");
        txtSegundos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSegundosActionPerformed(evt);
            }
        });

        txtMinutos.setText("0");
        txtMinutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinutosActionPerformed(evt);
            }
        });

        jLabel7.setText(":");

        txtMilesimos.setText("0");

        btm0.setText("0");
        btm0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm0ActionPerformed(evt);
            }
        });

        btm1.setText("1");
        btm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm1ActionPerformed(evt);
            }
        });

        btm2.setText("2");
        btm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm2ActionPerformed(evt);
            }
        });

        btm3.setText("3");
        btm3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm3ActionPerformed(evt);
            }
        });

        btm4.setText("4");
        btm4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm4ActionPerformed(evt);
            }
        });

        btm5.setText("5");
        btm5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm5ActionPerformed(evt);
            }
        });

        btm6.setText("6");
        btm6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm6ActionPerformed(evt);
            }
        });

        btm7.setText("7");
        btm7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm7ActionPerformed(evt);
            }
        });

        btm8.setText("8");
        btm8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm8ActionPerformed(evt);
            }
        });

        btm9.setText("9");
        btm9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtMinutos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btm1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                .addComponent(btm0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMilesimos, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bmrStartar)
                        .addGap(18, 18, 18)
                        .addComponent(btmRelatorio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btm3, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(btm2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btm4, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                            .addComponent(btm5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btm7, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(btm6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btm9, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                            .addComponent(btm8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 92, Short.MAX_VALUE)
                .addComponent(lblRandom, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRandom, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btm0)
                    .addComponent(btm2)
                    .addComponent(btm4)
                    .addComponent(btm6)
                    .addComponent(btm8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btm1)
                    .addComponent(btm3)
                    .addComponent(btm5)
                    .addComponent(btm7)
                    .addComponent(btm9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btmRelatorio)
                        .addComponent(bmrStartar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel7)
                        .addComponent(txtMilesimos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static Integer getNs() {
        return ns;
    }

    public static void setNs(Integer ns) {
        TelaRandom.ns = ns;
    }

    public static Integer getNm() {
        return nm;
    }

    public static void setNm(Integer nm) {
        TelaRandom.nm = nm;
    }

    public static Integer getNt() {
        return nt;
    }

    public static void setNt(Integer nt) {
        TelaRandom.nt = nt;
    }
    static Integer ns;
    static Integer nm;
    static Integer nt;

    public static Integer getN1() {
        return n1;
    }

    public static void setN1(Integer n1) {
        TelaRandom.n1 = n1;
    }

    public static Integer getN2() {
        return n2;
    }

    public static void setN2(Integer n2) {
        TelaRandom.n2 = n2;
    }

    static Integer n1;
    static Integer n2;
    
    private void btmRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmRelatorioActionPerformed
        TelaRelatorio TelaRelat = new TelaRelatorio();                  
        TelaRelat.setVisible(true);
        this.dispose();
        
        ns = Integer.parseInt(txtSegundos.getText());
        nm = Integer.parseInt(txtMinutos.getText());
        
        //Integer.parseInt(jtf_Idade.getText());
        n1 = Integer.parseInt(txtSegundos.getText());
        n2 = Integer.parseInt(txtMinutos.getText());
        
    }//GEN-LAST:event_btmRelatorioActionPerformed

    public Minuto getMinuto() {
        return minuto;
    }

    public void setMinuto(Minuto minuto) {
        this.minuto = minuto;
    }

    public Segundo getSegundo() {
        return segundo;
    }

    public void setSegundo(Segundo segundo) {
        this.segundo = segundo;
    }

    public Thread getTmin() {
        return Tmin;
    }

    public void setTmin(Thread Tmin) {
        this.Tmin = Tmin;
    }

    public Thread getTsec() {
        return Tsec;
    }

    public void setTsec(Thread Tsec) {
        this.Tsec = Tsec;
    }

    public static String getR() {
        return r;
    }

    public static void setR(String r) {
        TelaRandom.r = r;
    }

    public static Integer getAcerto() {
        return acerto;
    }

    public static void setAcerto(Integer acerto) {
        TelaRandom.acerto = acerto;
    }

    public static Integer getPorcAcerto() {
        return porcAcerto;
    }

    public static void setPorcAcerto(Integer porcAcerto) {
        TelaRandom.porcAcerto = porcAcerto;
    }

    public static Integer getErro() {
        return erro;
    }

    public static void setErro(Integer erro) {
        TelaRandom.erro = erro;
    }

    public static Integer getPorcErro() {
        return porcErro;
    }

    public static void setPorcErro(Integer porcErro) {
        TelaRandom.porcErro = porcErro;
    }

  
    static String r;
    static Integer acerto=0;
    static Integer porcAcerto=0;
    static Integer erro=0;
    static Integer porcErro=0;

    
    static Integer numero=0;
    
    
    public static String getMin() {
        return min;
    }

    public static void setMin(String min) {
        TelaRandom.min = min;
    }

    public static String getSeg() {
        return seg;
    }

    public static void setSeg(String seg) {
        TelaRandom.seg = seg;
    }

    public static String getMil() {
        return mil;
    }

    public static void setMil(String mil) {
        TelaRandom.mil = mil;
    }
    static String min;
    static String seg;
    static String mil;
    
    static String segtot;
    
    private void bmrStartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmrStartarActionPerformed
        // TODO add your handling code here:
        if(!Tsec.isAlive() && !Tmil.isAlive() && !Tmin.isAlive()){
            Tsec.start();
            Tmil.start();
            Tmin.start();
        }
        
        Random gerador = new Random();   
        
        //lblRandom.setText();
        numero = gerador.nextInt(9);
        //JOptionPane.showMessageDialog(null, "Sorteado:"+numero);  
        r = Integer.toString(numero);
        lblRandom.setText(r);
        
        //timer
        //segtot = (Tmin*60) + Tsec;
        
        //bmrStartar.setEnable(false);
        bmrStartar.setVisible(false);
              
    }//GEN-LAST:event_bmrStartarActionPerformed

    private void txtSegundosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSegundosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSegundosActionPerformed

    private void txtMinutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinutosActionPerformed
    static Integer vbtm0=0;
    private void btm0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm0ActionPerformed
        // TODO add your handling code here:
       if(acerto<qtdRod){ 
            int vrand = Integer.parseInt(lblRandom.getText());
            if(vbtm0 == vrand){
                acerto++;
                
                Random gerador = new Random();  
                numero = gerador.nextInt(9);         
                r = Integer.toString(numero);
                lblRandom.setText(r);
            }else{
                erro++;
            }
        }else{
            //desabilitar os botoes, deixando somente habilitado obotao de reatorio
            btm0.setVisible(false);
        }
        
        
    }//GEN-LAST:event_btm0ActionPerformed
    static Integer vbtm1=1;
    private void btm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm1ActionPerformed
        // TODO add your handling code here:
        if(acerto<qtdRod){
            int vrand = Integer.parseInt(lblRandom.getText());
            if(vbtm1 == vrand){
                acerto++;
                
                Random gerador = new Random();  
                numero = gerador.nextInt(9);         
                r = Integer.toString(numero);
                lblRandom.setText(r);
            }else{
                erro++;
            }
        }else{
            //desabilitar os botoes, deixando somente habilitado obotao de reatorio
            btm1.setVisible(false);            
        }
    }//GEN-LAST:event_btm1ActionPerformed
    static Integer vbtm2=2;
    private void btm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm2ActionPerformed
        if(acerto<qtdRod){
            int vrand = Integer.parseInt(lblRandom.getText());
            if(vbtm2 == vrand){
                acerto++;
                
                Random gerador = new Random();  
                numero = gerador.nextInt(9);         
                r = Integer.toString(numero);
                lblRandom.setText(r);
                
                if(acerto==qtdRod){
                    btm2.setVisible(false);  
                }
                
            }else{
                erro++;
            }
        }else{
            //desabilitar os botoes, deixando somente habilitado obotao de reatorio
            btm2.setVisible(false);            
        }
    }//GEN-LAST:event_btm2ActionPerformed
    static Integer vbtm3=3;
    private void btm3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm3ActionPerformed
        if(acerto<qtdRod){
            int vrand = Integer.parseInt(lblRandom.getText());
            if(vbtm3 == vrand){
                acerto++;
                
                Random gerador = new Random();  
                numero = gerador.nextInt(9);         
                r = Integer.toString(numero);
                lblRandom.setText(r);
            }else{
                erro++;
            }
        }else{
            //desabilitar os botoes, deixando somente habilitado obotao de reatorio
            btm3.setVisible(false);            
        }
    }//GEN-LAST:event_btm3ActionPerformed
    static Integer vbtm4=4;
    private void btm4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm4ActionPerformed
        if(acerto<qtdRod){
            int vrand = Integer.parseInt(lblRandom.getText());
            if(vbtm4 == vrand){
                acerto++;
                /////////
                Random gerador = new Random();  
                numero = gerador.nextInt(9);         
                r = Integer.toString(numero);
                lblRandom.setText(r);
            }else{
                erro++;
            }
        }else{
            //desabilitar os botoes, deixando somente habilitado obotao de reatorio
            btm4.setVisible(false);            
        }
    }//GEN-LAST:event_btm4ActionPerformed
    static Integer vbtm5=5;
    private void btm5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm5ActionPerformed
         if(acerto<qtdRod){
            int vrand = Integer.parseInt(lblRandom.getText());
            if(vbtm5 == vrand){
                acerto++;
                
                Random gerador = new Random();  
                numero = gerador.nextInt(9);         
                r = Integer.toString(numero);
                lblRandom.setText(r);
            }else{
                erro++;
            }
        }else{
            //desabilitar os botoes, deixando somente habilitado obotao de reatorio
            btm5.setVisible(false);            
        }   
    }//GEN-LAST:event_btm5ActionPerformed
    static Integer vbtm6=6;
    private void btm6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm6ActionPerformed
        if(acerto<qtdRod){
            int vrand = Integer.parseInt(lblRandom.getText());
            if(vbtm6 == vrand){
                acerto++;
                
                Random gerador = new Random();  
                numero = gerador.nextInt(9);         
                r = Integer.toString(numero);
                lblRandom.setText(r);
            }else{
                erro++;
            }
        }else{
            //desabilitar os botoes, deixando somente habilitado obotao de reatorio
            btm6.setVisible(false);            
        }  
    }//GEN-LAST:event_btm6ActionPerformed
    static Integer vbtm7=7;
    private void btm7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm7ActionPerformed
        if(acerto<qtdRod){
            int vrand = Integer.parseInt(lblRandom.getText());
            if(vbtm7 == vrand){
                acerto++;
                
                Random gerador = new Random();  
                numero = gerador.nextInt(9);         
                r = Integer.toString(numero);
                lblRandom.setText(r);
            }else{
                erro++;
            }
        }else{
            //desabilitar os botoes, deixando somente habilitado obotao de reatorio
            btm7.setVisible(false);            
        }  
    }//GEN-LAST:event_btm7ActionPerformed
    static Integer vbtm8=8;
    private void btm8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm8ActionPerformed
        if(acerto<qtdRod){
            int vrand = Integer.parseInt(lblRandom.getText());
            if(vbtm8 == vrand){
                acerto++;
                
                Random gerador = new Random();  
                numero = gerador.nextInt(9);         
                r = Integer.toString(numero);
                lblRandom.setText(r);
            }else{
                erro++;
            }
        }else{
            //desabilitar os botoes, deixando somente habilitado obotao de reatorio
            btm8.setVisible(false);            
        }  
    }//GEN-LAST:event_btm8ActionPerformed
    static Integer vbtm9=9;
    private void btm9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm9ActionPerformed
        if(acerto<qtdRod){
            int vrand = Integer.parseInt(lblRandom.getText());
            if(vbtm9 == vrand){
                acerto++;
                
                Random gerador = new Random();  
                numero = gerador.nextInt(9);         
                r = Integer.toString(numero);
                lblRandom.setText(r);
            }else{
                erro++;
            }
        }else{
            //desabilitar os botoes, deixando somente habilitado obotao de reatorio
            btm9.setVisible(false);            
        }  
    }//GEN-LAST:event_btm9ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRandom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRandom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRandom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRandom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        
        //if(isPressing()){
            
        //}
        
        
        
        
        
        
        
 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bmrStartar;
    private javax.swing.JButton btm0;
    private javax.swing.JButton btm1;
    private javax.swing.JButton btm2;
    private javax.swing.JButton btm3;
    private javax.swing.JButton btm4;
    private javax.swing.JButton btm5;
    private javax.swing.JButton btm6;
    private javax.swing.JButton btm7;
    private javax.swing.JButton btm8;
    private javax.swing.JButton btm9;
    private javax.swing.JToggleButton btmRelatorio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblRandom;
    public static javax.swing.JTextField txtMilesimos;
    public static javax.swing.JTextField txtMinutos;
    public static javax.swing.JTextField txtSegundos;
    // End of variables declaration//GEN-END:variables

    private void setEnable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
