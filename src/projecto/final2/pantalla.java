/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projecto.final2;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;


/**
 *
 * @author longf
 */

public class pantalla extends javax.swing.JFrame {
    //Projectofinal2 pf=new Projectofinal2();
    /**
     * Creates new form pantalla
     */
    static int[] c ={0,0,0,0,0,0,0};
    static int v;
    static int[] ec ={0,0,0,0,0,0,0};
    static int econt;
    static boolean seguier=true;
    static enemigos enen=new enemigos();
    card[] cards = Projectofinal2.getCards();
    public pantalla() {
        setTitle("★w★");
        initComponents();
        
        getContentPane().setBackground(Color.lightGray);
        setResizable(false); // deshabilitar redimension
        
        setLocationRelativeTo(null);//ponderlo en el medio
        //card1.setVisible(false); 
        
        //card1.setOpaque(true);
        
    }
    //todavia experimentando con todos los comando para el display

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        esenemigos = new javax.swing.JPanel();
        pedir = new javax.swing.JButton();
        parar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        stats2 = new javax.swing.JTextArea();
        estu = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        stats1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        card1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        card2 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        card3 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        card5 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        card4 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        ecard = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        card6 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        contador = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        esenemigos.setBorder(javax.swing.BorderFactory.createTitledBorder("Enemigo"));
        esenemigos.setToolTipText("");

