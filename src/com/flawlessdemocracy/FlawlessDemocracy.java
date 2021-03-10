
package com.flawlessdemocracy;

import com.flawlessdemocracy.world.RectangleWorld;
import com.flawlessdemocracy.world.RectangleWorldCanvas;
import com.flawlessdemocracy.world.WorldFrame;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JColorChooser;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 * Flawless Democracy
 * 
 * @author Pascal
 */
public class FlawlessDemocracy extends javax.swing.JFrame {
    
    private static final int DEFAULT_GRID_WIDTH = 100;
    private static final int DEFAULT_GRID_HEIGHT = 100;
    
    private static final Party DEFAULT_DEMOCRATIC_PARTY = new Party("Democrats", Color.BLUE);
    private static final Party DEFAULT_REPUBLICAN_PARTY = new Party("Republicans", Color.RED);
    
    private final BlobGrid blobGrid;

    public FlawlessDemocracy() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/putin.png")));
        initComponents();
        Random random = new Random(System.currentTimeMillis());
        
        setGridWidth(DEFAULT_GRID_WIDTH);
        setGridHeight(DEFAULT_GRID_HEIGHT);
        
        blobGrid = new BlobGrid(getGridWidth(), getGridHeight(), new ArrayList(), random);
        addParty(DEFAULT_DEMOCRATIC_PARTY);
        addParty(DEFAULT_REPUBLICAN_PARTY);
        
        blobGrid.setup();
        WorldFrame frame = new WorldFrame("World 1", new RectangleWorldCanvas(new RectangleWorld(blobGrid.getParties(), 20, 20)));
        desktopPane.add(frame);
        
