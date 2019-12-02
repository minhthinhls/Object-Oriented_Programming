package lab05;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.xml.bind.JAXBException;

public class AppGUI {

    private JFrame frame;
    private JTextField textField_productName;
    private JScrollPane scrollPane;
    private JList list;
    private JTextField textField_searchProductName;
    private JLabel searchAmountValue;
    private JLabel searchDescriptionValue;
    private ProductList products;

    private void loadWordsIntoTable() {
        DefaultListModel<String> model = new DefaultListModel();
        StringBuilder sb;
        int i = 1;
        for (Product product : products.getListProducts()) {
            sb = new StringBuilder();
            sb.append("<html><pre>");
            sb.append(String.format("%d.\t%-15s\t%d\t%-20s", i++,
                    product.getProductName(),
                    product.getAmount(),
                    product.getDescription()
            ));
            sb.append("</pre></html>");
            model.addElement(sb.toString());
        }
        list.setModel(model);
    }

    /**
     * Launch the application.
     *
     * @param args
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    AppGUI window = new AppGUI();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public AppGUI() {
        try {
            products = JSON_IO.loadJSONFile();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        this.initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    public void initialize() {

        frame = new JFrame();

        frame.setTitle("WAREHOUSE MANAGEMENT");
        frame.setResizable(false);
        frame.setBounds(100, 100, 701, 562);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setBounds(0, 0, 695, 527);
        frame.getContentPane().add(tabbedPane);

        JPanel managePanel = new JPanel();
        tabbedPane.addTab("Manage", null, managePanel, null);
        managePanel.setLayout(null);

        JLabel lblProductName = new JLabel("Product Name");
        lblProductName.setBounds(12, 13, 119, 23);
        managePanel.add(lblProductName);
        lblProductName.setFont(new Font("Tahoma", Font.PLAIN, 19));

        JLabel lblAmount = new JLabel("Amount");
        lblAmount.setBounds(12, 40, 127, 32);
        managePanel.add(lblAmount);
        lblAmount.setFont(new Font("Tahoma", Font.PLAIN, 19));

        JLabel lblDescription = new JLabel("Description");
        lblDescription.setBounds(12, 72, 127, 32);
        managePanel.add(lblDescription);
        lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 19));

        textField_productName = new JTextField();
        textField_productName.setBounds(146, 10, 532, 30);
        managePanel.add(textField_productName);
        textField_productName.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textField_productName.setColumns(10);

        final JSpinner spin_amount = new JSpinner();
        spin_amount.setBounds(146, 44, 69, 30);
        managePanel.add(spin_amount);
        spin_amount.setFont(new Font("Tahoma", Font.PLAIN, 15));
        spin_amount.setModel(new SpinnerNumberModel(0, 0, null, 1));

        final JTextPane textPane_description = new JTextPane();
        textPane_description.setBounds(146, 85, 532, 81);
        managePanel.add(textPane_description);
        textPane_description.setFont(new Font("Tahoma", Font.PLAIN, 15));

        JLabel lblProductList = new JLabel("Product List");
        lblProductList.setBounds(12, 186, 154, 38);
        managePanel.add(lblProductList);
        lblProductList.setFont(new Font("Tahoma", Font.BOLD, 25));
        scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 225, 671, 259);
        managePanel.add(scrollPane);

        Object[] data = products.getListProducts().toArray();
        list = new JList(data);
        scrollPane.setViewportView(list);
        list.setFont(new Font("Tahoma", Font.PLAIN, 16));
        JButton removeButton = new JButton("Remove");
        removeButton.setBounds(581, 179, 97, 30);
        managePanel.add(removeButton);

        JButton addButton = new JButton("Add");
        addButton.setBounds(466, 179, 97, 30);
        managePanel.add(addButton);

        JPanel searchPanel = new JPanel();
        tabbedPane.addTab("Search", null, searchPanel, null);
        searchPanel.setLayout(null);

        JLabel lbl_productName = new JLabel("Product Name");
        lbl_productName.setBounds(12, 13, 119, 23);
        lbl_productName.setFont(new Font("Tahoma", Font.PLAIN, 19));
        searchPanel.add(lbl_productName);

        JLabel lbl_amount = new JLabel("Amount");
        lbl_amount.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lbl_amount.setBounds(12, 83, 127, 32);
        searchPanel.add(lbl_amount);

        JLabel lbl_description = new JLabel("Description");
        lbl_description.setFont(new Font("Tahoma", Font.PLAIN, 19));
        lbl_description.setBounds(12, 115, 127, 32);
        searchPanel.add(lbl_description);

        textField_searchProductName = new JTextField();
        /**
         * Input product name and press ENTER keyboard to start searching.
         */
        textField_searchProductName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    for (Product product : products.getListProducts()) {
                        if (textField_searchProductName.getText().toUpperCase()
                                .equals(product.getProductName().toUpperCase())) {
                            searchAmountValue.setText(product.getAmount().toString());
                            searchDescriptionValue.setText(product.getDescription());
                        }
                    }
                }
            }
        });
        textField_searchProductName.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textField_searchProductName.setColumns(10);
        textField_searchProductName.setBounds(146, 10, 532, 30);
        searchPanel.add(textField_searchProductName);

        JButton searchButton = new JButton("Search");
        /**
         * Input product name and click SEARCH button to start searching.
         */
        searchButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                for (Product product : products.getListProducts()) {
                    if (textField_searchProductName.getText().toUpperCase()
                            .equals(product.getProductName().toUpperCase())) {
                        searchAmountValue.setText(product.getAmount().toString());
                        searchDescriptionValue
                                .setText("<html>" + product.getDescription() + "</html>");
                    }
                }
            }
        });
        searchButton.setBounds(570, 53, 105, 30);
        searchPanel.add(searchButton);

        searchAmountValue = new JLabel("");
        searchAmountValue.setFont(new Font("Tahoma", Font.PLAIN, 19));
        searchAmountValue.setBounds(143, 83, 127, 32);
        searchPanel.add(searchAmountValue);

        searchDescriptionValue = new JLabel("");
        searchDescriptionValue.setVerticalAlignment(SwingConstants.TOP);
        searchDescriptionValue.setHorizontalAlignment(SwingConstants.LEFT);
        searchDescriptionValue.setFont(new Font("Tahoma", Font.PLAIN, 19));
        searchDescriptionValue.setBounds(143, 120, 535, 350);
        searchPanel.add(searchDescriptionValue);
        /**
         * Input product name & amount, then click ADD button to add item.
         */
        addButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (textField_productName.getText().length() > 0 && (Integer) spin_amount.getValue() > 0) {
                    boolean flag = true;
                    for (Product product : products.getListProducts()) {
                        if (textField_productName.getText().toUpperCase()
                                .equals(product.getProductName().toUpperCase())) {
                            product.increaseAmount((Integer) spin_amount.getValue());
                            product.setDescription(textPane_description.getText());
                            flag = false;
                        }
                    }
                    if (flag == true) {
                        products.addProduct(textField_productName.getText(), (Integer) spin_amount.getValue(),
                                textPane_description.getText());
                    }

                    textField_productName.setText("");
                    spin_amount.setValue(0);
                    textPane_description.setText("");
                    loadWordsIntoTable();
                    try {
                        JSON_IO.saveJSONFile(products);
                    } catch (JAXBException ex) {
                        ex.printStackTrace();
                    }
                }

            }
        });
        /**
         * Input product name or choose item from JList, then click REMOVE
         * button to decrease item amount.
         */
        removeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int select = list.getSelectedIndex();
                Product toDeleteProduct = null;
                if (textField_productName.getText().length() > 0) {
                    for (Product product : products.getListProducts()) {
                        if (textField_productName.getText().toUpperCase()
                                .equals(product.getProductName().toUpperCase())
                                && !product.decreaseAmountByOne()) {
                            toDeleteProduct = product;
                        }
                    }
                    products.getListProducts().remove(toDeleteProduct);
                    loadWordsIntoTable();
                } else if (list.getSelectedIndex() != -1) {
                    Product product = products.getListProducts().get(list.getSelectedIndex());
                    if (!product.decreaseAmountByOne()) {
                        products.getListProducts().remove(product);
                    }
                    loadWordsIntoTable();
                    list.setSelectedIndex(select);
                }

                try {
                    JSON_IO.saveJSONFile(products);
                } catch (JAXBException e1) {
                    e1.printStackTrace();
                }
            }
        });
        loadWordsIntoTable();

    }

}
