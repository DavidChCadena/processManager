package view;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {

    private JTable tblProcess, tblQueue;
    private JLabel lblInfo, lblTime;
    private JButton btnExit;
    private JPanel panelContent;
    private GridBagConstraints constraints;

    public MainView() throws HeadlessException {
        super("Process Manager");
        this.setLayout(new GridLayout(1, 1));
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        panelContent = new JPanel();
        panelContent.setLayout(new GridBagLayout());
        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1.5;
        init();
        this.add(panelContent);
        this.setVisible(true);
    }

    public void init() {
        lblInfo = new JLabel("Administrador de procesos");
        lblInfo.setBorder(BorderFactory.createTitledBorder("Información"));
        lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 0;
        panelContent.add(lblInfo, constraints);

        lblTime = new JLabel("Tiempo: 00:00");
        lblTime.setBorder(BorderFactory.createTitledBorder("Tiempo de simulación"));
        lblTime.setHorizontalAlignment(SwingConstants.CENTER);
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(0,20,0,20);
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.weightx = 2;
        panelContent.add(lblTime, constraints);

        addData();
        JScrollPane scrollProcess = new JScrollPane(tblProcess);
        constraints.fill = GridBagConstraints.BOTH;
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridheight = 2;
        constraints.gridwidth = 2;
        panelContent.add(scrollProcess, constraints);

        JScrollPane scrollQueue = new JScrollPane(tblQueue);
        constraints.fill = GridBagConstraints.BOTH;
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridheight = 3;
        constraints.gridwidth = 1;
        panelContent.add(scrollQueue, constraints);

    }

    private void addData() {
        String[] columnNames = {"Número de serie", "Nombre", "Chino", "Matemáticas", "Inglés", "Puntos totales"};
        Object[][] rowData = {
                {1, "Zhang San", 80, 80, 80, 240},
                {2, "John", 70, 80, 90, 240},
                {3, "Sue", 70, 70, 70, 210},
                {4, "Jane", 80, 70, 60, 210},
                {5, "Joe_05", 80, 70, 60, 210},
                {6, "Joe_06", 80, 70, 60, 210},
                {7, "Joe_07", 80, 70, 60, 210},
                {8, "Joe_08", 80, 70, 60, 210},
                {9, "Joe_09", 80, 70, 60, 210},
                {10, "Joe_10", 80, 70, 60, 210},
                {11, "Joe_11", 80, 70, 60, 210},
                {12, "Joe_12", 80, 70, 60, 210},
                {13, "Joe_13", 80, 70, 60, 210},
                {14, "Joe_14", 80, 70, 60, 210},
                {15, "Joe_15", 80, 70, 60, 210},
                {16, "Joe_16", 80, 70, 60, 210},
                {17, "Joe_17", 80, 70, 60, 210},
                {18, "Joe_18", 80, 70, 60, 210},
                {19, "Joe_19", 80, 70, 60, 210},
                {20, "Joe_20", 80, 70, 60, 210}
        };
        tblProcess = new JTable(rowData, columnNames);

        String[] columnNames2 = {"Procesos en cola"};
        Object[][] rowData2 = {
                {"Proceso 1"},
                {"Proceso 2"},
                {"Proceso 3"},
                {"Proceso 4"},
                {"Proceso 5"},
                {"Proceso 6"},
                {"Proceso 7"},
                {"Proceso 8"},

        };

        tblQueue = new JTable(rowData2, columnNames2);
    }


    public static void main(String Args[]) {
        new MainView();
    }
}
