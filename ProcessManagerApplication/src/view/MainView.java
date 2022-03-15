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
        /*
        JFrame marco = new JFrame();
        marco.setTitle("GridBagLayout");
        marco.setSize(600,300);
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        GridBagLayout gridBag = new GridBagLayout ();
        GridBagConstraints restricciones = new GridBagConstraints ();

        marco.setLayout(gridBag);

        restricciones.fill = GridBagConstraints.BOTH; //modifica altura y anchura

        restricciones.weightx = 1.5; //espacio horizontal extra
        JButton btn1 = new JButton("Boton 1");
        JButton btn2 = new JButton("Boton 2");
        JButton btn3 = new JButton("Boton 3");
        gridBag.setConstraints (btn1, restricciones);
        gridBag.setConstraints (btn2, restricciones);
        gridBag.setConstraints (btn3, restricciones);
        marco.add(btn1);marco.add(btn2);marco.add(btn3);

        restricciones.gridwidth = GridBagConstraints.REMAINDER;  // Fila final
        JButton btn4 = new JButton("Boton 4");
        gridBag.setConstraints (btn4, restricciones);
        marco.add(btn4);

        restricciones.weightx = 0.0;  // Restablecer a los valores predeterminados
        JButton btn5 = new JButton("Boton 5");
        gridBag.setConstraints (btn5, restricciones);
        marco.add(btn5);

        restricciones.gridwidth = GridBagConstraints.RELATIVE;  //-Penúltimo en la fila
        JButton btn6 = new JButton("Boton 6");
        gridBag.setConstraints (btn6, restricciones);
        marco.add(btn6);

        restricciones.gridwidth = GridBagConstraints.REMAINDER;  // Fila final
        JButton btn7 = new JButton("Boton 7");
        gridBag.setConstraints (btn7, restricciones);
        marco.add(btn7);

        restricciones.gridwidth = 1;  // Restablecer a los valores predeterminados
        restricciones.gridheight = 2;
        restricciones.weighty = 1.0;
        JButton btn8 = new JButton("Boton 8");
        gridBag.setConstraints (btn8, restricciones);
        marco.add(btn8);

        restricciones.weighty = 0.0;  // Restablecer a los valores predeterminados
        restricciones.gridwidth = GridBagConstraints.REMAINDER;  // Fila final
        restricciones.gridheight = 1;  // Restablecer a los valores predeterminados
        JButton btn9 = new JButton("Boton 9");
        JButton btn10 = new JButton("Boton 10");
        gridBag.setConstraints (btn9, restricciones);
        gridBag.setConstraints (btn10, restricciones);
        marco.add(btn9);marco.add(btn10);

        marco.setVisible(true);
        */
    }
}