        pedir.setText("Pedir");
        pedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedirActionPerformed(evt);
            }
        });

        parar.setText("Parar");
        parar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pararActionPerformed(evt);
            }
        });

        stats2.setEditable(false);
        stats2.setColumns(20);
        stats2.setLineWrap(true);
        stats2.setRows(5);
        stats2.setToolTipText("");
        jScrollPane1.setViewportView(stats2);

        javax.swing.GroupLayout esenemigosLayout = new javax.swing.GroupLayout(esenemigos);
        esenemigos.setLayout(esenemigosLayout);
        esenemigosLayout.setHorizontalGroup(
            esenemigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(esenemigosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(esenemigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, esenemigosLayout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(pedir))
                    .addComponent(parar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        esenemigosLayout.setVerticalGroup(
            esenemigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, esenemigosLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(pedir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parar)
                .addContainerGap())
        );

        estu.setBorder(javax.swing.BorderFactory.createTitledBorder("Tu"));
        estu.setToolTipText("");

        stats1.setEditable(false);
        stats1.setColumns(20);
        stats1.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        stats1.setLineWrap(true);
        stats1.setRows(5);
        stats1.setToolTipText("");
        jScrollPane2.setViewportView(stats1);

        javax.swing.GroupLayout estuLayout = new javax.swing.GroupLayout(estu);
        estu.setLayout(estuLayout);
        estuLayout.setHorizontalGroup(
            estuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        );
        estuLayout.setVerticalGroup(
            estuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(estuLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 131, Short.MAX_VALUE))
        );

        card1.setEditable(false);
        card1.setColumns(20);
        card1.setLineWrap(true);
        card1.setRows(4);
        jScrollPane3.setViewportView(card1);

        card2.setEditable(false);
        card2.setColumns(20);
        card2.setLineWrap(true);
        card2.setRows(4);
        jScrollPane4.setViewportView(card2);

        card3.setEditable(false);
        card3.setColumns(20);
        card3.setLineWrap(true);
        card3.setRows(4);
        jScrollPane5.setViewportView(card3);

        card5.setEditable(false);
        card5.setColumns(20);
        card5.setLineWrap(true);
        card5.setRows(4);
        jScrollPane6.setViewportView(card5);

        card4.setEditable(false);
        card4.setColumns(20);
        card4.setLineWrap(true);
        card4.setRows(4);
        jScrollPane7.setViewportView(card4);

        ecard.setEditable(false);
        ecard.setColumns(20);
        ecard.setLineWrap(true);
        ecard.setRows(1);
        jScrollPane8.setViewportView(ecard);

        card6.setEditable(false);
        card6.setColumns(20);
        card6.setLineWrap(true);
        card6.setRows(4);
        jScrollPane9.setViewportView(card6);

        contador.setColumns(20);
        contador.setLineWrap(true);
        contador.setRows(1);
        contador.setTabSize(1);
        jScrollPane10.setViewportView(contador);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(estu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 6, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(esenemigos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(esenemigos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedirActionPerformed
        // TODO add your handling code here:
        v=valor(c);//para saber el valor total de la sumatoria de cartas
        //if ((cards[c[0]].getVal()==11)&&(cards[c[1]].getVal()==11)&&(cards[c[2]].getVal()==11)&&(cards[c[3]].getVal()==11)&&(cards[c[4]].getVal()==11)&&(cards[c[5]].getVal()==11)){
        
        reiniciarpantalla();
        if (v<21){
            if (card3.getText().isEmpty()){
                c[2]=Projectofinal2.getrandom();
                imp(c[2], 3);
            }
            else if (card4.getText().isEmpty()){
                c[3]=Projectofinal2.getrandom();
                imp(c[3], 4);
            }
            else if (card5.getText().isEmpty()){
                c[4]=Projectofinal2.getrandom();
                imp(c[4], 5);
            }
            else if (card6.getText().isEmpty()){
                c[5]=Projectofinal2.getrandom();
                imp(c[5], 6);
            }else
                JOptionPane.showMessageDialog(null,"No hay tiempo para pensar, el enemigo esta muy cerca");
        }
        v=valor(c);//reverificar los numeros si se pasa de 21 con el nuevo numero añadido
        for (int n=0;n<6;n++){
            if (v>21){
                if (cards[c[n]].getSim()=="A"){
                    cards[c[n]].setSim("a");
                    cards[c[n]].setVal(1);
                    imp(c[n], n+1);
                    break;
                }
            }
        }
        //}
        v=valor(c);//reiniciar valor de v para que no salga los mensajes
        reiniciarpantalla();
        if (v==21){
            JOptionPane.showMessageDialog(null,"tienes 21!!!");
        }else if (v>21)
            JOptionPane.showMessageDialog(null,"te pasastes de 21 =(");
        
        
        /*
        if (cards != null && cards.length > 0) {
            card1.setText(cards[0].tocard());
            card1.setBackground(Color.LIGHT_GRAY);
            card1.setVisible(false); 
           
            card2.setText(cards[1].tocard());
        }
            Projectofinal2.atkp=1;
        */
    }//GEN-LAST:event_pedirActionPerformed

    
    private void pararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pararActionPerformed
        // TODO add your handling code here:
        //this.setVisible(false);
        v=valor(c);
        int v2=valor(ec);
        resultados(v,c,v2,ec);
        reiniciarcard();
        reiniciarpantalla();
    }//GEN-LAST:event_pararActionPerformed

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
            java.util.logging.Logger.getLogger(pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantalla().setVisible(true);
            }
        });
        
    }
    public void bot() {
        Random rand=new Random();
        
        econt=0;
        ec[econt] = Projectofinal2.getrandom();
        econt++;
        ec[econt] = Projectofinal2.getrandom();
        econt++;
        
       
    do {
        int a = valor(ec);

        //ajustar valores de cartas si superan 21 y hay un "A"
        if (a > 21) {
            for (int n = 0; n < econt; n++) {
                if (cards[ec[n]].getSim().equals("A")) {
                    cards[ec[n]].setSim("a");  //cambiar "A" por "a"
                    cards[ec[n]].setVal(1);    //cambiar el valor de 11 a 1
                    break;
                }
            }
            a = valor(ec); //recalcular
        }

        // decisión de pedir o quedarse
        int r = 1; // por defecto
        if (a < 21 && seguier) {
            switch (a) {
                case 17 -> r = rand.nextInt(2); 
                case 18 -> r = rand.nextInt(3); 
                case 19 -> r = rand.nextInt(6); 
                default -> {
                    if (a < 17) 
                        r = 0; 
                }
            }
        }

       
        if (r == 0 && econt < ec.length) { 
            ec[econt] = Projectofinal2.getrandom(); 
            econt++;
        } else {
            seguier = false;
        }
        //valorp(a,ec,);
        String text="";
        if (!seguier)
            text="tienes esta cantidad preparada";
        switch(econt){//???????????????????????????????????
            case 2 -> ecard.setText("Cartas del enemigo: ▯▯ "+text);
            case 3 -> ecard.setText("Cartas del enemigo: ▯▯▯ "+text);
            case 4 -> ecard.setText("Cartas del enemigo: ▯▯▯▯ "+text);
            case 5 -> ecard.setText("Cartas del enemigo: ▯▯▯▯▯ "+text);
            case 6 -> ecard.setText("Cartas del enemigo: ▯▯▯▯▯▯ "+text);
            //default ->      
        }
        }while(seguier);
        
    }
    public void reiniciarcard() {
        card1.setText("");
        card2.setText("");
        card3.setText("");
        card4.setText("");
        card5.setText("");
        card6.setText("");
        ecard.setText("");
        getContentPane().setBackground(Color.lightGray);
                        // Redibujar la pantalla
        revalidate();
        repaint();
        reiniciarpantalla();
        Projectofinal2.renovar();
        c[2]=52;//tu cartas
        c[3]=52;
        c[4]=52;
        c[5]=52;
        c[0]=Projectofinal2.getrandom();
        c[1]=Projectofinal2.getrandom();
        imp(c[0], 1);
        imp(c[1], 2);
        ec[2]=52;//cartas enemigas
        ec[3]=52;
        ec[4]=52;
        ec[5]=52;
        
        seguier=true;
        bot();
        
        
    }
    
    public void reiniciarpantalla() {
        stats1.setText(Projectofinal2.tostats());
        stats2.setText(Projectofinal2.toene());
        contador.setText(valor(c)+"/21");
        
    }
    public void imp(int i,int a) {
        if (cards[i].getColor() == 1) {
            switch(a){
                case 1 -> card1.setForeground(Color.RED);
                case 2 -> card2.setForeground(Color.RED);
                case 3 -> card3.setForeground(Color.RED);
                case 4 -> card4.setForeground(Color.RED);
                case 5 -> card5.setForeground(Color.RED);
                case 6 -> card6.setForeground(Color.RED);
            }
        }
        else{
            switch(a){
                case 1 -> card1.setForeground(Color.BLACK);
                case 2 -> card2.setForeground(Color.BLACK);
                case 3 -> card3.setForeground(Color.BLACK);
                case 4 -> card4.setForeground(Color.BLACK);
                case 5 -> card5.setForeground(Color.BLACK);
                case 6 -> card6.setForeground(Color.BLACK);
            }
        }
        switch(a){
            case 1 -> card1.setText(cards[i].tocard());
            case 2 -> card2.setText(cards[i].tocard());
            case 3 -> card3.setText(cards[i].tocard());
            case 4 -> card4.setText(cards[i].tocard());
            case 5 -> card5.setText(cards[i].tocard());
            case 6 -> card6.setText(cards[i].tocard());
        }
    }
    public int valor(int[]v) {
        int a=(cards[v[0]].getVal()+cards[v[1]].getVal()+cards[v[2]].getVal()+cards[v[3]].getVal()+cards[v[4]].getVal()+cards[v[5]].getVal());
        
        //if ((cards[c[0]].getVal()==1)||(cards[c[1]].getVal()==1)||(cards[c[2]].getVal()==1)||(cards[c[3]].getVal()==1)||(cards[c[4]].getVal()==1)||(cards[c[5]].getVal()==1)){
            
        //}
        
        return a;
    }
    public void resultados(int a,int[] v,int a2,int[]ev) {//resultado tuyo 
        String text="?";
        /*boolean res1,res2;
        if (a<=21)
            res1=true;
        else
            res1=false;
        if (a2<=21)
            res2=true;
        else
            res2=false;
        */
        int total=0;
        if (a>a2&& a<=21){//tu
            int atkp=Projectofinal2.getAtkp();
            atkp=atkp+a-a2;
            int defp=enen.getDefp();
            int t=atkp-defp;
            text=("ganaste la ronda entonces le hace "+ atkp +"menos la defensa del enemigo"+ defp +"="+t);
            enen.setHp(enen.getHp()-t);
        }
        
        else if (a2>a&& a2<=21){//ene
            int atkp=enen.getAtkp();
            atkp=atkp+a2-a;
            int defp=Projectofinal2.getDefp();
            int t=atkp-defp;
            text=("el enemigo gano la ronda entonces te hace "+ atkp +"menos la defensa tuya"+ defp +"="+t);
            Projectofinal2.setHp(Projectofinal2.getHp()-t);
        }
        else if (a<21&&a2>21){//tu
            int atkp=Projectofinal2.getAtkp();
            atkp=atkp+a;
            int defp=enen.getDefp();
            int t=atkp-defp;
            text=("el enemigo fallo y le hace critico de"+ atkp +"menos la defensa del enemigo"+ defp+"="+t);
            enen.setHp(enen.getHp()-t);
        }
        else if (a2<21&&a>21){//ene
            int atkp=enen.getAtkp();
            atkp=atkp+a2;
            int defp=Projectofinal2.getDefp();
            int t=atkp-defp;
            text=("tu fallaste el ataque y te hace critico de"+ atkp +"menos la defensa tuya"+ + defp +"="+t);
            Projectofinal2.setHp(Projectofinal2.getHp()-t);
        }
        else if(a>21&& a2>21){
           text="los dos fallan miserablemente";
        }
        if(a==a2){
           text="los dos bloquearon exitosamente";
        }
        
        JOptionPane.showMessageDialog(null,"tu valor es"+cards[v[0]].getVal()+""+cards[v[0]].getSim2()+"+"+cards[v[1]].getVal()+""+cards[v[1]].getSim2()+"+"+cards[v[2]].getVal()+""+cards[v[2]].getSim2()+"+"+cards[v[3]].getVal()+""+cards[v[3]].getSim2()+"+"+cards[v[4]].getVal()+""+cards[v[4]].getSim2()+"+"+cards[v[5]].getVal()+""+cards[v[5]].getSim2()+"="+a+"\n"+
                "tu valor del enemigo es"+cards[ev[0]].getVal()+""+cards[ev[0]].getSim2()+"+"+cards[ev[1]].getVal()+""+cards[ev[1]].getSim2()+"+"+cards[ev[2]].getVal()+""+cards[ev[2]].getSim2()+"+"+cards[ev[3]].getVal()+""+cards[ev[3]].getSim2()+"+"+cards[ev[4]].getVal()+""+cards[ev[4]].getSim2()+"+"+cards[ev[5]].getVal()+""+cards[ev[5]].getSim2()+"="+a2+"\n"+
                text);
        if (Projectofinal2.getHp()<=0){
            JOptionPane.showMessageDialog(null,"perdistes");
            System.exit(0);
        }
        if (enen.getHp()<=0){
            JOptionPane.showMessageDialog(null,"ganastes1212");
            Projectofinal2.setRonda(Projectofinal2.getRonda()+1);
            Projectofinal2.restableserenemigos();
            reiniciarcard();
        }
        //if (enemigos.vida)
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea card1;
    private javax.swing.JTextArea card2;
    private javax.swing.JTextArea card3;
    private javax.swing.JTextArea card4;
    private javax.swing.JTextArea card5;
    private javax.swing.JTextArea card6;
    private javax.swing.JTextArea contador;
    private javax.swing.JTextArea ecard;
    private javax.swing.JPanel esenemigos;
    private javax.swing.JPanel estu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JButton parar;
    private javax.swing.JButton pedir;
    private javax.swing.JTextArea stats1;
    private javax.swing.JTextArea stats2;
    // End of variables declaration//GEN-END:variables
}
