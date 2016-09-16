/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * forwardWrite.java
 *
 * Created on 10 Jul, 2012, 1:37:46 PM
 */

package forwardwrite;

import java.awt.Color;
//import java.awt.Event;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import javax.swing.JFileChooser;
import java.io.*;
import java.io.FilenameFilter.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.net.URI;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author AJAY-PREM
 */
public class forwardWrite extends javax.swing.JFrame {

    boolean fileProtectionFlag=true;
    static File fd=new File("D:\\forwardWrite");
    encDec ed=new encDec();
    ActionEvent evt=new ActionEvent(this, WIDTH,"");
    /** Creates new form forwardWrite */

    private JMenuItem Cut=new JMenuItem("Cut");
    private JMenuItem Copy=new JMenuItem("Copy");
    private JMenuItem Paste=new JMenuItem("Paste");
    private JMenuItem SelectAll=new JMenuItem("SelectAll");
    private JMenuItem CopyAll=new JMenuItem("CopyAll");
    private JMenuItem Undo=new JMenuItem("Undo");
    protected JPasswordField JPass;
    FileFilter fff;

    public forwardWrite() {

        initComponents();
//        initApp iA=new initApp();
            Font f=new Font("Courier New",Font.PLAIN,15);
        write.setFont(f);
        write.setForeground(Color.BLACK);
        write.setBackground(Color.WHITE);
        fontDialog.setVisible(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(forwardWrite.class.getResource("icon.png")));
        fontDialog.setIconImage(Toolkit.getDefaultToolkit().getImage(forwardWrite.class.getResource("icon.png")));
        aboutUs.setIconImage(Toolkit.getDefaultToolkit().getImage(forwardWrite.class.getResource("icon.png")));
        passHelpDialog.setIconImage(Toolkit.getDefaultToolkit().getImage(forwardWrite.class.getResource("icon.png")));
        searchDialog.setIconImage(Toolkit.getDefaultToolkit().getImage(forwardWrite.class.getResource("icon.png")));
        RandomDialog.setIconImage(Toolkit.getDefaultToolkit().getImage(forwardWrite.class.getResource("icon.png")));
        initHelpDialog.setIconImage(Toolkit.getDefaultToolkit().getImage(forwardWrite.class.getResource("icon.png")));
        passProtection.setState(true);


        file.setRolloverEnabled(true);


        /*Adding context Listeners*/
        Cut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        Cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CutActionPerformed(evt);
            }
        });
        Copy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        Copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyActionPerformed(evt);
            }
        });
        Paste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        Paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasteActionPerformed(evt);
            }
        });
        SelectAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        SelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectAllActionPerformed(evt);
            }
        });

        CopyAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        CopyAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyAllActionPerformed(evt);
            }
        });


        Undo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        Undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UndoActionPerformed(evt);
            }
        });


        if(!fd.exists())
        {
            fd.mkdir();
        }
        }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fontDialog = new javax.swing.JDialog();
        fontSlider = new javax.swing.JSlider();
        fontButton = new javax.swing.JButton();
        GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
        Font[] fonts=ge.getAllFonts();
        String arr[]=new String[fonts.length];
        for(int i=0;i<fonts.length;i++)
        arr[i]=""+fonts[i].getName();
        fontJumbo = new javax.swing.JComboBox(arr);
        fontText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        fontStyle = new javax.swing.JComboBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        fontPreview = new javax.swing.JTextArea();
        aboutUs = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jText = new javax.swing.JTextField();
        vote = new javax.swing.JCheckBox();
        thankx = new javax.swing.JButton();
        voteCount = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        passHelpDialog = new javax.swing.JDialog();
        jScrollPane5 = new javax.swing.JScrollPane();
        passHelpText = new javax.swing.JTextArea();
        passHelpTitle = new javax.swing.JLabel();
        useMasterPass = new javax.swing.JButton();
        passHelpGotIt = new javax.swing.JButton();
        passCheckField = new javax.swing.JPasswordField();
        contextMenu = new javax.swing.JPopupMenu();
        searchDialog = new javax.swing.JDialog();
        searchBar = new javax.swing.JTextField();
        findBut = new javax.swing.JButton();
        findNextBut = new javax.swing.JButton();
        findPrevBut = new javax.swing.JButton();
        findFirstBut = new javax.swing.JButton();
        findLastBut = new javax.swing.JButton();
        findCancelBut = new javax.swing.JButton();
        popUpMenu = new javax.swing.JDialog();
        jScrollPane6 = new javax.swing.JScrollPane();
        viewList = new javax.swing.JList();
        infoPopUp = new javax.swing.JPopupMenu();
        infoMessage = new javax.swing.JTextField();
        messageBox = new javax.swing.JTextArea();
        RandomDialog = new javax.swing.JDialog();
        randomButt = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        randomText = new javax.swing.JTextArea();
        initHelpDialog = new javax.swing.JDialog();
        jScrollPane8 = new javax.swing.JScrollPane();
        initHelpCont = new javax.swing.JTextArea();
        nextTip = new javax.swing.JButton();
        initHelpFlag = new javax.swing.JCheckBox();
        initHelpClose = new javax.swing.JButton();
        load = new javax.swing.JDialog();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        write = new javax.swing.JTextArea();
        menu = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        newWrite = new javax.swing.JMenuItem();
        open = new javax.swing.JMenuItem();
        save = new javax.swing.JMenuItem();
        saveAs = new javax.swing.JMenuItem();
        print = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        edit = new javax.swing.JMenu();
        editCut = new javax.swing.JMenuItem();
        editCopy = new javax.swing.JMenuItem();
        editPaste = new javax.swing.JMenuItem();
        editSelectAll = new javax.swing.JMenuItem();
        editCopyAll = new javax.swing.JMenuItem();
        editUndo = new javax.swing.JMenuItem();
        toLower = new javax.swing.JMenuItem();
        toUpper = new javax.swing.JMenuItem();
        toCapitalise = new javax.swing.JMenuItem();
        view = new javax.swing.JMenu();
        font = new javax.swing.JMenuItem();
        fileList = new javax.swing.JMenuItem();
        search = new javax.swing.JMenu();
        findMenu = new javax.swing.JMenuItem();
        protection = new javax.swing.JMenu();
        forgotPass = new javax.swing.JMenuItem();
        changePassword = new javax.swing.JMenuItem();
        passProtection = new javax.swing.JCheckBoxMenuItem();
        ProtectionSetMaster = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();
        about = new javax.swing.JMenuItem();
        needHelp = new javax.swing.JMenuItem();
        tips = new javax.swing.JMenuItem();

        fontSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                fontSliderMouseDragged(evt);
            }
        });

        fontButton.setText("OK");
        fontButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontButtonActionPerformed(evt);
            }
        });

        /*
        fontJumbo.setModel(arr);
        */
        fontJumbo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fontJumboItemStateChanged(evt);
            }
        });
        fontJumbo.setSelectedItem(fonts[10].getName());

        fontText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fontTextKeyReleased(evt);
            }
        });

        jLabel1.setText("Enter font Size");

        fontStyle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BOLD", "ITALIC", "PLAIN"}));
        fontStyle.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fontStyleItemStateChanged(evt);
            }
        });

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane4.setEnabled(false);
        jScrollPane4.setWheelScrollingEnabled(false);

        fontPreview.setColumns(20);
        fontPreview.setEditable(false);
        fontPreview.setForeground(new java.awt.Color(8, 37, 177));
        fontPreview.setRows(5);
        jScrollPane4.setViewportView(fontPreview);

        javax.swing.GroupLayout fontDialogLayout = new javax.swing.GroupLayout(fontDialog.getContentPane());
        fontDialog.getContentPane().setLayout(fontDialogLayout);
        fontDialogLayout.setHorizontalGroup(
            fontDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fontDialogLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(fontDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addGroup(fontDialogLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fontDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fontJumbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(fontDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fontDialogLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fontText, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fontDialogLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                                .addComponent(fontStyle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))))
                    .addComponent(fontSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(fontButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        fontDialogLayout.setVerticalGroup(
            fontDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fontDialogLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(fontSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fontDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fontText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fontDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fontJumbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fontStyle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(fontButton)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setFont(new java.awt.Font("Courier New", 0, 16));
        jTextArea1.setRows(5);
        jTextArea1.setText("forwardWrite is the text-editor with\nextra abilty of password protection,\nwhich secures your private data...\nAnd Security of your data is our \nprime duty and we love to do that....\n\t\t\t    This is \n\t        © forward s/ash inc.\n \t\t\t    product.\n\t\t\n\t\t      version 1.0.3");
        jScrollPane2.setViewportView(jTextArea1);

        jText.setEditable(false);
        jText.setFont(new java.awt.Font("Candara", 1, 12));
        jText.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jText.setText("I like your intiative... forwardWrite");
        jText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextActionPerformed(evt);
            }
        });

        vote.setSelected(true);
        vote.setText("yes");
        vote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voteActionPerformed(evt);
            }
        });

        thankx.setText("Vote");
        thankx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thankxActionPerformed(evt);
            }
        });

        voteCount.setBackground(java.awt.Color.green);
        voteCount.setEditable(false);

        jTextPane1.setEditable(false);
        jTextPane1.setFont(new java.awt.Font("Lucida Handwriting", 1, 24));
        jTextPane1.setForeground(java.awt.Color.red);
        jTextPane1.setText("Know Us.");
        jTextPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextPane1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextPane1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextPane1MouseExited(evt);
            }
        });
        jScrollPane3.setViewportView(jTextPane1);

        javax.swing.GroupLayout aboutUsLayout = new javax.swing.GroupLayout(aboutUs.getContentPane());
        aboutUs.getContentPane().setLayout(aboutUsLayout);
        aboutUsLayout.setHorizontalGroup(
            aboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutUsLayout.createSequentialGroup()
                .addGroup(aboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(aboutUsLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jText, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(vote)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(thankx)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(voteCount, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                        .addGroup(aboutUsLayout.createSequentialGroup()
                            .addGap(125, 125, 125)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(aboutUsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        aboutUsLayout.setVerticalGroup(
            aboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutUsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(aboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vote)
                    .addComponent(thankx)
                    .addComponent(voteCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        passHelpText.setColumns(20);
        passHelpText.setEditable(false);
        passHelpText.setFont(new java.awt.Font("Courier New", 0, 15));
        passHelpText.setRows(5);
        jScrollPane5.setViewportView(passHelpText);

        passHelpTitle.setBackground(java.awt.Color.white);
        passHelpTitle.setFont(new java.awt.Font("Courier New", 0, 24));
        passHelpTitle.setForeground(java.awt.Color.red);
        passHelpTitle.setText("Password Hints :");

        useMasterPass.setText("Not yet ?? Use Master Password");
        useMasterPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useMasterPassActionPerformed(evt);
            }
        });

        passHelpGotIt.setText("Got It !! open File Now ");
        passHelpGotIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passHelpGotItActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout passHelpDialogLayout = new javax.swing.GroupLayout(passHelpDialog.getContentPane());
        passHelpDialog.getContentPane().setLayout(passHelpDialogLayout);
        passHelpDialogLayout.setHorizontalGroup(
            passHelpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passHelpDialogLayout.createSequentialGroup()
                .addGroup(passHelpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(passHelpDialogLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(passHelpTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, passHelpDialogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(useMasterPass, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(passHelpGotIt, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(passHelpDialogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)))
                .addContainerGap())
        );
        passHelpDialogLayout.setVerticalGroup(
            passHelpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, passHelpDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passHelpTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(passHelpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(useMasterPass)
                    .addComponent(passHelpGotIt))
                .addGap(26, 26, 26))
        );

        passCheckField.setBackground(java.awt.Color.yellow);
        passCheckField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        searchBar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        searchBar.setText("search....");
        searchBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                searchBarMouseReleased(evt);
            }
        });

        findBut.setText("Find");
        findBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButActionPerformed(evt);
            }
        });

        findNextBut.setText("Find Next");
        findNextBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findNextButActionPerformed(evt);
            }
        });

        findPrevBut.setText("Find Previous");
        findPrevBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findPrevButActionPerformed(evt);
            }
        });

        findFirstBut.setText("Find First");
        findFirstBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findFirstButActionPerformed(evt);
            }
        });

        findLastBut.setText("Find Last");
        findLastBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findLastButActionPerformed(evt);
            }
        });

        findCancelBut.setText("Cancel");
        findCancelBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findCancelButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchDialogLayout = new javax.swing.GroupLayout(searchDialog.getContentPane());
        searchDialog.getContentPane().setLayout(searchDialogLayout);
        searchDialogLayout.setHorizontalGroup(
            searchDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchDialogLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(searchDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchDialogLayout.createSequentialGroup()
                        .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(searchDialogLayout.createSequentialGroup()
                        .addGroup(searchDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(findBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(findFirstBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(searchDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(findLastBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(findNextBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(searchDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(findCancelBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(findPrevBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(46, Short.MAX_VALUE))))
        );
        searchDialogLayout.setVerticalGroup(
            searchDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchDialogLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(searchDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(findBut)
                    .addComponent(findPrevBut)
                    .addComponent(findNextBut))
                .addGap(18, 18, 18)
                .addGroup(searchDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(findFirstBut)
                    .addComponent(findLastBut)
                    .addComponent(findCancelBut))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        searchDialog.getAccessibleContext().setAccessibleParent(write);

        jScrollPane6.setViewportView(viewList);

        javax.swing.GroupLayout popUpMenuLayout = new javax.swing.GroupLayout(popUpMenu.getContentPane());
        popUpMenu.getContentPane().setLayout(popUpMenuLayout);
        popUpMenuLayout.setHorizontalGroup(
            popUpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(popUpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(popUpMenuLayout.createSequentialGroup()
                    .addGap(0, 71, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 71, Short.MAX_VALUE)))
        );
        popUpMenuLayout.setVerticalGroup(
            popUpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(popUpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(popUpMenuLayout.createSequentialGroup()
                    .addGap(0, 85, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 85, Short.MAX_VALUE)))
        );

        infoMessage.setText("jTextField1");

        messageBox.setBackground(new java.awt.Color(255, 255, 102));
        messageBox.setColumns(20);
        messageBox.setRows(5);

        RandomDialog.setBackground(new java.awt.Color(255, 102, 102));
        RandomDialog.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                RandomDialogWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                RandomDialogWindowClosing(evt);
            }
        });

        randomButt.setFont(new java.awt.Font("Courier New", 3, 24));
        randomButt.setForeground(new java.awt.Color(0, 153, 51));
        randomButt.setText("jButton1");
        randomButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomButtActionPerformed(evt);
            }
        });

        randomText.setBackground(new java.awt.Color(255, 0, 51));
        randomText.setColumns(20);
        randomText.setEditable(false);
        randomText.setFont(new java.awt.Font("Simplified Arabic Fixed", 0, 24));
        randomText.setForeground(new java.awt.Color(255, 255, 255));
        randomText.setRows(5);
        randomText.setToolTipText("");
        randomText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane7.setViewportView(randomText);

        javax.swing.GroupLayout RandomDialogLayout = new javax.swing.GroupLayout(RandomDialog.getContentPane());
        RandomDialog.getContentPane().setLayout(RandomDialogLayout);
        RandomDialogLayout.setHorizontalGroup(
            RandomDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
            .addGroup(RandomDialogLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(randomButt, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        RandomDialogLayout.setVerticalGroup(
            RandomDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RandomDialogLayout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(randomButt, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        RandomDialog.getAccessibleContext().setAccessibleParent(write);

        initHelpCont.setColumns(20);
        initHelpCont.setEditable(false);
        initHelpCont.setFont(new java.awt.Font("Courier New", 2, 16));
        initHelpCont.setRows(5);
        jScrollPane8.setViewportView(initHelpCont);

        nextTip.setText("Next Tip");
        nextTip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextTipActionPerformed(evt);
            }
        });

        initHelpFlag.setSelected(true);
        initHelpFlag.setText("Show Tips At StartUp");
        initHelpFlag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initHelpFlagActionPerformed(evt);
            }
        });

        initHelpClose.setText("Close");
        initHelpClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initHelpCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout initHelpDialogLayout = new javax.swing.GroupLayout(initHelpDialog.getContentPane());
        initHelpDialog.getContentPane().setLayout(initHelpDialogLayout);
        initHelpDialogLayout.setHorizontalGroup(
            initHelpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(initHelpDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(initHelpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(initHelpDialogLayout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, initHelpDialogLayout.createSequentialGroup()
                        .addComponent(initHelpFlag)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(nextTip)
                        .addGap(18, 18, 18)
                        .addComponent(initHelpClose)
                        .addGap(37, 37, 37))))
        );
        initHelpDialogLayout.setVerticalGroup(
            initHelpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(initHelpDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(initHelpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextTip)
                    .addComponent(initHelpFlag)
                    .addComponent(initHelpClose))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Loading App...\n");
        jTextArea2.setAlignmentX(5.0F);
        jTextArea2.setAlignmentY(5.0F);
        jScrollPane9.setViewportView(jTextArea2);

        javax.swing.GroupLayout loadLayout = new javax.swing.GroupLayout(load.getContentPane());
        load.getContentPane().setLayout(loadLayout);
        loadLayout.setHorizontalGroup(
            loadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 212, Short.MAX_VALUE)
            .addGroup(loadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loadLayout.createSequentialGroup()
                    .addGap(0, 23, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 23, Short.MAX_VALUE)))
        );
        loadLayout.setVerticalGroup(
            loadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 139, Short.MAX_VALUE)
            .addGroup(loadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loadLayout.createSequentialGroup()
                    .addGap(0, 21, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 22, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(108, 181, 244));
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(115, 123, 255)));

        write.setColumns(20);
        write.setForeground(new java.awt.Color(51, 51, 255));
        write.setRows(5);
        write.setSelectionColor(new java.awt.Color(192, 199, 192));
        write.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                writeMouseClicked(evt);
            }
        });
        write.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                writeKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(write);

        file.setText("File");

        newWrite.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newWrite.setText("New");
        newWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newWriteActionPerformed(evt);
            }
        });
        file.add(newWrite);

        open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        open.setText("Open");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });
        file.add(open);

        save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        file.add(save);

        saveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        saveAs.setText("Save As..");
        saveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsActionPerformed(evt);
            }
        });
        file.add(saveAs);

        print.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        file.add(print);

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        file.add(exit);

        menu.add(file);

        edit.setText("Edit");
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                editMousePressed(evt);
            }
        });

        editCut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        editCut.setText("Cut");
        editCut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCutActionPerformed(evt);
            }
        });
        edit.add(editCut);

        editCopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        editCopy.setText("Copy");
        editCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCopyActionPerformed(evt);
            }
        });
        edit.add(editCopy);

        editPaste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        editPaste.setText("Paste");
        editPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPasteActionPerformed(evt);
            }
        });
        edit.add(editPaste);

        editSelectAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        editSelectAll.setText("Select  All");
        editSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSelectAllActionPerformed(evt);
            }
        });
        edit.add(editSelectAll);

        editCopyAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        editCopyAll.setText("Copy All");
        editCopyAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCopyAllActionPerformed(evt);
            }
        });
        edit.add(editCopyAll);

        editUndo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        editUndo.setText("Undo");
        editUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUndoActionPerformed(evt);
            }
        });
        edit.add(editUndo);

        toLower.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        toLower.setText("lowercase");
        toLower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toLowerActionPerformed(evt);
            }
        });
        edit.add(toLower);

        toUpper.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        toUpper.setText("UPPERCASE");
        toUpper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toUpperActionPerformed(evt);
            }
        });
        edit.add(toUpper);

        toCapitalise.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        toCapitalise.setText("Capitalize");
        toCapitalise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toCapitaliseActionPerformed(evt);
            }
        });
        edit.add(toCapitalise);

        menu.add(edit);

        view.setText("View");

        font.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        font.setText("font");
        font.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontActionPerformed(evt);
            }
        });
        view.add(font);

        fileList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forwardwrite/icon00.png"))); // NOI18N
        fileList.setText("File List");
        fileList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileListActionPerformed(evt);
            }
        });
        view.add(fileList);

        menu.add(view);

        search.setText("Search");

        findMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        findMenu.setText("Find");
        findMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findMenuActionPerformed(evt);
            }
        });
        search.add(findMenu);

        menu.add(search);

        protection.setText("Protection");

        forgotPass.setText("Forgot Password ??");
        forgotPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotPassActionPerformed(evt);
            }
        });
        protection.add(forgotPass);

        changePassword.setText("Change Password");
        changePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordActionPerformed(evt);
            }
        });
        protection.add(changePassword);

        passProtection.setText("Password Protection");
        passProtection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passProtectionActionPerformed(evt);
            }
        });
        protection.add(passProtection);

        ProtectionSetMaster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forwardwrite/icon00.png"))); // NOI18N
        ProtectionSetMaster.setText("Set Master Password");
        ProtectionSetMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProtectionSetMasterActionPerformed(evt);
            }
        });
        protection.add(ProtectionSetMaster);

        menu.add(protection);

        help.setText("Help");

        about.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        about.setText("Who R We ?");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        help.add(about);

        needHelp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        needHelp.setText("Need Help");
        needHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                needHelpActionPerformed(evt);
            }
        });
        help.add(needHelp);

        tips.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_MASK));
        tips.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forwardwrite/icon00.png"))); // NOI18N
        tips.setText("Tips");
        tips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipsActionPerformed(evt);
            }
        });
        help.add(tips);

        menu.add(help);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
            File file1;
            String setPass,getPass;
            JFileChooser jfc;
    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed

        //JOptionPane.showMessageDialog(rootPane,"This is forward slash inc. Product" ,"About Us", WIDTH,new ImageIcon("icon.png"));
            aboutUs.setVisible(true);
            aboutUs.setSize(420,400);
            aboutUs.setTitle(title+"Who Are We !!!");
            aboutUs.setLocation(330,180);
            aboutUs.setResizable(false);
            try
            {
                FileReader fr=new FileReader(new File("D:\\forwardWrite\\votefile.vote"));
                BufferedReader br=new BufferedReader(fr);
                voteCount.setText(""+br.readLine().length()+" votes");
            }
            catch(IOException e)
            {
                voteCount.setText("Thank U");
            }
    }//GEN-LAST:event_aboutActionPerformed
        boolean newflag=false;
    private void newWriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newWriteActionPerformed
            if(changeFlag){
            newflag=true;
            if(JOptionPane.showConfirmDialog(null,"Do you want to save this to the file")==JOptionPane.OK_OPTION)
            saveActionPerformed(evt);
            else{
            write.setText("");
            setTitle(title+"Untitled");
            passFieldflag=false;
            }
            }
            else{
            write.setText("");
            setTitle(title+"Untitled");
            passFieldflag=false;
    }//GEN-LAST:event_newWriteActionPerformed
    }
    String fontCheck="Is It Good For U ? \n\n"+
            "Why So SERIOUS ?? \n\n"+"Get Good Or Get Out ...";

    private void fontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontActionPerformed

            fontDialog.setVisible(true);
            fontSlider.setMinimum(1);
            fontSlider.setMaximum(72);
            fontSlider.setValue(22);
            fontDialog.setSize(520,370);
            fontJumbo.setSelectedItem(30);
            fontDialog.setTitle(title+"font");
            fontDialog.setLocation(330,180);
            fontText.setText(""+fontSlider.getValue());
            fontPreview.setText(fontCheck);
            int fst;
            if((""+fontStyle.getSelectedItem()).equalsIgnoreCase("BOLD"))
                fst=Font.BOLD;
            else if((""+fontStyle.getSelectedItem()).equalsIgnoreCase("ITALIC"))
                fst=Font.ITALIC;
            else
                fst=Font.PLAIN;

            Font cf=new Font(""+fontJumbo.getSelectedItem(),fst,fontSlider.getValue());

            fontPreview.setFont(cf);
            fontButton.setSize(50,20);
    }//GEN-LAST:event_fontActionPerformed
            boolean pswflag=true;
    private void passProtectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passProtectionActionPerformed
            

             if(!passProtection.getState())
             {
                if(JOptionPane.showConfirmDialog(null,"Do you " +
                    "want to Switch off encryption for files" +newline+
                    "** This will make forwardWrite, an editor")==JOptionPane.OK_OPTION)
                    {
                     pswflag=false;

                    }
                else
                 passProtection.setState(true);
              }
             else
             {
                if(JOptionPane.showConfirmDialog(null,"Do you want encryption" +
                        " to be applied to file"+newline+
                        "** This make forwardWrite , a Diary")==JOptionPane.OK_OPTION)
                {
                 pswflag=true;
                }
                else
                passProtection.setState(false);
             }
}//GEN-LAST:event_passProtectionActionPerformed
            String newline=System.getProperty("line.separator");
            final String msg="Something went " +
                    "wrong !! "+newline+newline+
                    "possible Reasons:"+newline+
                    "*    Wrong password"+newline+"*" +
                    "     Error in File opening";
            boolean passFieldflag=false;
    private void fontButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontButtonActionPerformed
            fontDialog.setVisible(false);
            int style,p=Integer.parseInt(fontText.getText());
            if(p>fontSlider.getMaximum())
                p=fontSlider.getMaximum();
            if(fontStyle.getSelectedItem().toString().equalsIgnoreCase("bold"))
             style=Font.BOLD;
            else if(fontStyle.getSelectedItem().toString().equalsIgnoreCase("italic"))
                style=Font.ITALIC;
            else
                style=Font.PLAIN;
            Font fnt=new Font(fontJumbo.getSelectedItem().toString(),style,p);
            write.setFont(fnt);
    }//GEN-LAST:event_fontButtonActionPerformed

    private void fontSliderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fontSliderMouseDragged
            fontText.setText(""+fontSlider.getValue());
            fontPreview.setText(fontCheck);
            int fst;
            if((""+fontStyle.getSelectedItem()).equalsIgnoreCase("BOLD"))
                fst=Font.BOLD;
            else if((""+fontStyle.getSelectedItem()).equalsIgnoreCase("ITALIC"))
                fst=Font.ITALIC;
            else
                fst=Font.PLAIN;
            Font cf=new Font(""+fontJumbo.getSelectedItem(),fst,fontSlider.getValue());
            fontPreview.setFont(cf);

    }//GEN-LAST:event_fontSliderMouseDragged

    private void fontTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fontTextKeyReleased
        if(!fontText.getText().equals(""))
        fontSlider.setValue(Integer.parseInt(fontText.getText()));
                    fontPreview.setText(fontCheck);
            int fst;
            if((""+fontStyle.getSelectedItem()).equalsIgnoreCase("BOLD"))
                fst=Font.BOLD;
            else if((""+fontStyle.getSelectedItem()).equalsIgnoreCase("ITALIC"))
                fst=Font.ITALIC;
            else
                fst=Font.PLAIN;
            Font cf=new Font(""+fontJumbo.getSelectedItem(),fst,fontSlider.getValue());
            fontPreview.setFont(cf);

    }//GEN-LAST:event_fontTextKeyReleased
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
    }//GEN-LAST:event_exitActionPerformed

    private void voteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voteActionPerformed
            if(!vote.isSelected())
                vote.setText("No");
            else
                vote.setText("Yes");

    }//GEN-LAST:event_voteActionPerformed

    private void thankxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thankxActionPerformed
            aboutUs.setVisible(false);

                File votef=new File("D:\\forwardWrite\\votefile.vote");
               if(vote.isSelected())
            {
                try
                {
                    FileWriter fw=new FileWriter(votef,true);
                    BufferedWriter bw=new BufferedWriter(fw);
                    
                    bw.append('v');
                bw.close();
                }
                catch(IOException e)
                {
                }
                JOptionPane.showMessageDialog(null,"Thank U for Voting");

               }
       initApp.hideMaster();
    }//GEN-LAST:event_thankxActionPerformed

    private void needHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_needHelpActionPerformed
                if(Desktop.isDesktopSupported())
                {
                    try{
                    Desktop.getDesktop().open(new File(fd+"\\UG.pdf"));
                    }
                    catch(IOException e)
                    {
                    }
                 }
    }//GEN-LAST:event_needHelpActionPerformed

    private void jTextPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextPane1MouseClicked
                if(Desktop.isDesktopSupported())
                {
                 try{
                Desktop.getDesktop().browse(new URI("https://www.facebook.com/ForwardSlash.FW"));
                }
                 catch(Exception e)
                 {
                 }
                }
    }//GEN-LAST:event_jTextPane1MouseClicked

    private void jTextPane1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextPane1MouseEntered
            jTextPane1.setCursor(new Cursor(Cursor.HAND_CURSOR));
            jTextPane1.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jTextPane1MouseEntered

    private void jTextPane1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextPane1MouseExited
            jTextPane1.setBackground(Color.WHITE);
    }//GEN-LAST:event_jTextPane1MouseExited

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed

            jfc=new JFileChooser(fd);
            fff=new FileNameExtensionFilter("Other files", "txt","html","docx");
            jfc.addChoosableFileFilter(fff);
            jfc.setFileFilter(fff);
            FileFilter ff1=new FileNameExtensionFilter("forwardWrite(FSW) files", "fsw");
            jfc.addChoosableFileFilter(ff1);
            jfc.setFileFilter(ff1);
            jfc.removeChoosableFileFilter(jfc.getChoosableFileFilters()[0]);
            jfc.setFileHidingEnabled(true);
            jfc.showOpenDialog(null);
            file1=jfc.getSelectedFile();
            if(file1!=null){
            fileRead fr=new fileRead(file1);

            if(!new String(""+file1).endsWith(".fsw")){
            write.setText(fr.reader());
            setTitle(title+file1.getName());
            }
            else{
            jfc.setVisible(false);
            passCheckField.setText("");
            JOptionPane.showConfirmDialog(null,passCheckField,"" +
                    "Enter password for "+file1.getName(),JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
             String as=new String(passCheckField.getPassword());
             as=fr.reader(as);
             if(as!=null){
             setTitle(title+file1.getName());
             write.setText(as);
             }
             else{
             JOptionPane.showMessageDialog(passHelpText,"Wrong Password !!!");
             }
            }
            }
    }//GEN-LAST:event_openActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
       String filename=getTitle().replace(title,"");
       file1=new File(fd+"\\"+filename);
       fileRead frc=new fileRead(file1);
       if(frc.existsMasterFileEntry())
       {
       fileWrite fw=new fileWrite(new File(fd+"\\"+filename));
       if(filename.endsWith(".fsw"))
       {
           fw.writer(new StringBuilder(write.getText()));
       }
       else{
       setPass=new forgotPassword(new File(fd+"\\"+filename)).getPassword();
       fw.writer(new StringBuilder(write.getText()),setPass);
       }
       }
       else{
        int opt=JOptionPane.showConfirmDialog(null,"Do " +
                "you want Password" +
                " Protection For This File");
        if(opt==JOptionPane.OK_OPTION)
        {
            pswflag=true;
            passProtection.setSelected(true);
        }
        else if(opt==JOptionPane.NO_OPTION){
        pswflag=false;
        }
        if(opt==JOptionPane.OK_OPTION||opt==JOptionPane.NO_OPTION){
        jfc=new JFileChooser(fd);
        fileOption fOp=new fileOption(jfc);
        fOp.fileFilter();
        jfc.showSaveDialog(null);
        file1=jfc.getSelectedFile();
        if(file1!=null){
        fOp.fileSave(file1,write.getText(),pswflag);
        setTitle(title+file1.getName());
        }
        }
       }
       initApp.hideMaster();
       changeFlag=false;
       if(closeflag){
            closeflag=false;
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setDefaultClose();
                }
            if(printflag){
            printflag=false;
            if(Desktop.isDesktopSupported()){
                try{
                Desktop.getDesktop().print(file1);
                }
                catch(IOException e)
                {
                JOptionPane.showMessageDialog(null,"Unable to print the file due to:"+newline+
                        "** Printer is unavailable OR" +newline+
                        "**IO error for some reasons");
                }
            }
            if(newflag){
                newflag=false;
            write.setText("");
            setTitle(title+"Untitled");
            passFieldflag=false;
            }
    }
    }//GEN-LAST:event_saveActionPerformed
        boolean changeFlag=false;
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(changeFlag){
            closeflag=true;
        setDefaultClose();
        }
        else{
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
          printflag=true;
          saveActionPerformed(evt);
    }//GEN-LAST:event_printActionPerformed

    private void fontJumboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fontJumboItemStateChanged
            fontPreview.setText(fontCheck);
            int fst;
            if((""+fontStyle.getSelectedItem()).equalsIgnoreCase("BOLD"))
                fst=Font.BOLD;
            else if((""+fontStyle.getSelectedItem()).equalsIgnoreCase("ITALIC"))
                fst=Font.ITALIC;
            else
                fst=Font.PLAIN;
            Font cf=new Font(""+fontJumbo.getSelectedItem(),fst,fontSlider.getValue());
            fontPreview.setFont(cf);

    }//GEN-LAST:event_fontJumboItemStateChanged

    private void fontStyleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fontStyleItemStateChanged
            fontPreview.setText(fontCheck);
            int fst;
            if((""+fontStyle.getSelectedItem()).equalsIgnoreCase("BOLD"))
                fst=Font.BOLD;
            else if((""+fontStyle.getSelectedItem()).equalsIgnoreCase("ITALIC"))
                fst=Font.ITALIC;
            else
                fst=Font.PLAIN;
            Font cf=new Font(""+fontJumbo.getSelectedItem(),fst,fontSlider.getValue());
            fontPreview.setFont(cf);

    }//GEN-LAST:event_fontStyleItemStateChanged

    private void changePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordActionPerformed
            jfc=new JFileChooser(fd);
            jfc.showOpenDialog(null);
          FileFilter ff1=new FileNameExtensionFilter("FSW files", "fsw");
            jfc.addChoosableFileFilter(ff1);
            jfc.setFileFilter(ff1);

            jfc.removeChoosableFileFilter(jfc.getChoosableFileFilters()[0]);
