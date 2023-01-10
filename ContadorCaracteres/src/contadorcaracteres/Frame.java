/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadorcaracteres;


import java.awt.Color;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author maryf
 */

public class Frame extends javax.swing.JFrame {
    private JFileChooser fileChooser;
    private File archivo = null;
    private long startES;
    Data dataES=new Data();
    String texto="";
    private FileReader fr = null;
    private ArrayList lineas = new ArrayList();
    private String ruta=null;
    char[] aCaracteres;
    /**
     * Creates new form Frame
     */
    public Frame() {
        initComponents();
        setLocationRelativeTo(null);
        //jPanel.setPreferredSize(new Dimension(250,250));
        //jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        fileChooser = new JFileChooser();
    }

    private void reset(){
        jTextArea1.setText("");
        labelTimeFJ1.setText("ms");
        labelAFJ.setText("A:");
        labelEFJ.setText("E:");
        labelIFJ.setText("I:");
        labelOFJ.setText("O:");
        labelUFJ.setText("U:");
        labelTimeS1.setText("ms");
        labelA.setText("A:");
        labelE.setText("E:");
        labelI.setText("I:");
        labelO.setText("O:");
        labelU.setText("U:");
        labelTimeES.setText("ms");
        labelAES.setText("A:");
        labelEES.setText("E:");
        labelIES.setText("I:");
        labelOES.setText("O:");
        labelUES.setText("U:");
        labelTotal.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loadButton = new javax.swing.JButton();
        labelPath = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        labelAFJ = new javax.swing.JLabel();
        labelEFJ = new javax.swing.JLabel();
        labelIFJ = new javax.swing.JLabel();
        labelOFJ = new javax.swing.JLabel();
        labelUFJ = new javax.swing.JLabel();
        labelO = new javax.swing.JLabel();
        labelU = new javax.swing.JLabel();
        labelA = new javax.swing.JLabel();
        labelE = new javax.swing.JLabel();
        labelI = new javax.swing.JLabel();
        labelTimeFJ = new javax.swing.JLabel();
        labelTime = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        labelOES = new javax.swing.JLabel();
        labelUES = new javax.swing.JLabel();
        labelAES = new javax.swing.JLabel();
        labelEES = new javax.swing.JLabel();
        labelIES = new javax.swing.JLabel();
        buttonES = new javax.swing.JButton();
        labelTimeES = new javax.swing.JLabel();
        labelTimeS1 = new javax.swing.JLabel();
        labelTimeFJ1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        resetButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loadButton.setBackground(new java.awt.Color(0, 153, 51));
        loadButton.setForeground(new java.awt.Color(255, 255, 255));
        loadButton.setText("Load");
        loadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadButtonMouseClicked(evt);
            }
        });
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        labelPath.setEditable(false);
        labelPath.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setBackground(new java.awt.Color(2, 117, 216));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Fork Join counter");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(2, 117, 216));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Seq counter");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        labelAFJ.setText("A:");

        labelEFJ.setText("E:");

        labelIFJ.setText("I:");

        labelOFJ.setText("O:");

        labelUFJ.setText("U:");

        labelO.setText("O:");

        labelU.setText("U:");

        labelA.setText("A:");

        labelE.setText("E:");

        labelI.setText("I:");

        labelTotal.setText("Total: ");

        labelOES.setText("O:");

        labelUES.setText("U:");

        labelAES.setText("A:");

        labelEES.setText("E:");

        labelIES.setText("I:");

        buttonES.setBackground(new java.awt.Color(2, 117, 216));
        buttonES.setForeground(new java.awt.Color(255, 255, 255));
        buttonES.setText("Executor counter");
        buttonES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonESMouseClicked(evt);
            }
        });
        buttonES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonESActionPerformed(evt);
            }
        });

        labelTimeES.setText("ms");

        labelTimeS1.setText("ms");

        labelTimeFJ1.setText("ms");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        resetButton.setBackground(new java.awt.Color(0, 153, 51));
        resetButton.setForeground(new java.awt.Color(255, 255, 255));
        resetButton.setText("Reset text");
        resetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetButtonMouseClicked(evt);
            }
        });
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("a→@");

        jLabel2.setText("e→£");

        jLabel3.setText("i→&");

        jLabel4.setText("o→Ø");

        jLabel5.setText("u→¥");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPath, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelAFJ)
                                        .addGap(10, 10, 10)
                                        .addComponent(labelEFJ))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelOFJ)
                                        .addGap(10, 10, 10)
                                        .addComponent(labelUFJ))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labelO)
                                            .addComponent(labelA))
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelE)
                                            .addComponent(labelU))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelIFJ)
                                            .addComponent(labelTimeFJ1)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(labelI))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelTimeS1))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buttonES, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelAES)
                                    .addComponent(labelOES))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelUES)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelTimeES))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelEES)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelIES)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(labelTimeFJ))
                            .addComponent(labelTime)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))
                            .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTotal))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loadButton)
                    .addComponent(labelPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(labelTimeFJ)
                                .addGap(75, 75, 75)
                                .addComponent(labelTime))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelAFJ)
                                    .addComponent(labelEFJ)
                                    .addComponent(labelIFJ))
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelUFJ)
                                    .addComponent(labelOFJ)
                                    .addComponent(labelTimeFJ1))
                                .addGap(2, 2, 2)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(labelA)
                                            .addComponent(labelE))
                                        .addGap(0, 0, 0)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(labelO)
                                            .addComponent(labelU)
                                            .addComponent(labelTimeS1)))
                                    .addComponent(labelI))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonES)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelAES)
                                    .addComponent(labelEES)
                                    .addComponent(labelIES))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelOES)
                                    .addComponent(labelUES)
                                    .addComponent(labelTimeES))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelTotal)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resetButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadButtonActionPerformed
    
    private void loadButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadButtonMouseClicked
        // TODO add your handling code here:
        
        reset();
        aCaracteres=null;
      
        fileChooser.setFileFilter(new FileNameExtensionFilter("","*"));
        int opcion = fileChooser.showOpenDialog(null);
        if (opcion == JFileChooser.APPROVE_OPTION) {
           ruta = fileChooser.getSelectedFile().getAbsolutePath();
            labelPath.setText(ruta);
            readFile();
        }
    }//GEN-LAST:event_loadButtonMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        aCaracteres=texto.toCharArray();
        long start=System.currentTimeMillis();
        ForkJoinPool pool=new ForkJoinPool();
        ForkJoinCounter forkjoin= new ForkJoinCounter(aCaracteres,0,aCaracteres.length);
        pool.invoke(forkjoin);
        //Future<Data>future=pool.submit(new ForkJoinCounter(aCaracteres,0,aCaracteres.length));
        long end=System.currentTimeMillis();
        System.out.println("El tiempo calculado es"+(end-start));
        labelTimeFJ1.setText((end-start)+"ms");
        labelAFJ.setText("A:"+forkjoin.getData().getA());
        labelEFJ.setText("E:"+forkjoin.getData().getE());
        labelIFJ.setText("I:"+forkjoin.getData().getI());
        labelOFJ.setText("O:"+forkjoin.getData().getO());
        labelUFJ.setText("U:"+forkjoin.getData().getU());
        jTextArea1.setText(Arrays.toString(aCaracteres).replace(",", ""));
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // SECUENCIAL
        aCaracteres=texto.toCharArray();
        
        long start=System.currentTimeMillis();
        Data data= new Data();
        for(int i=0; i<aCaracteres.length; i++){
            if(aCaracteres[i]=='a'){ data.addA(); aCaracteres[i]='@'; }
            if(aCaracteres[i]=='e'){ data.addE(); aCaracteres[i]='£';}
            if(aCaracteres[i]=='i'){ data.addI(); aCaracteres[i]='&';}
            if(aCaracteres[i]=='o'){ data.addO(); aCaracteres[i]='Ø';}
            if(aCaracteres[i]=='u'){ data.addU(); aCaracteres[i]='¥';}
        }
        labelA.setText("A:"+data.getA());
        labelE.setText("E:"+data.getE());
        labelI.setText("I:"+data.getI());
        labelO.setText("O:"+data.getO());
        labelU.setText("U:"+data.getU());
        jTextArea1.setText(Arrays.toString(aCaracteres).replace(",", ""));
        long end=System.currentTimeMillis();
        labelTimeS1.setText((end-start)+"ms");
        System.out.println("El tiempo calculado es"+(end-start));
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void buttonESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonESMouseClicked
        // EXECUTOR SERVICE
        dataES.clear();
        aCaracteres=texto.toCharArray();
        jTextArea1.setText(Arrays.toString(aCaracteres).replace(",", ""));
        Data data=new Data();
        int core= Runtime.getRuntime().availableProcessors();
        System.out.println("core = " + core);
         startES=System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(core); 
        int cambio= aCaracteres.length/core;
        System.out.println("cambio = " + cambio);
        for (int i = 0; i <= aCaracteres.length; i=i+cambio) {
            executorService.execute(new ExecutorCounter(aCaracteres,i,i+cambio,this));
        }
        //executorService.execute(new ExecutorCounter(aCaracteres,0,aCaracteres.length, data, this));

        executorService.shutdown();
        while(!executorService.isTerminated()){
            
        }
        
        long end=System.currentTimeMillis();
        int[]labels=new int[5];
        labels[0]=dataES.getA();
        labels[1]=dataES.getE();
        labels[2]=dataES.getI();
        labels[3]=dataES.getO();
        labels[4]=dataES.getU();
        
        setLabelsES(labels,end);
        setTextArea(Arrays.toString(aCaracteres).replace(",", ""));
        //Future<Data>future=pool.submit(new ForkJoinCounter(aCaracteres,0,aCaracteres.length));
        //long end=System.currentTimeMillis();
        
        
       
        
    }//GEN-LAST:event_buttonESMouseClicked
    public void setLabelsES(int[] arr, long end){
        labelAES.setText("A:"+arr[0]);
        labelEES.setText("E:"+arr[1]);
        labelIES.setText("I:"+arr[2]);
        labelOES.setText("O:"+arr[3]);
        labelUES.setText("U:"+arr[4]);
        System.out.println("El tiempo calculado es"+(end-startES));
        labelTimeES.setText((end-startES)+"ms");
    }
    private void buttonESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonESActionPerformed

    private void resetButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetButtonMouseClicked
        // TODO add your handling code here:
        aCaracteres=texto.toCharArray();
        jTextArea1.setText(Arrays.toString(aCaracteres).replace(",", ""));
    }//GEN-LAST:event_resetButtonMouseClicked

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetButtonActionPerformed
    private void readFile(){
        try {
            archivo = new File (ruta);
            
            String linea;
            fr = new FileReader (archivo);
            BufferedReader br = new BufferedReader(fr);
            while((linea=br.readLine())!=null){
                linea=linea.toLowerCase();
                texto+=linea+"\n";
            }
            aCaracteres=texto.toCharArray();
          
            jTextArea1.setText(Arrays.toString(aCaracteres).replace(",", ""));
            labelTotal.setText("Total: "+texto.length());
            
            
            
            /*for (int j = 0 ; j < texto.length() ; j++){
                if(j%40==0&&aCaracteres[j]!='\n') jTextArea.setText(jTextArea.getText().concat("\n"+aCaracteres[j]));
                else  jTextArea.setText(jTextArea.getText().concat(""+aCaracteres[j]));
                
            }*/
            
        }catch(IOException e){
        System.out.println(e);
        }
        finally{
            try{ //el bloque finally se ejecuta siempre, por eso, si se cierra el fichero
            if( fr != null){ //al final del primer try, y ha dado un error antes, pasaría
            fr.close(); //al 1er catch y luego saldría, dejándolo abierto. Es conveniente
            } //Cerrarlo aquí, comprobando que no sea -por un error anterior, como
            }catch (IOException e){ // no tener permisos de lectura o que no exista - de valor null.
            }
        }
        //System.exit(0);

    }
    public void setTextArea(String text){
        jTextArea1.setText(text);
    }
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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonES;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelA;
    private javax.swing.JLabel labelAES;
    private javax.swing.JLabel labelAFJ;
    private javax.swing.JLabel labelE;
    private javax.swing.JLabel labelEES;
    private javax.swing.JLabel labelEFJ;
    private javax.swing.JLabel labelI;
    private javax.swing.JLabel labelIES;
    private javax.swing.JLabel labelIFJ;
    private javax.swing.JLabel labelO;
    private javax.swing.JLabel labelOES;
    private javax.swing.JLabel labelOFJ;
    private javax.swing.JTextField labelPath;
    private javax.swing.JLabel labelTime;
    private javax.swing.JLabel labelTimeES;
    private javax.swing.JLabel labelTimeFJ;
    private javax.swing.JLabel labelTimeFJ1;
    private javax.swing.JLabel labelTimeS1;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel labelU;
    private javax.swing.JLabel labelUES;
    private javax.swing.JLabel labelUFJ;
    private javax.swing.JButton loadButton;
    private javax.swing.JButton resetButton;
    // End of variables declaration//GEN-END:variables
}
