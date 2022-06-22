package UI;

import java.awt.TextArea;
import java.util.ArrayList;

public class Calculator extends javax.swing.JFrame {

    private String expression;
    private Double result;

    public Calculator() {
        initComponents();
        this.expression = "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        topPanel = new javax.swing.JPanel();
        scrollPanel = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        remainderButton = new javax.swing.JButton();
        divisionButton = new javax.swing.JButton();
        multiplyButton = new javax.swing.JButton();
        subButton = new javax.swing.JButton();
        sumButton = new javax.swing.JButton();
        bottomPanel = new javax.swing.JPanel();
        numberThree = new javax.swing.JButton();
        numberOne = new javax.swing.JButton();
        numberTwo = new javax.swing.JButton();
        numberFour = new javax.swing.JButton();
        numberSeven = new javax.swing.JButton();
        numberFive = new javax.swing.JButton();
        numberSix = new javax.swing.JButton();
        numberEight = new javax.swing.JButton();
        equalOperator = new javax.swing.JButton();
        numberNine = new javax.swing.JButton();
        numberZero = new javax.swing.JButton();
        commaButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        acButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(1920, 1080));

        topPanel.setBackground(new java.awt.Color(255, 255, 255));

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        textArea.setRows(2);
        scrollPanel.setViewportView(textArea);