//            jfc.removeChoosableFileFilter(jfc.getChoosableFileFilters()[0]);
        
            file1=jfc.getSelectedFile();
            if(file1.getName().equalsIgnoreCase("masterfile.fsw")){
            jfc.setVisible(false);
            file1=new File("");
            JOptionPane.showMessageDialog(null,"You are not authorized" +
                    " to change" +
                    "\n the password of masterfile");
            }
            else{
            fileRead fr=new fileRead(file1);
            fileWrite fw=new fileWrite(file1);
            passCheckField.setText("");
            JOptionPane.showConfirmDialog(null,passCheckField,"Enter Old Password" +
                    " of File "+file1.getName(),JOptionPane.OK_CANCEL_OPTION);
            String oldPass=new String(passCheckField.getPassword());
            passCheckField.setText("");
            JOptionPane.showConfirmDialog(null,passCheckField,"Enter" +
                    " New Password",JOptionPane.OK_CANCEL_OPTION);
            String newPass=new String(passCheckField.getPassword());
                if(fw.saveToMaster(oldPass, newPass))
                    JOptionPane.showMessageDialog(null,"Password SuccessFully " +
                            "Changed !!!");
                else
                    JOptionPane.showMessageDialog(null,"You Enterd Wrong Password !!");
            
    }//GEN-LAST:event_changePasswordActionPerformed
    }

    private void forgotPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotPassActionPerformed
            jfc=new JFileChooser(fd);
            FileFilter ff1=new FileNameExtensionFilter("FSW files", "fsw");
            jfc.addChoosableFileFilter(ff1);
            jfc.setFileFilter(ff1);
            jfc.removeChoosableFileFilter(jfc.getChoosableFileFilters()[0]);
            jfc.setFileHidingEnabled(false);
            jfc.showOpenDialog(null);
            file1=jfc.getSelectedFile();
            if(file1!=null){
            forgotPassword fpw=new forgotPassword(file1);
            fpw.genHelp();
            }
    }//GEN-LAST:event_forgotPassActionPerformed

    private void passHelpGotItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passHelpGotItActionPerformed
            passHelpDialog.setVisible(false);
            openActionPerformed(evt);
    }//GEN-LAST:event_passHelpGotItActionPerformed
        boolean browsePassflag=false;
    private void useMasterPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useMasterPassActionPerformed
            passHelpDialog.setVisible(false);
            browsePassflag=true;
            passCheckField.setText("");
            int op=JOptionPane.showConfirmDialog(null,passCheckField,"Enter Master Password :",JOptionPane.OK_CANCEL_OPTION);
            String pass=new String(passCheckField.getPassword());
            fileRead fr=new fileRead(new File(fd+"\\masterfile.fsw"));
            if(fr.checkPassword(pass))
            {
            forgotPassword fgp=new forgotPassword(file1);
            pass=fgp.getPassword();
            if(pass.equals(""))
                pass="(blank password)";
            JOptionPane.showMessageDialog(passHelpText,"Your password" +
                    " for file "+file1.getName()+" is: \n\t"+pass);
            }
            else{
                if(op!=JOptionPane.CANCEL_OPTION){
            JOptionPane.showMessageDialog(passHelpText,"You have " +
                    "entered wrong Master Password");
            
            useMasterPassActionPerformed(evt);
                }
            }
    }//GEN-LAST:event_useMasterPassActionPerformed

    private void ProtectionSetMasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProtectionSetMasterActionPerformed
            fileRead frf=new fileRead(new File(fd+"\\masterfile.fsw"));
            fileWrite fwf=new fileWrite(new File(fd+"\\masterfile.fsw"));
            if(frf.existsMasterFileEntry()){
            passCheckField.setText("");
            JOptionPane.showConfirmDialog(null,passCheckField,"Enter Current Master Password",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
            String oldPass=new String(passCheckField.getPassword());
            if(frf.checkPassword(oldPass)){
            passCheckField.setText("");
            JOptionPane.showConfirmDialog(null,passCheckField,"Enter new Master Password",JOptionPane.OK_CANCEL_OPTION);
            String newPass=new String(passCheckField.getPassword());
            if(fwf.saveToMaster(oldPass, newPass))
                JOptionPane.showMessageDialog(messageBox,"Changed successfully");
            }
            else{
            JOptionPane.showMessageDialog(messageBox,"You have entered " +
                    "wrong Master password");
            }
            }
            else{
            }
       initApp.hideMaster();
    }//GEN-LAST:event_ProtectionSetMasterActionPerformed
       boolean masterflag=false;    
       public String clipboard=new String("");
    private void editCutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCutActionPerformed
                 CutActionPerformed(evt);
    }//GEN-LAST:event_editCutActionPerformed

    private void editCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCopyActionPerformed
                CopyActionPerformed(evt);
    }//GEN-LAST:event_editCopyActionPerformed

    private void editPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPasteActionPerformed
                 PasteActionPerformed(evt);
    }//GEN-LAST:event_editPasteActionPerformed

    private void writeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_writeMouseClicked

        if(evt.getButton()==java.awt.event.MouseEvent.BUTTON3){
            contextMenu.setSize(100,100);
            contextMenu.add(Cut);
            contextMenu.add(Copy);
            contextMenu.add(Paste);
            contextMenu.add(SelectAll);
            contextMenu.add(CopyAll);
            contextMenu.add(Undo);
            contextMenu.setVisible(true);
            contextMenu.setLocation(evt.getLocationOnScreen());
            if(write.getSelectedText()==null){
            Cut.setEnabled(false);
            Copy.setEnabled(false);

            }
            else{
            Cut.setEnabled(true);
            Copy.setEnabled(true);
            }
            Transferable tbl=cb.getContents(this);
       try{
       clipboard=(String)tbl.getTransferData(DataFlavor.stringFlavor);
       }
       catch(Exception e){}
            if((clipboard==null)){
            Paste.setEnabled(false);
            }
            else{
            Paste.setEnabled(true);
            }
            if(write.getText().contains(clipboard)){
            Undo.setEnabled(false);
            }
            else{
            Undo.setEnabled(false);
            }
            if(write.getText().equals(""))
                Undo.setEnabled(false);
        }
            
        else{
        contextMenu.setVisible(false);
        }

    }//GEN-LAST:event_writeMouseClicked

    private void editSelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSelectAllActionPerformed
            SelectAllActionPerformed(evt);
    }//GEN-LAST:event_editSelectAllActionPerformed

    private void editCopyAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCopyAllActionPerformed
                CopyAllActionPerformed(evt);
    }//GEN-LAST:event_editCopyAllActionPerformed

    private void editUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUndoActionPerformed
            UndoActionPerformed(evt);
    }//GEN-LAST:event_editUndoActionPerformed

    private void editMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMousePressed
            if(write.getSelectedText()==null){
            editCut.setEnabled(false);
            editCopy.setEnabled(false);
            }
            else{
            editCut.setEnabled(true);
            editCopy.setEnabled(true);
            }
            Transferable tbl=cb.getContents(this);
       try{
       clipboard=(String)tbl.getTransferData(DataFlavor.stringFlavor);
       }
       catch(Exception e){}
            if(clipboard==null){
            editPaste.setEnabled(false);
            }
            else{
            editPaste.setEnabled(true);
            }
            if(write.getText().contains(clipboard)){
            editUndo.setEnabled(false);
            }
            else{
            editUndo.setEnabled(false);
            }
            if(write.getText().equals(""))
                editUndo.setEnabled(false);
    }//GEN-LAST:event_editMousePressed

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
            editMousePressed(evt);
    }//GEN-LAST:event_editMouseEntered

    private void toLowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toLowerActionPerformed
        if(write.getSelectedText()!=null)
        {
            try{
write.setText(write.getText(0,write.getSelectionStart())+write.getSelectedText().toLowerCase()+write.getText(write.getSelectionEnd(),write.getText().length()-write.getSelectionEnd()));
        }
            catch(Exception e){}
        }
        else
        write.setText(write.getText().toLowerCase());
    }//GEN-LAST:event_toLowerActionPerformed

    private void toUpperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toUpperActionPerformed
        if(write.getSelectedText()!=null)
        {
            try{
write.setText(write.getText(0,write.getSelectionStart())+write.getSelectedText().toUpperCase()+write.getText(write.getSelectionEnd(),write.getText().length()-write.getSelectionEnd()));
        }
            catch(Exception e){}
        }
        else
        write.setText(write.getText().toUpperCase());
    }//GEN-LAST:event_toUpperActionPerformed

    private void toCapitaliseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toCapitaliseActionPerformed
        String s=write.getText();
        String sw=(""+s.charAt(0)).toUpperCase();
        char ch;
        int x=0,y=s.length()-1;
        if(write.getSelectedText()!=null){
        x=write.getSelectionStart();
        y=write.getSelectionEnd();
        try{
        sw=write.getText(0,write.getSelectionStart()+1);
        }
        catch(Exception e){}
        }
        for(int i=x;i<y;i++){
        ch=s.charAt(i);
        if(ch==' '||ch=='.'||ch=='\n'||ch==','||ch=='\t'){
        sw=sw+(""+s.charAt(i+1)).toUpperCase();
        }
        else
            sw=sw+(""+s.charAt(i+1)).toLowerCase();
        }
        if(write.getSelectedText()!=null){
            try{
        sw=sw+write.getText(write.getSelectionEnd(),s.length()-write.getSelectionEnd());
        }
            catch(Exception e){}
        }
        write.setText(sw);
    }//GEN-LAST:event_toCapitaliseActionPerformed

    private void findMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findMenuActionPerformed
            searchBar.setText("....Search");
            searchDialog.setVisible(true);
            searchDialog.setSize(420,220);
            searchDialog.setLocation(400,200);
            searchDialog.setResizable(false);

    }//GEN-LAST:event_findMenuActionPerformed

    private void searchBarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBarMouseReleased
            searchBar.setText("");
    }//GEN-LAST:event_searchBarMouseReleased
            String key="";
            int start=0,end=0;
    private void findButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButActionPerformed
            key=searchBar.getText();
            if(write.getText().contains(key))
            {
            start=write.getText().indexOf(key);
            end=write.getText().indexOf(key)+key.length();
            }
            write.setSelectionStart(start);
            write.setSelectionEnd(end);
    }//GEN-LAST:event_findButActionPerformed

    private void findNextButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findNextButActionPerformed
            key=searchBar.getText();
            try{
            if(write.getText(end,write.getText().length()-end).contains(key)){
            start=write.getText(end,write.getText().length()-end-1).indexOf(key)+3;
            end=write.getText(end,write.getText().length()-end-1).indexOf(key)+key.length()+4;
            }
            write.setSelectionStart(start);
            write.setSelectionEnd(end);
            }
            catch(Exception e){
            System.out.println("exception :"+e);
            }
    }//GEN-LAST:event_findNextButActionPerformed

    private void findPrevButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findPrevButActionPerformed
            key=searchBar.getText();
            try{
            if(write.getText(0,start).contains(key)){
            start=write.getText(0,start).lastIndexOf(key);
            end=write.getText(0,start).lastIndexOf(key)+key.length()+1;
            }
            write.setSelectionStart(start);
            write.setSelectionEnd(end);
            }
            catch(Exception e){
            
            }
    }//GEN-LAST:event_findPrevButActionPerformed

    private void findFirstButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findFirstButActionPerformed
            key=searchBar.getText();
            if(write.getText().contains(key))
            {
            start=write.getText().indexOf(key);
            end=write.getText().indexOf(key)+key.length();
            write.setSelectionStart(start);
            write.setSelectionEnd(end);
            }
    }//GEN-LAST:event_findFirstButActionPerformed

    private void findLastButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findLastButActionPerformed
            key=searchBar.getText();
            try{
            if(write.getText().contains(key)){
            start=write.getText().lastIndexOf(key);
            end=write.getText().lastIndexOf(key)+key.length();
            write.setSelectionStart(start);
            write.setSelectionEnd(end);
            }
            }
            catch(Exception e){}
    }//GEN-LAST:event_findLastButActionPerformed

    private void findCancelButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findCancelButActionPerformed
            searchDialog.setVisible(false);
            key="";
            start=end=0;
    }//GEN-LAST:event_findCancelButActionPerformed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
            if(evt.getSource().equals(evt.ALT_MASK))
                file.setFocusPainted(true);
    }//GEN-LAST:event_formKeyReleased

    private void saveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsActionPerformed
            String filename=getTitle().replace(title,"");
            jfc=new JFileChooser(fd);
            fileOption fOp=new fileOption(jfc);

        int opt=JOptionPane.showConfirmDialog(null,"Do " +
                "you want Password" +
                " Protection For This File");
        if(opt==JOptionPane.OK_OPTION)
        {
            pswflag=true;
            passProtection.setSelected(true);
            filename=filename.replaceAll(".fsw","");
        }
        else if(opt==JOptionPane.NO_OPTION){
        pswflag=false;
            filename=filename.replaceAll(".txt","");

        }
            if(opt==JOptionPane.NO_OPTION||opt==JOptionPane.OK_OPTION){
            jfc.setSelectedFile(new File(filename));
            fOp.fileFilter();
            jfc.showSaveDialog(null);
            file1=jfc.getSelectedFile();
            if(file1!=null){
            fOp.fileSave(file1,write.getText(),pswflag);
            }
            }
        changeFlag=false;
    }//GEN-LAST:event_saveAsActionPerformed

    private void writeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_writeKeyReleased
       changeFlag=true;
    }//GEN-LAST:event_writeKeyReleased

    private void fileListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileListActionPerformed
            JOptionPane.showConfirmDialog(null,passCheckField,"Enter Master Password to view Available Files",JOptionPane.OK_CANCEL_OPTION);
            String pass=new String(forwardWrite.passCheckField.getPassword());
            jfc=new JFileChooser(fd+"\\");
            fileRead frc=new fileRead(new File(fd+"\\masterfile.fsw"));
            if(frc.checkPassword(pass)){
            fff=new FileNameExtensionFilter("Other files", "txt","html","docx");
            jfc.addChoosableFileFilter(fff);
            jfc.setFileFilter(fff);
            jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            jfc.showOpenDialog(null);
            fd=jfc.getSelectedFile();
            System.out.println(fd);
            viewOption vOp=new viewOption(fd);
            vOp.genViewList();
            }
            else{

            if(JOptionPane.showConfirmDialog(passHelpText,"" +
                    "Wrong master password \n Do " +
                    "You want to retry")==JOptionPane.OK_OPTION)
            fileListActionPerformed(evt);
            }
    }//GEN-LAST:event_fileListActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                    initApp iApp=new initApp();
        if(!iApp.isMasterPswSet()){
        
        randomText.setText("Master Password" +
                    "\nIs Not Yet Set.... \n\n" +
                    "    Please Set It Now");
        randomButt.setText("Set Now !!");
        RandomDialog.setTitle("Secure your App");
        RandomDialog.setLocation(400,200);
        RandomDialog.setSize(400,290);
        RandomDialog.setVisible(true);
        }
        else{
         fileRead frc=new fileRead(new File("D:\\forwardWrite\\help.txt"));
         String cont=frc.reader();
         if(cont!=null);
         char ch=cont.charAt(0);
            if(ch=='y')
                initHelpFlag.setSelected(true);
            else
                initHelpFlag.setSelected(false);
                initApp.initHelpDia();
        }
    }//GEN-LAST:event_formWindowOpened

    private void jTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextActionPerformed

    private void randomButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomButtActionPerformed
            setEnabled(true);
            RandomDialog.setVisible(false);
            passCheckField.setText("");
            fileWrite fwf=new fileWrite(new File(fd+"\\masterfile.fsw"));
            int op=JOptionPane.showConfirmDialog(null,passCheckField,"Enter new Master Password(length>4)",JOptionPane.OK_CANCEL_OPTION);
            String newPass=new String(passCheckField.getPassword());
            if(newPass.length()<=4&&op==JOptionPane.OK_OPTION){
                JOptionPane.showMessageDialog(randomText,"Password is too small");
                randomButtActionPerformed(evt);
            }
            if(fwf.saveToMaster(newPass,true))
            {
            JOptionPane.showMessageDialog(messageBox,"Saved Successfully");
            }
            else{
            RandomDialog.setVisible(true);
            }
            initApp.hideMaster();
            initApp.initHelpDia();
    }//GEN-LAST:event_randomButtActionPerformed

    private void RandomDialogWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_RandomDialogWindowClosing
            RandomDialog.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_RandomDialogWindowClosing

    private void RandomDialogWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_RandomDialogWindowActivated
                RandomDialog.setAlwaysOnTop(true);
                setEnabled(false);
    }//GEN-LAST:event_RandomDialogWindowActivated

    private void tipsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipsActionPerformed
        initHelpFlag.setSelected(true);
        initApp.initHelpDia();
           fileRead frc=new fileRead(new File("D:\\forwardWrite\\help.txt"));
           fileWrite fwc=new fileWrite(new File("D:\\forwardWrite\\help.txt"));
               String cont=frc.reader();
 //              cont=cont.replaceAll("\r\n","\n");
               if(cont.charAt(0)!='y')
                        cont=cont.replaceFirst("n","y");
                    else{
                       cont=cont.replaceFirst("y","n");
                    }
