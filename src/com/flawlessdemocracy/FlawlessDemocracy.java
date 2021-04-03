
package com.flawlessdemocracy;

import com.flawlessdemocracy.world.TileWorld;
import com.flawlessdemocracy.world.TileWorldCanvas;
import com.flawlessdemocracy.world.TileWorldRenderer;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JColorChooser;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

/**
 * Flawless Democracy
 * 
 * @author Pascal
 */
public class FlawlessDemocracy extends javax.swing.JFrame {
    
    private static final int DEFAULT_GRID_WIDTH = 100;
    private static final int MIN_GRID_WIDTH = 5;
    private static final int MAX_GRID_WIDTH = 500;
    
    private static final int DEFAULT_GRID_HEIGHT = 100;
    private static final int MIN_GRID_HEIGHT = 5;
    private static final int MAX_GRID_HEIGHT = 500;
    
    private static final int DEFAULT_CELL_SIZE = 10;
    private static final int MIN_CELL_SIZE = 2;
    private static final int MAX_CELL_SIZE = 100;
    
    private static final int DEFAULT_BORDER_WIDTH = 1;
    private static final int MIN_BORDER_WIDTH = 0;
    private static final int MAX_BORDER_WIDTH = 5;
    
    private static final int[] SPEED_INTERVALS = {
        1_000_000,
        200_000,
        50_000,
        1_000,
        1
    };
    
    private static final Party DEFAULT_DEMOCRATIC_PARTY = new Party("Democrats", Color.BLUE);
    private static final Party DEFAULT_REPUBLICAN_PARTY = new Party("Republicans", Color.RED);
    
    private final List<Party> parties;
    
    private TileWorldRenderer renderer;

    public FlawlessDemocracy() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/putin.png")));
        initComponents();
        
        gridWidthSpinner.setModel(new SpinnerNumberModel(
                DEFAULT_GRID_WIDTH,
                MIN_GRID_WIDTH,
                MAX_GRID_WIDTH,
                1
        ));
        
        gridHeightSpinner.setModel(new SpinnerNumberModel(
                DEFAULT_GRID_HEIGHT,
                MIN_GRID_HEIGHT,
                MAX_GRID_HEIGHT,
                1
        ));
        
        cellSizeSpinner.setModel(new SpinnerNumberModel(
                DEFAULT_CELL_SIZE,
                MIN_CELL_SIZE,
                MAX_CELL_SIZE,
                1
        ));
        
        borderWidthSpinner.setModel(new SpinnerNumberModel(
                DEFAULT_BORDER_WIDTH,
                MIN_BORDER_WIDTH,
                MAX_BORDER_WIDTH,
                1
        ));
        
        pauseButton.setEnabled(false);
        stopButton.setEnabled(false);
        
        parties = new ArrayList();
        
        addParty(DEFAULT_DEMOCRATIC_PARTY);
        addParty(DEFAULT_REPUBLICAN_PARTY);
        