        Timer timer = new Timer(10, (event) -> {
            frame.repaint();
        });
        timer.setRepeats(true);
        timer.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        controlPanel = new javax.swing.JPanel();
        iterateButton = new javax.swing.JButton();
        partyLabel = new javax.swing.JLabel();
        iterationSpinner = new javax.swing.JSpinner();
        iterationLabel = new javax.swing.JLabel();
        iterationSeperator = new javax.swing.JSeparator();
        partySeperator = new javax.swing.JSeparator();
        partyNameLabel = new javax.swing.JLabel();
        partyNameField = new javax.swing.JTextField();
        partyColorLabel = new javax.swing.JLabel();
        addPartyButton = new javax.swing.JButton();
        colorField = new javax.swing.JTextField();
        chooseColorButton = new javax.swing.JButton();
        tableScrollPane = new javax.swing.JScrollPane();
        partyTable = new javax.swing.JTable();
        gameLabel = new javax.swing.JLabel();
        gameSeperator = new javax.swing.JSeparator();
        gridConfigPanel = new javax.swing.JPanel();
        gridWidthLabel = new javax.swing.JLabel();
        gridWidthLabel1 = new javax.swing.JLabel();
        gridHeightSpinner = new javax.swing.JSpinner();
        gridWidthSpinner = new javax.swing.JSpinner();
        gridRandomizeButton = new javax.swing.JButton();
        desktopPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Flawless Democracy");
        setMaximumSize(new java.awt.Dimension(1300, 700));
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setName("gameFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1300, 700));

        tabbedPane.setMaximumSize(new java.awt.Dimension(376, 688));
        tabbedPane.setMinimumSize(new java.awt.Dimension(376, 688));
        tabbedPane.setPreferredSize(new java.awt.Dimension(376, 688));

        controlPanel.setMaximumSize(new java.awt.Dimension(376, 688));
        controlPanel.setMinimumSize(new java.awt.Dimension(376, 688));
        controlPanel.setName("controlPanel"); // NOI18N
        controlPanel.setPreferredSize(new java.awt.Dimension(376, 688));

        iterateButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.background"));
        iterateButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        iterateButton.setText("Iterate");
        iterateButton.setActionCommand("");
        iterateButton.setName(""); // NOI18N
        iterateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iterateButtonMouseClicked(evt);
            }
        });

        partyLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        partyLabel.setText("Party Configuration");

        iterationLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        iterationLabel.setText("Iterations");

        partyNameLabel.setText("Party Name");

        partyColorLabel.setText("Party Color");

        addPartyButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.background"));
        addPartyButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addPartyButton.setText("Add Party");
        addPartyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addPartyButtonMouseClicked(evt);
            }
        });

        colorField.setEnabled(false);
        colorField.setFocusable(false);
        colorField.setMaximumSize(new java.awt.Dimension(20, 20));
        colorField.setMinimumSize(new java.awt.Dimension(20, 20));
        colorField.setPreferredSize(new java.awt.Dimension(20, 20));

        chooseColorButton.setText("Choose Color");
        chooseColorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chooseColorButtonMouseClicked(evt);
            }
        });

        tableScrollPane.setMaximumSize(new java.awt.Dimension(360, 240));
        tableScrollPane.setMinimumSize(new java.awt.Dimension(360, 240));
        tableScrollPane.setPreferredSize(new java.awt.Dimension(360, 240));

        partyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Color", "Action"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        partyTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        partyTable.getTableHeader().setReorderingAllowed(false);
        tableScrollPane.setViewportView(partyTable);

        gameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        gameLabel.setText("Game Configuration");

        gridConfigPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Grid"));

        gridWidthLabel.setText("Grid Width");

        gridWidthLabel1.setText("Grid Height");

        gridRandomizeButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.background"));
        gridRandomizeButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        gridRandomizeButton.setText("Randomize");
        gridRandomizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gridRandomizeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout gridConfigPanelLayout = new javax.swing.GroupLayout(gridConfigPanel);
        gridConfigPanel.setLayout(gridConfigPanelLayout);
        gridConfigPanelLayout.setHorizontalGroup(
            gridConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gridConfigPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gridConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gridConfigPanelLayout.createSequentialGroup()
                        .addGroup(gridConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gridWidthLabel)
                            .addComponent(gridWidthLabel1))
                        .addGap(36, 36, 36)
                        .addGroup(gridConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gridWidthSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gridHeightSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(gridRandomizeButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gridConfigPanelLayout.setVerticalGroup(
            gridConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gridConfigPanelLayout.createSequentialGroup()
                .addGroup(gridConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gridWidthLabel)
                    .addComponent(gridWidthSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gridConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gridWidthLabel1)
                    .addComponent(gridHeightSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gridRandomizeButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addComponent(iterationLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iterationSeperator))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iterationSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(partyLabel)
                            .addComponent(partyNameLabel)
                            .addComponent(partyColorLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(partySeperator)
                            .addGroup(controlPanelLayout.createSequentialGroup()
                                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(partyNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(iterateButton)
                                    .addComponent(addPartyButton)
                                    .addGroup(controlPanelLayout.createSequentialGroup()
                                        .addComponent(colorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(chooseColorButton)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addComponent(gameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gameSeperator))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gridConfigPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 10, Short.MAX_VALUE))))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iterationLabel)
                    .addComponent(iterationSeperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iterationSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iterateButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(partyLabel)
                    .addComponent(partySeperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(partyNameLabel)
                    .addComponent(partyNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(partyColorLabel)
                    .addComponent(colorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooseColorButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addPartyButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gameLabel)
                    .addComponent(gameSeperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gridConfigPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Controls", new javax.swing.ImageIcon(getClass().getResource("/resources/controls.png")), controlPanel); // NOI18N

        desktopPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        desktopPane.setDragMode(javax.swing.JDesktopPane.OUTLINE_DRAG_MODE);
        desktopPane.setMaximumSize(new java.awt.Dimension(971, 688));
        desktopPane.setMinimumSize(new java.awt.Dimension(971, 688));

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 971, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.getAccessibleContext().setAccessibleName("Controls");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iterateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iterateButtonMouseClicked
        //blobGrid.iterate(getIterations());
        WorldFrame frame = new WorldFrame("World 1", new RectangleWorldCanvas(new RectangleWorld(blobGrid.getParties(), 20, 20)));
        desktopPane.add(frame);
        
        Timer timer = new Timer(10, (event) -> {
            frame.repaint();
        });
        timer.setRepeats(true);
        timer.start();
    }//GEN-LAST:event_iterateButtonMouseClicked

    private void chooseColorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chooseColorButtonMouseClicked
        Color color = JColorChooser.showDialog(this, "Choose a Party Color", Color.WHITE);
         
        if (color != null) {
            colorField.setBackground(color);
            colorField.repaint();
        }
    }//GEN-LAST:event_chooseColorButtonMouseClicked

    private void addPartyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPartyButtonMouseClicked
        String name = partyNameField.getText();
        Color color = colorField.getBackground();
        if (name == null || name.isEmpty() || name.equals("")) return;
        
        Party party = new Party(name, color);
        addParty(party);
        partyNameField.setText("");
        colorField.setBackground(new Color(60, 63, 65));
    }//GEN-LAST:event_addPartyButtonMouseClicked
    
    private void gridRandomizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridRandomizeButtonMouseClicked
        blobGrid.setup(getGridWidth(), getGridHeight());
    }//GEN-LAST:event_gridRandomizeButtonMouseClicked
    
    
    
    private void addParty(Party party) {
        DefaultTableModel model = (DefaultTableModel) partyTable.getModel();
        model.addRow(new Object[] {party.getName(), createColorField(party.getColor())});
        blobGrid.addParty(party);
    }
    
    private int getIterations() {
        int iters = (int) iterationSpinner.getValue();
        
        if (iters < BlobGrid.MIN_ITERATIONS) iters = BlobGrid.MIN_ITERATIONS;
        if (iters > BlobGrid.MAX_ITERATIONS) iters = BlobGrid.MAX_ITERATIONS;
        iterationSpinner.setValue(iters);
        
        return iters;
    }
    
    private int getGridWidth() {
        int gridWidth = (int) gridWidthSpinner.getValue();
        
        if (gridWidth < BlobGrid.MIN_GRID_WIDTH) gridWidth = BlobGrid.MIN_GRID_WIDTH;
        if (gridWidth > BlobGrid.MAX_GRID_WIDTH) gridWidth = BlobGrid.MAX_GRID_WIDTH;
        gridWidthSpinner.setValue(gridWidth);
        
        return gridWidth;
    }
    
    private void setGridWidth(int width) {
        int gridWidth = width;
        
        if (gridWidth < BlobGrid.MIN_GRID_WIDTH) gridWidth = BlobGrid.MIN_GRID_WIDTH;
        if (gridWidth > BlobGrid.MAX_GRID_WIDTH) gridWidth = BlobGrid.MAX_GRID_WIDTH;
        
        gridWidthSpinner.setValue(gridWidth);
    }
    
    private int getGridHeight() {
        int gridHeight = (int) gridHeightSpinner.getValue();
        
        if (gridHeight < BlobGrid.MIN_GRID_HEIGHT) gridHeight = BlobGrid.MIN_GRID_HEIGHT;
        if (gridHeight > BlobGrid.MAX_GRID_HEIGHT) gridHeight = BlobGrid.MAX_GRID_HEIGHT;
        gridHeightSpinner.setValue(gridHeight);
        
        return gridHeight;
    }
    
    private void setGridHeight(int height) {
        int gridHeight = height;
        
        if (gridHeight < BlobGrid.MIN_GRID_HEIGHT) gridHeight = BlobGrid.MIN_GRID_HEIGHT;
        if (gridHeight > BlobGrid.MAX_GRID_HEIGHT) gridHeight = BlobGrid.MAX_GRID_HEIGHT;
        
        gridHeightSpinner.setValue(gridHeight);
    }
    
    private static JTextField createColorField(Color color) {
        JTextField colorField = new JTextField();
        colorField.setPreferredSize(new Dimension(20, 20));
        colorField.setEnabled(false);
        colorField.setBackground(color);
        return colorField;
    }
    
    public static void main(String args[]) {
        System.setProperty("flatlaf.useWindowDecorations", "true");
        FlatDarkLaf.install();

        java.awt.EventQueue.invokeLater(() -> {
            new FlawlessDemocracy().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPartyButton;
    private javax.swing.JButton chooseColorButton;
    private javax.swing.JTextField colorField;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel gameLabel;
    private javax.swing.JSeparator gameSeperator;
    private javax.swing.JPanel gridConfigPanel;
    private javax.swing.JSpinner gridHeightSpinner;
    private javax.swing.JButton gridRandomizeButton;
    private javax.swing.JLabel gridWidthLabel;
    private javax.swing.JLabel gridWidthLabel1;
    private javax.swing.JSpinner gridWidthSpinner;
    private javax.swing.JButton iterateButton;
    private javax.swing.JLabel iterationLabel;
    private javax.swing.JSeparator iterationSeperator;
    private javax.swing.JSpinner iterationSpinner;
    private javax.swing.JLabel partyColorLabel;
    private javax.swing.JLabel partyLabel;
    private javax.swing.JTextField partyNameField;
    private javax.swing.JLabel partyNameLabel;
    private javax.swing.JSeparator partySeperator;
    private javax.swing.JTable partyTable;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JScrollPane tableScrollPane;
    // End of variables declaration//GEN-END:variables
}
