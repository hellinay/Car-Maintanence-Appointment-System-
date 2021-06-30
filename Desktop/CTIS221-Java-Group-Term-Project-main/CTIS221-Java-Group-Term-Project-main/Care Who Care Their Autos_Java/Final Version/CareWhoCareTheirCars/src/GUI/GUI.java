/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Classes.Ambulance;
import Classes.Car;
import Classes.CareHistory;
import Classes.VehicleSys;
import Classes.Truck;
import Classes.Motorcycle;
import Classes.StandartVehicle;
import Classes.Vehicle;
import Classes.PrivilegedVehicle;
import Classes.FireTruck;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author merte
 */
//Merter Eker & Fatma Helin Ay

public class GUI extends javax.swing.JFrame {
    
    int fltcounter =0, tablecounter = 0, addcnt = 0;
    String[] defaults = new String[]{"Select"};
    String[] months = new String[]{"January" ,"February" ,"March" ,"April" ,"May" ,"Jun" ,"July" ,"August" ,"September" ,"Octaber" ,"November" ,"December"};
    String[] brands = new String[]{"Select", "Alfa Romeo" ,"Audi" ,"BMC" ,"BMW" ,"Chevrolet" ,"Citroen" ,"Dacia" ,"Ducati" ,"Ferrari" ,"Fiat" ,"Ford" ,"Honda" ,"Hyundai" ,"Jaguar" ,"Jeep" ,"Karsan" ,"Kia" ,"Lada" ,"Lamborghini" ,"Land Rover" ,"Mazda" ,"Mercedes Benz" ,"MINI" ,"Nissan" ,"Opel" ,"Peugeot" ,"Renault" ,"Seat" ,"Skoda" ,"Subaru" ,"Tesla" ,"Toyota" ,"Volkswagen" ,"Volvo" ,"Yamaha"};
    String[] fuels = new String[]{"Select", "Diesel", "Gasoline", "LPG"};
    String[] years = new String[]{"1970" ,"1971" ,"1972" ,"1973" ,"1974" ,"1975" ,"1976" ,"1977" ,"1978" ,"1979" ,"1980" ,"1981" ,"1982" ,"1983" ,"1984" ,"1985" ,"1986" ,"1987" ,"1988" ,"1989" ,"1990" ,"1991" ,"1992" ,"1993" ,"1994" ,"1995" ,"1996" ,"1997" ,"1998" ,"1999" ,"2000" ,"2001" ,"2002" ,"2003" ,"2004" ,"2005" ,"2006" ,"2007" ,"2008" ,"2009" ,"2010" ,"2011" ,"2012" ,"2013" ,"2014" ,"2015" ,"2016" ,"2017" ,"2018" ,"2019" ,"2020"};
    String[] tires = new String[]{"Standard", "Pallette"};
    String[] trucktypes = new String[]{"Van", "Truck", "Lorry", "Tractor"};
    String[] sv = new String[]{"Car", "Motorcycle", "Truck"};
    String[] pv = new String[]{"Ambulance", "Firetruck"};
    String[] yy1 = new String[]{"2020", "2021"};
    String[] yy0 = new String[]{"2019", "2020"};
    String[] clocks = new String[]{"08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30"};
    String[] days = new String[]{"01" ,"02" ,"03" ,"04" ,"05" ,"06" ,"07" ,"08" ,"09" ,"10" ,"11" ,"12" ,"13" ,"14" ,"15" ,"16" ,"17" ,"18" ,"19" ,"20" ,"21" ,"22" ,"23" ,"24" ,"25" ,"26" ,"27" ,"28" ,"29" ,"30"};
    String[] faults = new String[5];
        /**
     * Creates new form GUI
     */
    public GUI() {
        
        initComponents();
        
        System.out.println("we care your car");
        this.setLocationRelativeTo(null);
        
         MotorEx.setVisible(false);
         CarEx.setVisible(false);
         TruckEx.setVisible(false);
         AmbulanceEx.setVisible(false);
         FiretruckEx.setVisible(false);
         repetitionInfo4.setVisible(false);
         thirdPanel.setVisible(false);
         delete.setVisible(false);
         search.setVisible(false);
         extendedCarInfo.setVisible(false);
         carInfo.setVisible(false);
         servicesInfo.setVisible(false);
         result.setVisible(false);
         ResultPanel2.setVisible(false);
         
         //
        ffTF.setVisible(false);
        ffLBL5.setVisible(false);
        sfTF.setVisible(false);
        sfLBL5.setVisible(false);
        tfTF.setVisible(false);
        tfLBL5.setVisible(false);
        fofTF.setVisible(false);
        fofLBL5.setVisible(false);
        nextLBL.setVisible(false);
         //
        fineAmount.setVisible(true);
         
    }
    
    public void fillComboBox() {
        if(standardRB.isSelected())
        typecCMB.setModel(new DefaultComboBoxModel(sv));
        else
        typecCMB.setModel(new DefaultComboBoxModel(pv));
    }
    
    void clearServices()
    {
        aid8.setVisible(false);
        aid9.setVisible(false);
        jScrollPane1.setVisible(false);
        jList1.setVisible(false);
        aid14.setVisible(false);
        precheck.setVisible(false);
        vallet.setVisible(false);
        jSeparator4.setVisible(false);
        addBTN.setVisible(false);
        aid17.setVisible(false);
        cityTF.setVisible(false);
        aid18.setVisible(false);
        aid19.setVisible(false);
        clockCMB.setVisible(false);
        day.setVisible(false);
        yy.setVisible(false);
        mm.setVisible(false);
        possibleFaults.setVisible(true);
               jLabel15.setVisible(true);
               aid15.setVisible(true);
               jScrollPane2.setVisible(true);
        
    }
     void fillServices()
    {
        aid8.setVisible(true);
        aid9.setVisible(true);
        jScrollPane1.setVisible(true);
        jList1.setVisible(true);
        aid14.setVisible(true);
        precheck.setVisible(true);
        vallet.setVisible(true);
        jSeparator4.setVisible(true);
        addBTN.setVisible(true);
        aid17.setVisible(true);
        cityTF.setVisible(true);
        aid18.setVisible(true);
        aid19.setVisible(true);
        clockCMB.setVisible(true);
        day.setVisible(true);
        yy.setVisible(true);
        mm.setVisible(true);
        possibleFaults.setVisible(false);
               jLabel15.setVisible(false);
               aid15.setVisible(false);
               jScrollPane2.setVisible(false);
    }
    
    
    void clear()
    {
               plate1.setText("");
               plate2.setText("");
               plate3.setText("");
               cityTF.setText("");
               ffTF.setText("");
               sfTF.setText("");
               tfTF.setText("");
               fofTF.setText("");
               fuel.setModel(new DefaultComboBoxModel(fuels));
               mm.setModel(new DefaultComboBoxModel(months));
               repM5.setModel(new DefaultComboBoxModel(yy0));
               repY5.setModel(new DefaultComboBoxModel(months));
               yy.setModel(new DefaultComboBoxModel(yy1));
               day.setModel(new DefaultComboBoxModel(days));
               repD5.setModel(new DefaultComboBoxModel(days));
               clockCMB.setModel(new DefaultComboBoxModel(clocks));
               fuel.setModel(new DefaultComboBoxModel(fuels));
               year.setModel(new DefaultComboBoxModel(years)); 
               brand.setModel(new DefaultComboBoxModel(brands));
               typecCMB.setModel(new DefaultComboBoxModel(defaults));
               kmTF.setText("");
               fineAmount.setText("");
               tankCapacityTF.setText("");
               truckTypeCMB.setModel(new DefaultComboBoxModel(trucktypes)); 
               seatCount.setValue(0);
               motorCC.setText("");
               TyreCMB.setModel(new DefaultComboBoxModel(tires)); 
               equipmentChc.setSelected(false);
               aidC2.setSelected(false);
               aidC1.setSelected(false);
               aidC3.setSelected(false);
               fineC1.setSelected(false);
               fineC2.setSelected(false);
               fineC3.setSelected(false);
               exhC1.setSelected(false);
               exhC2.setSelected(false);
               exhC3.setSelected(false);
               equipmentChc.setSelected(false);
               precheck.setSelected(false);
               vallet.setSelected(false);
               faultCount.setValue(0);
               ffLBL5.setVisible(false);
               sfLBL5.setVisible(false);
               tfLBL5.setVisible(false);
               fofLBL5.setVisible(false);
               ffTF.setVisible(false);
               sfTF.setVisible(false);
               tfTF.setVisible(false);
               fofTF.setVisible(false);
               jLabel27.setVisible(true);
               faultCount.setVisible(true);
               nextLBL.setVisible(false);
               possibleFaults.setVisible(false);
               jLabel15.setVisible(false);
               aid15.setVisible(false);
                     jScrollPane2.setVisible(false);  
    }
    
    void closeAllRepSer(){
         delete.setVisible(false);
         search.setVisible(false);
         result.setVisible(false);
    }
    
    void closeAllAfterAdd(){
         CarEx.setVisible(false);
         MotorEx.setVisible(false);
         TruckEx.setVisible(false);
         AmbulanceEx.setVisible(false);
         FiretruckEx.setVisible(false);
         repetitionInfo4.setVisible(false);
         extendedCarInfo.setVisible(false);
         carInfo.setVisible(false);
    }
    
