package Panels.Calculator;

import Mainpackage.*;
import java.awt.Color;
import java.text.DecimalFormat;

public class BMICalculator extends javax.swing.JPanel {
    
    //This is a object that will help to use only 2digits after decimal point
    private static DecimalFormat df2 = new DecimalFormat(".##");
    
    public BMICalculator() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        ApplicationWindow = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        HeightCombo = new javax.swing.JComboBox<>();
        WeightCombo = new javax.swing.JComboBox<>();
        HeightTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        WeightTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        AnswerField = new javax.swing.JTextField();
        CalculateButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        AgeTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        SexCombo = new javax.swing.JComboBox<>();
        DetailsField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 153));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setOpaque(false);
        setLayout(new java.awt.GridBagLayout());

        ApplicationWindow.setMinimumSize(new java.awt.Dimension(700, 500));
        ApplicationWindow.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BMI Calculator");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Weight:");

        HeightCombo.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        HeightCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Centimeter", "Meter", "Foot", "Inch" }));

        WeightCombo.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        WeightCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilogram", "Pound" }));

        HeightTextField.setBackground(new java.awt.Color(204, 204, 204));
        HeightTextField.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        HeightTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Height:");

        WeightTextField.setBackground(new java.awt.Color(204, 204, 204));
        WeightTextField.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        WeightTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("BMI:");
        jLabel4.setToolTipText("");

        AnswerField.setEditable(false);
        AnswerField.setBackground(new java.awt.Color(204, 204, 204));
        AnswerField.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        AnswerField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AnswerField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        CalculateButton.setBackground(new java.awt.Color(44, 60, 76));
        CalculateButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CalculateButton.setForeground(new java.awt.Color(255, 255, 255));
        CalculateButton.setText("Calculate");
        CalculateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CalculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 2));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Age:");

        AgeTextField.setBackground(new java.awt.Color(204, 204, 204));
        AgeTextField.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        AgeTextField.setToolTipText("");
        AgeTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sex:");

        SexCombo.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        SexCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        SexCombo.setToolTipText("");

        DetailsField.setEditable(false);
        DetailsField.setBackground(new java.awt.Color(204, 204, 204));
        DetailsField.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        DetailsField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DetailsField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout ApplicationWindowLayout = new javax.swing.GroupLayout(ApplicationWindow);
        ApplicationWindow.setLayout(ApplicationWindowLayout);
        ApplicationWindowLayout.setHorizontalGroup(
            ApplicationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ApplicationWindowLayout.createSequentialGroup()
                .addGroup(ApplicationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ApplicationWindowLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(ApplicationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ApplicationWindowLayout.createSequentialGroup()
                                .addGroup(ApplicationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ApplicationWindowLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(HeightCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60))
                                    .addGroup(ApplicationWindowLayout.createSequentialGroup()
                                        .addGroup(ApplicationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ApplicationWindowLayout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(WeightCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(WeightTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(43, 43, 43)))
                                .addGroup(ApplicationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ApplicationWindowLayout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel6))
                                    .addGroup(ApplicationWindowLayout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(ApplicationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(AgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)))))
                            .addGroup(ApplicationWindowLayout.createSequentialGroup()
                                .addComponent(HeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(SexCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(ApplicationWindowLayout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel1))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ApplicationWindowLayout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(CalculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ApplicationWindowLayout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(jLabel4))
                    .addGroup(ApplicationWindowLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addGroup(ApplicationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DetailsField, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AnswerField, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ApplicationWindowLayout.setVerticalGroup(
            ApplicationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ApplicationWindowLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ApplicationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(HeightCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ApplicationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SexCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ApplicationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ApplicationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(WeightCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ApplicationWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WeightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(CalculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(9, 9, 9)
                .addComponent(AnswerField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DetailsField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(ApplicationWindow, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    
    private void CalculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateButtonActionPerformed
        double HeightInt, WeightInt, AgeInt, Result;
        try{
            ////:::::::::::::::::::::Taking Inputs::::::::::::::::::////
            HeightInt = Double.parseDouble(HeightTextField.getText());
            WeightInt = Double.parseDouble(WeightTextField.getText());
            AgeInt = Double.parseDouble(AgeTextField.getText());
              
            
            ////:::::::::::::::::::::converting Height to Meter::::::::::::::::::////
            if(HeightCombo.getSelectedItem().toString().equals("Centimeter")){
                HeightInt= HeightInt * 0.01;    //1cm = 0.01m
            }
            else if(HeightCombo.getSelectedItem().toString().equals("Foot")){
                HeightInt= HeightInt * 0.3048;  //1foot = 0.3048m
            }
            else if(HeightCombo.getSelectedItem().toString().equals("Inch")){
                HeightInt= HeightInt * 0.0254;  //1inch = 0.0254m
            }
                        
            ////:::::::::::::::::::::converting Weight to KG::::::::::::::::::////
            if(WeightCombo.getSelectedItem().toString().equals("Pound")){
                WeightInt= WeightInt * 0.4535924;   //1lb = 0.4535924kg
            }
            
            
            ////:::::::::::::::::::::Invalid Input Check::::::::::::::::::////
            //For Height
            if(HeightInt<0.5)
                throw new InputException("Does some part of your body exist in another dimention?");
            
            else if(HeightInt>3.5)
                throw new InputException("You cannot be a human. Are you a giant?");
            
            //For weight
            if(WeightInt<=0)
                throw new InputException("Even air has weight. Are you Hellium?");
            else if(WeightInt>=700)
                throw new InputException("When did the Earth's gravity become so powerful?");
            
            if(AgeInt<=0)
                throw new InputException("You are not even born.");
            else if(AgeInt>=200)
                throw new InputException("Don't Worry about your BMI. You lived very long.");
            
            
            ////:::::::::::::::::::::Calculating BMI::::::::::::::::::////
            //BMI = kg /(m^2)
            Result= WeightInt / (HeightInt*HeightInt);
            
            //fixing two digits after decimal point
            Result=Double.parseDouble(df2.format(Result));
            
            //setting BMI into the answerField
            AnswerField.setText(Double.toString(Result));
            
            
            ////::::::::::::::Changing Color according to age and sex:::::::::::////
            //For Male
            if(SexCombo.getSelectedItem().toString().equals("Male")){
                //For Children
                if(AgeInt<=5){
                    if (Result < 14.1) 
                        DetailsField.setBackground(Color.yellow);
                    else if (Result >= 14.1 && Result <= 16.5) 
                        DetailsField.setBackground(Color.green);
                    else if (Result > 16.5 && Result <= 20.1) 
                        DetailsField.setBackground(Color.orange);
                    else if (Result > 20.1) 
                        DetailsField.setBackground(Color.red);
                }
                //For Teens
                if(AgeInt>5 && AgeInt <=17){
                    if (Result < 15.3) 
                        DetailsField.setBackground(Color.yellow);
                    else if (Result >= 15.3 && Result <= 23.7) 
                        DetailsField.setBackground(Color.green);
                    else if (Result > 23.7 && Result <= 27.8) 
                        DetailsField.setBackground(Color.orange);
                    else if (Result > 27.8) 
                        DetailsField.setBackground(Color.red);
                }
                //For adults
                else if(AgeInt>17){
                    if (Result < 18.5) 
                        DetailsField.setBackground(Color.yellow);
                    else if (Result >= 18.5 && Result <= 24.9) 
                        DetailsField.setBackground(Color.green);
                    else if (Result > 24.9 && Result <= 30) 
                        DetailsField.setBackground(Color.orange);
                    else if (Result > 30) 
                        DetailsField.setBackground(Color.red);
                }
            }
            
            //For Female
            else if(SexCombo.getSelectedItem().toString().equals("Female")){
                //For Children
                if(AgeInt<=5){
                    if (Result < 14.1) 
                        DetailsField.setBackground(Color.yellow);
                    else if (Result >= 14.1 && Result <= 16.5) 
                        DetailsField.setBackground(Color.green);
                    else if (Result > 16.5 && Result <= 20.1) 
                        DetailsField.setBackground(Color.orange);
                    else if (Result > 20.1) 
                        DetailsField.setBackground(Color.red);
                }
                //For Teens
                if(AgeInt>5 && AgeInt <=17){
                    if (Result < 15.2) 
                        DetailsField.setBackground(Color.yellow);
                    else if (Result >= 15.2 && Result <= 23.4) 
                        DetailsField.setBackground(Color.green);
                    else if (Result > 23.4 && Result <= 27.7) 
                        DetailsField.setBackground(Color.orange);
                    else if (Result > 27.7) 
                        DetailsField.setBackground(Color.red);
                }
                //For adults
                else if(AgeInt>17){
                    if (Result < 18.4) 
                        DetailsField.setBackground(Color.yellow);
                    else if (Result >= 18.4 && Result <= 24.8) 
                        DetailsField.setBackground(Color.green);
                    else if (Result > 24.8 && Result <= 29.8) 
                        DetailsField.setBackground(Color.orange);
                    else if (Result > 29.8) 
                        DetailsField.setBackground(Color.red);
                }
            }
            
            ////::::::::::::::Showing info according to age and sex:::::::::::////
            if(DetailsField.getBackground().equals(Color.red)){
                DetailsField.setText("Obese");
            }
            else if(DetailsField.getBackground().equals(Color.orange)){
                DetailsField.setText("Overweight");
            }
            else if(DetailsField.getBackground().equals(Color.green)){
                DetailsField.setText("Normal");
            }
            else if(DetailsField.getBackground().equals(Color.yellow)){
                DetailsField.setText("Underweight");
            }
            
        }catch(InputException e){
            
        }catch(Exception e){
            ErrorWindow ob = new ErrorWindow();        
            ob.setErrorText("Invalid Input");
            ob.setVisible(true);
        }      
    }//GEN-LAST:event_CalculateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgeTextField;
    private javax.swing.JTextField AnswerField;
    private javax.swing.JPanel ApplicationWindow;
    private javax.swing.JButton CalculateButton;
    private javax.swing.JTextField DetailsField;
    private javax.swing.JComboBox<String> HeightCombo;
    private javax.swing.JTextField HeightTextField;
    private javax.swing.JComboBox<String> SexCombo;
    private javax.swing.JComboBox<String> WeightCombo;
    private javax.swing.JTextField WeightTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

