
package com.cruds.gui;

import com.cruds.db.BookDAO;
import com.cruds.model.Author;
import com.cruds.model.Book;
import com.cruds.model.Issue;
import com.cruds.model.Student;
import java.awt.CardLayout;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class MainFrame extends javax.swing.JFrame {

    
    public MainFrame() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")

    private void initComponents() {

        btnReturnToday = new javax.swing.JButton();
        btnListIssuedBooks = new javax.swing.JButton();
        btnIssueBook = new javax.swing.JButton();
        btnSearchBook = new javax.swing.JButton();
        btnListBooks = new javax.swing.JButton();
        btnAddBook = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        panelSearchBook = new javax.swing.JPanel();
        comboBoxSearchBy = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        searchScrollPane = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        panelListBooks = new javax.swing.JPanel();
        scrollPaneBookAuthor = new javax.swing.JScrollPane();
        bookAuthorTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        panelIssueBook = new javax.swing.JPanel();
        txtSearchBook = new javax.swing.JTextField();
        ComboBoxSearchBook = new javax.swing.JComboBox<>();
        btnSearchBookIssue = new javax.swing.JButton();
        bookScrollPane = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        searchBookLabel = new javax.swing.JLabel();
        searchStudentLabel = new javax.swing.JLabel();
        txtUsnSearch = new javax.swing.JTextField();
        usnLabel = new javax.swing.JLabel();
        studentScrollPane = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        btnIssue = new javax.swing.JButton();
        btnSearchBookIssue1 = new javax.swing.JButton();
        btnAddStudent = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panelIssuedBooks = new javax.swing.JPanel();
        scrollPaneIssuedBooks = new javax.swing.JScrollPane();
        issuedBooksTable = new javax.swing.JTable();
        btnReturn = new javax.swing.JButton();
        labelUsn2 = new javax.swing.JLabel();
        txtUsn = new javax.swing.JTextField();
        btnSearchByUsn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        panelReturnToday = new javax.swing.JPanel();
        scrollPaneReturnToday = new javax.swing.JScrollPane();
        returnTodayTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        panelAddBook = new javax.swing.JPanel();
        isbnLabel = new javax.swing.JLabel();
        txtISBN = new javax.swing.JTextField();
        titleLabel = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        categoryLabel = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        comboBoxCategory = new javax.swing.JComboBox<>();
        txtQuantity = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        authorLabel = new javax.swing.JLabel();
        txtAuthorName = new javax.swing.JTextField();
        authorEmailLabel = new javax.swing.JLabel();
        txtAuthorEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library");

        btnReturnToday.setBackground(new java.awt.Color(153, 102, 255));
        btnReturnToday.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReturnToday.setForeground(new java.awt.Color(51, 51, 51));
        btnReturnToday.setText("Book to be returned Today");
        btnReturnToday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnTodayActionPerformed(evt);
            }
        });

        btnListIssuedBooks.setBackground(new java.awt.Color(153, 102, 255));
        btnListIssuedBooks.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnListIssuedBooks.setForeground(new java.awt.Color(51, 51, 51));
        btnListIssuedBooks.setText("List Issued Books");
        btnListIssuedBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListIssuedBooksActionPerformed(evt);
            }
        });

        btnIssueBook.setBackground(new java.awt.Color(153, 102, 255));
        btnIssueBook.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnIssueBook.setForeground(new java.awt.Color(51, 51, 51));
        btnIssueBook.setText("Issue Book");
        btnIssueBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssueBookActionPerformed(evt);
            }
        });

        btnSearchBook.setBackground(new java.awt.Color(153, 102, 255));
        btnSearchBook.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSearchBook.setForeground(new java.awt.Color(51, 51, 51));
        btnSearchBook.setText("Search Book");
        btnSearchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBookActionPerformed(evt);
            }
        });

        btnListBooks.setBackground(new java.awt.Color(153, 102, 255));
        btnListBooks.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnListBooks.setForeground(new java.awt.Color(51, 51, 51));
        btnListBooks.setText("List all Books");
        btnListBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListBooksActionPerformed(evt);
            }
        });

        btnAddBook.setBackground(new java.awt.Color(153, 102, 255));
        btnAddBook.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddBook.setForeground(new java.awt.Color(51, 51, 51));
        btnAddBook.setText("Add Book");
        btnAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBookActionPerformed(evt);
            }
        });

        mainPanel.setLayout(new java.awt.CardLayout());

        panelSearchBook.setPreferredSize(new java.awt.Dimension(500, 399));

        comboBoxSearchBy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboBoxSearchBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Title", "Category", "Author", "ISBN" }));
        comboBoxSearchBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSearchByActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        searchTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ISBN", "Book Title", "Category", "Quantity", "Author"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        searchTable.setRowHeight(20);
        searchScrollPane.setViewportView(searchTable);
        if (searchTable.getColumnModel().getColumnCount() > 0) {
            searchTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            searchTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            searchTable.getColumnModel().getColumn(3).setPreferredWidth(20);
        }

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Search Book");

        javax.swing.GroupLayout panelSearchBookLayout = new javax.swing.GroupLayout(panelSearchBook);
        panelSearchBook.setLayout(panelSearchBookLayout);
        panelSearchBookLayout.setHorizontalGroup(
            panelSearchBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSearchBookLayout.createSequentialGroup()
                .addGroup(panelSearchBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSearchBookLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(panelSearchBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSearch)
                            .addGroup(panelSearchBookLayout.createSequentialGroup()
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxSearchBy, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(searchScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelSearchBookLayout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        panelSearchBookLayout.setVerticalGroup(
            panelSearchBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSearchBookLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelSearchBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxSearchBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );

        mainPanel.add(panelSearchBook, "panelSearchBook");

        scrollPaneBookAuthor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        bookAuthorTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bookAuthorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Title", "Category", "Quantity", "Author Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bookAuthorTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        bookAuthorTable.setIntercellSpacing(new java.awt.Dimension(2, 1));
        bookAuthorTable.setRowHeight(18);
        scrollPaneBookAuthor.setViewportView(bookAuthorTable);
        if (bookAuthorTable.getColumnModel().getColumnCount() > 0) {
            bookAuthorTable.getColumnModel().getColumn(0).setMinWidth(50);
            bookAuthorTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            bookAuthorTable.getColumnModel().getColumn(0).setMaxWidth(50);
            bookAuthorTable.getColumnModel().getColumn(1).setMinWidth(200);
            bookAuthorTable.getColumnModel().getColumn(1).setPreferredWidth(200);
            bookAuthorTable.getColumnModel().getColumn(1).setMaxWidth(300);
            bookAuthorTable.getColumnModel().getColumn(2).setMinWidth(50);
            bookAuthorTable.getColumnModel().getColumn(2).setPreferredWidth(80);
            bookAuthorTable.getColumnModel().getColumn(2).setMaxWidth(100);
            bookAuthorTable.getColumnModel().getColumn(3).setMinWidth(50);
            bookAuthorTable.getColumnModel().getColumn(3).setPreferredWidth(50);
            bookAuthorTable.getColumnModel().getColumn(3).setMaxWidth(50);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("List of Books");

        javax.swing.GroupLayout panelListBooksLayout = new javax.swing.GroupLayout(panelListBooks);
        panelListBooks.setLayout(panelListBooksLayout);
        panelListBooksLayout.setHorizontalGroup(
            panelListBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListBooksLayout.createSequentialGroup()
                .addGroup(panelListBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelListBooksLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(scrollPaneBookAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelListBooksLayout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        panelListBooksLayout.setVerticalGroup(
            panelListBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListBooksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollPaneBookAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        scrollPaneBookAuthor.getAccessibleContext().setAccessibleName("scrollPaneBookAuthor");

        mainPanel.add(panelListBooks, "panelListBooks");

        txtSearchBook.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ComboBoxSearchBook.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboBoxSearchBook.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Title", "Category", "Author", "ISBN" }));
        ComboBoxSearchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxSearchBookActionPerformed(evt);
            }
        });

        btnSearchBookIssue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSearchBookIssue.setText("Search");
        btnSearchBookIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBookIssueActionPerformed(evt);
            }
        });

        bookTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ISBN", "Book Title", "Category", "Quantity", "Author"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bookTable.setRowHeight(20);
        bookScrollPane.setViewportView(bookTable);
        if (bookTable.getColumnModel().getColumnCount() > 0) {
            bookTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            bookTable.getColumnModel().getColumn(3).setMinWidth(20);
            bookTable.getColumnModel().getColumn(3).setPreferredWidth(20);
        }

        searchBookLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchBookLabel.setText("Search Book");

        searchStudentLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchStudentLabel.setText("Search Student :");

        txtUsnSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsnSearchActionPerformed(evt);
            }
        });

        usnLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usnLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usnLabel.setText("USN");

        studentTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "USN", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        studentTable.setRowHeight(20);
        studentScrollPane.setViewportView(studentTable);

        btnIssue.setBackground(new java.awt.Color(153, 153, 255));
        btnIssue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnIssue.setText("Issue");
        btnIssue.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssueActionPerformed(evt);
            }
        });

        btnSearchBookIssue1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSearchBookIssue1.setText("Search");
        btnSearchBookIssue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBookIssue1ActionPerformed(evt);
            }
        });

        btnAddStudent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddStudent.setText("Add Student");
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Issue Book");

        javax.swing.GroupLayout panelIssueBookLayout = new javax.swing.GroupLayout(panelIssueBook);
        panelIssueBook.setLayout(panelIssueBookLayout);
        panelIssueBookLayout.setHorizontalGroup(
            panelIssueBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIssueBookLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(panelIssueBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIssueBookLayout.createSequentialGroup()
                        .addGroup(panelIssueBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
                            .addGroup(panelIssueBookLayout.createSequentialGroup()
                                .addGroup(panelIssueBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelIssueBookLayout.createSequentialGroup()
                                        .addComponent(searchBookLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSearchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ComboBoxSearchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSearchBookIssue)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(64, 64, 64))
                    .addGroup(panelIssueBookLayout.createSequentialGroup()
                        .addComponent(studentScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddStudent)
                        .addGap(143, 143, 143))
                    .addGroup(panelIssueBookLayout.createSequentialGroup()
                        .addComponent(searchStudentLabel)
                        .addGap(18, 18, 18)
                        .addComponent(usnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchBookIssue1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(panelIssueBookLayout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(btnIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelIssueBookLayout.setVerticalGroup(
            panelIssueBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIssueBookLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelIssueBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBookLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxSearchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchBookIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bookScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(panelIssueBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchStudentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchBookIssue1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelIssueBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIssueBookLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(studentScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelIssueBookLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(btnAddStudent)))
                .addGap(18, 18, 18)
                .addComponent(btnIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        mainPanel.add(panelIssueBook, "panelIssueBook");

        scrollPaneIssuedBooks.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        issuedBooksTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        issuedBooksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Issue ID", "Book Title", "USN", "Student Name", "Issue Date", "Return Date", "Book ISBN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        issuedBooksTable.setRowHeight(20);
        scrollPaneIssuedBooks.setViewportView(issuedBooksTable);
        if (issuedBooksTable.getColumnModel().getColumnCount() > 0) {
            issuedBooksTable.getColumnModel().getColumn(0).setMinWidth(20);
            issuedBooksTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            issuedBooksTable.getColumnModel().getColumn(1).setPreferredWidth(100);
        }

        btnReturn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        labelUsn2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelUsn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUsn2.setText("USN");

        txtUsn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnSearchByUsn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSearchByUsn.setText("Search");
        btnSearchByUsn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByUsnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Return Book");

        javax.swing.GroupLayout panelIssuedBooksLayout = new javax.swing.GroupLayout(panelIssuedBooks);
        panelIssuedBooks.setLayout(panelIssuedBooksLayout);
        panelIssuedBooksLayout.setHorizontalGroup(
            panelIssuedBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIssuedBooksLayout.createSequentialGroup()
                .addGroup(panelIssuedBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIssuedBooksLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(panelIssuedBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollPaneIssuedBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelIssuedBooksLayout.createSequentialGroup()
                                .addComponent(labelUsn2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearchByUsn))))
                    .addGroup(panelIssuedBooksLayout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelIssuedBooksLayout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        panelIssuedBooksLayout.setVerticalGroup(
            panelIssuedBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIssuedBooksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(panelIssuedBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsn2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchByUsn))
                .addGap(18, 18, 18)
                .addComponent(scrollPaneIssuedBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        mainPanel.add(panelIssuedBooks, "panelIssuedBooks");

        scrollPaneReturnToday.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        returnTodayTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        returnTodayTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Issue ID", "Book Title", "USN", "Issue Date", "Return Date", "Book ISBN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        returnTodayTable.setRowHeight(20);
        scrollPaneReturnToday.setViewportView(returnTodayTable);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Books to be returned Today");

        javax.swing.GroupLayout panelReturnTodayLayout = new javax.swing.GroupLayout(panelReturnToday);
        panelReturnToday.setLayout(panelReturnTodayLayout);
        panelReturnTodayLayout.setHorizontalGroup(
            panelReturnTodayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReturnTodayLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(panelReturnTodayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReturnTodayLayout.createSequentialGroup()
                        .addComponent(scrollPaneReturnToday, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReturnTodayLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(317, 317, 317))))
        );
        panelReturnTodayLayout.setVerticalGroup(
            panelReturnTodayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReturnTodayLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(scrollPaneReturnToday, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        mainPanel.add(panelReturnToday, "panelReturnToday");

        isbnLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        isbnLabel.setText("Book ISBN");

        txtISBN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        titleLabel.setText("Book Title");

        txtTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        categoryLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        categoryLabel.setText("Category");

        quantityLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        quantityLabel.setText("Quantity");

        txtCategory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        comboBoxCategory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboBoxCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Language", "Programming" }));
        comboBoxCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCategoryActionPerformed(evt);
            }
        });

        txtQuantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdd.setText("Add ");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        authorLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        authorLabel.setText("Author Name");

        txtAuthorName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        authorEmailLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        authorEmailLabel.setText("Author Email");

        txtAuthorEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Add Book");

        javax.swing.GroupLayout panelAddBookLayout = new javax.swing.GroupLayout(panelAddBook);
        panelAddBook.setLayout(panelAddBookLayout);
        panelAddBookLayout.setHorizontalGroup(
            panelAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddBookLayout.createSequentialGroup()
                .addGroup(panelAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddBookLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(panelAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(categoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(isbnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(authorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(authorEmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(quantityLabel))
                        .addGap(18, 18, 18)
                        .addGroup(panelAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(txtISBN)
                            .addGroup(panelAddBookLayout.createSequentialGroup()
                                .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboBoxCategory, 0, 1, Short.MAX_VALUE))
                            .addComponent(txtAuthorEmail)
                            .addComponent(txtAuthorName)
                            .addComponent(txtQuantity)))
                    .addGroup(panelAddBookLayout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAddBookLayout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(474, Short.MAX_VALUE))
        );
        panelAddBookLayout.setVerticalGroup(
            panelAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddBookLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(panelAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isbnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(panelAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTitle)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(panelAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(panelAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAuthorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panelAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAuthorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panelAddBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(quantityLabel)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(btnAdd)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        mainPanel.add(panelAddBook, "panelAddBook");
        panelAddBook.getAccessibleContext().setAccessibleName("");
        panelAddBook.getAccessibleContext().setAccessibleDescription("");

        btnLogout.setBackground(new java.awt.Color(204, 204, 204));
        btnLogout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearchBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListBooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIssueBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListIssuedBooks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(btnReturnToday, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogout)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnAddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnListBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnIssueBook, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(btnListIssuedBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReturnToday, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBookActionPerformed
       CardLayout card = (CardLayout)mainPanel.getLayout();
       card.show(mainPanel, "panelAddBook");
    }//GEN-LAST:event_btnAddBookActionPerformed

    private void comboBoxSearchByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSearchByActionPerformed
        searchBy = (String)comboBoxSearchBy.getSelectedItem();        
    }//GEN-LAST:event_comboBoxSearchByActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if(searchBy == null)
        {
            searchBy = "Title"; //search by title default
        }
        
        String txt = txtSearch.getText().trim();
        if(txt.length() == 0)
        {
            JOptionPane.showMessageDialog(panelSearchBook, "Please fill in the details", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
                
        switch(searchBy)
        {
            case    "Title":    searchTable.setModel(dao.getByTitle(txt));
                                break;
                          
            case "Category":    searchTable.setModel(dao.getByCategory(txt));
                                break;
             
            case   "Author":    searchTable.setModel(dao.getByAuthor(txt));
                                break;
                          
            case     "ISBN":    searchTable.setModel(dao.getByIsbn(txt));
                                break;              
        }
        
        if(searchTable.getModel().getRowCount() == 0)
        {
            JOptionPane.showMessageDialog(panelSearchBook, "No record Found", "Nothing Found", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void ComboBoxSearchBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxSearchBookActionPerformed
        searchBookBy = (String)ComboBoxSearchBook.getSelectedItem();
    }//GEN-LAST:event_ComboBoxSearchBookActionPerformed

    private void btnSearchBookIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchBookIssueActionPerformed
        if(searchBookBy == null)
        {
            searchBookBy = "Title"; //search by title default
        }
        
        String txt = txtSearchBook.getText().trim();
        if(txt.length() == 0)
        {
            JOptionPane.showMessageDialog(panelSearchBook, "Please fill in the details", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
                
        switch(searchBookBy)
        {
            case    "Title":    bookTable.setModel(dao.getByTitle(txt));
                                break;
                          
            case "Category":    bookTable.setModel(dao.getByCategory(txt));
                                break;
             
            case   "Author":    bookTable.setModel(dao.getByAuthor(txt));
                                break;
                          
            case     "ISBN":    bookTable.setModel(dao.getByIsbn(txt));
                                break;              
        }
        
        if(bookTable.getModel().getRowCount() == 0)
        {
            JOptionPane.showMessageDialog(panelIssueBook, "No record Found", "Nothing Found", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchBookIssueActionPerformed

    private void txtUsnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsnSearchActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        int row = issuedBooksTable.getSelectedRow();
        if(row == -1)
        {
            JOptionPane.showMessageDialog(panelIssuedBooks, "Nothing selected", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int id = Integer.parseInt((String)issuedBooksTable.getModel().getValueAt(row, 0));
        String isbn = (String)issuedBooksTable.getModel().getValueAt(row, 6);
        
        if(dao.returnBook(id, isbn))
        {
            JOptionPane.showMessageDialog(panelIssuedBooks, "Success", "Successfull", JOptionPane.INFORMATION_MESSAGE);
            row = -1;
            issuedBooksTable.setModel(dao.listIssuedBooks());   
        }
        else
        {
            JOptionPane.showMessageDialog(panelIssuedBooks, "Some error occured", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnSearchBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchBookActionPerformed
       CardLayout card = (CardLayout)mainPanel.getLayout();
       card.show(mainPanel, "panelSearchBook");
    }//GEN-LAST:event_btnSearchBookActionPerformed

    private void btnListBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListBooksActionPerformed
       CardLayout card = (CardLayout)mainPanel.getLayout();
       card.show(mainPanel, "panelListBooks");
       
       bookAuthorTable.setModel(dao.getTableBookAuthor());
       if(bookAuthorTable.getModel().getRowCount() == 0)
        {
            JOptionPane.showMessageDialog(panelListBooks, "No record Found", "Nothing Found", JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_btnListBooksActionPerformed

    private void btnIssueBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssueBookActionPerformed
        CardLayout card = (CardLayout)mainPanel.getLayout();
       card.show(mainPanel, "panelIssueBook");
    }//GEN-LAST:event_btnIssueBookActionPerformed

    private void btnListIssuedBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListIssuedBooksActionPerformed
       CardLayout card = (CardLayout)mainPanel.getLayout();
       card.show(mainPanel, "panelIssuedBooks");
       issuedBooksTable.setModel(dao.listIssuedBooks());
       if(issuedBooksTable.getModel().getRowCount() == 0)
       {
            JOptionPane.showMessageDialog(panelIssueBook, "No record Found", "No record", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_btnListIssuedBooksActionPerformed

    private void btnReturnTodayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnTodayActionPerformed
       CardLayout card = (CardLayout)mainPanel.getLayout();
       card.show(mainPanel, "panelReturnToday");
       
       Calendar cal = Calendar.getInstance();
       Date curDate = cal.getTime();
       returnTodayTable.setModel(dao.getBookToReturn(curDate));
       if(returnTodayTable.getModel().getRowCount() == 0)
       {
           JOptionPane.showMessageDialog(panelReturnToday, "No book to return Today", "Message", JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_btnReturnTodayActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String isbn = txtISBN.getText().trim();
        String title = txtTitle.getText().trim();
        String category = txtCategory.getText().trim();
        String q = txtQuantity.getText().trim();
        String name = txtAuthorName.getText().trim();
        String email = txtAuthorEmail.getText().trim();
        
        if(isbn.equals("") || title.equals("") || category.equals("") || name.equals("") || email.equals("") || q.equals(""))
        {
            JOptionPane.showMessageDialog(panelAddBook, "Fields can't be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int numBooks;
        try{
            numBooks = Integer.parseInt(q);
            if(numBooks <= 0)
            {
                throw new Exception();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(panelAddBook, "Please enter valid quantity", "Invalid Quantity", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        
        if( dao.addBook(new Book(isbn, title, category, numBooks)) && dao.addAuthor(new Author(name, email, isbn)) )
        {
            JOptionPane.showMessageDialog(panelAddBook, "Book details added successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            txtISBN.setText("");
            txtTitle.setText("");
            txtCategory.setText("");
            txtQuantity.setText("");
            txtAuthorName.setText("");
            txtAuthorEmail.setText("");
        }
        else
        {
            JOptionPane.showMessageDialog(panelAddBook, "Invalid Credentials", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSearchBookIssue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchBookIssue1ActionPerformed
        String usn = txtUsnSearch.getText().trim();
         
        if(usn.length() != 0)
        {
            studentTable.setModel(dao.getStudentbyUsn(usn));
        }
        else
        {
            JOptionPane.showMessageDialog(panelIssueBook, "Please enter name or usn", "Invalid Credentials", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(studentTable.getModel().getRowCount() == 0)
        {
            JOptionPane.showMessageDialog(panelIssueBook, "No record Found", "Nothing Found", JOptionPane.ERROR_MESSAGE);
            DialogAddStudent dialog = new DialogAddStudent(this, true);
            dialog.setLocationRelativeTo(btnAddStudent);
            dialog.setVisible(true);
            txtUsnSearch.setText(dialog.usn);
        }
        
        
        
    }//GEN-LAST:event_btnSearchBookIssue1ActionPerformed

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
        DialogAddStudent dialog = new DialogAddStudent(this, true);
        dialog.setLocationRelativeTo(btnAddStudent);
        dialog.setVisible(true);
        txtUsnSearch.setText(dialog.usn);
    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void btnIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssueActionPerformed
        int idxBook = bookTable.getSelectedRow();
        int idxStudent = studentTable.getSelectedRow();
	if(idxBook == -1 || idxStudent == -1)
	{
            JOptionPane.showMessageDialog(panelIssueBook, "Please select book and student from the table", "Invalid Operation", JOptionPane.ERROR_MESSAGE);
            return;
	}
        String usn = (String)studentTable.getModel().getValueAt(idxStudent, 0);
        String name = (String)studentTable.getModel().getValueAt(idxStudent, 1);
        String isbn = (String)bookTable.getModel().getValueAt(idxBook, 0);
        int count = Integer.parseInt((String)bookTable.getModel().getValueAt(idxBook, 3));
        
        if(count == 0)
        {
            JOptionPane.showMessageDialog(panelIssueBook, "Book not available", "Unavailable", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Calendar cal = Calendar.getInstance();
	Date curDate = cal.getTime();
        Date issue_date = curDate;
	cal.add(Calendar.DATE, 7); //add 7 days to current date
	Date return_date = cal.getTime();
        if( (dao.studentExist(new Student(usn, name)) || dao.addStudent(new Student(usn, name))) && dao.issueBook(new Issue(usn, issue_date, return_date, isbn)) )
	{
            JOptionPane.showMessageDialog(panelIssueBook, "Book Issued Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            idxBook = -1;
            bookTable.setModel(new DefaultTableModel());
	}
        else
        {
            JOptionPane.showMessageDialog(panelIssueBook, "Some error occured.", "Invalid Operation", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIssueActionPerformed

    private void btnSearchByUsnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByUsnActionPerformed
        String usn = txtUsn.getText().trim();
        if(usn.length() == 0)
        {
            JOptionPane.showMessageDialog(panelIssueBook, "Please enter usn", "Invalid USN", JOptionPane.ERROR_MESSAGE);
            return;
        }
        issuedBooksTable.setModel(dao.listBookByUsn(usn));
        if(issuedBooksTable.getModel().getRowCount() == 0)
        {
            JOptionPane.showMessageDialog(panelIssueBook, "No record Found", "No record", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchByUsnActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        this.dispose();
        new LoginFrame().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void comboBoxCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCategoryActionPerformed
        String val = (String)comboBoxCategory.getSelectedItem();
        if(!val.equals("Select"))
        {
            txtCategory.setText(val);
        }

    }//GEN-LAST:event_comboBoxCategoryActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if(!LoginFrame.loggedIn)
                {
                    new LoginFrame().setVisible(true);
                    return;
                }
        
                new MainFrame().setVisible(true);
            }
        });
    }
    BookDAO dao = new BookDAO();
    String searchBy = null, searchBookBy = null;
    //int numBooks = 0;
    //String isbn, usn, title, category, name, email;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxSearchBook;
    private javax.swing.JLabel authorEmailLabel;
    private javax.swing.JLabel authorLabel;
    private javax.swing.JTable bookAuthorTable;
    private javax.swing.JScrollPane bookScrollPane;
    private javax.swing.JTable bookTable;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddBook;
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnIssue;
    private javax.swing.JButton btnIssueBook;
    private javax.swing.JButton btnListBooks;
    private javax.swing.JButton btnListIssuedBooks;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnReturnToday;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearchBook;
    private javax.swing.JButton btnSearchBookIssue;
    private javax.swing.JButton btnSearchBookIssue1;
    private javax.swing.JButton btnSearchByUsn;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JComboBox<String> comboBoxCategory;
    private javax.swing.JComboBox<String> comboBoxSearchBy;
    private javax.swing.JLabel isbnLabel;
    private javax.swing.JTable issuedBooksTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labelUsn2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelAddBook;
    private javax.swing.JPanel panelIssueBook;
    private javax.swing.JPanel panelIssuedBooks;
    private javax.swing.JPanel panelListBooks;
    private javax.swing.JPanel panelReturnToday;
    private javax.swing.JPanel panelSearchBook;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JTable returnTodayTable;
    private javax.swing.JScrollPane scrollPaneBookAuthor;
    private javax.swing.JScrollPane scrollPaneIssuedBooks;
    private javax.swing.JScrollPane scrollPaneReturnToday;
    private javax.swing.JLabel searchBookLabel;
    private javax.swing.JScrollPane searchScrollPane;
    private javax.swing.JLabel searchStudentLabel;
    private javax.swing.JTable searchTable;
    private javax.swing.JScrollPane studentScrollPane;
    private javax.swing.JTable studentTable;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField txtAuthorEmail;
    private javax.swing.JTextField txtAuthorName;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSearchBook;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtUsn;
    private javax.swing.JTextField txtUsnSearch;
    private javax.swing.JLabel usnLabel;
   
}