//               cont=cont.replaceAll("\n","\n");
        fwc.writer(new StringBuilder(cont));
    }//GEN-LAST:event_tipsActionPerformed

    private void initHelpCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initHelpCloseActionPerformed
                initHelpDialog.setVisible(false);
    }//GEN-LAST:event_initHelpCloseActionPerformed

    private void nextTipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextTipActionPerformed
                initApp.initHelpDia();
    }//GEN-LAST:event_nextTipActionPerformed
            protected static boolean initTipsFlag=true;
    private void initHelpFlagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initHelpFlagActionPerformed
           fileRead frc=new fileRead(new File("D:\\forwardWrite\\help.txt"));
           fileWrite fwc=new fileWrite(new File("D:\\forwardWrite\\help.txt"));
               String cont=frc.reader();
 //              cont=cont.replaceAll("\r\n","\n");
                if(!initHelpFlag.isSelected())
                    if(cont.charAt(0)=='n')
                        cont=cont.replaceFirst("n","y");
                else
                   if(cont.charAt(0)=='y')
                       cont=cont.replaceFirst("y","n");
 //              cont=cont.replaceAll("\n","\r\n");
               fwc.writer(new StringBuilder(cont));
            
    }//GEN-LAST:event_initHelpFlagActionPerformed
   private void CopyActionPerformed(java.awt.event.ActionEvent evt) {
           contextMenu.setVisible(false);
           clipboard=write.getSelectedText();
          strSel=new StringSelection(clipboard);
          cb.setContents(strSel, strSel);

   }
            StringSelection strSel;
            Clipboard cb=getToolkit().getSystemClipboard();
      private void CutActionPerformed(java.awt.event.ActionEvent evt) {
          contextMenu.setVisible(false);
          clipboard=write.getSelectedText();
          strSel=new StringSelection(clipboard);
          write.setText(write.getText().replace(clipboard,""));
          cb.setContents(strSel, strSel);
      }

   private void PasteActionPerformed(java.awt.event.ActionEvent evt) {
       contextMenu.setVisible(false);
       String s=write.getText();
       int cp=write.getCaretPosition();
       Transferable tbl=cb.getContents(this);
       try{
       clipboard=(String)tbl.getTransferData(DataFlavor.stringFlavor);
       }
       catch(Exception e){}
       write.insert(clipboard,cp);
    }

       private void SelectAllActionPerformed(java.awt.event.ActionEvent evt) {
           contextMenu.setVisible(false); 
           write.setSelectionStart(0);
           write.setSelectionEnd(write.getText().length());
    }

       private void CopyAllActionPerformed(java.awt.event.ActionEvent evt) {
           contextMenu.setVisible(false);

           clipboard=write.getText();
          strSel=new StringSelection(clipboard);
          cb.setContents(strSel, strSel);

       }

      private void UndoActionPerformed(java.awt.event.ActionEvent evt) {
           contextMenu.setVisible(false);
           write.setText(write.getText().replace(clipboard,""));
           
    }


    int setDefaultClose(){
  if(!closeflag)
      System.exit(0);
  int i=JOptionPane.showConfirmDialog(null,"Do you want to save this file");
        if(i==JOptionPane.OK_OPTION)
    {
        changeFlag=false;
        closeflag=true;
        saveActionPerformed(evt);
        
    }
        else if(i==JOptionPane.NO_OPTION){
        System.exit(0);
        }
        else{
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
        return EXIT_ON_CLOSE;
    }

    boolean closeflag=false;
    boolean printflag=false;
    final String title="forwardWrite--";


    public static void main(String args[]) {
                forwardWrite w=new forwardWrite();
/*                UIManager.LookAndFeelInfo[] arr=UIManager.getInstalledLookAndFeels();
                System.out.println(arr[0]+"\n"+arr[1]+"\n"+arr[2]+"\n"+arr[3]);
                try{
                UIManager.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
                }
                catch(Exception e){
                System.out.println("LOOK failed");
                }
 */             w.setVisible(true);
                w.setTitle("forwardWrite--"+"Untitled");
                w.setLocation(300,120);
                w.setSize(700,500);
                w.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ProtectionSetMaster;
    protected javax.swing.JDialog RandomDialog;
    private javax.swing.JMenuItem about;
    protected javax.swing.JDialog aboutUs;
    private javax.swing.JMenuItem changePassword;
    private javax.swing.JPopupMenu contextMenu;
    private javax.swing.JMenu edit;
    private javax.swing.JMenuItem editCopy;
    private javax.swing.JMenuItem editCopyAll;
    private javax.swing.JMenuItem editCut;
    private javax.swing.JMenuItem editPaste;
    private javax.swing.JMenuItem editSelectAll;
    private javax.swing.JMenuItem editUndo;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu file;
    private javax.swing.JMenuItem fileList;
    private javax.swing.JButton findBut;
    private javax.swing.JButton findCancelBut;
    private javax.swing.JButton findFirstBut;
    private javax.swing.JButton findLastBut;
    private javax.swing.JMenuItem findMenu;
    private javax.swing.JButton findNextBut;
    private javax.swing.JButton findPrevBut;
    private javax.swing.JMenuItem font;
    private javax.swing.JButton fontButton;
    protected static javax.swing.JDialog fontDialog;
    private javax.swing.JComboBox fontJumbo;
    private javax.swing.JTextArea fontPreview;
    private javax.swing.JSlider fontSlider;
    private javax.swing.JComboBox fontStyle;
    private javax.swing.JTextField fontText;
    private javax.swing.JMenuItem forgotPass;
    private javax.swing.JMenu help;
    protected static javax.swing.JTextField infoMessage;
    protected static javax.swing.JPopupMenu infoPopUp;
    protected javax.swing.JButton initHelpClose;
    protected static javax.swing.JTextArea initHelpCont;
    protected static javax.swing.JDialog initHelpDialog;
    protected static javax.swing.JCheckBox initHelpFlag;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    protected javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jText;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextPane jTextPane1;
    protected static javax.swing.JDialog load;
    private javax.swing.JMenuBar menu;
    private javax.swing.JTextArea messageBox;
    private javax.swing.JMenuItem needHelp;
    private javax.swing.JMenuItem newWrite;
    protected static javax.swing.JButton nextTip;
    private javax.swing.JMenuItem open;
    protected static javax.swing.JPasswordField passCheckField;
    protected static javax.swing.JDialog passHelpDialog;
    private javax.swing.JButton passHelpGotIt;
    protected static javax.swing.JTextArea passHelpText;
    protected static javax.swing.JLabel passHelpTitle;
    protected javax.swing.JCheckBoxMenuItem passProtection;
    protected static javax.swing.JDialog popUpMenu;
    private javax.swing.JMenuItem print;
    private javax.swing.JMenu protection;
    private javax.swing.JButton randomButt;
    protected javax.swing.JTextArea randomText;
    private javax.swing.JMenuItem save;
    private javax.swing.JMenuItem saveAs;
    private javax.swing.JMenu search;
    private javax.swing.JTextField searchBar;
    protected javax.swing.JDialog searchDialog;
    private javax.swing.JButton thankx;
    private javax.swing.JMenuItem tips;
    private javax.swing.JMenuItem toCapitalise;
    private javax.swing.JMenuItem toLower;
    private javax.swing.JMenuItem toUpper;
    private javax.swing.JButton useMasterPass;
    private javax.swing.JMenu view;
    protected static javax.swing.JList viewList;
    private javax.swing.JCheckBox vote;
    private javax.swing.JTextField voteCount;
    protected static javax.swing.JTextArea write;
    // End of variables declaration//GEN-END:variables

}