        remainderButton.setBackground(new java.awt.Color(0, 153, 153));
        remainderButton.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        remainderButton.setForeground(new java.awt.Color(255, 255, 255));
        remainderButton.setText("%");
        remainderButton.setBorder(null);
        remainderButton.setDefaultCapable(false);
        remainderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                remainderButtonMouseClicked(evt);
            }
        });

        divisionButton.setBackground(new java.awt.Color(0, 153, 153));
        divisionButton.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        divisionButton.setForeground(new java.awt.Color(255, 255, 255));
        divisionButton.setText("/");
        divisionButton.setBorder(null);
        divisionButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                divisionButtonMouseClicked(evt);
            }
        });

        multiplyButton.setBackground(new java.awt.Color(0, 153, 153));
        multiplyButton.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        multiplyButton.setForeground(new java.awt.Color(255, 255, 255));
        multiplyButton.setText("*");
        multiplyButton.setBorder(null);
        multiplyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                multiplyButtonMouseClicked(evt);
            }
        });

        subButton.setBackground(new java.awt.Color(0, 153, 153));
        subButton.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        subButton.setForeground(new java.awt.Color(255, 255, 255));
        subButton.setText("-");
        subButton.setBorder(null);
        subButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subButtonMouseClicked(evt);
            }
        });

        sumButton.setBackground(new java.awt.Color(0, 153, 153));
        sumButton.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        sumButton.setForeground(new java.awt.Color(255, 255, 255));
        sumButton.setText("+");
        sumButton.setBorder(null);
        sumButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sumButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addComponent(remainderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(divisionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(multiplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(subButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sumButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollPanel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(remainderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divisionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sumButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        bottomPanel.setBackground(new java.awt.Color(255, 255, 255));

        numberThree.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        numberThree.setText("3");
        numberThree.setBorder(null);
        numberThree.setContentAreaFilled(false);
        numberThree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberThreeMouseClicked(evt);
            }
        });

        numberOne.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        numberOne.setText("1");
        numberOne.setBorder(null);
        numberOne.setContentAreaFilled(false);
        numberOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberOneMouseClicked(evt);
            }
        });

        numberTwo.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        numberTwo.setText("2");
        numberTwo.setBorder(null);
        numberTwo.setContentAreaFilled(false);
        numberTwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberTwoMouseClicked(evt);
            }
        });

        numberFour.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        numberFour.setText("4");
        numberFour.setBorder(null);
        numberFour.setContentAreaFilled(false);
        numberFour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberFourMouseClicked(evt);
            }
        });

        numberSeven.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        numberSeven.setText("7");
        numberSeven.setBorder(null);
        numberSeven.setContentAreaFilled(false);
        numberSeven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberSevenMouseClicked(evt);
            }
        });

        numberFive.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        numberFive.setText("5");
        numberFive.setBorder(null);
        numberFive.setContentAreaFilled(false);
        numberFive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberFiveMouseClicked(evt);
            }
        });

        numberSix.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        numberSix.setText("6");
        numberSix.setBorder(null);
        numberSix.setContentAreaFilled(false);
        numberSix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberSixMouseClicked(evt);
            }
        });

        numberEight.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        numberEight.setText("8");
        numberEight.setBorder(null);
        numberEight.setContentAreaFilled(false);
        numberEight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberEightMouseClicked(evt);
            }
        });

        equalOperator.setBackground(new java.awt.Color(0, 153, 153));
        equalOperator.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        equalOperator.setForeground(new java.awt.Color(255, 255, 255));
        equalOperator.setText("=");
        equalOperator.setBorder(null);
        equalOperator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                equalOperatorMouseClicked(evt);
            }
        });

        numberNine.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        numberNine.setText("9");
        numberNine.setBorder(null);
        numberNine.setContentAreaFilled(false);
        numberNine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberNineMouseClicked(evt);
            }
        });

        numberZero.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        numberZero.setText("0");
        numberZero.setBorder(null);
        numberZero.setContentAreaFilled(false);
        numberZero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberZeroMouseClicked(evt);
            }
        });

        commaButton.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        commaButton.setText(",");
        commaButton.setBorder(null);
        commaButton.setContentAreaFilled(false);
        commaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                commaButtonMouseClicked(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(0, 153, 153));
        deleteButton.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("<-");
        deleteButton.setBorder(null);
        deleteButton.setDefaultCapable(false);
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });

        acButton.setBackground(new java.awt.Color(0, 153, 153));
        acButton.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        acButton.setForeground(new java.awt.Color(255, 255, 255));
        acButton.setText("AC");
        acButton.setBorder(null);
        acButton.setDefaultCapable(false);
        acButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(bottomPanelLayout.createSequentialGroup()
                            .addComponent(numberNine, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(numberZero, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(commaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(bottomPanelLayout.createSequentialGroup()
                            .addComponent(numberFive, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(numberSix, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(numberSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addComponent(numberOne, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(numberTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(numberThree, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(bottomPanelLayout.createSequentialGroup()
                                .addComponent(numberEight, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(equalOperator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(bottomPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(numberFour, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(acButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(acButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(numberOne, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(numberTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(numberThree, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(numberFour, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberEight, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberSix, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberFive, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(equalOperator, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(commaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberZero, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberNine, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bottomPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(topPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>                        

    private void numberOneMouseClicked(java.awt.event.MouseEvent evt) {                                       
        this.expression += "1";
        this.textArea.append("1");
    }                                      

    private void remainderButtonMouseClicked(java.awt.event.MouseEvent evt) {                                             
        this.addOperator("%");
    }                                            

    private void divisionButtonMouseClicked(java.awt.event.MouseEvent evt) {                                            
        this.addOperator("/");
    }                                           

    private void multiplyButtonMouseClicked(java.awt.event.MouseEvent evt) {                                            
        this.addOperator("*");
    }                                           

    private void subButtonMouseClicked(java.awt.event.MouseEvent evt) {                                       
        this.addOperator("-");
    }                                      

    private void sumButtonMouseClicked(java.awt.event.MouseEvent evt) {                                       
        this.addOperator("+");
    }                                      

    private void numberTwoMouseClicked(java.awt.event.MouseEvent evt) {                                       
        this.expression += "2";
        this.textArea.append("2");
    }                                      

    private void numberThreeMouseClicked(java.awt.event.MouseEvent evt) {                                         
        this.expression += "3";
        this.textArea.append("3");
    }                                        

    private void numberFourMouseClicked(java.awt.event.MouseEvent evt) {                                        
        this.expression += "4";
        this.textArea.append("4");
    }                                       

    private void numberFiveMouseClicked(java.awt.event.MouseEvent evt) {                                        
        this.expression += "5";
        this.textArea.append("5");
    }                                       

    private void numberSixMouseClicked(java.awt.event.MouseEvent evt) {                                       
        this.expression += "6";
        this.textArea.append("6");
    }                                      

    private void numberSevenMouseClicked(java.awt.event.MouseEvent evt) {                                         
        this.expression += "7";
        this.textArea.append("7");
    }                                        

    private void numberEightMouseClicked(java.awt.event.MouseEvent evt) {                                         
        this.expression += "8";
        this.textArea.append("8");
    }                                        

    private void numberNineMouseClicked(java.awt.event.MouseEvent evt) {                                        
        this.expression += "9";
        this.textArea.append("9");
    }                                       

    private void numberZeroMouseClicked(java.awt.event.MouseEvent evt) {                                        
        this.expression += "0";
        this.textArea.append("0");
    }                                       

    private void equalOperatorMouseClicked(java.awt.event.MouseEvent evt) {                                           
        this.equalsExecute();
    }                                          

    /**
     * Método chamado ao ocorrer o evento de igualdade
     */
    private void equalsExecute() {
        char lastCharacter = this.getLastCharacter(this.expression);

        if (this.operatorContains(this.expression)) {
            if (!this.isOperator(lastCharacter)) {
                if (this.result != null) {
                    this.textArea.setText("");
                    if (this.expression.charAt(0) == '0') {
                        /* Se houver um valor negativo no inicio da expressão, então exibe
                            o valor, senão, exibe o número positivo sem o prefixo '+' */
                        if (this.expression.charAt(1) == '-') {
                            this.textArea.append(this.expression.substring(1, this.expression.length()).replace(".", ","));
                        } else {
                            this.textArea.append(this.expression.substring(2, this.expression.length()).replace(".", ","));
                        }
                    } else {
                        this.textArea.append(this.expression.replace(".", ","));
                    }
                }

                this.result = this.calculate(this.expression);
                String resultString = this.result.toString();

                if (this.result > Math.floor(this.result)) {
                    this.textArea.append("= \n" + resultString.replace('.', ','));
                    this.expression = resultString;
                } else {
                    this.textArea.append("= \n" + String.format("%.0f", this.result));
                    this.expression = String.format("%.0f", this.result);
                }

                // Adiciona o valor '0' antes do número negativo
                if (this.result < 0) {
                    this.expression = "0" + this.expression;
                }
            }
        }
    }

    private void commaButtonMouseClicked(java.awt.event.MouseEvent evt) {                                         
        this.addComma(".", ",");
    }                                        

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {                                          
        this.deleteLastCharacter();
    }                                         

    private void acButtonMouseClicked(java.awt.event.MouseEvent evt) {                                      
        this.expression = "";
        this.textArea.setText("");
    }                                     

    /**
     * Verifica se o caractere é um operador
     *
     * @param character caractere a ser verificado
     * @return boolean
     */
    private boolean isOperator(char character) {
        if (character == '+' || character == '-' || character == '*'
                || character == '/' || character == '%') {
            return true;
        }

        return false;
    }

    /**
     * Verifica se a expressão contém um operador
     *
     * @param expression expressão a ser verificada
     * @return boolean
     */
    private boolean operatorContains(String expression) {
        if (expression.contains("+") || expression.contains("-")
                || expression.contains("*") || expression.contains("/")
                || expression.contains("%")) {

            return true;
        }

        return false;
    }

    /**
     * Pega o último caractere da expressão
     *
     * @param expression expressão a ser pesquisada
     * @return retorna o último caractere da expressão
     */
    private char getLastCharacter(String expression) {
        return expression.charAt(expression.length() - 1);
    }

    /**
     * Exclui o último caractere da expressão da classe
     */
    private void deleteLastCharacter() {
        if (this.expression.length() > 1) {
            this.expression = this.expression.substring(0, this.expression.length() - 1);
            this.textArea.setText(this.textArea.getText().substring(0, this.textArea.getText().length() - 1));
        } else {
            this.expression = "";
            this.textArea.setText("");
        }
    }

    /**
     * Adiciona um operador a expressão da classe
     *
     * @param operator operador a ser adicionado
     */
    private void addOperator(String operator) {
        /* Verifica se a variável 'this.expression' contém uma expressão que
            já possa ser calculada */
        if (this.expression != null && this.expression != "") {
            if (!this.isOperator(this.getLastCharacter(this.expression))
                    && this.getLastCharacter(this.expression) != '.') {
                this.equalsExecute();
            }
        }

        // Adiciona um '0' antes da número para poder efetuar o cálculo
        if (this.expression == null || this.expression == "") {
            this.expression = "0" + operator;
            this.textArea.append("0" + operator);
            /* Se o último caractere da expressão for um operador, então substitui
            pelo atual */
        } else if (this.isOperator(this.getLastCharacter(this.expression))
                || this.getLastCharacter(this.expression) == '.') {
            this.deleteLastCharacter();
            this.expression += operator;
            this.textArea.append(operator);
        } else {
            this.expression += operator;
            this.textArea.append(operator);
        }
    }

    /**
     * Adiciona uma vírgula à expressão da classe
     *
     * @param operator operador a ser inserido
     * @param symbol símbolo para representá-lo na tela
     */
    private void addComma(String operator, String symbol) {
        if (this.expression == null || this.expression == "") {
            this.expression = "0" + operator;
            this.textArea.append("0" + symbol);
            // Bloco que limita o uso da vírgula
        } else if (this.getNumbers(this.expression).size() > 1) {
            if (this.getNumbers(this.expression).size() > 2) {
                if (this.getNumbers(this.expression).get(0).equals("0")) {

                    if (!this.getNumbers(this.expression).get(2).contains(".")) {
                        if (this.isOperator(this.getLastCharacter(this.expression))
                                || this.getLastCharacter(this.expression) == '.') {
                            this.deleteLastCharacter();
                        }

                        this.expression += operator;
                        this.textArea.append(symbol);
                    }
                }
            } else {
                if (!this.getNumbers(this.expression).get(1).contains(".")) {
                    if (this.isOperator(this.getLastCharacter(this.expression))
                            || this.getLastCharacter(this.expression) == '.') {
                        this.deleteLastCharacter();
                    }

                    this.expression += operator;
                    this.textArea.append(symbol);
                }
            }
        } else if (!this.getNumbers(this.expression).get(0).contains(".")) {
            if (this.isOperator(this.getLastCharacter(this.expression))
                    || this.getLastCharacter(this.expression) == '.') {
                this.deleteLastCharacter();
            }

            this.expression += operator;
            this.textArea.append(symbol);
        }
    }

    /**
     * Separa os números da expressão
     *
     * @param expression expressão a ser verificada
     * @return retorna um ArrayList com os números da expressão
     */
    private ArrayList<String> getNumbers(String expression) {
        ArrayList<String> numbers = new ArrayList<String>();
        String auxNumber = "";

        for (int c = 0; c < expression.length(); c++) {
            if (!this.isOperator(expression.charAt(c))) {
                auxNumber += expression.charAt(c);
            } else {
                numbers.add(auxNumber);
                auxNumber = "";
            }
        }

        numbers.add(auxNumber);

        return numbers;
    }

    /**
     * Separa os operadores da expressão
     *
     * @param expression expressão a ser verificada
     * @return retorna um ArrayList com os operadores da expressão
     */
    private ArrayList<Character> getOperators(String expression) {
        ArrayList<Character> operators = new ArrayList<Character>();

        for (int c = 0; c < expression.length(); c++) {
            if (this.isOperator(expression.charAt(c))) {
                operators.add(expression.charAt(c));
            }
        }

        return operators;
    }

    /**
     * Realiza a operação da expressão
     *
     * @param number1 primeiro número da da expressão
     * @param operator operador de cálculo
     * @param number2 segundo número da expressão
     * @return retorna o valor do cálculo
     */
    private double executeOperation(double number1, char operator, double number2) {
        double result = 0.0;

        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            case '%':
                result = number1 % number2;
                break;
        }

        return result;
    }

    /**
     * Executa o cálculo da expressão
     *
     * @param expression expressão a ser calculada
     * @return retorna o valor do cálculo
     */
    private double calculate(String expression) {
        ArrayList<String> numbers = getNumbers(expression);
        ArrayList<Character> operators = getOperators(expression);

        double result = 0.0f;

        for (int c = 0; c < operators.size(); c++) {
            if (c == 0) {
                result = Double.parseDouble(numbers.get(c));
            }

            double number2 = Double.parseDouble(numbers.get(c + 1));
            char operator = operators.get(c);

            result = executeOperation(result, operator, number2);
        }

        return result;
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton acButton;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton commaButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton divisionButton;
    private javax.swing.JButton equalOperator;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JButton numberEight;
    private javax.swing.JButton numberFive;
    private javax.swing.JButton numberFour;
    private javax.swing.JButton numberNine;
    private javax.swing.JButton numberOne;
    private javax.swing.JButton numberSeven;
    private javax.swing.JButton numberSix;
    private javax.swing.JButton numberThree;
    private javax.swing.JButton numberTwo;
    private javax.swing.JButton numberZero;
    private javax.swing.JButton remainderButton;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JButton subButton;
    private javax.swing.JButton sumButton;
    private javax.swing.JTextArea textArea;
    private javax.swing.JPanel topPanel;
    // End of variables declaration                   
}
