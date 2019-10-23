/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfood;

import ModelObject.Product;
import ModelObject.Table;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hieupt
 */
public class TableManagement extends javax.swing.JFrame
{

    /**
     * Creates new form TableManagement
     */
    public TableManagement()
    {
        initComponents();
        ComboBox_ProductSelect.addItem(product1.ProductName);
        ComboBox_ProductSelect.addItem(product2.ProductName);
        ComboBox_ProductSelect.addItem(product3.ProductName);
        ComboBox_ProductSelect.addItem(product4.ProductName);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        Panel_TableList = new javax.swing.JPanel();
        Label_TableList = new javax.swing.JLabel();
        Button_Table1 = new javax.swing.JButton();
        Button_Table2 = new javax.swing.JButton();
        Button_Table3 = new javax.swing.JButton();
        Button_Table4 = new javax.swing.JButton();
        Panel_Order = new javax.swing.JPanel();
        Label_Order = new javax.swing.JLabel();
        Label_Product = new javax.swing.JLabel();
        Label_Customer = new javax.swing.JLabel();
        Label_Code = new javax.swing.JLabel();
        ComboBox_ProductSelect = new javax.swing.JComboBox<>();
        TextField_Customer = new javax.swing.JTextField();
        Label_Number = new javax.swing.JLabel();
        TextField_Number = new javax.swing.JTextField();
        TextField_Code = new javax.swing.JTextField();
        Button_SubmitOrder = new javax.swing.JButton();
        Panel_Bill = new javax.swing.JPanel();
        Label_BillOf = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_BillDetails = new javax.swing.JTable();
        Button_Pay = new javax.swing.JButton();
        Label_Total = new javax.swing.JLabel();
        Label_TotalAmount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_TableList.setBackground(new java.awt.Color(153, 153, 255));
        Panel_TableList.setForeground(new java.awt.Color(51, 51, 255));
        Panel_TableList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Label_TableList.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_TableList.setText("Table  List");

        Button_Table1.setText("Table 1");
        Button_Table1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                Button_Table1MouseClicked(evt);
            }
        });

        Button_Table2.setText("Table 2");
        Button_Table2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                Button_Table2MouseClicked(evt);
            }
        });

        Button_Table3.setText("Table 3");
        Button_Table3.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                Button_Table3MouseClicked(evt);
            }
        });

        Button_Table4.setText("Table 4");
        Button_Table4.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                Button_Table4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel_TableListLayout = new javax.swing.GroupLayout(Panel_TableList);
        Panel_TableList.setLayout(Panel_TableListLayout);
        Panel_TableListLayout.setHorizontalGroup(
            Panel_TableListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_TableListLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(Label_TableList, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addGap(111, 111, 111))
            .addGroup(Panel_TableListLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(Panel_TableListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Button_Table3)
                    .addComponent(Button_Table1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel_TableListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_Table2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Button_Table4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        Panel_TableListLayout.setVerticalGroup(
            Panel_TableListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_TableListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_TableList)
                .addGap(42, 42, 42)
                .addGroup(Panel_TableListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Table1)
                    .addComponent(Button_Table2))
                .addGap(45, 45, 45)
                .addGroup(Panel_TableListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Table3)
                    .addComponent(Button_Table4))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        Panel_Order.setBackground(new java.awt.Color(255, 204, 204));

        Label_Order.setText("Order");

        Label_Product.setText("Product");

        Label_Customer.setText("Customer");

        Label_Code.setText("Code(Ship only)");

        Label_Number.setText("Number");

        Button_SubmitOrder.setText("Submit");

        javax.swing.GroupLayout Panel_OrderLayout = new javax.swing.GroupLayout(Panel_Order);
        Panel_Order.setLayout(Panel_OrderLayout);
        Panel_OrderLayout.setHorizontalGroup(
            Panel_OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_OrderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label_Order)
                .addGap(130, 130, 130))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_OrderLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(Panel_OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_Product)
                    .addComponent(Label_Customer)
                    .addComponent(Label_Code)
                    .addComponent(Label_Number))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel_OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_SubmitOrder)
                    .addGroup(Panel_OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ComboBox_ProductSelect, 0, 148, Short.MAX_VALUE)
                        .addComponent(TextField_Customer)
                        .addComponent(TextField_Code)
                        .addComponent(TextField_Number)))
                .addGap(38, 38, 38))
        );
        Panel_OrderLayout.setVerticalGroup(
            Panel_OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_OrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_Order, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Product)
                    .addComponent(ComboBox_ProductSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(Panel_OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Number)
                    .addComponent(TextField_Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(Panel_OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Label_Customer)
                    .addComponent(TextField_Customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_OrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Code)
                    .addComponent(TextField_Code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Button_SubmitOrder)
                .addGap(9, 9, 9))
        );

        Panel_Bill.setBackground(new java.awt.Color(204, 255, 204));

        Label_BillOf.setText("BILL");

        Table_BillDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String []
            {
                "Product", "Number", "Sum"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table_BillDetails);

        Button_Pay.setText("Pay");

        Label_Total.setText("Total:");

        javax.swing.GroupLayout Panel_BillLayout = new javax.swing.GroupLayout(Panel_Bill);
        Panel_Bill.setLayout(Panel_BillLayout);
        Panel_BillLayout.setHorizontalGroup(
            Panel_BillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_BillLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_BillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_Pay, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_BillOf, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel_BillLayout.createSequentialGroup()
                        .addComponent(Label_Total)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Label_TotalAmount)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        Panel_BillLayout.setVerticalGroup(
            Panel_BillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_BillLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_BillOf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addGroup(Panel_BillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Total)
                    .addComponent(Label_TotalAmount))
                .addGap(18, 18, 18)
                .addComponent(Button_Pay, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_Bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Panel_TableList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_Order, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_TableList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Panel_Order, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Panel_Bill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_Table1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_Button_Table1MouseClicked
    {//GEN-HEADEREND:event_Button_Table1MouseClicked
        // TODO add your handling code here:
        Label_BillOf.setText("Bill Of Table 1");
//        DefaultTableModel model = (DefaultTableModel) Table_BillDetails.getModel();
//        while (model.getRowCount() > table1.ListOfNumber.length)
//            model.removeRow(table1.ListOfNumber.length+1);
        Table_BillDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String []
            {
                "Product", "Number", "Sum"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }
        });
        Table_BillDetails.setValueAt(table1.ListOfProduct[0].ProductName, 0, 0);
        Table_BillDetails.setValueAt(table1.ListOfNumber[0], 0, 1);
        Table_BillDetails.setValueAt(table1.ListOfProduct[0].ProductPrice * table1.ListOfNumber[0], 0, 2);
        Table_BillDetails.setValueAt(table1.ListOfProduct[1].ProductName, 1, 0);
        Table_BillDetails.setValueAt(table1.ListOfNumber[1], 1, 1);
        Table_BillDetails.setValueAt(table1.ListOfProduct[1].ProductPrice * table1.ListOfNumber[1], 1, 2);
        Label_TotalAmount.setText(Integer.toString(table1.CalculateBill()));
    }//GEN-LAST:event_Button_Table1MouseClicked

    private void Button_Table2MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_Button_Table2MouseClicked
    {//GEN-HEADEREND:event_Button_Table2MouseClicked
        // TODO add your handling code here:
        Label_BillOf.setText("Bill Of Table 2");
        Table_BillDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String []
            {
                "Product", "Number", "Sum"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }
        });
        Table_BillDetails.setValueAt(table2.ListOfProduct[0].ProductName, 0, 0);
        Table_BillDetails.setValueAt(table2.ListOfNumber[0], 0, 1);
        Table_BillDetails.setValueAt(table2.ListOfProduct[0].ProductPrice * table2.ListOfNumber[0], 0, 2);
        Table_BillDetails.setValueAt(table2.ListOfProduct[1].ProductName, 1, 0);
        Table_BillDetails.setValueAt(table2.ListOfNumber[1], 1, 1);
        Table_BillDetails.setValueAt(table2.ListOfProduct[1].ProductPrice * table2.ListOfNumber[1], 1, 2);
        Label_TotalAmount.setText(Integer.toString(table2.CalculateBill()));
    }//GEN-LAST:event_Button_Table2MouseClicked

    private void Button_Table3MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_Button_Table3MouseClicked
    {//GEN-HEADEREND:event_Button_Table3MouseClicked
        // TODO add your handling code here:
        Label_BillOf.setText("Bill Of Table 3");
        Table_BillDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String []
            {
                "Product", "Number", "Sum"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }
        });
        Table_BillDetails.setValueAt(table3.ListOfProduct[0].ProductName, 0, 0);
        Table_BillDetails.setValueAt(table3.ListOfNumber[0], 0, 1);
        Table_BillDetails.setValueAt(table3.ListOfProduct[0].ProductPrice * table3.ListOfNumber[0], 0, 2);
        Table_BillDetails.setValueAt(table3.ListOfProduct[1].ProductName, 1, 0);
        Table_BillDetails.setValueAt(table3.ListOfNumber[1], 1, 1);
        Table_BillDetails.setValueAt(table3.ListOfProduct[1].ProductPrice * table3.ListOfNumber[1], 1, 2);
        Table_BillDetails.setValueAt(table3.ListOfProduct[2].ProductName, 2, 0);
        Table_BillDetails.setValueAt(table3.ListOfNumber[2], 2, 1);
        Table_BillDetails.setValueAt(table3.ListOfProduct[2].ProductPrice * table3.ListOfNumber[2], 2, 2);
        Label_TotalAmount.setText(Integer.toString(table3.CalculateBill()));
    }//GEN-LAST:event_Button_Table3MouseClicked

    private void Button_Table4MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_Button_Table4MouseClicked
    {//GEN-HEADEREND:event_Button_Table4MouseClicked
        // TODO add your handling code here:
        Label_BillOf.setText("Bill Of Table 4");
        Table_BillDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String []
            {
                "Product", "Number", "Sum"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }
        });
        Table_BillDetails.setValueAt(table4.ListOfProduct[0].ProductName, 0, 0);
        Table_BillDetails.setValueAt(table4.ListOfNumber[0], 0, 1);
        Table_BillDetails.setValueAt(table4.ListOfProduct[0].ProductPrice * table4.ListOfNumber[0], 0, 2);
        Table_BillDetails.setValueAt(table4.ListOfProduct[1].ProductName, 1, 0);
        Table_BillDetails.setValueAt(table4.ListOfNumber[1], 1, 1);
        Table_BillDetails.setValueAt(table4.ListOfProduct[1].ProductPrice * table4.ListOfNumber[1], 1, 2);
        Table_BillDetails.setValueAt(table4.ListOfProduct[2].ProductName, 2, 0);
        Table_BillDetails.setValueAt(table4.ListOfNumber[2], 2, 1);
        Table_BillDetails.setValueAt(table4.ListOfProduct[2].ProductPrice * table4.ListOfNumber[2], 2, 2);
        Label_TotalAmount.setText(Integer.toString(table4.CalculateBill()));
    }//GEN-LAST:event_Button_Table4MouseClicked

    /**
     * @param args the command line arguments
     */
    // Model some Products
    Product product1 = new Product(1, "Ta Tua", 100);
    Product product2 = new Product(2, "Lac Rang", 10);
    Product product3 = new Product(3, "Bia Hoi", 16);
    Product product4 = new Product(4, "Kem oc que", 88);

    // Model some Tables
    Product[] _table1 = new Product[]
    {
        product1, product2
    };
    int[] _NumTable1 = new int[]
    {
        1, 2
    };
    Product[] _table2 = new Product[]
    {
        product3, product4
    };
    int[] _NumTable2 = new int[]
    {
        4, 10
    };
    Product[] _table3 = new Product[]
    {
        product1, product2, product4
    };
    int[] _NumTable3 = new int[]
    {
        3, 2, 5
    };
    Product[] _table4 = new Product[]
    {
        product3, product1, product2
    };
    int[] _NumTable4 = new int[]
    {
        1, 2, 3
    };

    Table table1 = new Table(1, _table1, _NumTable1);
    Table table2 = new Table(2, _table2, _NumTable2);
    Table table3 = new Table(3, _table3, _NumTable3);
    Table table4 = new Table(4, _table4, _NumTable4);

    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(TableManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(TableManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(TableManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(TableManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new TableManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Pay;
    private javax.swing.JButton Button_SubmitOrder;
    private javax.swing.JButton Button_Table1;
    private javax.swing.JButton Button_Table2;
    private javax.swing.JButton Button_Table3;
    private javax.swing.JButton Button_Table4;
    private javax.swing.JComboBox<String> ComboBox_ProductSelect;
    private javax.swing.JLabel Label_BillOf;
    private javax.swing.JLabel Label_Code;
    private javax.swing.JLabel Label_Customer;
    private javax.swing.JLabel Label_Number;
    private javax.swing.JLabel Label_Order;
    private javax.swing.JLabel Label_Product;
    private javax.swing.JLabel Label_TableList;
    private javax.swing.JLabel Label_Total;
    private javax.swing.JLabel Label_TotalAmount;
    private javax.swing.JPanel Panel_Bill;
    private javax.swing.JPanel Panel_Order;
    private javax.swing.JPanel Panel_TableList;
    private javax.swing.JTable Table_BillDetails;
    private javax.swing.JTextField TextField_Code;
    private javax.swing.JTextField TextField_Customer;
    private javax.swing.JTextField TextField_Number;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