        setupWorld();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        controlPanel = new javax.swing.JPanel();
        startButton = new javax.swing.JButton();
        partyLabel = new javax.swing.JLabel();
        simulationLabel = new javax.swing.JLabel();
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
        gridConfigPanel = new javax.swing.JPanel();
        gridWidthLabel = new javax.swing.JLabel();
        gridHeightLabel = new javax.swing.JLabel();
        gridHeightSpinner = new javax.swing.JSpinner();
        gridWidthSpinner = new javax.swing.JSpinner();
        cellSizeLabel = new javax.swing.JLabel();
        cellSizeSpinner = new javax.swing.JSpinner();
        borderWidthLabel = new javax.swing.JLabel();
        borderWidthSpinner = new javax.swing.JSpinner();
        stopButton = new javax.swing.JButton();
        restartButton = new javax.swing.JButton();
        speedSlider = new javax.swing.JSlider();
        speedLabel = new javax.swing.JLabel();
        pauseButton = new javax.swing.JToggleButton();
        scrollPane = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Flawless Democracy");
        setMaximumSize(new java.awt.Dimension(1300, 730));
        setMinimumSize(new java.awt.Dimension(1300, 730));
        setName("gameFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1300, 730));
        setResizable(false);
        setSize(new java.awt.Dimension(1300, 730));

        tabbedPane.setMaximumSize(new java.awt.Dimension(376, 688));
        tabbedPane.setMinimumSize(new java.awt.Dimension(376, 688));
        tabbedPane.setPreferredSize(new java.awt.Dimension(376, 688));

        controlPanel.setMaximumSize(new java.awt.Dimension(376, 688));
        controlPanel.setMinimumSize(new java.awt.Dimension(376, 688));
        controlPanel.setName("controlPanel"); // NOI18N
        controlPanel.setPreferredSize(new java.awt.Dimension(376, 688));

        startButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.background"));
        startButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        startButton.setText("Start");
        startButton.setActionCommand("");
        startButton.setName(""); // NOI18N
        startButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onStartButton(evt);
            }
        });

        partyLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        partyLabel.setText("Party Configuration");

        simulationLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        simulationLabel.setText("Simulation");

        partyNameLabel.setText("Party Name");

        partyColorLabel.setText("Party Color");

        addPartyButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.background"));
        addPartyButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addPartyButton.setText("Add Party");
        addPartyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onAddPartyButton(evt);
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
                onChooseColorButton(evt);
            }
        });

        tableScrollPane.setMaximumSize(new java.awt.Dimension(360, 240));
        tableScrollPane.setMinimumSize(new java.awt.Dimension(360, 240));
        tableScrollPane.setPreferredSize(new java.awt.Dimension(360, 240));

        partyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Percentage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        partyTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        partyTable.getTableHeader().setReorderingAllowed(false);
        tableScrollPane.setViewportView(partyTable);

        gridConfigPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Grid"));

        gridWidthLabel.setText("Grid Width");

        gridHeightLabel.setText("Grid Height");

        cellSizeLabel.setText("Cell Size");

        borderWidthLabel.setText("Border Width");

        javax.swing.GroupLayout gridConfigPanelLayout = new javax.swing.GroupLayout(gridConfigPanel);
        gridConfigPanel.setLayout(gridConfigPanelLayout);
        gridConfigPanelLayout.setHorizontalGroup(
            gridConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gridConfigPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gridConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gridWidthLabel)
                    .addComponent(gridHeightLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gridConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gridWidthSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gridHeightSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gridConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(borderWidthLabel)
                    .addComponent(cellSizeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gridConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cellSizeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borderWidthSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gridConfigPanelLayout.setVerticalGroup(
            gridConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gridConfigPanelLayout.createSequentialGroup()
                .addGroup(gridConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gridConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cellSizeLabel)
                        .addComponent(cellSizeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gridConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(gridWidthLabel)
                        .addComponent(gridWidthSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gridConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gridConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(borderWidthLabel)
                        .addComponent(borderWidthSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gridConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(gridHeightLabel)
                        .addComponent(gridHeightSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        stopButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.background"));
        stopButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        stopButton.setText("Stop");
        stopButton.setActionCommand("");
        stopButton.setName(""); // NOI18N
        stopButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onStopButton(evt);
            }
        });

        restartButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.background"));
        restartButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        restartButton.setText("Restart");
        restartButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onRestartButton(evt);
            }
        });

        speedSlider.setMajorTickSpacing(1);
        speedSlider.setMaximum(5);
        speedSlider.setMinimum(1);
        speedSlider.setMinorTickSpacing(1);
        speedSlider.setPaintLabels(true);
        speedSlider.setPaintTicks(true);
        speedSlider.setSnapToTicks(true);
        speedSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                onSpeedSliderChange(evt);
            }
        });

        speedLabel.setText("Speed");

        pauseButton.setText("Pause");
        pauseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onPauseButton(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addComponent(simulationLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iterationSeperator))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(controlPanelLayout.createSequentialGroup()
                                    .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(partyLabel)
                                        .addComponent(partyNameLabel)
                                        .addComponent(partyColorLabel))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(partyNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addPartyButton)
                                        .addGroup(controlPanelLayout.createSequentialGroup()
                                            .addComponent(colorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(chooseColorButton))))
                                .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(controlPanelLayout.createSequentialGroup()
                                    .addComponent(startButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(pauseButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(stopButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(restartButton))
                                .addGroup(controlPanelLayout.createSequentialGroup()
                                    .addComponent(speedLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(speedSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(1, 1, 1)))
                            .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(partySeperator, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(gridConfigPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(10, Short.MAX_VALUE))))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(simulationLabel)
                    .addComponent(iterationSeperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startButton)
                    .addComponent(stopButton)
                    .addComponent(restartButton)
                    .addComponent(pauseButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(speedSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(speedLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gridConfigPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addContainerGap(140, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Controls", new javax.swing.ImageIcon(getClass().getResource("/resources/controls.png")), controlPanel); // NOI18N

        scrollPane.setAutoscrolls(true);
        scrollPane.setMaximumSize(new java.awt.Dimension(903, 688));
        scrollPane.setMinimumSize(new java.awt.Dimension(903, 688));
        scrollPane.setPreferredSize(new java.awt.Dimension(903, 688));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbedPane.getAccessibleContext().setAccessibleName("Controls");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onChooseColorButton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onChooseColorButton
        Color color = JColorChooser.showDialog(this, "Choose a Party Color", Color.WHITE);
         
        if (color != null) {
            colorField.setBackground(color);
            colorField.repaint();
        }
    }//GEN-LAST:event_onChooseColorButton

    private void onAddPartyButton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onAddPartyButton
        String name = partyNameField.getText();
        Color color = colorField.getBackground();
        if (name == null || name.isEmpty() || name.equals("")) return;
        
        Party party = new Party(name, color);
        addParty(party);
        partyNameField.setText("");
        colorField.setBackground(new Color(60, 63, 65));
    }//GEN-LAST:event_onAddPartyButton

    private void onStartButton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onStartButton
        if (startButton.isEnabled()) {
            renderer.execute();
            
            startButton.setEnabled(false);
            pauseButton.setEnabled(true);
            stopButton.setEnabled(true);
            restartButton.setEnabled(false);
            speedSlider.setEnabled(true);
        }
    }//GEN-LAST:event_onStartButton

    private void onPauseButton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onPauseButton
        if (pauseButton.isEnabled()) {
            if (renderer.isPaused()) {
                renderer.unpause();
                restartButton.setEnabled(false);
            } else {
                renderer.pause();
            }
        }
    }//GEN-LAST:event_onPauseButton

    private void onStopButton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onStopButton
        if (stopButton.isEnabled()) {
            renderer.cancel(true);
        
            startButton.setEnabled(false);
            pauseButton.setEnabled(false);
            stopButton.setEnabled(false);
            restartButton.setEnabled(true);
        }
    }//GEN-LAST:event_onStopButton

    private void onRestartButton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onRestartButton
        if (restartButton.isEnabled()) {
            setupWorld();

            startButton.setEnabled(true);
        }
    }//GEN-LAST:event_onRestartButton

    private void onSpeedSliderChange(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_onSpeedSliderChange
        if (!speedSlider.getValueIsAdjusting()) {
            renderer.setInterval(getInterval());
        }
    }//GEN-LAST:event_onSpeedSliderChange
    
    private void setupWorld() {
        TileWorldCanvas canvas = new TileWorldCanvas(
            new TileWorld(parties, getGridHeight(), getGridWidth()),
            getCellSize(),
            getBorderWidth()
        );
        scrollPane.setViewportView(canvas);
        renderer = new TileWorldRenderer(canvas, getInterval(), (DefaultTableModel) partyTable.getModel());
    }
    
    private int getGridWidth() {
        return (int) gridWidthSpinner.getValue();
    }
    
    private int getGridHeight() {
        return (int) gridHeightSpinner.getValue();
    }
    
    private int getCellSize() {
        return (int) cellSizeSpinner.getValue();
    }
    
    private int getBorderWidth() {
        return (int) borderWidthSpinner.getValue();
    }
    
    private int getInterval() {
        return SPEED_INTERVALS[speedSlider.getValue() - 1];
    }
    
    private void addParty(Party party) {
        parties.add(party);
        DefaultTableModel model = (DefaultTableModel) partyTable.getModel();
        model.addRow(new Object[] {party.getName(), "0 %"});
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
    private javax.swing.JLabel borderWidthLabel;
    private javax.swing.JSpinner borderWidthSpinner;
    private javax.swing.JLabel cellSizeLabel;
    private javax.swing.JSpinner cellSizeSpinner;
    private javax.swing.JButton chooseColorButton;
    private javax.swing.JTextField colorField;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JPanel gridConfigPanel;
    private javax.swing.JLabel gridHeightLabel;
    private javax.swing.JSpinner gridHeightSpinner;
    private javax.swing.JLabel gridWidthLabel;
    private javax.swing.JSpinner gridWidthSpinner;
    private javax.swing.JSeparator iterationSeperator;
    private javax.swing.JLabel partyColorLabel;
    private javax.swing.JLabel partyLabel;
    private javax.swing.JTextField partyNameField;
    private javax.swing.JLabel partyNameLabel;
    private javax.swing.JSeparator partySeperator;
    private javax.swing.JTable partyTable;
    private javax.swing.JToggleButton pauseButton;
    private javax.swing.JButton restartButton;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JLabel simulationLabel;
    private javax.swing.JLabel speedLabel;
    private javax.swing.JSlider speedSlider;
    private javax.swing.JButton startButton;
    private javax.swing.JButton stopButton;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JScrollPane tableScrollPane;
    // End of variables declaration//GEN-END:variables
}
