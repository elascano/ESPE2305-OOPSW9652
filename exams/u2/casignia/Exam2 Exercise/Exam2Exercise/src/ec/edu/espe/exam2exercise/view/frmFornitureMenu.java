package ec.edu.espe.exam2exercise.view;

import ec.edu.espe.exam2exercise.controller.FornitureController;
import ec.edu.espe.utils.ValidationUtil;
import ec.edu.espe.exam2exercise.model.Forniture;
import ec.edu.espe.exam2exercise.model.Sale;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import javax.swing.JOptionPane;
import org.bson.Document;
import org.bson.conversions.Bson;
import java.util.*;
import java.awt.HeadlessException;

/**
 *
 * @author Diego Casignia, Techware, DCCO-ESPE
 */
public class frmFornitureMenu extends javax.swing.JFrame {

    /**
     * Creates new form frmSourvenir
     */
    DefaultTableModel model = new DefaultTableModel();
    Forniture forniture;
    ArrayList<Sale> saleList = new ArrayList<>();
    Sale sale;

    public frmFornitureMenu() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(Color.white);
        initAllPanel();
        addTable();
        loadInventoryGUI();
    }

    public void loadInventoryGUI() {

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Name");
        model.addColumn("Amount");

        String uri = "mongodb+srv://dacasignia:dacasignia@cluster0.zry5emh.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("exam");
            MongoCollection<Document> collection = database.getCollection("inventory");

            FindIterable<Document> iterable = collection.find();
            for (Document document : iterable) {
                int id = document.getInteger("id");
                String nombre = document.getString("name");
                int cantidad = document.getInteger("stock");

                model.addRow(new Object[]{id, nombre, cantidad});
            }
            tbInventory.setModel(model);

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        txtUnitValue = new javax.swing.JTextField();
        txtFullValue = new javax.swing.JTextField();
        bntNewProduct = new javax.swing.JButton();
        btnAddProduct = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbInventory = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnFinishSale = new javax.swing.JButton();
        btnNewSale = new javax.swing.JButton();
        txtFinalPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabList = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuCreate = new javax.swing.JMenu();
        itmAdd = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exam2");
        setName("mainPage"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 625));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Id");

        txtId.setBackground(new java.awt.Color(255, 255, 255));
        txtId.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtId.setForeground(new java.awt.Color(0, 0, 0));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Amount");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Unit Price");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Total Price");

        txtAmount.setBackground(new java.awt.Color(255, 255, 255));
        txtAmount.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtAmount.setForeground(new java.awt.Color(0, 0, 0));
        txtAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAmountKeyPressed(evt);
            }
        });

        txtUnitValue.setEditable(false);
        txtUnitValue.setBackground(new java.awt.Color(255, 255, 255));
        txtUnitValue.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtUnitValue.setForeground(new java.awt.Color(0, 0, 0));
        txtUnitValue.setRequestFocusEnabled(false);

        txtFullValue.setEditable(false);
        txtFullValue.setBackground(new java.awt.Color(255, 255, 255));
        txtFullValue.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtFullValue.setForeground(new java.awt.Color(0, 0, 0));
        txtFullValue.setRequestFocusEnabled(false);
        txtFullValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullValueActionPerformed(evt);
            }
        });

        bntNewProduct.setBackground(new java.awt.Color(255, 255, 255));
        bntNewProduct.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        bntNewProduct.setForeground(new java.awt.Color(0, 0, 0));
        bntNewProduct.setText("Nuevo Producto");
        bntNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNewProductActionPerformed(evt);
            }
        });

        btnAddProduct.setBackground(new java.awt.Color(255, 255, 255));
        btnAddProduct.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAddProduct.setForeground(new java.awt.Color(0, 0, 0));
        btnAddProduct.setText("Agregar Producto");
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });
        btnAddProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAddProductKeyPressed(evt);
            }
        });

        tbInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Cantidad"
            }
        ));
        tbInventory.setEnabled(false);
        jScrollPane2.setViewportView(tbInventory);

        jScrollPane3.setViewportView(jScrollPane2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFullValue, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(txtUnitValue, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(77, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bntNewProduct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddProduct)
                        .addGap(116, 116, 116))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUnitValue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFullValue, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddProduct)
                    .addComponent(bntNewProduct))
                .addGap(63, 63, 63))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(665, 625));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("List Products");

        btnFinishSale.setBackground(new java.awt.Color(255, 255, 255));
        btnFinishSale.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnFinishSale.setForeground(new java.awt.Color(0, 0, 0));
        btnFinishSale.setText("Finalizar Venta");
        btnFinishSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishSaleActionPerformed(evt);
            }
        });

        btnNewSale.setBackground(new java.awt.Color(255, 255, 255));
        btnNewSale.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnNewSale.setForeground(new java.awt.Color(0, 0, 0));
        btnNewSale.setText("Nueva Venta");
        btnNewSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewSaleActionPerformed(evt);
            }
        });

        txtFinalPrice.setEditable(false);
        txtFinalPrice.setBackground(new java.awt.Color(255, 255, 255));
        txtFinalPrice.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtFinalPrice.setForeground(new java.awt.Color(0, 0, 0));
        txtFinalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFinalPriceActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Final Price");

        tabList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(tabList);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addComponent(btnNewSale)
                .addGap(125, 125, 125)
                .addComponent(btnFinishSale)
                .addGap(135, 135, 135))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(txtFinalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txtFinalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewSale)
                    .addComponent(btnFinishSale))
                .addGap(81, 81, 81))
        );

        mnuCreate.setText("Menu");
        mnuCreate.setActionCommand("Menu");

        itmAdd.setText("Delete");
        itmAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAddActionPerformed(evt);
            }
        });
        mnuCreate.add(itmAdd);

        jMenuBar1.add(mnuCreate);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntNewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNewProductActionPerformed
        initPanelProduct();
    }//GEN-LAST:event_bntNewProductActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed

    }//GEN-LAST:event_txtIdActionPerformed

    private void txtIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyReleased

    }//GEN-LAST:event_txtIdKeyReleased

    private void txtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyPressed
        
        ValidationUtil validationUtil = new ValidationUtil();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (validationUtil.validateInt(txtId.getText())) {

                int id = Integer.parseInt(txtId.getText());
                validateProduct(id);
                txtAmount.requestFocus();
                txtUnitValue.setText(String.valueOf(forniture.getPrice()));
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un un numero positivo para el Id");
                txtId.setText("");
                txtId.requestFocus();
            }

        }
    }//GEN-LAST:event_txtIdKeyPressed

    private void validateProduct(int id) {

        String uri = "mongodb+srv://dacasignia:dacasignia@cluster0.zry5emh.mongodb.net/?retryWrites=true&w=majority";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("exam");
            MongoCollection<Document> collection = database.getCollection("inventory");

            Bson usernameFilter = Filters.eq("id", id);
            Document productDocument = collection.find(usernameFilter).first();

            if (productDocument != null) {
                String nameProduct = productDocument.getString("name");
                float budgetProduct = productDocument.getDouble("price").floatValue();
                System.out.println(budgetProduct);
                int stock = productDocument.getInteger("stock");
                System.out.println(stock);
                forniture = new Forniture(id, nameProduct, budgetProduct, stock);
            } else {
                JOptionPane.showMessageDialog(null, "Producto no encontrado");
            }
        } catch (MongoException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos");
            e.printStackTrace();
        }
    }

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        addProductAction();
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void addProductAction() throws NumberFormatException, HeadlessException {
        
        ValidationUtil validationUtil = new ValidationUtil();

        boolean validate = true;

        int id = 0;
        int amount = 0;
        float totalPrice = 0;

        if (validationUtil.validateInt(txtId.getText())) {
            btnAddProduct.requestFocus();
            id = Integer.parseInt(txtId.getText());
            validateProduct(id);
            txtAmount.requestFocus();

            if (validationUtil.validateInt(txtAmount.getText())) {

                amount = Integer.parseInt(txtAmount.getText());
                txtFullValue.setText(String.valueOf(forniture.getPrice() * amount));
                totalPrice = forniture.getPrice() * amount;

            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un un numero positivo para la Cantidad");
                validate = false;
                txtAmount.setText("");
                txtAmount.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un un numero positivo para el Id");
            txtId.setText("");
            txtId.requestFocus();
            validate = false;
        }

        if (validate) {

            sale = new Sale(forniture.getId(), forniture.getName(), amount, forniture.getPrice(), totalPrice);
            saleList.add(sale);
            addProductToList();
            initPanelProduct();
        }
    }

    private void txtAmountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountKeyPressed
        ValidationUtil validationUtil = new ValidationUtil();

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (validationUtil.validateInt(txtId.getText())) {
                btnAddProduct.requestFocus();
                int id = Integer.parseInt(txtId.getText());
                validateProduct(id);
                txtAmount.requestFocus();
                txtUnitValue.setText(String.valueOf(forniture.getPrice()));
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un un numero positivo para el Id");
                txtId.setText("");
                txtId.requestFocus();
            }
            if (validationUtil.validateInt(txtAmount.getText())) {

                int amount = Integer.parseInt(txtAmount.getText());
                txtFullValue.setText(String.valueOf(forniture.getPrice() * amount));
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un un numero positivo para la Cantidad");
                txtAmount.setText("");
                txtAmount.requestFocus();
            }
            btnAddProduct.requestFocus();
        }
    }//GEN-LAST:event_txtAmountKeyPressed

    private void btnNewSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewSaleActionPerformed
        int rowTable = tabList.getRowCount();
        for (int i = 1; i <= rowTable; i++) {
            model.removeRow(0);
            tabList.setModel(model);
        }
        initAllPanel();
    }//GEN-LAST:event_btnNewSaleActionPerformed

    private void btnFinishSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishSaleActionPerformed
        saveSale();
        finishSale();
        initAllPanel();
    }//GEN-LAST:event_btnFinishSaleActionPerformed

    private void finishSale() throws HeadlessException {

        FornitureController mongoConnect = new FornitureController();
        mongoConnect.inventoryConnect(saleList, model, tabList);

    }

    private void saveSale() {

        float finalPrice = Float.parseFloat(txtFinalPrice.getText());

        FornitureController mongoConnect = new FornitureController();
        mongoConnect.incomeConnect(saleList, finalPrice);
    }

    private void btnAddProductKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAddProductKeyPressed
        addProductAction();
    }//GEN-LAST:event_btnAddProductKeyPressed

    private void txtFinalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFinalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFinalPriceActionPerformed

    private void txtFullValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullValueActionPerformed

    private void itmAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAddActionPerformed
        InventoryGUI incomeGUI = new InventoryGUI();
        incomeGUI.setVisible(true);
    }//GEN-LAST:event_itmAddActionPerformed

    private void addProductToList() {
        float finalPrice = Float.parseFloat(txtFinalPrice.getText());
        model.addRow(new Object[]{sale.getId(), sale.getNameProduct(), sale.getAmount(), sale.getUnitPrice(), sale.getTotalPrice()});
        tabList.setModel(model);
        finalPrice = finalPrice + sale.getTotalPrice();
        txtFinalPrice.setText(String.valueOf(finalPrice));
    }

    private void initAllPanel() {
        initPanelProduct();
        txtFinalPrice.setText("0.0");
    }

    private void initPanelProduct() {
        txtId.setText("");
        txtAmount.setText("");
        txtUnitValue.setText("0.0");
        txtFullValue.setText("0.0");
        txtId.requestFocus();
    }

    private void addTable() {
        model.addColumn("Codigo");
        model.addColumn("Nombre");
        model.addColumn("Cantidad");
        model.addColumn("Precio Unitario");
        model.addColumn("Precio Total");
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
            java.util.logging.Logger.getLogger(frmFornitureMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFornitureMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFornitureMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFornitureMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFornitureMenu().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntNewProduct;
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnFinishSale;
    private javax.swing.JButton btnNewSale;
    private javax.swing.JMenuItem itmAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenu mnuCreate;
    private javax.swing.JTable tabList;
    private javax.swing.JTable tbInventory;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtFinalPrice;
    private javax.swing.JTextField txtFullValue;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtUnitValue;
    // End of variables declaration//GEN-END:variables
}
