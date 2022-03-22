package view;

import controller.MainController;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class MainView extends JFrame {

    private JTable tblProcess, tblQueue;
    private JLabel lblInfo, lblTime;
    private JButton btnExit;
    private JPanel panelContent;
    private DefaultTableModel dflTblProcess, defTblQueue;

    //Controlador action listener
    public MainView(MainController controller) throws HeadlessException {
        super("Process Manager");
        this.setLayout(new GridLayout(1, 1));
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        panelContent = new JPanel();
        panelContent.setLayout(new BorderLayout());
        panelContent.setBorder(BorderFactory.createEmptyBorder(10,20,10,20));
        init(controller);
        this.add(panelContent);
        this.setVisible(true);
    }

    //Controlador action listener
    public void init(MainController controller) {
        JPanel panelNorth = new JPanel(new GridLayout(1,2));

        lblInfo = new JLabel("Administrador de procesos");
        lblInfo.setBorder(BorderFactory.createTitledBorder("Información"));
        lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTime = new JLabel("Tiempo: 00:00");
        lblTime.setBorder(BorderFactory.createTitledBorder("Tiempo de simulación"));
        lblTime.setHorizontalAlignment(SwingConstants.CENTER);

        panelNorth.add(lblInfo);
        panelNorth.add(lblTime);

        addData();

        JPanel panelWest = new JPanel();
        JPanel panelCenter = new JPanel();
        panelCenter.setLayout(new BoxLayout(panelCenter, BoxLayout.Y_AXIS));
        panelWest.setLayout(new BoxLayout(panelWest, BoxLayout.Y_AXIS));

        JScrollPane scrollProcess = new JScrollPane(tblProcess, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        JScrollPane scrollQueue = new JScrollPane(tblQueue, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollQueue.setPreferredSize(new Dimension(120,80));
        panelWest.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

        panelCenter.add(scrollProcess);
        panelWest.add(scrollQueue);

        JPanel panelSouth = new JPanel();
        panelSouth.setLayout(new FlowLayout());

        btnExit = new JButton("Salir");
        btnExit.addActionListener(controller);
        btnExit.setActionCommand("exit");
        panelSouth.add(btnExit);

        panelContent.add(panelNorth, BorderLayout.NORTH);
        panelContent.add(panelWest, BorderLayout.WEST);
        panelContent.add(panelCenter, BorderLayout.CENTER);
        panelContent.add(panelSouth, BorderLayout.SOUTH);
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
        dflTblProcess = new DefaultTableModel(rowData, columnNames);
        tblProcess = new JTable(dflTblProcess);


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
        defTblQueue = new DefaultTableModel(rowData2, columnNames2);
        tblQueue = new JTable(defTblQueue);
    }

    public DefaultTableModel getDflTblProcess() {
        return dflTblProcess;
    }

    public DefaultTableModel getDefTblQueue() {
        return defTblQueue;
    }

    public static void main(String Args[]) {
        new MainView(null);
    }
}