    void closeAll(){
         CarEx.setVisible(false);
         MotorEx.setVisible(false);
         TruckEx.setVisible(false);
         AmbulanceEx.setVisible(false);
         FiretruckEx.setVisible(false);
         repetitionInfo4.setVisible(false);
         thirdPanel.setVisible(false);
         delete.setVisible(false);
         search.setVisible(false);
         extendedCarInfo.setVisible(false);
         carInfo.setVisible(false);
         servicesInfo.setVisible(false);
         result.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        LeftPanel = new javax.swing.JPanel();
        CarInfoPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AppRepPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ServicesPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ResultPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sdPanel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        message2 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        message = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        ResultPanel2 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        CarInfoPanel1 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        background = new javax.swing.JPanel();
        decoration = new javax.swing.JPanel();
        carInfo = new javax.swing.JPanel();
        plate1 = new javax.swing.JTextField();
        plate2 = new javax.swing.JTextField();
        plate3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        brand = new javax.swing.JComboBox<>();
        fuel = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        year = new javax.swing.JComboBox<>();
        privilegedRB = new javax.swing.JRadioButton();
        standardRB = new javax.swing.JRadioButton();
        kmTF = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        extendedCarInfo = new javax.swing.JPanel();
        typecCMB = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        AmbulanceEx = new javax.swing.JPanel();
        aid6 = new javax.swing.JLabel();
        equipmentChc = new javax.swing.JCheckBox();
        aid7 = new javax.swing.JLabel();
        TyreCMB = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        continueLBLA = new javax.swing.JLabel();
        MotorEx = new javax.swing.JPanel();
        aid2 = new javax.swing.JLabel();
        aidC2 = new javax.swing.JCheckBox();
        fine2 = new javax.swing.JLabel();
        fineC2 = new javax.swing.JCheckBox();
        exh2 = new javax.swing.JLabel();
        exhC2 = new javax.swing.JCheckBox();
        aid3 = new javax.swing.JLabel();
        motorCC = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        fineAmount1 = new javax.swing.JTextField();
        continueLBLM = new javax.swing.JLabel();
        CarEx = new javax.swing.JPanel();
        aid1 = new javax.swing.JLabel();
        aidC1 = new javax.swing.JCheckBox();
        fine1 = new javax.swing.JLabel();
        fineC1 = new javax.swing.JCheckBox();
        exh1 = new javax.swing.JLabel();
        exhC1 = new javax.swing.JCheckBox();
        jLabel20 = new javax.swing.JLabel();
        seatCount = new javax.swing.JSpinner();
        jLabel23 = new javax.swing.JLabel();
        fineAmount = new javax.swing.JTextField();
        continueLBLC = new javax.swing.JLabel();
        TruckEx = new javax.swing.JPanel();
        aid4 = new javax.swing.JLabel();
        aidC3 = new javax.swing.JCheckBox();
        fine3 = new javax.swing.JLabel();
        fineC3 = new javax.swing.JCheckBox();
        exh3 = new javax.swing.JLabel();
        exhC3 = new javax.swing.JCheckBox();
        aid5 = new javax.swing.JLabel();
        truckTypeCMB = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        fineAmount2 = new javax.swing.JTextField();
        continueLBLT = new javax.swing.JLabel();
        FiretruckEx = new javax.swing.JPanel();
        aid10 = new javax.swing.JLabel();
        eqFt = new javax.swing.JCheckBox();
        aid11 = new javax.swing.JLabel();
        lift = new javax.swing.JCheckBox();
        aid12 = new javax.swing.JLabel();
        tankCapacityTF = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        continueLBLFT = new javax.swing.JLabel();
        thirdPanel = new javax.swing.JPanel();
        repetitionInfo4 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        repD5 = new javax.swing.JComboBox<>();
        repM5 = new javax.swing.JComboBox<>();
        repY5 = new javax.swing.JComboBox<>();
        faultCount = new javax.swing.JSpinner();
        jLabel27 = new javax.swing.JLabel();
        faultCntBTN = new javax.swing.JButton();
        ffLBL5 = new javax.swing.JLabel();
        sfLBL5 = new javax.swing.JLabel();
        tfLBL5 = new javax.swing.JLabel();
        fofLBL5 = new javax.swing.JLabel();
        ffTF = new javax.swing.JTextField();
        sfTF = new javax.swing.JTextField();
        tfTF = new javax.swing.JTextField();
        fofTF = new javax.swing.JTextField();
        nextLBL = new javax.swing.JLabel();
        servicesInfo = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        possibleFaults = new javax.swing.JTextArea();
        aid8 = new javax.swing.JLabel();
        aid9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        aid13 = new javax.swing.JLabel();
        aid14 = new javax.swing.JLabel();
        precheck = new javax.swing.JCheckBox();
        vallet = new javax.swing.JCheckBox();
        aid15 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        addBTN = new javax.swing.JLabel();
        aid17 = new javax.swing.JLabel();
        cityTF = new javax.swing.JTextField();
        aid18 = new javax.swing.JLabel();
        aid19 = new javax.swing.JLabel();
        clockCMB = new javax.swing.JComboBox<>();
        day = new javax.swing.JComboBox<>();
        yy = new javax.swing.JComboBox<>();
        mm = new javax.swing.JComboBox<>();
        search = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        searchCMB = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        searchTA = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        deleteCMB = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        deleteTA = new javax.swing.JTextArea();
        deleteBTN = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        result = new javax.swing.JPanel();
        aid16 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane5 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1375, 856));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LeftPanel.setBackground(new java.awt.Color(51, 0, 102));
        LeftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CarInfoPanel.setBackground(new java.awt.Color(85, 65, 120));
        CarInfoPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CarInfoPanelMouseClicked(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8_car_30px.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 86));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Car Info");

        javax.swing.GroupLayout CarInfoPanelLayout = new javax.swing.GroupLayout(CarInfoPanel);
        CarInfoPanel.setLayout(CarInfoPanelLayout);
        CarInfoPanelLayout.setHorizontalGroup(
            CarInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CarInfoPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(233, Short.MAX_VALUE))
        );
        CarInfoPanelLayout.setVerticalGroup(
            CarInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CarInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CarInfoPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(19, 19, 19))
        );

        LeftPanel.add(CarInfoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 400, 70));

        AppRepPanel.setBackground(new java.awt.Color(64, 43, 100));
        AppRepPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AppRepPanelMouseClicked(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8_recurring_appointment_exception_35px_2.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 86));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Appointment Repetition");

        javax.swing.GroupLayout AppRepPanelLayout = new javax.swing.GroupLayout(AppRepPanel);
        AppRepPanel.setLayout(AppRepPanelLayout);
        AppRepPanelLayout.setHorizontalGroup(
            AppRepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppRepPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        AppRepPanelLayout.setVerticalGroup(
            AppRepPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AppRepPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AppRepPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(19, 19, 19))
        );

        LeftPanel.add(AppRepPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));

        ServicesPanel.setBackground(new java.awt.Color(64, 43, 100));
        ServicesPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ServicesPanelMouseClicked(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8_service_reminder_indicator_35px_3.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 86));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Special Services");

        javax.swing.GroupLayout ServicesPanelLayout = new javax.swing.GroupLayout(ServicesPanel);
        ServicesPanel.setLayout(ServicesPanelLayout);
        ServicesPanelLayout.setHorizontalGroup(
            ServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServicesPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        ServicesPanelLayout.setVerticalGroup(
            ServicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ServicesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ServicesPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(19, 19, 19))
        );

        LeftPanel.add(ServicesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));

        ResultPanel1.setBackground(new java.awt.Color(64, 43, 100));
        ResultPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResultPanel1MouseClicked(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8_list_of_thumbnails_30px_1.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 86));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Result");

        javax.swing.GroupLayout ResultPanel1Layout = new javax.swing.GroupLayout(ResultPanel1);
        ResultPanel1.setLayout(ResultPanel1Layout);
        ResultPanel1Layout.setHorizontalGroup(
            ResultPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap(250, Short.MAX_VALUE))
        );
        ResultPanel1Layout.setVerticalGroup(
            ResultPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(19, 19, 19))
        );

        LeftPanel.add(ResultPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, -1, -1));

        sdPanel.setBackground(new java.awt.Color(64, 43, 100));
        sdPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sdPanelMouseClicked(evt);
            }
        });

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8_search_30px.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 86));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Search/Delete");

        javax.swing.GroupLayout sdPanelLayout = new javax.swing.GroupLayout(sdPanel);
        sdPanel.setLayout(sdPanelLayout);
        sdPanelLayout.setHorizontalGroup(
            sdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sdPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addContainerGap(250, Short.MAX_VALUE))
        );
        sdPanelLayout.setVerticalGroup(
            sdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sdPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sdPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(19, 19, 19))
        );

        LeftPanel.add(sdPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        message2.setBackground(new java.awt.Color(204, 51, 0));
        message2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        message2.setForeground(new java.awt.Color(255, 153, 153));
        LeftPanel.add(message2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 330, 60));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/logo1.png"))); // NOI18N
        LeftPanel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 100));

        message.setBackground(new java.awt.Color(204, 51, 0));
        message.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        message.setForeground(new java.awt.Color(255, 153, 153));
        LeftPanel.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 330, 70));

        jLabel32.setBackground(new java.awt.Color(102, 102, 0));
        jLabel32.setForeground(new java.awt.Color(255, 153, 51));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8_exit_60px.png"))); // NOI18N
        jLabel32.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel32MouseMoved(evt);
            }
        });
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel32MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel32MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel32MouseReleased(evt);
            }
        });
        LeftPanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 780, 70, 70));

        ResultPanel2.setBackground(new java.awt.Color(64, 43, 100));
        ResultPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResultPanel2MouseClicked(evt);
            }
        });

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8_list_of_thumbnails_30px_1.png"))); // NOI18N

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 0, 86));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Result");

        javax.swing.GroupLayout ResultPanel2Layout = new javax.swing.GroupLayout(ResultPanel2);
        ResultPanel2.setLayout(ResultPanel2Layout);
        ResultPanel2Layout.setHorizontalGroup(
            ResultPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel34)
                .addContainerGap(250, Short.MAX_VALUE))
        );
        ResultPanel2Layout.setVerticalGroup(
            ResultPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addGap(19, 19, 19))
        );

        LeftPanel.add(ResultPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, -1, -1));

        CarInfoPanel1.setBackground(new java.awt.Color(85, 65, 120));
        CarInfoPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CarInfoPanel1MouseClicked(evt);
            }
        });

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8_car_30px.png"))); // NOI18N

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 0, 86));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Car Info");

        javax.swing.GroupLayout CarInfoPanel1Layout = new javax.swing.GroupLayout(CarInfoPanel1);
        CarInfoPanel1.setLayout(CarInfoPanel1Layout);
        CarInfoPanel1Layout.setHorizontalGroup(
            CarInfoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CarInfoPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel36)
                .addContainerGap(233, Short.MAX_VALUE))
        );
        CarInfoPanel1Layout.setVerticalGroup(
            CarInfoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CarInfoPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CarInfoPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addGap(19, 19, 19))
        );

        LeftPanel.add(CarInfoPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 400, 70));

        getContentPane().add(LeftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 880));

        background.setBackground(new java.awt.Color(242, 241, 241));
        background.setAutoscrolls(true);
        background.setFocusCycleRoot(true);
        background.setFocusTraversalPolicyProvider(true);
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        decoration.setBackground(new java.awt.Color(85, 65, 120));

        carInfo.setBackground(new java.awt.Color(64, 43, 100));

        plate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plate1ActionPerformed(evt);
            }
        });

        plate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plate2ActionPerformed(evt);
            }
        });

        plate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plate3ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Brand:");

        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Fuel Type:");

        brand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Alfa Romeo", "Audi", "BMC", "BMW", "Chevrolet", "Citroen", "Dacia", "Ducati", "Ferrari", "Fiat", "Ford", "Honda", "Hyundai", "Jaguar", "Jeep", "Karsan", "Kia", "Lada", "Lamborghini", "Land Rover", "Mazda", "Mercedes Benz", "MINI", "Nissan", "Opel", "Peugeot", "Renault", "Seat", "Skoda", "Subaru", "Tesla", "Toyota", "Volkswagen", "Volvo", "Yamaha" }));

        fuel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Diesel", "Gasoline", "LPG" }));

        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Year of Production:");

        jLabel13.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Vehicle Type:");

        jLabel14.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("km:");

        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));

        buttonGroup1.add(privilegedRB);
        privilegedRB.setForeground(new java.awt.Color(255, 255, 255));
        privilegedRB.setText("Privileged");
        privilegedRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                standardRBMouseClicked(evt);
            }
        });
        privilegedRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                privilegedRBActionPerformed(evt);
            }
        });

        buttonGroup1.add(standardRB);
        standardRB.setForeground(new java.awt.Color(255, 255, 255));
        standardRB.setText("Standard");
        standardRB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                standardRBMouseClicked(evt);
            }
        });
        standardRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standardRBActionPerformed(evt);
            }
        });

        kmTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kmTFActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Plate:");

        javax.swing.GroupLayout carInfoLayout = new javax.swing.GroupLayout(carInfo);
        carInfo.setLayout(carInfoLayout);
        carInfoLayout.setHorizontalGroup(
            carInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, carInfoLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(carInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(carInfoLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fuel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(carInfoLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(plate1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(plate2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(plate3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(carInfoLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 376, Short.MAX_VALUE)
                .addGroup(carInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(carInfoLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(year, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(carInfoLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kmTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(carInfoLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(4, 4, 4)
                        .addComponent(standardRB)
                        .addGap(18, 18, 18)
                        .addComponent(privilegedRB)))
                .addGap(58, 58, 58))
        );
        carInfoLayout.setVerticalGroup(
            carInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(carInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(carInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(carInfoLayout.createSequentialGroup()
                        .addGroup(carInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, carInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(plate1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(plate3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(plate2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(carInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(brand))
                        .addGap(12, 12, 12)
                        .addGroup(carInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(fuel)))
                    .addGroup(carInfoLayout.createSequentialGroup()
                        .addGroup(carInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(year))
                        .addGap(18, 18, 18)
                        .addGroup(carInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(privilegedRB, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(standardRB, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(carInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kmTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addContainerGap())
        );

        extendedCarInfo.setBackground(new java.awt.Color(64, 43, 100));

        typecCMB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", " " }));
        typecCMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typecCMBActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Vehicle:");

        AmbulanceEx.setBackground(new java.awt.Color(255, 51, 102));

        aid6.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        aid6.setForeground(new java.awt.Color(255, 255, 255));
        aid6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aid6.setText("Do you have proper equipments(like sirens) in your car?");

        aid7.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        aid7.setForeground(new java.awt.Color(255, 255, 255));
        aid7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aid7.setText("What is the type of vehichle tire?");

        TyreCMB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Standard", "Pallette" }));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8_ambulance_40px.png"))); // NOI18N

        continueLBLA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        continueLBLA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8_next_page_64px.png"))); // NOI18N
        continueLBLA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continueLBLAMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AmbulanceExLayout = new javax.swing.GroupLayout(AmbulanceEx);
        AmbulanceEx.setLayout(AmbulanceExLayout);
        AmbulanceExLayout.setHorizontalGroup(
            AmbulanceExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AmbulanceExLayout.createSequentialGroup()
                .addGroup(AmbulanceExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AmbulanceExLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aid7))
                    .addGroup(AmbulanceExLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(equipmentChc)
                        .addGap(6, 6, 6)
                        .addComponent(aid6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
                        .addGroup(AmbulanceExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TyreCMB, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AmbulanceExLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(continueLBLA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(92, 92, 92)))
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AmbulanceExLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        AmbulanceExLayout.setVerticalGroup(
            AmbulanceExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AmbulanceExLayout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aid7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AmbulanceExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TyreCMB, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aid6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equipmentChc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(continueLBLA)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        MotorEx.setBackground(new java.awt.Color(0, 204, 204));

        aid2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        aid2.setForeground(new java.awt.Color(255, 255, 255));
        aid2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aid2.setText("Do you have first aid kit?");

        fine2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        fine2.setForeground(new java.awt.Color(255, 255, 255));
        fine2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fine2.setText("Do you have traffic fine?");

        exh2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        exh2.setForeground(new java.awt.Color(255, 255, 255));
        exh2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exh2.setText("Has your exhaust inspection done?");

        aid3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        aid3.setForeground(new java.awt.Color(255, 255, 255));
        aid3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aid3.setText("Engine CC:");

        motorCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motorCCActionPerformed(evt);
            }
        });

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8_motorcycle_40px.png"))); // NOI18N

        continueLBLM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        continueLBLM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8_next_page_64px.png"))); // NOI18N
        continueLBLM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continueLBLMMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MotorExLayout = new javax.swing.GroupLayout(MotorEx);
        MotorEx.setLayout(MotorExLayout);
        MotorExLayout.setHorizontalGroup(
            MotorExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MotorExLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(MotorExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MotorExLayout.createSequentialGroup()
                        .addComponent(fineC2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fine2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fineAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 310, Short.MAX_VALUE)
                        .addComponent(aid3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(motorCC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(MotorExLayout.createSequentialGroup()
                        .addComponent(aidC2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(aid2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(MotorExLayout.createSequentialGroup()
                        .addComponent(exhC2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exh2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(continueLBLM, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        MotorExLayout.setVerticalGroup(
            MotorExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MotorExLayout.createSequentialGroup()
                .addGroup(MotorExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MotorExLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(MotorExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(aidC2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(aid2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MotorExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fineC2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE)
                    .addGroup(MotorExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(aid3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(motorCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MotorExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fine2)
                        .addComponent(fineAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(MotorExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MotorExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(exhC2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exh2))
                    .addComponent(continueLBLM))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        CarEx.setBackground(new java.awt.Color(113, 32, 89));

        aid1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        aid1.setForeground(new java.awt.Color(255, 255, 255));
        aid1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aid1.setText("Do you have first aid kit?");

        fine1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        fine1.setForeground(new java.awt.Color(255, 255, 255));
        fine1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fine1.setText("Do you have traffic fine?");

        fineC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fineC1MouseClicked(evt);
            }
        });

        exh1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        exh1.setForeground(new java.awt.Color(255, 255, 255));
        exh1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exh1.setText("Has your exhaust inspection done?");

        exhC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exhC1ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Seat Count:");

        seatCount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 7, 1));

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8_car_40px_1.png"))); // NOI18N

        continueLBLC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        continueLBLC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8_next_page_64px.png"))); // NOI18N
        continueLBLC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continueLBLCMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CarExLayout = new javax.swing.GroupLayout(CarEx);
        CarEx.setLayout(CarExLayout);
        CarExLayout.setHorizontalGroup(
            CarExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CarExLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(CarExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CarExLayout.createSequentialGroup()
                        .addComponent(aidC1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(aid1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(CarExLayout.createSequentialGroup()
                        .addComponent(fineC1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fine1)
                        .addGap(18, 18, 18)
                        .addComponent(fineAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 324, Short.MAX_VALUE)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seatCount, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))
                    .addGroup(CarExLayout.createSequentialGroup()
                        .addComponent(exhC1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exh1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(continueLBLC, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CarExLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        CarExLayout.setVerticalGroup(
            CarExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CarExLayout.createSequentialGroup()
                .addGroup(CarExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CarExLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(aidC1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CarExLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aid1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CarExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CarExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(fineC1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(CarExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fine1)
                            .addComponent(fineAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CarExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CarExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(exhC1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exh1))
                    .addComponent(continueLBLC))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        TruckEx.setBackground(new java.awt.Color(255, 191, 0));

        aid4.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        aid4.setForeground(new java.awt.Color(255, 255, 255));
        aid4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aid4.setText("Do you have first aid kit?");

        fine3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        fine3.setForeground(new java.awt.Color(255, 255, 255));
        fine3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fine3.setText("Do you have traffic fine?");

        exh3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        exh3.setForeground(new java.awt.Color(255, 255, 255));
        exh3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exh3.setText("Has your exhaust inspection done?");

        aid5.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        aid5.setForeground(new java.awt.Color(255, 255, 255));
        aid5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aid5.setText("Type:");

        truckTypeCMB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Van", "Truck", "Lorry", "Tractor" }));
        truckTypeCMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                truckTypeCMBActionPerformed(evt);
            }
        });

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8_truck_40px_1.png"))); // NOI18N

        continueLBLT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        continueLBLT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8_next_page_64px.png"))); // NOI18N
        continueLBLT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continueLBLTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout TruckExLayout = new javax.swing.GroupLayout(TruckEx);
        TruckEx.setLayout(TruckExLayout);
        TruckExLayout.setHorizontalGroup(
            TruckExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TruckExLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(TruckExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TruckExLayout.createSequentialGroup()
                        .addComponent(fineC3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fine3)
                        .addGap(18, 18, 18)
                        .addComponent(fineAmount2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 326, Short.MAX_VALUE)
                        .addComponent(aid5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(truckTypeCMB, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153))
                    .addGroup(TruckExLayout.createSequentialGroup()
                        .addComponent(aidC3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(aid4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(TruckExLayout.createSequentialGroup()
                        .addComponent(exhC3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exh3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(continueLBLT, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))))
        );
        TruckExLayout.setVerticalGroup(
            TruckExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TruckExLayout.createSequentialGroup()
                .addGroup(TruckExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TruckExLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(TruckExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(aidC3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(aid4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TruckExLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TruckExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fineC3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE)
                    .addGroup(TruckExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(aid5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(truckTypeCMB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TruckExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fine3)
                        .addComponent(fineAmount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TruckExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TruckExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(exhC3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exh3))
                    .addComponent(continueLBLT))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        FiretruckEx.setBackground(new java.awt.Color(51, 153, 255));

        aid10.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        aid10.setForeground(new java.awt.Color(255, 255, 255));
        aid10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aid10.setText("Do you have proper equipments(like sirens) in your car?");

        aid11.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        aid11.setForeground(new java.awt.Color(255, 255, 255));
        aid11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aid11.setText("Does Fire Truck has lift?");

        aid12.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        aid12.setForeground(new java.awt.Color(255, 255, 255));
        aid12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aid12.setText("What is the water tank capacity?");

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8_fire_truck_40px.png"))); // NOI18N

        continueLBLFT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        continueLBLFT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8_next_page_64px.png"))); // NOI18N
        continueLBLFT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continueLBLFTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout FiretruckExLayout = new javax.swing.GroupLayout(FiretruckEx);
        FiretruckEx.setLayout(FiretruckExLayout);
        FiretruckExLayout.setHorizontalGroup(
            FiretruckExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FiretruckExLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(FiretruckExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eqFt)
                    .addComponent(lift))
                .addGap(6, 6, 6)
                .addGroup(FiretruckExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FiretruckExLayout.createSequentialGroup()
                        .addGroup(FiretruckExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FiretruckExLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FiretruckExLayout.createSequentialGroup()
                                .addComponent(aid10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                                .addComponent(aid12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tankCapacityTF, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27))
                    .addGroup(FiretruckExLayout.createSequentialGroup()
                        .addComponent(aid11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(continueLBLFT)
                        .addGap(161, 161, 161))))
        );
        FiretruckExLayout.setVerticalGroup(
            FiretruckExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FiretruckExLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FiretruckExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FiretruckExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(aid10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eqFt))
                    .addGroup(FiretruckExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(aid12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tankCapacityTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(FiretruckExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aid11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lift)
                    .addComponent(continueLBLFT))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout extendedCarInfoLayout = new javax.swing.GroupLayout(extendedCarInfo);
        extendedCarInfo.setLayout(extendedCarInfoLayout);
        extendedCarInfoLayout.setHorizontalGroup(
            extendedCarInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(extendedCarInfoLayout.createSequentialGroup()
                .addGap(386, 386, 386)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(typecCMB, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(399, Short.MAX_VALUE))
            .addGroup(extendedCarInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(CarEx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(extendedCarInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(MotorEx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(extendedCarInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(TruckEx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(extendedCarInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(AmbulanceEx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(extendedCarInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(FiretruckEx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        extendedCarInfoLayout.setVerticalGroup(
            extendedCarInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(extendedCarInfoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(extendedCarInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(typecCMB))
                .addGap(253, 253, 253))
            .addGroup(extendedCarInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(extendedCarInfoLayout.createSequentialGroup()
                    .addComponent(CarEx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1, Short.MAX_VALUE)))
            .addGroup(extendedCarInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(extendedCarInfoLayout.createSequentialGroup()
                    .addComponent(MotorEx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1, Short.MAX_VALUE)))
            .addGroup(extendedCarInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(extendedCarInfoLayout.createSequentialGroup()
                    .addComponent(TruckEx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1, Short.MAX_VALUE)))
            .addGroup(extendedCarInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(extendedCarInfoLayout.createSequentialGroup()
                    .addComponent(AmbulanceEx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(extendedCarInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(extendedCarInfoLayout.createSequentialGroup()
                    .addComponent(FiretruckEx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1, Short.MAX_VALUE)))
        );

        thirdPanel.setBackground(new java.awt.Color(204, 204, 255));

        repetitionInfo4.setBackground(new java.awt.Color(64, 43, 100));
        repetitionInfo4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Last Inspection Date:");
        repetitionInfo4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        repD5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        repD5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repD1ActionPerformed(evt);
            }
        });
        repetitionInfo4.add(repD5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, -1, 38));

        repM5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020" }));
        repetitionInfo4.add(repM5, new org.netbeans.lib.awtextra.AbsoluteConstraints(689, 30, 70, 40));

        repY5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "Jun", "July", "August", "September", "Octaber", "November", "December" }));
        repY5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repY1ActionPerformed(evt);
            }
        });
        repetitionInfo4.add(repY5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 80, 40));

        faultCount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 4, 1));
        repetitionInfo4.add(faultCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 45, 29));

        jLabel27.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Major Fault Count:");
        repetitionInfo4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        faultCntBTN.setText("Confirm");
        faultCntBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faultCntBTNActionPerformed(evt);
            }
        });
        repetitionInfo4.add(faultCntBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, -1, 29));

        ffLBL5.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        ffLBL5.setForeground(new java.awt.Color(255, 255, 255));
        ffLBL5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ffLBL5.setText("First Fault:");
        repetitionInfo4.add(ffLBL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        sfLBL5.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        sfLBL5.setForeground(new java.awt.Color(255, 255, 255));
        sfLBL5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sfLBL5.setText("Second Fault:");
        repetitionInfo4.add(sfLBL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        tfLBL5.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        tfLBL5.setForeground(new java.awt.Color(255, 255, 255));
        tfLBL5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tfLBL5.setText("Third Fault:");
        repetitionInfo4.add(tfLBL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, -1, -1));

        fofLBL5.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        fofLBL5.setForeground(new java.awt.Color(255, 255, 255));
        fofLBL5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fofLBL5.setText("Forth Fault:");
        repetitionInfo4.add(fofLBL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, -1, -1));
        repetitionInfo4.add(ffTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 120, 29));
        repetitionInfo4.add(sfTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 120, 29));
        repetitionInfo4.add(tfTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 160, 120, 29));
        repetitionInfo4.add(fofTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 200, 120, 29));

        nextLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nextLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8_next_page_70px.png"))); // NOI18N
        nextLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextLBLMouseClicked(evt);
            }
        });
        repetitionInfo4.add(nextLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 80, 70));

        servicesInfo.setBackground(new java.awt.Color(64, 43, 100));
        servicesInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        possibleFaults.setEditable(false);
        possibleFaults.setColumns(20);
        possibleFaults.setRows(5);
        jScrollPane2.setViewportView(possibleFaults);

        servicesInfo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 920, 200));

        aid8.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        aid8.setForeground(new java.awt.Color(255, 255, 255));
        aid8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aid8.setText("Do you want to get pre check service?");
        servicesInfo.add(aid8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, -1, -1));

        aid9.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        aid9.setForeground(new java.awt.Color(255, 255, 255));
        aid9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aid9.setText("City:");
        servicesInfo.add(aid9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, 30));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Brake System check", "Wheel System check", "Illumination System check", "Suspension System check", "Tyre check", "Seatbelt check", "Pick-up from everwhere", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        servicesInfo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 294, 128));

        aid13.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        aid13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        servicesInfo.add(aid13, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 276, -1, -1));

        aid14.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        aid14.setForeground(new java.awt.Color(255, 255, 255));
        aid14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aid14.setText("Do you want to get vallet service?");
        servicesInfo.add(aid14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, -1, -1));
        servicesInfo.add(precheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, -1, -1));
        servicesInfo.add(vallet, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, -1, -1));

        aid15.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        aid15.setForeground(new java.awt.Color(255, 255, 255));
        aid15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aid15.setText("Possible Faults");
        servicesInfo.add(aid15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, 40));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8_engine_30px.png"))); // NOI18N
        servicesInfo.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 40));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        servicesInfo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 10, 210));

        addBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8_add_70px.png"))); // NOI18N
        addBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBTNMouseClicked(evt);
            }
        });
        servicesInfo.add(addBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 90, 70, 60));

        aid17.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        aid17.setForeground(new java.awt.Color(255, 255, 255));
        aid17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aid17.setText("Advantages of Pre Check and Vallet Service");
        servicesInfo.add(aid17, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, 26));
        servicesInfo.add(cityTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 130, 30));

        aid18.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        aid18.setForeground(new java.awt.Color(255, 255, 255));
        aid18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aid18.setText("Date:");
        servicesInfo.add(aid18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, 60));

        aid19.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        aid19.setForeground(new java.awt.Color(255, 255, 255));
        aid19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aid19.setText("Clock:");
        servicesInfo.add(aid19, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, 60));

        clockCMB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30" }));
        servicesInfo.add(clockCMB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 70, 40));

        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayrepD1ActionPerformed(evt);
            }
        });
        servicesInfo.add(day, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, 38));

        yy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", " " }));
        servicesInfo.add(yy, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 70, 40));

        mm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "Jun", "July", "August", "September", "Octaber", "November", "December" }));
        mm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmrepY1ActionPerformed(evt);
            }
        });
        servicesInfo.add(mm, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 80, 40));

        javax.swing.GroupLayout thirdPanelLayout = new javax.swing.GroupLayout(thirdPanel);
        thirdPanel.setLayout(thirdPanelLayout);
        thirdPanelLayout.setHorizontalGroup(
            thirdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(servicesInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE)
            .addGroup(thirdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(repetitionInfo4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE))
        );
        thirdPanelLayout.setVerticalGroup(
            thirdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(servicesInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(thirdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(thirdPanelLayout.createSequentialGroup()
                    .addComponent(repetitionInfo4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        search.setBackground(new java.awt.Color(64, 43, 100));

        jLabel28.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Search Plate");

        searchCMB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchCMB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "06BB44", "07SS77", "11DD33" }));
        searchCMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCMBActionPerformed(evt);
            }
        });

        searchTA.setEditable(false);
        searchTA.setBackground(new java.awt.Color(85, 65, 120));
        searchTA.setColumns(20);
        searchTA.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        searchTA.setForeground(new java.awt.Color(255, 255, 255));
        searchTA.setRows(5);
        jScrollPane3.setViewportView(searchTA);

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8_search_40px.png"))); // NOI18N

        javax.swing.GroupLayout searchLayout = new javax.swing.GroupLayout(search);
        search.setLayout(searchLayout);
        searchLayout.setHorizontalGroup(
            searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchLayout.createSequentialGroup()
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchLayout.createSequentialGroup()
                        .addContainerGap(36, Short.MAX_VALUE)
                        .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(searchLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel28))
                            .addGroup(searchLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(searchCMB, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93))
                    .addGroup(searchLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        searchLayout.setVerticalGroup(
            searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(searchLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchCMB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        delete.setBackground(new java.awt.Color(64, 43, 100));

        jLabel29.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Delete Plate");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        deleteCMB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteCMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCMBActionPerformed(evt);
            }
        });

        deleteTA.setEditable(false);
        deleteTA.setBackground(new java.awt.Color(85, 65, 120));
        deleteTA.setColumns(20);
        deleteTA.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        deleteTA.setForeground(new java.awt.Color(255, 255, 255));
        deleteTA.setRows(5);
        jScrollPane4.setViewportView(deleteTA);

        deleteBTN.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        deleteBTN.setText("Delete");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8_delete_bin_40px.png"))); // NOI18N

        javax.swing.GroupLayout deleteLayout = new javax.swing.GroupLayout(delete);
        delete.setLayout(deleteLayout);
        deleteLayout.setHorizontalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteLayout.createSequentialGroup()
                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deleteLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel29))
                    .addGroup(deleteLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(deleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(deleteLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(deleteLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(deleteCMB, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(deleteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        deleteLayout.setVerticalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteCMB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        result.setBackground(new java.awt.Color(64, 43, 100));

        aid16.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        aid16.setForeground(new java.awt.Color(255, 255, 255));
        aid16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aid16.setText("Final Result");

        jScrollPane5.setBorder(null);

        resultTable.setAutoCreateRowSorter(true);
        resultTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        resultTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plate", "Type", "Brand", "Model", "City", "Date", "Clock", "Repetition", "Vallet Service", "Pre Check Service", "Final Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        resultTable.setGridColor(new java.awt.Color(255, 255, 255));
        resultTable.setIntercellSpacing(new java.awt.Dimension(5, 5));
        resultTable.setRowHeight(30);
        resultTable.setSelectionBackground(new java.awt.Color(255, 153, 153));
        resultTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(resultTable);
        if (resultTable.getColumnModel().getColumnCount() > 0) {
            resultTable.getColumnModel().getColumn(0).setResizable(false);
            resultTable.getColumnModel().getColumn(0).setPreferredWidth(23);
            resultTable.getColumnModel().getColumn(1).setResizable(false);
            resultTable.getColumnModel().getColumn(1).setPreferredWidth(30);
            resultTable.getColumnModel().getColumn(2).setResizable(false);
            resultTable.getColumnModel().getColumn(2).setPreferredWidth(45);
            resultTable.getColumnModel().getColumn(3).setResizable(false);
            resultTable.getColumnModel().getColumn(3).setPreferredWidth(8);
            resultTable.getColumnModel().getColumn(4).setResizable(false);
            resultTable.getColumnModel().getColumn(4).setPreferredWidth(40);
            resultTable.getColumnModel().getColumn(5).setResizable(false);
            resultTable.getColumnModel().getColumn(5).setPreferredWidth(60);
            resultTable.getColumnModel().getColumn(6).setResizable(false);
            resultTable.getColumnModel().getColumn(6).setPreferredWidth(8);
            resultTable.getColumnModel().getColumn(7).setResizable(false);
            resultTable.getColumnModel().getColumn(7).setPreferredWidth(15);
            resultTable.getColumnModel().getColumn(8).setResizable(false);
            resultTable.getColumnModel().getColumn(8).setPreferredWidth(20);
            resultTable.getColumnModel().getColumn(9).setResizable(false);
            resultTable.getColumnModel().getColumn(9).setPreferredWidth(20);
            resultTable.getColumnModel().getColumn(10).setResizable(false);
            resultTable.getColumnModel().getColumn(10).setPreferredWidth(25);
        }

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/icons8_tasklist_40px.png"))); // NOI18N

        javax.swing.GroupLayout resultLayout = new javax.swing.GroupLayout(result);
        result.setLayout(resultLayout);
        resultLayout.setHorizontalGroup(
            resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultLayout.createSequentialGroup()
                .addGroup(resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resultLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(aid16))
                    .addGroup(resultLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(resultLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        resultLayout.setVerticalGroup(
            resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(aid16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout decorationLayout = new javax.swing.GroupLayout(decoration);
        decoration.setLayout(decorationLayout);
        decorationLayout.setHorizontalGroup(
            decorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(decorationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(decorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(thirdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(extendedCarInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(carInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(1157, Short.MAX_VALUE))
            .addGroup(decorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(decorationLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1155, Short.MAX_VALUE)))
            .addGroup(decorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(decorationLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1155, Short.MAX_VALUE)))
            .addGroup(decorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(decorationLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1156, Short.MAX_VALUE)))
        );
        decorationLayout.setVerticalGroup(
            decorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(decorationLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(carInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(extendedCarInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(thirdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(435, Short.MAX_VALUE))
            .addGroup(decorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(decorationLayout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(891, Short.MAX_VALUE)))
            .addGroup(decorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(decorationLayout.createSequentialGroup()
                    .addGap(415, 415, 415)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(540, Short.MAX_VALUE)))
            .addGroup(decorationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(decorationLayout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(680, Short.MAX_VALUE)))
        );

        getContentPane().add(decoration, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CarInfoPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CarInfoPanelMouseClicked
        setColor(CarInfoPanel);
        resetColor(AppRepPanel);
        resetColor(ServicesPanel);
        resetColor(sdPanel);
        resetColor(ResultPanel1);
        closeAll();
        carInfo.setVisible(true);
        extendedCarInfo.setVisible(true);
        possibleFaults.setText("");
        message.setText("");
        message2.setText("");
         typecCMB.setModel(new DefaultComboBoxModel(defaults)); 
         addBTN.setVisible(true);
         fillServices();
            jLabel27.setVisible(true);
            faultCount.setVisible(true);
            faultCntBTN.setVisible(true);
            fltcounter = 0;
             continueLBLC.setVisible(true);
             continueLBLFT.setVisible(true);
             continueLBLA.setVisible(true);
             continueLBLM.setVisible(true);
             continueLBLT.setVisible(true);
             int rows = resultTable.getRowCount();
                for(int i=0;i<rows;i++)
               ((DefaultTableModel)resultTable.getModel()).removeRow(i);
                
        if(typecCMB.getSelectedItem().toString().equalsIgnoreCase("Car"))
        {
         continueLBLC.setVisible(false);
        }
        if(typecCMB.getSelectedItem().toString().equalsIgnoreCase("Ambulance"))
        {
         continueLBLA.setVisible(false);
        }
        if(typecCMB.getSelectedItem().toString().equalsIgnoreCase("Motor"))
        {
         continueLBLM.setVisible(false);
        }
        if(typecCMB.getSelectedItem().toString().equalsIgnoreCase("Truck"))
        {
         continueLBLT.setVisible(false);
        }
        if(typecCMB.getSelectedItem().toString().equalsIgnoreCase("Firetruck"))
        {
         continueLBLFT.setVisible(false);
        }
            
            ResultPanel2.setVisible(false);
            ResultPanel1.setVisible(true);
    }//GEN-LAST:event_CarInfoPanelMouseClicked

    private void AppRepPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AppRepPanelMouseClicked
        
        
        String platefirst = plate1.getText();
        String platemid = plate2.getText();
        String platelast = plate3.getText();
        String plateFull = platefirst + platemid + platelast;
        
        if(
               plate1.getText().equalsIgnoreCase("") ||
               plate2.getText().equalsIgnoreCase("") ||
               plate3.getText().equalsIgnoreCase("") ||
               fuel.getSelectedItem().toString().equalsIgnoreCase("Select") ||
               year.getSelectedItem().toString().equalsIgnoreCase("Select") ||
               brand.getSelectedItem().toString().equalsIgnoreCase("Select") ||
               typecCMB.getSelectedItem().toString().equalsIgnoreCase("Select") ||
               kmTF.getText().equalsIgnoreCase("")
                ){
            message2.setText("Please fill the all fields to continue!");
        }
        
        else if(VehicleSys.checkPlate(plateFull))
                message.setText("There is a appointment with this plate!");
           
        
        else{
            
            CarInfoPanel1.setVisible(true);
            CarInfoPanel.setVisible(false);
             message2.setText("");
             message.setText("");
        setColor(AppRepPanel);
        resetColor(CarInfoPanel);
        resetColor(CarInfoPanel1);
        resetColor(ServicesPanel);
        resetColor(sdPanel);
        resetColor(ResultPanel1);
        
        int rows = resultTable.getRowCount();
                for(int i=0;i<rows;i++)
               ((DefaultTableModel)resultTable.getModel()).removeRow(i);
         
        closeAllRepSer();
        servicesInfo.setVisible(false);
        carInfo.setVisible(true);
        extendedCarInfo.setVisible(true);
        thirdPanel.setVisible(true);
        repetitionInfo4.setVisible(true);
        
        
        if(typecCMB.getSelectedItem().toString().equalsIgnoreCase("Car"))
        {
         continueLBLC.setVisible(false);
        }
        if(typecCMB.getSelectedItem().toString().equalsIgnoreCase("Ambulance"))
        {
         continueLBLA.setVisible(false);
        }
        if(typecCMB.getSelectedItem().toString().equalsIgnoreCase("Motor"))
        {
         continueLBLM.setVisible(false);
        }
        if(typecCMB.getSelectedItem().toString().equalsIgnoreCase("Truck"))
        {
         continueLBLT.setVisible(false);
        }
        if(typecCMB.getSelectedItem().toString().equalsIgnoreCase("Firetruck"))
        {
         continueLBLFT.setVisible(false);
        }
        
       }
        
    }//GEN-LAST:event_AppRepPanelMouseClicked

    private void ServicesPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ServicesPanelMouseClicked
        
        
        String platefirst = plate1.getText();
        String platemid = plate2.getText();
        String platelast = plate3.getText();
        String plateFull = platefirst + platemid + platelast;
        
        if(
               plate1.getText().equalsIgnoreCase("") ||
               plate2.getText().equalsIgnoreCase("") ||
               plate3.getText().equalsIgnoreCase("") ||
               fuel.getSelectedItem().toString().equalsIgnoreCase("Select") ||
               year.getSelectedItem().toString().equalsIgnoreCase("Select") ||
               brand.getSelectedItem().toString().equalsIgnoreCase("Select") ||
               typecCMB.getSelectedItem().toString().equalsIgnoreCase("Select") ||
               kmTF.getText().equalsIgnoreCase("")
                ){
            message2.setText("Please fill the all fields to continue!");
        }
        
        else if(VehicleSys.checkPlate(plateFull))
                message.setText("There is a appointment with this plate!");
        
        else{
            fillServices();
            message2.setText("");
             message.setText("");
        setColor(ServicesPanel);
        resetColor(CarInfoPanel);
        resetColor(CarInfoPanel1);
        resetColor(ServicesPanel);
        resetColor(sdPanel);
        resetColor(ResultPanel1);
        resetColor(ResultPanel2);
        
        int rows = resultTable.getRowCount();
                for(int i=0;i<rows;i++)
               ((DefaultTableModel)resultTable.getModel()).removeRow(i);
         
            
            CarInfoPanel1.setVisible(true);
            CarInfoPanel.setVisible(false);
        addBTN.setVisible(true);
        closeAllRepSer();
        repetitionInfo4.setVisible(false);
        carInfo.setVisible(true);
        extendedCarInfo.setVisible(true);
        thirdPanel.setVisible(true);
        servicesInfo.setVisible(true);
        addBTN.setVisible(true);
       }
    }//GEN-LAST:event_ServicesPanelMouseClicked

    private void sdPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sdPanelMouseClicked
        setColor(sdPanel);
        resetColor(CarInfoPanel);
        resetColor(CarInfoPanel1);
        resetColor(ServicesPanel);
        resetColor(AppRepPanel);
        resetColor(ResultPanel1);
        resetColor(ResultPanel2);
         
         message.setText("");
         searchTA.setText("");
         deleteTA.setText("");
         closeAll();
         
         int rows = resultTable.getRowCount();
                for(int i=0;i<rows;i++)
               ((DefaultTableModel)resultTable.getModel()).removeRow(i);
         
         CarInfoPanel1.setVisible(false);
            CarInfoPanel.setVisible(true);
         
         fillComboBoxSearch();
         fillComboBoxDelete();
         ResultPanel2.setVisible(false);
         ResultPanel1.setVisible(true);
         search.setVisible(true);
         delete.setVisible(true);
         
    }//GEN-LAST:event_sdPanelMouseClicked

    private void ResultPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResultPanel1MouseClicked
        setColor(ResultPanel1);
        setColor(ResultPanel2);
        resetColor(CarInfoPanel);
        resetColor(CarInfoPanel1);
        resetColor(ServicesPanel);
        resetColor(sdPanel);
         
        message.setText("");
        closeAll();
        
        CarInfoPanel1.setVisible(false);
            CarInfoPanel.setVisible(true);
        
        fillTable();
        result.setVisible(true);
        ResultPanel2.setVisible(true);
        ResultPanel1.setVisible(false);
    }//GEN-LAST:event_ResultPanel1MouseClicked

    private void deleteCMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCMBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteCMBActionPerformed

    public JComboBox getPlateCMB() {
        return searchCMB;
    }
    public JComboBox getPlateCMB2() {
        return deleteCMB;
    }
    
    public void fillComboBoxSearch() {
        getPlateCMB().setModel(new DefaultComboBoxModel(VehicleSys.getPlates()));
    }
     public void fillComboBoxDelete() {
        getPlateCMB2().setModel(new DefaultComboBoxModel(VehicleSys.getPlates()));
    }
 
    
    private void searchCMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCMBActionPerformed
        String searchPlate = (String)searchCMB.getSelectedItem();
       
         try {
            searchTA.setText(VehicleSys.searchPlate(searchPlate).toString());
                
            } catch (NullPointerException ex) {
               
                message.setText("There is nothing to show.");
                message2.setText("Please add vehicle information.");
                
            }
    }//GEN-LAST:event_searchCMBActionPerformed

    private void repY1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repY1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_repY1ActionPerformed

    private void repD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repD1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_repD1ActionPerformed

    private void truckTypeCMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_truckTypeCMBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_truckTypeCMBActionPerformed

    private void exhC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exhC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exhC1ActionPerformed

    private void motorCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motorCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_motorCCActionPerformed

    private void typecCMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typecCMBActionPerformed
        String n = typecCMB.getSelectedItem().toString();
        if (n.equalsIgnoreCase("Car")) {
            CarEx.setVisible(true);
            MotorEx.setVisible(false);
            TruckEx.setVisible(false);
            AmbulanceEx.setVisible(false);
            FiretruckEx.setVisible(false);
        } else if (n.equalsIgnoreCase("Motorcycle")) {
            CarEx.setVisible(false);
            MotorEx.setVisible(true);
            TruckEx.setVisible(false);
            AmbulanceEx.setVisible(false);
            FiretruckEx.setVisible(false);
        }
        else if (n.equalsIgnoreCase("Truck")) {
            CarEx.setVisible(false);
            MotorEx.setVisible(false);
            TruckEx.setVisible(true);
            AmbulanceEx.setVisible(false);
            FiretruckEx.setVisible(false);
        }
        else if (n.equalsIgnoreCase("Firetruck")) {
            CarEx.setVisible(false);
            MotorEx.setVisible(false);
            TruckEx.setVisible(false);
            AmbulanceEx.setVisible(false);
            FiretruckEx.setVisible(true);
        }
        else if (n.equalsIgnoreCase("Ambulance")) {
            CarEx.setVisible(false);
            MotorEx.setVisible(false);
            TruckEx.setVisible(false);
            AmbulanceEx.setVisible(true);
            FiretruckEx.setVisible(false);
        }
        else if (n.equalsIgnoreCase("Select")) {
            CarEx.setVisible(false);
            MotorEx.setVisible(false);
            TruckEx.setVisible(false);
            AmbulanceEx.setVisible(false);
            FiretruckEx.setVisible(false);
        }

    }//GEN-LAST:event_typecCMBActionPerformed

    private void kmTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kmTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kmTFActionPerformed

    private void standardRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standardRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_standardRBActionPerformed

    private void privilegedRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_privilegedRBActionPerformed
       fillComboBox();
    }//GEN-LAST:event_privilegedRBActionPerformed

    private void plate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plate3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plate3ActionPerformed

    private void plate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plate2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plate2ActionPerformed

    private void plate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plate1ActionPerformed

    private void faultCntBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faultCntBTNActionPerformed
        
        fltcounter++;
        int faultcnt = (Integer) faultCount.getValue();
        if(fltcounter == 1)
        {
            switch(faultcnt)
        {
            case 1: ffTF.setVisible(true);
                    ffLBL5.setVisible(true);
            break;
            
            case 2: ffTF.setVisible(true);
                    ffLBL5.setVisible(true);
                    sfTF.setVisible(true);
                    sfLBL5.setVisible(true);
            break;
            
            case 3: ffTF.setVisible(true);
                    ffLBL5.setVisible(true);
                    sfTF.setVisible(true);
                    sfLBL5.setVisible(true);
                    tfTF.setVisible(true);
                    tfLBL5.setVisible(true);
            break;
            
            case 4: ffTF.setVisible(true);
                    ffLBL5.setVisible(true);
                    sfTF.setVisible(true);
                    sfLBL5.setVisible(true);
                    tfTF.setVisible(true);
                    tfLBL5.setVisible(true);
                    fofTF.setVisible(true);
                    fofLBL5.setVisible(true);
            break;
            
        }
        
            jLabel27.setVisible(false);
            faultCount.setVisible(false);
            faultCntBTN.setVisible(false);
            nextLBL.setVisible(true);
            
        }
        
        
    }//GEN-LAST:event_faultCntBTNActionPerformed

    
    
    public void fillTable()
    {

        DefaultTableModel model = (DefaultTableModel) resultTable.getModel();



        Object rowData[] = new Object[11];

        for(int r = 0; r<VehicleSys.VehicleArray.size(); r++)
        {

            rowData[0] = VehicleSys.VehicleArray.get(r).plate;
            rowData[1] = VehicleSys.VehicleArray.get(r).type;
            rowData[2] = VehicleSys.VehicleArray.get(r).brand;
            rowData[3] = VehicleSys.VehicleArray.get(r).year;
            rowData[4] = VehicleSys.VehicleArray.get(r).city;
            rowData[5] = VehicleSys.VehicleArray.get(r).date;
            rowData[6] = VehicleSys.VehicleArray.get(r).time;
            rowData[7] = VehicleSys.VehicleArray.get(r).repetition;
            rowData[8] = VehicleSys.VehicleArray.get(r).valletService;
            rowData[9] = VehicleSys.VehicleArray.get(r).preCheckService;
            rowData[10] = VehicleSys.VehicleArray.get(r).price;
     model.addRow(rowData);
          
        }
             
        }
    
    
    private void nextLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextLBLMouseClicked
        setColor(ServicesPanel);
        resetColor(AppRepPanel);
        resetColor(CarInfoPanel);
        resetColor(CarInfoPanel1);
        resetColor(sdPanel);
        resetColor(ResultPanel1);
        
        closeAllRepSer();
        repetitionInfo4.setVisible(false);
        carInfo.setVisible(true);
        extendedCarInfo.setVisible(true);
        thirdPanel.setVisible(true);
        servicesInfo.setVisible(true);
    }//GEN-LAST:event_nextLBLMouseClicked

    private void fineC1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fineC1MouseClicked
        
    }//GEN-LAST:event_fineC1MouseClicked

    private void standardRBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_standardRBMouseClicked
        fillComboBox();
    }//GEN-LAST:event_standardRBMouseClicked

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
       
        
        try {
            String delPlate = deleteCMB.getSelectedItem().toString();
            deleteTA.setText(VehicleSys.searchPlate(delPlate).toString());
            Vehicle del0 = VehicleSys.removePlate(delPlate);
            if (del0 != null) {
            deleteTA.append("\nThis vehicle is deleted!!\n");
            deleteCMB.setModel(new DefaultComboBoxModel(VehicleSys.getPlates()));
            getPlateCMB().setModel(new DefaultComboBoxModel(VehicleSys.getPlates()));
            
             int rows = resultTable.getRowCount();
                for(int i=0;i<rows;i++)
               ((DefaultTableModel)resultTable.getModel()).removeRow(i);
            
        }
            
        } catch (NullPointerException ex) {
               
                message.setText("There is nothing to delete.");
                message2.setText("Please select/add vehicle information.");
                
            }
        
       /* if (del0 != null) {
            deleteTA.append("\nThis vehicle is deleted!!\n");
            deleteCMB.setModel(new DefaultComboBoxModel(VehicleSys.getPlates()));
            getPlateCMB().setModel(new DefaultComboBoxModel(VehicleSys.getPlates()));
            
        }*/
    }//GEN-LAST:event_deleteBTNActionPerformed

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jLabel32MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseMoved
       message2.setText("See You!");
    }//GEN-LAST:event_jLabel32MouseMoved

    private void jLabel32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseEntered
      
    }//GEN-LAST:event_jLabel32MouseEntered

    private void ResultPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResultPanel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultPanel2MouseClicked

    private void continueLBLAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continueLBLAMouseClicked
       String platefirst = plate1.getText();
        String platemid = plate2.getText();
        String platelast = plate3.getText();
        String plateFull = platefirst + platemid + platelast;
        
        if(
               plate1.getText().equalsIgnoreCase("") ||
               plate2.getText().equalsIgnoreCase("") ||
               plate3.getText().equalsIgnoreCase("") ||
               fuel.getSelectedItem().toString().equalsIgnoreCase("Select") ||
               year.getSelectedItem().toString().equalsIgnoreCase("Select") ||
               brand.getSelectedItem().toString().equalsIgnoreCase("Select") ||
               typecCMB.getSelectedItem().toString().equalsIgnoreCase("Select") ||
               kmTF.getText().equalsIgnoreCase("")
                ){
            message2.setText("Please fill the all fields to continue!");
        }
        
        else if(VehicleSys.checkPlate(plateFull))
                message.setText("There is a appointment with this plate!");
        
        else{
             message.setText("");
             message2.setText("");
        setColor(AppRepPanel);
        resetColor(CarInfoPanel);
        resetColor(ServicesPanel);
        resetColor(sdPanel);
        resetColor(ResultPanel1);
         
        closeAllRepSer();
        servicesInfo.setVisible(false);
        carInfo.setVisible(true);
        extendedCarInfo.setVisible(true);
        thirdPanel.setVisible(true);
        repetitionInfo4.setVisible(true);
        continueLBLA.setVisible(false);
        }
       
       
    }//GEN-LAST:event_continueLBLAMouseClicked

    private void continueLBLMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continueLBLMMouseClicked
      String platefirst = plate1.getText();
        String platemid = plate2.getText();
        String platelast = plate3.getText();
        String plateFull = platefirst + platemid + platelast;
        
        if(
               plate1.getText().equalsIgnoreCase("") ||
               plate2.getText().equalsIgnoreCase("") ||
               plate3.getText().equalsIgnoreCase("") ||
               fuel.getSelectedItem().toString().equalsIgnoreCase("Select") ||
               year.getSelectedItem().toString().equalsIgnoreCase("Select") ||
               brand.getSelectedItem().toString().equalsIgnoreCase("Select") ||
               typecCMB.getSelectedItem().toString().equalsIgnoreCase("Select") ||
               kmTF.getText().equalsIgnoreCase("")
                ){
            message2.setText("Please fill the all fields to continue!");
        }
        
        else if(VehicleSys.checkPlate(plateFull))
                message.setText("There is a appointment with this plate!");
        
        else{
             message.setText("");
             message2.setText("");
        setColor(AppRepPanel);
        resetColor(CarInfoPanel);
        resetColor(ServicesPanel);
        resetColor(sdPanel);
        resetColor(ResultPanel1);
         
        closeAllRepSer();
        servicesInfo.setVisible(false);
        carInfo.setVisible(true);
        extendedCarInfo.setVisible(true);
        thirdPanel.setVisible(true);
        repetitionInfo4.setVisible(true);
        continueLBLM.setVisible(false);
        }
    }//GEN-LAST:event_continueLBLMMouseClicked

    private void continueLBLCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continueLBLCMouseClicked
        String platefirst = plate1.getText();
        String platemid = plate2.getText();
        String platelast = plate3.getText();
        String plateFull = platefirst + platemid + platelast;
        
        if(
               plate1.getText().equalsIgnoreCase("") ||
               plate2.getText().equalsIgnoreCase("") ||
               plate3.getText().equalsIgnoreCase("") ||
               fuel.getSelectedItem().toString().equalsIgnoreCase("Select") ||
               year.getSelectedItem().toString().equalsIgnoreCase("Select") ||
               brand.getSelectedItem().toString().equalsIgnoreCase("Select") ||
               typecCMB.getSelectedItem().toString().equalsIgnoreCase("Select") ||
               kmTF.getText().equalsIgnoreCase("")
                ){
            message2.setText("Please fill the all fields to continue!");
        }
        
        else if(VehicleSys.checkPlate(plateFull))
                message.setText("There is a appointment with this plate!");
        
        else{
             message.setText("");
             message2.setText("");
        setColor(AppRepPanel);
        resetColor(CarInfoPanel);
        resetColor(ServicesPanel);
        resetColor(sdPanel);
        resetColor(ResultPanel1);
         
        closeAllRepSer();
        servicesInfo.setVisible(false);
        carInfo.setVisible(true);
        extendedCarInfo.setVisible(true);
        thirdPanel.setVisible(true);
        repetitionInfo4.setVisible(true);
        continueLBLC.setVisible(false);
        }
    }//GEN-LAST:event_continueLBLCMouseClicked

    private void continueLBLTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continueLBLTMouseClicked
       String platefirst = plate1.getText();
        String platemid = plate2.getText();
        String platelast = plate3.getText();
        String plateFull = platefirst + platemid + platelast;
        
        if(
               plate1.getText().equalsIgnoreCase("") ||
               plate2.getText().equalsIgnoreCase("") ||
               plate3.getText().equalsIgnoreCase("") ||
               fuel.getSelectedItem().toString().equalsIgnoreCase("Select") ||
               year.getSelectedItem().toString().equalsIgnoreCase("Select") ||
               brand.getSelectedItem().toString().equalsIgnoreCase("Select") ||
               typecCMB.getSelectedItem().toString().equalsIgnoreCase("Select") ||
               kmTF.getText().equalsIgnoreCase("")
                ){
            message2.setText("Please fill the all fields to continue!");
        }
        
        else if(VehicleSys.checkPlate(plateFull))
                message.setText("There is a appointment with this plate!");
        
        else{
             message.setText("");
             message2.setText("");
        setColor(AppRepPanel);
        resetColor(CarInfoPanel);
        resetColor(ServicesPanel);
        resetColor(sdPanel);
        resetColor(ResultPanel1);
         
        closeAllRepSer();
        servicesInfo.setVisible(false);
        carInfo.setVisible(true);
        extendedCarInfo.setVisible(true);
        thirdPanel.setVisible(true);
        repetitionInfo4.setVisible(true);
        continueLBLT.setVisible(false);
        }
    }//GEN-LAST:event_continueLBLTMouseClicked

    private void continueLBLFTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continueLBLFTMouseClicked
       String platefirst = plate1.getText();
        String platemid = plate2.getText();
        String platelast = plate3.getText();
        String plateFull = platefirst + platemid + platelast;
        
        if(
               plate1.getText().equalsIgnoreCase("") ||
               plate2.getText().equalsIgnoreCase("") ||
               plate3.getText().equalsIgnoreCase("") ||
               fuel.getSelectedItem().toString().equalsIgnoreCase("Select") ||
               year.getSelectedItem().toString().equalsIgnoreCase("Select") ||
               brand.getSelectedItem().toString().equalsIgnoreCase("Select") ||
               typecCMB.getSelectedItem().toString().equalsIgnoreCase("Select") ||
               kmTF.getText().equalsIgnoreCase("")
                ){
            message2.setText("Please fill the all fields to continue!");
        }
        
        else if(VehicleSys.checkPlate(plateFull))
                message.setText("There is a appointment with this plate!");
        
        else{
             message.setText("");
             message2.setText("");
        setColor(AppRepPanel);
        resetColor(CarInfoPanel);
        resetColor(ServicesPanel);
        resetColor(sdPanel);
        resetColor(ResultPanel1);
         
        closeAllRepSer();
        servicesInfo.setVisible(false);
        carInfo.setVisible(true);
        extendedCarInfo.setVisible(true);
        thirdPanel.setVisible(true);
        repetitionInfo4.setVisible(true);
        continueLBLFT.setVisible(false);
        }
    }//GEN-LAST:event_continueLBLFTMouseClicked

    private void CarInfoPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CarInfoPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CarInfoPanel1MouseClicked

    private void addBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBTNMouseClicked

        int yearFull;
        int km;
        double price=0.0;
        String aidkit ="Unknown", fine ="Unknown", exhaustStatus ="Unknown", typeOf = "Unknown";
        double fineA=0.0;
        String valletSer="Unknown", preCheckSer="Unknown", rep="Unknown", equipment="Unknown", liftA="Unknown";
        String typeTruck = "Unknown", aTyre = "Unknown";
        int cc = 0, seat = 0, tankCapacity =0;
        int faultcnt2 = (Integer) faultCount.getValue();
        String platefirst = plate1.getText();
        String platemid = plate2.getText();
        String platelast = plate3.getText();
        String plateFull = platefirst + platemid + platelast;

        String brandFull = brand.getSelectedItem().toString();
        String fuelFull = fuel.getSelectedItem().toString();
        yearFull = Integer.parseInt(year.getSelectedItem().toString());
        
            try{
                    km = Integer.parseInt(kmTF.getText());
                }
                catch(NumberFormatException ex){
                    message.setText("Enter the km in a proper format.");
                    km = Integer.parseInt(kmTF.getText());
                }

        if(cityTF.getText().equalsIgnoreCase(""))
        {
            message.setText("Please enter a city!");
        }
                
        else
        {
            
            
        if(!cityTF.getText().matches("[a-zA-Z]+"))
        {
            message.setText("Enter the city in a proper format.");
        }
        
        else{
            
             if(platefirst.matches("[a-zA-Z]+"))
        {
            message.setText("Enter the plate in a proper format.");
        }
            
        else
             {
                 
             if(platelast.matches("[a-zA-Z]+"))
        {
            message.setText("Enter the plate in a proper format.");
        }
             
        else
             {
                 
                 
                 if(!platemid.matches("[a-zA-Z]+"))
        {
            message.setText("Enter the plate in a proper format.");
        }
             
        else
             {
        
        //
        if (standardRB.isSelected()) {
            typeOf = "Standard";
        }
        else
        {
            typeOf = "Privileged";
        }
        //

        //
        if(equipmentChc.isSelected()){
            equipment = "Yes";
        }
        else{
            equipment = "No";
        }
        //
        if(typecCMB.getSelectedItem().toString().equalsIgnoreCase("Ambulance"))
        {
            aTyre = TyreCMB.getSelectedItem().toString();
        }
        //
        if(eqFt.isSelected()){
            equipment = "Yes";
        }
        else{
            equipment = "No";
        }
        //

        //
        if(lift.isSelected()){
            liftA = "Yes";
        }
        else{
            liftA = "No";
        }
        //
        if(typecCMB.getSelectedItem().toString().equalsIgnoreCase("Firetruck"))
        {
            
            try{
                     tankCapacity = Integer.parseInt(tankCapacityTF.getText());
                }
                catch(NumberFormatException ex){
                    message.setText("Enter the capacity in a proper format.");
                     tankCapacity = Integer.parseInt(tankCapacityTF.getText());
                }
        }
        //*
        if(aidC1.isSelected()){
            aidkit = "Yes";
        }
        else{
            aidkit = "No";
        }
        //
        //
        if(fineC1.isSelected()){
            fine = "Yes";
            fineA = Double.parseDouble(fineAmount.getText());
        }
        else{
            fine = "No";
        }
        //
        //
        if(exhC1.isSelected()){
            exhaustStatus = "Yes";
        }
        else{
            exhaustStatus = "No";
        }
        //
        if(typecCMB.getSelectedItem().toString().equalsIgnoreCase("Car"))
        {
            seat = (Integer) seatCount.getValue();
        }
        //*

        //
        if(aidC3.isSelected()){
            aidkit = "Yes";
        }
        else{
            aidkit = "No";
        }
        //
        //
        if(fineC3.isSelected()){
            fine = "Yes";
            fineA = Double.parseDouble(fineAmount2.getText());
        }
        else{
            fine = "No";
        }
        //
        //
        if(exhC3.isSelected()){
            exhaustStatus = "Yes";
        }
        else{
            exhaustStatus = "No";
        }
        //
        if(typecCMB.getSelectedItem().toString().equalsIgnoreCase("Truck"))
        {
            typeTruck = truckTypeCMB.getSelectedItem().toString();
        }
        //*

        //
        if(aidC2.isSelected()){
            aidkit = "Yes";
        }
        else{
            aidkit = "No";
        }
        //
        //
        if(fineC2.isSelected()){
            fine = "Yes";
            fineA = Double.parseDouble(fineAmount1.getText());
        }
        else{
            fine = "No";
        }
        //
        //
        if(exhC2.isSelected()){
            exhaustStatus = "Yes";
        }
        else{
            exhaustStatus = "No";
        }
        //
        if(typecCMB.getSelectedItem().toString().equalsIgnoreCase("Motorcycle"))
        {
           
            
             try{
                     cc = Integer.parseInt(motorCC.getText());
                }
                catch(NumberFormatException ex){
                    message.setText("Enter the CC in a proper format.");
                     cc = Integer.parseInt(motorCC.getText());
                }
        }
        if(precheck.isSelected())
        {
            preCheckSer = "Yes";
        }
        else{
            preCheckSer = "No";
        }

        if(vallet.isSelected())
        {
            valletSer = "Yes";
        }
        else{
            valletSer = "No";
        }

        String repD = repD5.getSelectedItem().toString();
        String repM = repM5.getSelectedItem().toString();
        String repY = repY5.getSelectedItem().toString();
        String repDate = repD+ repM + repY;
        CareHistory ch = new CareHistory();
        switch(faultcnt2)
        {
            case 0: rep = "No";
            break;

            case 1:
            rep = "Yes";
            ch.setLastInspectationDate(repDate);
            faults[0] = ffTF.getText();
            ch.getInput(faults,1);
            break;

            case 2:
            rep = "Yes";
            ch.setLastInspectationDate(repDate);
            faults[0] = ffTF.getText();
            faults[1] = sfTF.getText();
            ch.getInput(faults,2);
            break;

            case 3:
            rep = "Yes";
            ch.setLastInspectationDate(repDate);
            faults[0] = ffTF.getText();
            faults[1] = sfTF.getText();
            faults[2] = tfTF.getText();
            ch.getInput(faults,3);
            break;

            case 4:
            rep = "Yes";
            ch.setLastInspectationDate(repDate);
            faults[0] = ffTF.getText();
            faults[1] = sfTF.getText();
            faults[2] = tfTF.getText();
            faults[3] = fofTF.getText();
            ch.getInput(faults,4);

            break;
        }

        String city = cityTF.getText();

        String appD = day.getSelectedItem().toString();
        String appM = mm.getSelectedItem().toString();
        String appY = yy.getSelectedItem().toString();
        String appDate = appD+ appM + appY;

        String time = clockCMB.getSelectedItem().toString();

        if(typecCMB.getSelectedItem().toString().equalsIgnoreCase("Car"))
        {
            StandartVehicle carO = new Car(seat, aidkit, fine, fineA, exhaustStatus, plateFull, "Car", brandFull, yearFull, km, fuelFull, city, appDate, time, valletSer, preCheckSer, price, rep);
            VehicleSys.calcNewPrice();
            VehicleSys.VehicleArray.add(carO);
            possibleFaults.setText(carO.possibleFaults());
            carO.getHistInput(ch);
            if(rep.equalsIgnoreCase("Yes"))
            possibleFaults.append(carO.HistDisplay());
            
        }
        else if(typecCMB.getSelectedItem().toString().equalsIgnoreCase("Motorcycle"))
        {
            StandartVehicle motorO = new Motorcycle(cc, aidkit, fine, fineA, exhaustStatus, plateFull, "Motorcycle", brandFull, yearFull, km, fuelFull, city, appDate, time, valletSer, preCheckSer, price, rep);
            VehicleSys.calcNewPrice();
            VehicleSys.VehicleArray.add(motorO);
            possibleFaults.setText(motorO.possibleFaults());
            motorO.getHistInput(ch);
            if(rep.equalsIgnoreCase("Yes"))
            possibleFaults.append(motorO.HistDisplay());

        }
        else if(typecCMB.getSelectedItem().toString().equalsIgnoreCase("Truck"))
        {
            StandartVehicle Truck = new Truck(typeTruck, aidkit, fine, fineA, exhaustStatus, plateFull, "Truck", brandFull, yearFull, km, fuelFull, city, appDate, time, valletSer, preCheckSer, price, rep);
            VehicleSys.calcNewPrice();
            VehicleSys.VehicleArray.add(Truck);
            possibleFaults.setText(Truck.possibleFaults());
            Truck.getHistInput(ch);
            if(rep.equalsIgnoreCase("Yes"))
            possibleFaults.append(Truck.HistDisplay());

        }
        else if(typecCMB.getSelectedItem().toString().equalsIgnoreCase("Ambulance"))
        {
            PrivilegedVehicle Ambulance = new Ambulance(aTyre, equipment, plateFull, "Ambulance", brandFull, yearFull, km, fuelFull, city, appDate, time, valletSer, preCheckSer, price, rep);
            VehicleSys.calcNewPrice();
            VehicleSys.VehicleArray.add(Ambulance);
            possibleFaults.setText(Ambulance.possibleFaults());
            Ambulance.getHistInput(ch);
            if(rep.equalsIgnoreCase("Yes"))
            possibleFaults.append(Ambulance.HistDisplay());

        }
        else if(typecCMB.getSelectedItem().toString().equalsIgnoreCase("Firetruck"))
        {
            PrivilegedVehicle FireTruck = new FireTruck(tankCapacity, liftA, equipment, plateFull, "Firetruck", brandFull, yearFull, km, fuelFull, city, appDate, time, valletSer, preCheckSer, price, rep);
            VehicleSys.calcNewPrice();
            VehicleSys.VehicleArray.add(FireTruck);
            possibleFaults.setText(FireTruck.possibleFaults());
            FireTruck.getHistInput(ch);
            if(rep.equalsIgnoreCase("Yes"))
            possibleFaults.append(FireTruck.HistDisplay());

        }
        

        message.setText("Succesfully created.");
        addcnt++;
        message2.setText("Click Car Info to create a new one.");
        clear();
        addBTN.setVisible(false);
        CarInfoPanel1.setVisible(false);
        CarInfoPanel.setVisible(true);
        VehicleSys.calcNewPrice();
        clearServices();
        closeAllAfterAdd();
        }
        
             }
           }
        }
        
       }
    }//GEN-LAST:event_addBTNMouseClicked

    private void mmrepY1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmrepY1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mmrepY1ActionPerformed

    private void dayrepD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayrepD1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayrepD1ActionPerformed

    private void jLabel32MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseReleased
        
    }//GEN-LAST:event_jLabel32MouseReleased

    private void jLabel32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseExited
        message.setText("");
        message2.setText("");
    }//GEN-LAST:event_jLabel32MouseExited

    void setColor(JPanel panel){
        panel.setBackground(new Color(85,65,118));
    }
    
    void resetColor(JPanel panel){
        panel.setBackground(new Color(64,43,100));
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AmbulanceEx;
    private javax.swing.JPanel AppRepPanel;
    private javax.swing.JPanel CarEx;
    private javax.swing.JPanel CarInfoPanel;
    private javax.swing.JPanel CarInfoPanel1;
    private javax.swing.JPanel FiretruckEx;
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JPanel MotorEx;
    private javax.swing.JPanel ResultPanel1;
    private javax.swing.JPanel ResultPanel2;
    private javax.swing.JPanel ServicesPanel;
    private javax.swing.JPanel TruckEx;
    private javax.swing.JComboBox<String> TyreCMB;
    private javax.swing.JLabel addBTN;
    private javax.swing.JLabel aid1;
    private javax.swing.JLabel aid10;
    private javax.swing.JLabel aid11;
    private javax.swing.JLabel aid12;
    private javax.swing.JLabel aid13;
    private javax.swing.JLabel aid14;
    private javax.swing.JLabel aid15;
    private javax.swing.JLabel aid16;
    private javax.swing.JLabel aid17;
    private javax.swing.JLabel aid18;
    private javax.swing.JLabel aid19;
    private javax.swing.JLabel aid2;
    private javax.swing.JLabel aid3;
    private javax.swing.JLabel aid4;
    private javax.swing.JLabel aid5;
    private javax.swing.JLabel aid6;
    private javax.swing.JLabel aid7;
    private javax.swing.JLabel aid8;
    private javax.swing.JLabel aid9;
    private javax.swing.JCheckBox aidC1;
    private javax.swing.JCheckBox aidC2;
    private javax.swing.JCheckBox aidC3;
    private javax.swing.JPanel background;
    private javax.swing.JComboBox<String> brand;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel carInfo;
    private javax.swing.JTextField cityTF;
    private javax.swing.JComboBox<String> clockCMB;
    private javax.swing.JLabel continueLBLA;
    private javax.swing.JLabel continueLBLC;
    private javax.swing.JLabel continueLBLFT;
    private javax.swing.JLabel continueLBLM;
    private javax.swing.JLabel continueLBLT;
    private javax.swing.JComboBox<String> day;
    private javax.swing.JPanel decoration;
    private javax.swing.JPanel delete;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JComboBox<String> deleteCMB;
    private javax.swing.JTextArea deleteTA;
    private javax.swing.JCheckBox eqFt;
    private javax.swing.JCheckBox equipmentChc;
    private javax.swing.JLabel exh1;
    private javax.swing.JLabel exh2;
    private javax.swing.JLabel exh3;
    private javax.swing.JCheckBox exhC1;
    private javax.swing.JCheckBox exhC2;
    private javax.swing.JCheckBox exhC3;
    private javax.swing.JPanel extendedCarInfo;
    private javax.swing.JButton faultCntBTN;
    private javax.swing.JSpinner faultCount;
    private javax.swing.JLabel ffLBL5;
    private javax.swing.JTextField ffTF;
    private javax.swing.JLabel fine1;
    private javax.swing.JLabel fine2;
    private javax.swing.JLabel fine3;
    private javax.swing.JTextField fineAmount;
    private javax.swing.JTextField fineAmount1;
    private javax.swing.JTextField fineAmount2;
    private javax.swing.JCheckBox fineC1;
    private javax.swing.JCheckBox fineC2;
    private javax.swing.JCheckBox fineC3;
    private javax.swing.JLabel fofLBL5;
    private javax.swing.JTextField fofTF;
    private javax.swing.JComboBox<String> fuel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField kmTF;
    private javax.swing.JCheckBox lift;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel message;
    private javax.swing.JLabel message2;
    private javax.swing.JComboBox<String> mm;
    private javax.swing.JTextField motorCC;
    private javax.swing.JLabel nextLBL;
    private javax.swing.JTextField plate1;
    private javax.swing.JTextField plate2;
    private javax.swing.JTextField plate3;
    private javax.swing.JTextArea possibleFaults;
    private javax.swing.JCheckBox precheck;
    private javax.swing.JRadioButton privilegedRB;
    private javax.swing.JComboBox<String> repD5;
    private javax.swing.JComboBox<String> repM5;
    private javax.swing.JComboBox<String> repY5;
    private javax.swing.JPanel repetitionInfo4;
    private javax.swing.JPanel result;
    private javax.swing.JTable resultTable;
    private javax.swing.JPanel sdPanel;
    private javax.swing.JPanel search;
    private javax.swing.JComboBox<String> searchCMB;
    private javax.swing.JTextArea searchTA;
    private javax.swing.JSpinner seatCount;
    private javax.swing.JPanel servicesInfo;
    private javax.swing.JLabel sfLBL5;
    private javax.swing.JTextField sfTF;
    private javax.swing.JRadioButton standardRB;
    private javax.swing.JTextField tankCapacityTF;
    private javax.swing.JLabel tfLBL5;
    private javax.swing.JTextField tfTF;
    private javax.swing.JPanel thirdPanel;
    private javax.swing.JComboBox<String> truckTypeCMB;
    private javax.swing.JComboBox<String> typecCMB;
    private javax.swing.JCheckBox vallet;
    private javax.swing.JComboBox<String> year;
    private javax.swing.JComboBox<String> yy;
    // End of variables declaration//GEN-END:variables
}
