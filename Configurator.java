//Craig Broyles
//CPT 431 Final Project

// Final Project: Configurator.java
// This application produces a sales price for the system selected.
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;
import javax.swing.border.*;

public class Configurator extends JFrame
{
   // JPanel Base Computer for user inputs
   private JPanel baseComputerJPanel;

   // ButtonGroup to control numeric and letter JRadioButtons
   private ButtonGroup baseComputerButtonGroup;
   private ButtonGroup memoryButtonGroup;
   private ButtonGroup hardDriveButtonGroup;
   private ButtonGroup opticalDriveButtonGroup;
   private ButtonGroup graphicButtonGroup;
   private ButtonGroup systemButtonGroup;


   //Intel Pentium processor Button group inludes base processor
   private ButtonGroup pProcessorButtonGroup;

   //AMD processor Button Group includes base processor
   private ButtonGroup aProcessorButtonGroup;

   // JRadioButtons to choose to base computer
   private JRadioButton intelJRadioButton;
   private JRadioButton amdJRadioButton;

   // JPanel processor for upgrades
   private JPanel processorJPanel;

   // JPanel memory for upgrades
   private JPanel memoryJPanel;

   // JPanel hard drive for upgrades
   private JPanel hardDriveJPanel;

   // JPanel optical for upgrades
   private JPanel opticalDriveJPanel;

   // JPanel graphics for upgrades
   private JPanel graphicsJPanel;

   // JPanel processor for upgrades
   private JPanel systemJPanel;

   //JPanel comesWith for information
   private JPanel comesWithJPanel;

   // JPanel application for upgrades
   private JPanel applicationsJPanel;

   ////////////////////////////////////////
   // JPanel processor for intel computer includes base model

   //JRadioButton for Celeron D 2.53GHz processor (base model)
   private JRadioButton pC253JRadioButton;

   //JRadioButton for P4 2.6GHz
   private JRadioButton p426JRadioButton;

   //JRadioButton for P4 2.8GHz
   private JRadioButton p428JRadioButton;

   //JRadioButton for P4 3.0GHz
   private JRadioButton p430JRadioButton;

   //JRadioButton for P4 3.6GHz
   private JRadioButton p436JRadioButton;

   ///////////////////////////////////////
   // JPanel processor for AMD computer

   //JRadioButton for Sempron 2400+ processor (base model)
   private JRadioButton sempron2400JRadioButton;

   //JRadioButton for Sempron 3100+
   private JRadioButton sempron3100JRadioButton;

   //JRadioButton for Athlon 64 3500+
   private JRadioButton athlon643500JRadioButton;

   //JRadioButton for Athlon 64 3800+
   private JRadioButton athlon643800JRadioButton;

   //JRadioButton for Athlon 64 4000+
   private JRadioButton athlon644000JRadioButton;

   ///////////////////////////////////////
   // JPanel for memory upgrades
   //JRadioButton for 128Mb
   private JRadioButton m128MbJRadioButton;

   //JRadioButton for 256Mb
   private JRadioButton m256MbJRadioButton;

   //JCheckBox for 512Mb
   private JRadioButton m512MbJRadioButton;

   //JCheckBox for 1Gb
   private JRadioButton m1GbJRadioButton;

   //JCheckBox for 2Gb
   private JRadioButton m2GbJRadioButton;

   ////////////////////////////////////////
   // JPanel for hard drive  upgrades
   //JRadioButton for 40Gb - base default
   private JRadioButton h40GbJRadioButton;

   //JRadioButton for 80Gb
   private JRadioButton h80GbJRadioButton;

   //JRadioButton for 120Gb
   private JRadioButton h120GbJRadioButton;

   //JCheckBox for 170Gb
   private JRadioButton h170GbJRadioButton;

   ////////////////////////////////////////
   // JPanel for optical drive  upgrades
   //JRadioButton for cdRomJRadioButton - base default
   private JRadioButton cdRomJRadioButton;

   //JRadioButton for DVD drive
   private JRadioButton dvdDriveJRadioButton;

   //JRadioButton for combo DVD/CDRW
   private JRadioButton comboJRadioButton;

   //JRadioButton for DVD and CDRW
   private JRadioButton dvdCDRWJRadioButton;

   ////////////////////////////////////////
   // JPanel for graphic  upgrades
   //JRadioButton for NVIDA PCX 5300
   private JRadioButton integrated3DJRadioButton;

   //JRadioButton for NVIDA PCX 5300
   private JRadioButton nvidaPCX5300JRadioButton;

   //JRadioButton for NVIDA PCX 6600
   private JRadioButton nvidaPCX6600JRadioButton;

   //JRadioButton for NVIDA PCX 6600
   private JRadioButton nvidaPCX6800JRadioButton;

   ////////////////////////////////////////
   // JPanel for operating systems upgrades
   //JRadioButton for Microsoft Home Edition (default)
   private JRadioButton msHomeJRadioButton;

   //JRadioButton for Microsoft XP Professional Ed.
   private JRadioButton msXPProJRadioButton;

   //JRadioButton for Linux
   private JRadioButton linuxJRadioButton;

   ////////////////////////////////////////

   // JPanel for items computer comes with
   private JLabel floppyDriveJLabel;
   private JLabel integratedAudioJLabel;
   private JLabel integratedEthernetJLabel;
   private JLabel speakerSetJLabel;
   private JLabel windowsKeyboardJLabel;
   private JLabel msOpticalMouseJLabel;

   /////////////////////////////////////////

   // JPanel for application  upgrades
   //JCheckBox for Microsoft Office 2003
   private JCheckBox msOffice2003JCheckBox;

   //JCheckBox for Star Office
   private JCheckBox starOfficeJCheckBox;

   //JCheckBox for accounting package
   private JCheckBox accountingJCheckBox;

   //JCheckBox for graphics package
   private JCheckBox graphicsJCheckBox;


   ////////////////////////////////////////
   // JPanel OrderTotal for user inputs
   private JPanel orderTotalJPanel;

   // JLabel and JTextField for Subtotal
   private JLabel subtotalJLabel;
   private JTextField subtotalJTextField;

   // JLabel and JTextField for Tax
   private JLabel taxJLabel;
   private JTextField taxJTextField;

   //JLabel and JTextField for Shipping and Handling
   private JLabel shippingJLabel;
   private JTextField shippingJTextField;

   // JLabel and JTextField for Total Due
   private JLabel totalDueJLabel;
   private JTextField totalDueJTextField;

   // JButton to calculate total of items selected
   private JButton placeOrderJButton;

   // JButton to clear all JText Fields & set defaults
   private JButton clearJButton;

   // JButton to exit
   private JButton exitJButton;
   /////////////////////////////////////////////
   /////////////////////////////////////////////

   //JPanel and JLabel for displaying a base computer image
   private JPanel baseComputerImageJPanel;
   private JLabel baseComputerImageJLabel;

   //declare a JLabel for image use
   private JLabel imageJLabel;

   //file name and directory constants
   private final String FILE_PREFIX = "Images/";
   private final String FILE_SUFFIX = ".png";


   //////////////////////////////////////////////
   //declare tax rate as constant
   double TAX_RATE = .078;

   //declare shipping and handling rate as constant
   double SHIPPING = .025;

	//declare subtotal, taxAmount, and shipping
	double subtotal;
	double taxAmount;
	double shipAmount;

	double totalDue;

	//declare variables to store string information about configuration for order message
	String basePrice = "";
	String processor = "";
	String memory = "";
	String hardDrive = "";
	String opticalDrive = "";
	String graphic = "";
	String system = "";
	String msOffice2003 = "";
	String starOffice = "";
	String accounting = "";
	String graphicsPackage = "";

   // no-argument constructor
      public Configurator()
      {
         createUserInterface();
   }

   // create and position GUI components; register event handlers
      private void createUserInterface()
      {
         // get content pane for attaching GUI components
         Container contentPane = getContentPane();

         // enable explicit positioning of GUI components
         contentPane.setLayout( null );


         //set up image JLabel
		 imageJLabel = new JLabel();
		 imageJLabel.setBounds( 220, 16, 150, 80 );
		 contentPane.add( imageJLabel );

         // set up baseComputerJPanel
         baseComputerJPanel = new JPanel();
         baseComputerJPanel.setBounds( 16, 16, 200, 75 );
         baseComputerJPanel.setBorder(
         	new TitledBorder( "Select a base computer system:" ) );
         baseComputerJPanel.setLayout( null );
         contentPane.add( baseComputerJPanel );

         // set up baseComputerButtonGroup
		 baseComputerButtonGroup = new ButtonGroup();

		 // set up intelJRadioButton & set intel as default
		 //add item listener to see if JCheckBoxes or JRadioButtons are changed
		 intelJRadioButton = new JRadioButton();
		 intelJRadioButton.setBounds( 6, 20, 180, 23 );
		 intelJRadioButton.setText( "$499 - Intel base model");
		 intelJRadioButton.setSelected( true );
		 baseComputerButtonGroup.add( intelJRadioButton );
		 baseComputerJPanel.add( intelJRadioButton );
		 intelJRadioButton.addActionListener(

		 new ActionListener() // anonymous inner class
		     {
		       // event handler called when intelJRadioButton
		       // is selected
		       public void actionPerformed( ActionEvent event )
		             {
		                intelJRadioButtonActionPerformed( event );
		             }

		      } // end anonymous inner class

		       ); // end call to addActionListener

		  // set up amdJRadioButton
		  //add item listener to see if JCheckBoxes or JRadioButtons are changed
		  amdJRadioButton = new JRadioButton();
		  amdJRadioButton.setBounds( 6, 40, 180, 23 );
		  amdJRadioButton.setText( "$439 - AMD base model" );
		  baseComputerButtonGroup.add( amdJRadioButton );
		  baseComputerJPanel.add( amdJRadioButton );
		  amdJRadioButton.addActionListener(

		  new ActionListener() // anonymous inner class
		      {
		         // event handler called when amdJRadioButton
		         // is selected
		         public void actionPerformed( ActionEvent event )
		             {
		                amdJRadioButtonActionPerformed( event );
		             }

		          } // end anonymous inner class

      ); // end call to addActionListener

	  ////////////////////////////////////////////////////////////
      //Set up processor JPanel
      processorJPanel = new JPanel();
	  processorJPanel.setBounds( 16, 100, 300, 130 );
	  processorJPanel.setBorder(
	  	new TitledBorder( "Processor upgrades" ) );
	  processorJPanel.setLayout( null );
      contentPane.add( processorJPanel );

	  //set intel processors as default

	  // set up processorButtonGroup
	  pProcessorButtonGroup = new ButtonGroup();

	  // set up processorJRadioButtons & set base as default
	  //add item listener to see if JRadioButtons are changed
	  pC253JRadioButton = new JRadioButton();
	  pC253JRadioButton.setBounds( 6, 20, 250, 23 );
	  pC253JRadioButton.setText( "Celeron D 2.53GHz - Standard");
	  pC253JRadioButton.setSelected( true );
	  pProcessorButtonGroup.add( pC253JRadioButton );
	  processorJPanel.add( pC253JRadioButton );
	  pC253JRadioButton.addActionListener(

	  		 new ActionListener() // anonymous inner class
	  		     {
	  		       // event handler called when JRadioButton is changed

	  		       public void actionPerformed( ActionEvent event )
	  		             {
	  		                processorJRadioButtonActionPerformed( event );
	  		             }

	  		      } // end anonymous inner class

		       ); // end call to addActionListener

	  //add action listener to see if JRadioButtons are changed
	  p426JRadioButton = new JRadioButton();
	  p426JRadioButton.setBounds( 6, 40, 250, 23 );
	  p426JRadioButton.setText( "P4 2.6GHz - Add $50.00" );
	  pProcessorButtonGroup.add( p426JRadioButton );
	  processorJPanel.add( p426JRadioButton );
	  p426JRadioButton.addActionListener(

	  		 new ActionListener() // anonymous inner class
	  		     {
	  		       // event handler called when JRadioButton is changed

	  		       public void actionPerformed( ActionEvent event )
	  		             {
	  		                processorJRadioButtonActionPerformed( event );
	  		             }

	  		      } // end anonymous inner class

		       ); // end call to addActionListener

	  	//add P4 2.8GHz
	  	//add action listener to see if JRadioButtons are changed
	  	p428JRadioButton = new JRadioButton();
	  	p428JRadioButton.setBounds( 6, 60, 250, 23 );
	  	p428JRadioButton.setText( "P4 2.8GHz - Add $90.00" );
	  	pProcessorButtonGroup.add( p428JRadioButton );
	  	processorJPanel.add( p428JRadioButton );
	  	p428JRadioButton.addActionListener(

	  		 new ActionListener() // anonymous inner class
	  		     {
	  		       // event handler called when JRadioButton is changed

	  		       public void actionPerformed( ActionEvent event )
	  		             {
	  		                processorJRadioButtonActionPerformed( event );
	  		             }

	  		      } // end anonymous inner class

		       ); // end call to addActionListenerr


	  	//add P4 3.0GHz
		//add action listener to see if JRadioButtons are changed
		p430JRadioButton = new JRadioButton();
		p430JRadioButton.setBounds( 6, 80, 250, 23 );
		p430JRadioButton.setText( "P4 3.0GHz - Add $105.00" );
		pProcessorButtonGroup.add( p430JRadioButton );
		processorJPanel.add( p430JRadioButton );
		p430JRadioButton.addActionListener(

	  		 new ActionListener() // anonymous inner class
	  		     {
	  		       // event handler called when JRadioButton is changed

	  		       public void actionPerformed( ActionEvent event )
	  		             {
	  		                processorJRadioButtonActionPerformed( event );
	  		             }

	  		      } // end anonymous inner class

		       ); // end call to addActionListener

		//add P4 3.6GHz
	  	//add action listener to see if JRadioButtons are changed
	  	p436JRadioButton = new JRadioButton();
	  	p436JRadioButton.setBounds( 6, 100, 250, 23 );
	  	p436JRadioButton.setText( "P4 3.6GHz - Add $130.00" );
	  	pProcessorButtonGroup.add( p436JRadioButton );
	  	processorJPanel.add( p436JRadioButton );
	  	p436JRadioButton.addActionListener(

	  		 new ActionListener() // anonymous inner class
	  		     {
	  		       // event handler called when JRadioButton is changed

	  		       public void actionPerformed( ActionEvent event )
	  		             {
	  		                processorJRadioButtonActionPerformed( event );
	  		             }

	  		      } // end anonymous inner class

		       ); // end call to addActionListener

	  	//add intel image to imageJLabel
	  	ImageIcon image = new ImageIcon( FILE_PREFIX + "intel_logo" + FILE_SUFFIX );

	  	//display intel icon in imageJLabel
		imageJLabel.setIcon( image );
		//end set intel as default

	  ///////////////////////////////////////////////////
	  //set up memory JPanel
	      memoryJPanel = new JPanel();
	  	  memoryJPanel.setBounds( 16, 250, 300, 130 );
	  	  memoryJPanel.setBorder(
	  	  	new TitledBorder( "Memory upgrades:" ) );
	  	  memoryJPanel.setLayout( null );
	        contentPane.add( memoryJPanel );

	  	  // set up pProcessorButtonGroup
	  	  memoryButtonGroup = new ButtonGroup();

	  	  // set up memoryJRadioButtons & set base as default
	  	  //add item listener to see if JRadioButtons are changed
	  	  m128MbJRadioButton = new JRadioButton();
	  	  m128MbJRadioButton.setBounds( 6, 20, 250, 23 );
	  	  m128MbJRadioButton.setText( "128Mb DDR - Standard");
	  	  m128MbJRadioButton.setSelected( true );
	  	  memoryButtonGroup.add( m128MbJRadioButton );
	  	  memoryJPanel.add( m128MbJRadioButton );
	  	  m128MbJRadioButton.addActionListener(

	  	  		 new ActionListener() // anonymous inner class
	  	  		     {
	  	  		       // event handler called when JRadioButton is changed

	  	  		       public void actionPerformed( ActionEvent event )
	  	  		             {
	  	  		                memoryJRadioButtonActionPerformed( event );
	  	  		             }

	  	  		      } // end anonymous inner class

	  		       ); // end call to addActionListener

	  	  //add action listener to see if JRadioButtons are changed
	  	  m256MbJRadioButton = new JRadioButton();
	  	  m256MbJRadioButton.setBounds( 6, 40, 250, 23 );
	  	  m256MbJRadioButton.setText( "256Mb - Add $28.00" );
	  	  memoryButtonGroup.add( m256MbJRadioButton );
	  	  memoryJPanel.add( m256MbJRadioButton );
	  	  m256MbJRadioButton.addActionListener(

	  	  		 new ActionListener() // anonymous inner class
	  	  		     {
	  	  		       // event handler called when JRadioButton
	  	  		       // is selected
	  	  		       public void actionPerformed( ActionEvent event )
	  	  		             {
	  	  		                memoryJRadioButtonActionPerformed( event );
	  	  		             }

	  	  		      } // end anonymous inner class

	  		       ); // end call to addActionListener

	  	  	//add action listener to see if JRadioButtons are changed
	  	  	m512MbJRadioButton = new JRadioButton();
	  	  	m512MbJRadioButton.setBounds( 6, 60, 250, 23 );
	  	  	m512MbJRadioButton.setText( "512Mb - Add $58.00" );
	  	  	memoryButtonGroup.add( m512MbJRadioButton );
	  	  	memoryJPanel.add( m512MbJRadioButton );
	  	  	m512MbJRadioButton.addActionListener(

	  	  		 new ActionListener() // anonymous inner class
	  	  		     {
	  	  		       // event handler called when JRadioButton
	  	  		       // is selected
	  	  		       public void actionPerformed( ActionEvent event )
	  	  		             {
	  	  		                memoryJRadioButtonActionPerformed( event );
	  	  		             }

	  	  		      } // end anonymous inner class

	  		       ); // end call to addActionListenerr


	  	  	//add action listener to see if JRadioButtons are changed
	  		m1GbJRadioButton = new JRadioButton();
	  		m1GbJRadioButton.setBounds( 6, 80, 250, 23 );
	  		m1GbJRadioButton.setText( "1Gb - Add $108.00" );
	  		memoryButtonGroup.add( m1GbJRadioButton );
	  		memoryJPanel.add( m1GbJRadioButton );
	  		m1GbJRadioButton.addActionListener(

	  	  		 new ActionListener() // anonymous inner class
	  	  		     {
	  	  		       // event handler called when JRadioButton
	  	  		       // is selected
	  	  		       public void actionPerformed( ActionEvent event )
	  	  		             {
	  	  		                memoryJRadioButtonActionPerformed( event );
	  	  		             }

	  	  		      } // end anonymous inner class

	  		       ); // end call to addActionListener

	  		//add action listener to see if JRadioButtons are changed
	  	  	m2GbJRadioButton = new JRadioButton();
	  	  	m2GbJRadioButton.setBounds( 6, 100, 250, 23 );
	  	  	m2GbJRadioButton.setText( "2Gb - Add $176.00" );
	  	  	memoryButtonGroup.add( m2GbJRadioButton );
	  	  	memoryJPanel.add( m2GbJRadioButton );
	  	  	m2GbJRadioButton.addActionListener(

	  	  		 new ActionListener() // anonymous inner class
	  	  		     {
	  	  		       // event handler called when JRadioButton
	  	  		       // is selected
	  	  		       public void actionPerformed( ActionEvent event )
	  	  		             {
	  	  		                memoryJRadioButtonActionPerformed( event );
	  	  		             }

	  	  		      } // end anonymous inner class

	  		       ); // end call to addActionListener

//////////////////////////////////////////////////////////////////////////////
//set up hardDrive JPanel
	      hardDriveJPanel = new JPanel();
	  	  hardDriveJPanel.setBounds( 16, 400, 300, 110 );
	  	  hardDriveJPanel.setBorder(
	  	  	new TitledBorder( "Hard Drive upgrades:" ) );
	  	  hardDriveJPanel.setLayout( null );
	        contentPane.add( hardDriveJPanel );

	  	  // set up ButtonGroup
	  	  hardDriveButtonGroup = new ButtonGroup();

	  	  // set up hardDriveJRadioButtons & set base as default
	  	  //add item listener to see if JRadioButtons are changed
	  	  h40GbJRadioButton = new JRadioButton();
	  	  h40GbJRadioButton.setBounds( 6, 20, 250, 23 );
	  	  h40GbJRadioButton.setText( "40Gb 7200rpm - Standard");
	  	  h40GbJRadioButton.setSelected( true );
	  	  hardDriveButtonGroup.add( h40GbJRadioButton );
	  	  hardDriveJPanel.add( h40GbJRadioButton );
	  	  h40GbJRadioButton.addActionListener(

	  	  		 new ActionListener() // anonymous inner class
	  	  		     {
	  	  		       // event handler called when JRadioButton is changed

	  	  		       public void actionPerformed( ActionEvent event )
	  	  		             {
	  	  		                hardDriveJRadioButtonActionPerformed( event );
	  	  		             }

	  	  		      } // end anonymous inner class

	  		       ); // end call to addActionListener

	  	  //add action listener to see if JRadioButtons are changed
	  	  h80GbJRadioButton = new JRadioButton();
	  	  h80GbJRadioButton.setBounds( 6, 40, 250, 23 );
	  	  h80GbJRadioButton.setText( "80Gb - Add $27.00" );
	  	  hardDriveButtonGroup.add( h80GbJRadioButton );
	  	  hardDriveJPanel.add( h80GbJRadioButton );
	  	  h80GbJRadioButton.addActionListener(

	  	  		 new ActionListener() // anonymous inner class
	  	  		     {
	  	  		       // event handler called when JRadioButton
	  	  		       // is selected
	  	  		       public void actionPerformed( ActionEvent event )
	  	  		             {
	  	  		                hardDriveJRadioButtonActionPerformed( event );
	  	  		             }

	  	  		      } // end anonymous inner class

	  		       ); // end call to addActionListener

	  	  	//add action listener to see if JRadioButtons are changed
	  	  	h120GbJRadioButton = new JRadioButton();
	  	  	h120GbJRadioButton.setBounds( 6, 60, 250, 23 );
	  	  	h120GbJRadioButton.setText( "120Gb - Add $50.00" );
	  	  	hardDriveButtonGroup.add( h120GbJRadioButton );
	  	  	hardDriveJPanel.add( h120GbJRadioButton );
	  	  	h120GbJRadioButton.addActionListener(

	  	  		 new ActionListener() // anonymous inner class
	  	  		     {
	  	  		       // event handler called when JRadioButton
	  	  		       // is selected
	  	  		       public void actionPerformed( ActionEvent event )
	  	  		             {
	  	  		                hardDriveJRadioButtonActionPerformed( event );
	  	  		             }

	  	  		      } // end anonymous inner class

	  		       ); // end call to addActionListenerr


	  	  	//add action listener to see if JRadioButtons are changed
	  		h170GbJRadioButton = new JRadioButton();
	  		h170GbJRadioButton.setBounds( 6, 80, 250, 23 );
	  		h170GbJRadioButton.setText( "170Gb - Add $89.00" );
	  		hardDriveButtonGroup.add( h170GbJRadioButton );
	  		hardDriveJPanel.add( h170GbJRadioButton );
	  		h170GbJRadioButton.addActionListener(

	  	  		 new ActionListener() // anonymous inner class
	  	  		     {
	  	  		       // event handler called when JRadioButton
	  	  		       // is selected
	  	  		       public void actionPerformed( ActionEvent event )
	  	  		             {
	  	  		                hardDriveJRadioButtonActionPerformed( event );
	  	  		             }

	  	  		      } // end anonymous inner class

	  		       ); // end call to addActionListener

////////////////////////////////////////////////////////////////////////////////////
//set up opticalDrive JPanel
	      opticalDriveJPanel = new JPanel();
	  	  opticalDriveJPanel.setBounds( 16, 530, 300, 110 );
	  	  opticalDriveJPanel.setBorder(
	  	  	new TitledBorder( "Optical Drive upgrades:" ) );
	  	  opticalDriveJPanel.setLayout( null );
	        contentPane.add( opticalDriveJPanel );

	  	  // set up ButtonGroup
	  	  opticalDriveButtonGroup = new ButtonGroup();

	  	  // set up hardDriveJRadioButtons & set base as default
	  	  //add item listener to see if JRadioButtons are changed
	  	  cdRomJRadioButton = new JRadioButton();
	  	  cdRomJRadioButton.setBounds( 6, 20, 250, 23 );
	  	  cdRomJRadioButton.setText( "CD-Rom Drive - Standard");
	  	  cdRomJRadioButton.setSelected( true );
	  	  opticalDriveButtonGroup.add( cdRomJRadioButton );
	  	  opticalDriveJPanel.add( cdRomJRadioButton );
	  	  cdRomJRadioButton.addActionListener(

	  	  		 new ActionListener() // anonymous inner class
	  	  		     {
	  	  		       // event handler called when JRadioButton is changed

	  	  		       public void actionPerformed( ActionEvent event )
	  	  		             {
	  	  		                opticalDriveJRadioButtonActionPerformed( event );
	  	  		             }

	  	  		      } // end anonymous inner class

	  		       ); // end call to addActionListener

	  	  //add action listener to see if JRadioButtons are changed
	  	  dvdDriveJRadioButton = new JRadioButton();
	  	  dvdDriveJRadioButton.setBounds( 6, 40, 250, 23 );
	  	  dvdDriveJRadioButton.setText( "DVD Drive - Add $17.00" );
	  	  opticalDriveButtonGroup.add( dvdDriveJRadioButton );
	  	  opticalDriveJPanel.add( dvdDriveJRadioButton );
	  	  dvdDriveJRadioButton.addActionListener(

	  	  		 new ActionListener() // anonymous inner class
	  	  		     {
	  	  		       // event handler called when JRadioButton
	  	  		       // is selected
	  	  		       public void actionPerformed( ActionEvent event )
	  	  		             {
	  	  		                opticalDriveJRadioButtonActionPerformed( event );
	  	  		             }

	  	  		      } // end anonymous inner class

	  		       ); // end call to addActionListener

	  	  	//add action listener to see if JRadioButtons are changed
	  	  	comboJRadioButton = new JRadioButton();
	  	  	comboJRadioButton.setBounds( 6, 60, 250, 23 );
	  	  	comboJRadioButton.setText( "Combo DVD/CDRW - Add $40.00" );
	  	  	opticalDriveButtonGroup.add( comboJRadioButton );
	  	  	opticalDriveJPanel.add( comboJRadioButton );
	  	  	comboJRadioButton.addActionListener(

	  	  		 new ActionListener() // anonymous inner class
	  	  		     {
	  	  		       // event handler called when JRadioButton
	  	  		       // is selected
	  	  		       public void actionPerformed( ActionEvent event )
	  	  		             {
	  	  		                opticalDriveJRadioButtonActionPerformed( event );
	  	  		             }

	  	  		      } // end anonymous inner class

	  		       ); // end call to addActionListenerr


	  	  	//add action listener to see if JRadioButtons are changed
	  		dvdCDRWJRadioButton = new JRadioButton();
	  		dvdCDRWJRadioButton.setBounds( 6, 80, 250, 23 );
	  		dvdCDRWJRadioButton.setText( "DVD and CDRW - Add $79.00" );
	  		opticalDriveButtonGroup.add( dvdCDRWJRadioButton );
	  		opticalDriveJPanel.add( dvdCDRWJRadioButton );
	  		dvdCDRWJRadioButton.addActionListener(

	  	  		 new ActionListener() // anonymous inner class
	  	  		     {
	  	  		       // event handler called when JRadioButton
	  	  		       // is selected
	  	  		       public void actionPerformed( ActionEvent event )
	  	  		             {
	  	  		                opticalDriveJRadioButtonActionPerformed( event );
	  	  		             }

	  	  		      } // end anonymous inner class

	  		       ); // end call to addActionListener


	  //////////////////////////////////////////////////////////////////////////
//set up graphics JPanel
	      graphicsJPanel = new JPanel();
	  	  graphicsJPanel.setBounds( 350, 16, 425, 110 );
	  	  graphicsJPanel.setBorder(
	  	  	new TitledBorder( "Graphics upgrades:" ) );
	  	  graphicsJPanel.setLayout( null );
	        contentPane.add( graphicsJPanel );

	  	  // set up ButtonGroup
	  	  graphicButtonGroup = new ButtonGroup();

	  	  // set up graphicJRadioButtons & set base as default
	  	  //add item listener to see if JRadioButtons are changed
	  	  integrated3DJRadioButton = new JRadioButton();
	  	  integrated3DJRadioButton.setBounds( 6, 20, 400, 23 );
	  	  integrated3DJRadioButton.setText( "Integrated 3D Graphics - Standard");
	  	  integrated3DJRadioButton.setSelected( true );
	  	  graphicButtonGroup.add( integrated3DJRadioButton );
	  	  graphicsJPanel.add( integrated3DJRadioButton );
	  	  integrated3DJRadioButton.addActionListener(

	  	  		 new ActionListener() // anonymous inner class
	  	  		     {
	  	  		       // event handler called when JRadioButton is changed

	  	  		       public void actionPerformed( ActionEvent event )
	  	  		             {
	  	  		                graphicJRadioButtonActionPerformed( event );
	  	  		             }

	  	  		      } // end anonymous inner class

	  		       ); // end call to addActionListener

	  	  //add action listener to see if JRadioButtons are changed
	  	  nvidaPCX5300JRadioButton = new JRadioButton();
	  	  nvidaPCX5300JRadioButton.setBounds( 6, 40, 400, 23 );
	  	  nvidaPCX5300JRadioButton.setText( "NVIDA GeForce PCX 5300 PCI Express w/128 DDR - Add $80.00" );
	  	  graphicButtonGroup.add( nvidaPCX5300JRadioButton );
	  	  graphicsJPanel.add( nvidaPCX5300JRadioButton );
	  	  nvidaPCX5300JRadioButton.addActionListener(

	  	  		 new ActionListener() // anonymous inner class
	  	  		     {
	  	  		       // event handler called when JRadioButton
	  	  		       // is selected
	  	  		       public void actionPerformed( ActionEvent event )
	  	  		             {
	  	  		                graphicJRadioButtonActionPerformed( event );
	  	  		             }

	  	  		      } // end anonymous inner class

	  		       ); // end call to addActionListener

	  	  	//add action listener to see if JRadioButtons are changed
	  	  	nvidaPCX6600JRadioButton = new JRadioButton();
	  	  	nvidaPCX6600JRadioButton.setBounds( 6, 60, 400, 23 );
	  	  	nvidaPCX6600JRadioButton.setText( "NVIDA GeForce PCX 6600 PCI Express w/128 DDR - Add $169.00" );
	  	  	graphicButtonGroup.add( nvidaPCX6600JRadioButton );
	  	  	graphicsJPanel.add( nvidaPCX6600JRadioButton );
	  	  	nvidaPCX6600JRadioButton.addActionListener(

	  	  		 new ActionListener() // anonymous inner class
	  	  		     {
	  	  		       // event handler called when JRadioButton
	  	  		       // is selected
	  	  		       public void actionPerformed( ActionEvent event )
	  	  		             {
	  	  		                graphicJRadioButtonActionPerformed( event );
	  	  		             }

	  	  		      } // end anonymous inner class

	  		       ); // end call to addActionListenerr


	  	  	//add action listener to see if JRadioButtons are changed
	  		nvidaPCX6800JRadioButton = new JRadioButton();
	  		nvidaPCX6800JRadioButton.setBounds( 6, 80, 400, 23 );
	  		nvidaPCX6800JRadioButton.setText( "NVIDA GeForce PCX 6800 PCI Express w/256 DDR3 - Add $490.00" );
	  		graphicButtonGroup.add( nvidaPCX6800JRadioButton );
	  		graphicsJPanel.add( nvidaPCX6800JRadioButton );
	  		nvidaPCX6800JRadioButton.addActionListener(

	  	  		 new ActionListener() // anonymous inner class
	  	  		     {
	  	  		       // event handler called when JRadioButton
	  	  		       // is selected
	  	  		       public void actionPerformed( ActionEvent event )
	  	  		             {
	  	  		                graphicJRadioButtonActionPerformed( event );
	  	  		             }

	  	  		      } // end anonymous inner class

	  		       ); // end call to addActionListener


	  //////////////////////////////////////////////////////////////////////////

//set up system JPanel
	      systemJPanel = new JPanel();
	  	  systemJPanel.setBounds( 350, 130, 425, 100 );
	  	  systemJPanel.setBorder(
	  	  	new TitledBorder( "Operating System upgrades:" ) );
	  	  systemJPanel.setLayout( null );
	        contentPane.add( systemJPanel );

	  	  // set up ButtonGroup
	  	  systemButtonGroup = new ButtonGroup();

	  	  // set up systemJRadioButtons & set base as default
	  	  //add item listener to see if JRadioButtons are changed
	  	  msHomeJRadioButton = new JRadioButton();
	  	  msHomeJRadioButton.setBounds( 6, 20, 400, 23 );
	  	  msHomeJRadioButton.setText( "Microsoft Home Edition - Standard");
	  	  msHomeJRadioButton.setSelected( true );
	  	  systemButtonGroup.add( msHomeJRadioButton );
	  	  systemJPanel.add( msHomeJRadioButton );
	  	  msHomeJRadioButton.addActionListener(

	  	  		 new ActionListener() // anonymous inner class
	  	  		     {
	  	  		       // event handler called when JRadioButton is changed

	  	  		       public void actionPerformed( ActionEvent event )
	  	  		             {
	  	  		                systemJRadioButtonActionPerformed( event );
	  	  		             }

	  	  		      } // end anonymous inner class

	  		       ); // end call to addActionListener

	  	  //add action listener to see if JRadioButtons are changed
	  	  msXPProJRadioButton = new JRadioButton();
	  	  msXPProJRadioButton.setBounds( 6, 40, 400, 23 );
	  	  msXPProJRadioButton.setText( "Microsoft XP Professional Ed. - Add $59.00" );
	  	  systemButtonGroup.add( msXPProJRadioButton );
	  	  systemJPanel.add( msXPProJRadioButton );
	  	  msXPProJRadioButton.addActionListener(

	  	  		 new ActionListener() // anonymous inner class
	  	  		     {
	  	  		       // event handler called when JRadioButton
	  	  		       // is selected
	  	  		       public void actionPerformed( ActionEvent event )
	  	  		             {
	  	  		                systemJRadioButtonActionPerformed( event );
	  	  		             }

	  	  		      } // end anonymous inner class

	  		       ); // end call to addActionListener

	  	  	//add action listener to see if JRadioButtons are changed
	  	  	linuxJRadioButton = new JRadioButton();
	  	  	linuxJRadioButton.setBounds( 6, 60, 400, 23 );
	  	  	linuxJRadioButton.setText( "Linux - Subtract $89.00" );
	  	  	systemButtonGroup.add( linuxJRadioButton );
	  	  	systemJPanel.add( linuxJRadioButton );
	  	  	linuxJRadioButton.addActionListener(

	  	  		 new ActionListener() // anonymous inner class
	  	  		     {
	  	  		       // event handler called when JRadioButton
	  	  		       // is selected
	  	  		       public void actionPerformed( ActionEvent event )
	  	  		             {
	  	  		                systemJRadioButtonActionPerformed( event );
	  	  		             }

	  	  		      } // end anonymous inner class

	  		       ); // end call to addActionListenerr

////////////////////////////////////////////////////////////////////////////////
//Set up comesWith JPanel
	  comesWithJPanel = new JPanel();
	  comesWithJPanel.setBounds( 350, 235, 425, 170 );
	  comesWithJPanel.setBorder(
	  new TitledBorder( "All computers come with the following:" ) );
	  comesWithJPanel.setLayout( null );
      contentPane.add( comesWithJPanel );

      //set up floppyDrive JLabel
	  floppyDriveJLabel = new JLabel();
	  floppyDriveJLabel.setBounds( 16, 20, 200, 23 );
	  floppyDriveJLabel.setHorizontalAlignment( JLabel.LEFT );
	  floppyDriveJLabel.setText( "Floppy Disk Drive" );
      comesWithJPanel.add( floppyDriveJLabel );

      //set up integratedAudio JLabel
      integratedAudioJLabel = new JLabel();
      integratedAudioJLabel.setBounds( 16, 45, 200, 23 );
      integratedAudioJLabel.setHorizontalAlignment( JLabel.LEFT );
      integratedAudioJLabel.setText( "Integrated Audio" );
      comesWithJPanel.add( integratedAudioJLabel );


	  //set up integratedEthernet JLabel
	  integratedEthernetJLabel = new JLabel();
	  integratedEthernetJLabel.setBounds( 16, 70, 400, 23 );
	  integratedEthernetJLabel.setHorizontalAlignment( JLabel.LEFT );
	  integratedEthernetJLabel.setText( "Integrated 10/100 Ethernet" );
	  comesWithJPanel.add( integratedEthernetJLabel );


	  //set up speakerSet JLabel
	  speakerSetJLabel = new JLabel();
	  speakerSetJLabel.setBounds( 16, 95, 400, 23 );
	  speakerSetJLabel.setHorizontalAlignment( JLabel.LEFT );
	  speakerSetJLabel.setText( "2 Piece Powered Speaker Set" );
	  comesWithJPanel.add( speakerSetJLabel );


	  //set up windowsKeyboard JLabel
	  windowsKeyboardJLabel = new JLabel();
	  windowsKeyboardJLabel.setBounds( 16, 120, 400, 23 );
	  windowsKeyboardJLabel.setHorizontalAlignment( JLabel.LEFT );
	  windowsKeyboardJLabel.setText( "Windows Keyboard" );
	  comesWithJPanel.add( windowsKeyboardJLabel );

	  //set up windowsKeyboard JLabel
	  msOpticalMouseJLabel = new JLabel();
	  msOpticalMouseJLabel.setBounds( 16, 145, 400, 23 );
	  msOpticalMouseJLabel.setHorizontalAlignment( JLabel.LEFT );
	  msOpticalMouseJLabel.setText( "Microsoft Optical Mouse" );
	  comesWithJPanel.add( msOpticalMouseJLabel );



///////////////////////////////////////////////////////////////////////////

//Set up applications JPanel
      applicationsJPanel = new JPanel();
	  applicationsJPanel.setBounds( 350, 410, 425, 110 );
	  applicationsJPanel.setBorder(
	  	new TitledBorder( "Application Package upgrades: " ) );
	  applicationsJPanel.setLayout( null );
      contentPane.add( applicationsJPanel );


	  //add item listener to see if JCheckBoxes are changed
	    msOffice2003JCheckBox = new JCheckBox();
	  	msOffice2003JCheckBox.setBounds( 6, 20, 400, 23 );
	  	msOffice2003JCheckBox.setText( "Microsoft Office 2003 - Add $529.00" );
	  	applicationsJPanel.add( msOffice2003JCheckBox );
	  	msOffice2003JCheckBox.addItemListener(

					new ItemListener()  //anonymous inner class
					{
						//event handler to track when JCheckBox is changed
						public void itemStateChanged( ItemEvent event )
						{
							applicationItemStateChanged( event );
						}

					} //end anonymous inner class

					);  //end call to addChangeListener



	  	//add item listener to see if JCheckBoxes are changed
	  	starOfficeJCheckBox = new JCheckBox();
	  	starOfficeJCheckBox.setBounds( 6, 40, 400, 23 );
	  	starOfficeJCheckBox.setText( "Star Office - Add $39.00" );
	  	applicationsJPanel.add( starOfficeJCheckBox );
	  	starOfficeJCheckBox.addItemListener(

					new ItemListener()  //anonymous inner class
					{
						//event handler to track when JCheckBox is changed
						public void itemStateChanged( ItemEvent event )
						{
							applicationItemStateChanged( event );
						}

					} //end anonymous inner class

					);  //end call to addChangeListener



	  	//add item listener to see if JCheckBoxes are changed
	  	accountingJCheckBox = new JCheckBox();
	  	accountingJCheckBox.setBounds( 6, 60, 400, 23 );
	  	accountingJCheckBox.setText( "Accounting package - Add $399.00" );
	  	applicationsJPanel.add( accountingJCheckBox );
	  	accountingJCheckBox.addItemListener(

					new ItemListener()  //anonymous inner class
					{
						//event handler to track when JCheckBox is changed
						public void itemStateChanged( ItemEvent event )
						{
							applicationItemStateChanged( event );
						}

					} //end anonymous inner class

					);  //end call to addChangeListener

		//add item listener to see if JCheckBoxes are changed
	  	graphicsJCheckBox = new JCheckBox();
	  	graphicsJCheckBox.setBounds( 6, 80, 400, 23 );
	  	graphicsJCheckBox.setText( "Graphics package - Add $499.00" );
	  	applicationsJPanel.add( graphicsJCheckBox );
	  	graphicsJCheckBox.addItemListener(

					new ItemListener()  //anonymous inner class
					{
						//event handler to track when JCheckBox is changed
						public void itemStateChanged( ItemEvent event )
						{
							applicationItemStateChanged( event );
						}

					} //end anonymous inner class

					);  //end call to addChangeListener




	  //////////////////////////////////////////////////////////////////////////

      //Set up Order total JPanel
	  orderTotalJPanel = new JPanel();
	  orderTotalJPanel.setBounds( 350, 530, 180, 130 );
	  orderTotalJPanel.setBorder(
	  new TitledBorder( "Order total" ) );
	  orderTotalJPanel.setLayout( null );
      contentPane.add( orderTotalJPanel );

      //set up subtotal JLabel
      subtotalJLabel = new JLabel();
      subtotalJLabel.setBounds( 16, 20, 70, 23 );
      subtotalJLabel.setHorizontalAlignment( JLabel.RIGHT );
      subtotalJLabel.setText( "Subtotal: " );
      orderTotalJPanel.add( subtotalJLabel );

      //set up subtotal JTextField
	  subtotalJTextField = new JTextField();
	  subtotalJTextField.setBounds( 90, 20, 70, 23 );
	  subtotalJTextField.setText( "$0.00" );
	  subtotalJTextField.setEditable( false );
	  orderTotalJPanel.add( subtotalJTextField );

	  //set up tax JLabel
	  taxJLabel = new JLabel();
	  taxJLabel.setBounds( 16, 45, 70, 23 );
	  taxJLabel.setHorizontalAlignment( JLabel.RIGHT );
	  taxJLabel.setText( "Tax (7.8%) " );
	  orderTotalJPanel.add( taxJLabel );

	  //set up tax JTextField
	  taxJTextField = new JTextField();
	  taxJTextField.setBounds( 90, 45, 70, 23 );
	  taxJTextField.setText( "$0.00" );
	  taxJTextField.setEditable( false );
	  orderTotalJPanel.add( taxJTextField );

	  //set up shipping and handling JLabel
	  shippingJLabel = new JLabel();
	  shippingJLabel.setBounds( 6, 70, 80, 23 );
	  shippingJLabel.setHorizontalAlignment( JLabel.RIGHT );
	  shippingJLabel.setText( "S & H (2.5%) " );
	  orderTotalJPanel.add( shippingJLabel );

	  //set up shipping and handlingJTextField
	  shippingJTextField = new JTextField();
	  shippingJTextField.setBounds( 90, 70, 70, 23 );
	  shippingJTextField.setText( "$0.00" );
	  shippingJTextField.setEditable( false );
	  orderTotalJPanel.add( shippingJTextField );

	  //set up total due JLabel
	  totalDueJLabel = new JLabel();
	  totalDueJLabel.setBounds( 6, 95, 80, 23 );
	  totalDueJLabel.setHorizontalAlignment( JLabel.RIGHT );
	  totalDueJLabel.setText( "Total due: " );
	  orderTotalJPanel.add( totalDueJLabel );

	  //set up total due JTextField
	  totalDueJTextField = new JTextField();
	  totalDueJTextField.setBounds( 90, 95, 70, 23 );
	  totalDueJTextField.setText( "$0.00" );
	  totalDueJTextField.setEditable( false );
	  orderTotalJPanel.add( totalDueJTextField );

	  // set up placeOrderJButton
	  placeOrderJButton = new JButton();
	  placeOrderJButton.setBounds( 540, 540, 100, 26 );
	  placeOrderJButton.setText( "Place order" );
	  contentPane.add( placeOrderJButton );
	  placeOrderJButton.addActionListener(

	     new ActionListener() // anonymous inner class
	        {
	           // event handler called when placeOrderJButton is pressed
	           public void actionPerformed ( ActionEvent event )
	              {
	                  placeOrderJButtonActionPerformed( event );
	              }

	         } // end anonymous inner class

	  ); // end call to addActionListener

	  // set up exitJButton
	  exitJButton = new JButton();
	  exitJButton.setBounds( 540, 570, 60, 26 );
	  exitJButton.setText( "Exit" );
	  contentPane.add( exitJButton );
	  exitJButton.addActionListener(

	     new ActionListener() // anonymous inner class
	        {
	           // event handler called when exitJButton is pressed
	           public void actionPerformed ( ActionEvent event )
	              {
	                  exitJButtonActionPerformed( event );
	              }

	  		} // end anonymous inner class

	  ); // end call to addActionListener

	  // set up clearJButton
	  	  clearJButton = new JButton();
	  	  clearJButton.setBounds( 540, 600, 70, 26 );
	  	  clearJButton.setText( "Clear" );
	  	  contentPane.add( clearJButton );
	  	  clearJButton.addActionListener(

	  	     new ActionListener() // anonymous inner class
	  	        {
	  	           // event handler called when clearJButton is pressed
	  	           public void actionPerformed ( ActionEvent event )
	  	              {
	  	                  clearJButtonActionPerformed( event );
	  	              }

	  	  		} // end anonymous inner class

	  ); // end call to addActionListener

	  // set properties of application's window
      setTitle( "Configurator" ); // set title bar string
      setSize( 800, 700 );          // set window size
      setLocationRelativeTo(null);
      setVisible( true );           // display window


		calculateTotal();

}// end method createUserInterface

public void displayIntel()
{
	//reset processor JPanel
	processorJPanel.removeAll();

		  // set up pProcessorButtonGroup
		  pProcessorButtonGroup = new ButtonGroup();

		  // set up processorJRadioButtons & set base as default
		  //add item listener to see if JRadioButtons are changed
		  pC253JRadioButton = new JRadioButton();
		  pC253JRadioButton.setBounds( 6, 20, 200, 23 );
		  pC253JRadioButton.setText( "Celeron D 2.53GHz - Standard");
		  pC253JRadioButton.setSelected( true );
		  pProcessorButtonGroup.add( pC253JRadioButton );
		  processorJPanel.add( pC253JRadioButton );
		  pC253JRadioButton.addActionListener(

		  		 new ActionListener() // anonymous inner class
		  		     {
		  		       // event handler called when JRadioButton
		  		       // is selected
		  		       public void actionPerformed( ActionEvent event )
		  		             {
		  		                processorJRadioButtonActionPerformed( event );
		  		             }

		  		      } // end anonymous inner class

			       ); // end call to addActionListener

		  //add action listener to see if JRadioButtons are changed
		  p426JRadioButton = new JRadioButton();
		  p426JRadioButton.setBounds( 6, 40, 200, 23 );
		  p426JRadioButton.setText( "P4 2.6GHz - Add $50.00" );
		  pProcessorButtonGroup.add( p426JRadioButton );
		  processorJPanel.add( p426JRadioButton );
		  p426JRadioButton.addActionListener(

		  		 new ActionListener() // anonymous inner class
		  		     {
		  		       // event handler called when JRadioButton
		  		       // is selected
		  		       public void actionPerformed( ActionEvent event )
		  		             {
		  		                processorJRadioButtonActionPerformed( event );
		  		             }

		  		      } // end anonymous inner class

			       ); // end call to addActionListener

		  	//add P4 2.8GHz
		  	//add action listener to see if JRadioButtons are changed
		  	p428JRadioButton = new JRadioButton();
		  	p428JRadioButton.setBounds( 6, 60, 200, 23 );
		  	p428JRadioButton.setText( "P4 2.8GHz - Add $90.00" );
		  	pProcessorButtonGroup.add( p428JRadioButton );
		  	processorJPanel.add( p428JRadioButton );
		  	p428JRadioButton.addActionListener(

		  		 new ActionListener() // anonymous inner class
		  		     {
		  		       // event handler called when JRadioButton
		  		       // is selected
		  		       public void actionPerformed( ActionEvent event )
		  		             {
		  		                processorJRadioButtonActionPerformed( event );
		  		             }

		  		      } // end anonymous inner class

			       ); // end call to addActionListenerr


		  	//add P4 3.0GHz
			//add action listener to see if JRadioButtons are changed
			p430JRadioButton = new JRadioButton();
			p430JRadioButton.setBounds( 6, 80, 200, 23 );
			p430JRadioButton.setText( "P4 3.0GHz - Add $105.00" );
			pProcessorButtonGroup.add( p430JRadioButton );
			processorJPanel.add( p430JRadioButton );
			p430JRadioButton.addActionListener(

		  		 new ActionListener() // anonymous inner class
		  		     {
		  		       // event handler called when JRadioButton
		  		       // is selected
		  		       public void actionPerformed( ActionEvent event )
		  		             {
		  		                processorJRadioButtonActionPerformed( event );
		  		             }

		  		      } // end anonymous inner class

			       ); // end call to addActionListener

			//add P4 3.6GHz
		  	//add action listener to see if JRadioButtons are changed
		  	p436JRadioButton = new JRadioButton();
		  	p436JRadioButton.setBounds( 6, 100, 200, 23 );
		  	p436JRadioButton.setText( "P4 3.6GHz - Add $130.00" );
		  	pProcessorButtonGroup.add( p436JRadioButton );
		  	processorJPanel.add( p436JRadioButton );
		  	p436JRadioButton.addActionListener(

		  		 new ActionListener() // anonymous inner class
		  		     {
		  		       // event handler called when JRadioButton
		  		       // is selected
		  		       public void actionPerformed( ActionEvent event )
		  		             {
		  		                processorJRadioButtonActionPerformed( event );
		  		             }

		  		      } // end anonymous inner class

			       ); // end call to addActionListener



	//add intel image to imageJLabel
	ImageIcon image = new ImageIcon( FILE_PREFIX + "intel_logo" + FILE_SUFFIX );

	//display intel icon in imageJLabel
	imageJLabel.setIcon( image );

	//reset add-on JPanel
	processorJPanel.repaint();

	calculateTotal();

} //end method displayIntel

public void displayAMD()
{

	//reset add-on JPanel
	processorJPanel.removeAll();

	// set up aProcessorButtonGroup
	aProcessorButtonGroup = new ButtonGroup();

	//set up processor JPanel for AMD

	//add action listener to see if JRadioButtons are changed

	sempron2400JRadioButton = new JRadioButton();
	sempron2400JRadioButton.setBounds( 6, 20, 200, 23 );
	sempron2400JRadioButton.setText( "Sempron 2400+ - Standard" );
	sempron2400JRadioButton.setSelected( true );
	aProcessorButtonGroup.add( sempron2400JRadioButton );
	processorJPanel.add( sempron2400JRadioButton );
	sempron2400JRadioButton.addActionListener(

	     new ActionListener() // anonymous inner class
	        {
	           // event handler called when JRadioButton is changed
	           public void actionPerformed ( ActionEvent event )
	              {
	                  processorJRadioButtonActionPerformed( event );
	              }

	         } // end anonymous inner class

	  ); // end call to addActionListener



	//add action listener to see if JRadioButtons are changed
	sempron3100JRadioButton = new JRadioButton();
	sempron3100JRadioButton.setBounds( 6, 40, 200, 23 );
	sempron3100JRadioButton.setText( "Sempron 3100+ - Add $25.00" );
	aProcessorButtonGroup.add( sempron3100JRadioButton );
	processorJPanel.add( sempron3100JRadioButton );
	sempron3100JRadioButton.addActionListener(

	     new ActionListener() // anonymous inner class
	        {
	           // event handler called when JRadioButton is changed
	           public void actionPerformed ( ActionEvent event )
	              {
	                  processorJRadioButtonActionPerformed( event );
	              }

	         } // end anonymous inner class

	  ); // end call to addActionListener


	//add Athlon 64 3500+
	//add action listener to see if JRadioButtons are changed
	athlon643500JRadioButton = new JRadioButton();
	athlon643500JRadioButton.setBounds( 6, 60, 200, 23 );
	athlon643500JRadioButton.setText( "Athlon 64 3500+ - Add $90.00" );
	aProcessorButtonGroup.add( athlon643500JRadioButton );
	processorJPanel.add( athlon643500JRadioButton );
	athlon643500JRadioButton.addActionListener(

	     new ActionListener() // anonymous inner class
	        {
	           // event handler called when JRadioButton is changed
	           public void actionPerformed ( ActionEvent event )
	              {
	                  processorJRadioButtonActionPerformed( event );
	              }

	         } // end anonymous inner class

	  ); // end call to addActionListener


	//add Athlon 64 3800+
	//add action listener to see if JRadioButtons are changed
	athlon643800JRadioButton = new JRadioButton();
	athlon643800JRadioButton.setBounds( 6, 80, 200, 23 );
	athlon643800JRadioButton.setText( "Athlon 64 3800+ - Add $187.00" );
	aProcessorButtonGroup.add( athlon643800JRadioButton );
	processorJPanel.add( athlon643800JRadioButton );
	athlon643800JRadioButton.addActionListener(

	     new ActionListener() // anonymous inner class
	        {
	           // event handler called when JRadioButton is changed
	           public void actionPerformed ( ActionEvent event )
	              {
	                  processorJRadioButtonActionPerformed( event );
	              }

	         } // end anonymous inner class

	  ); // end call to addActionListener


	//add Athlon 64 4000+
	//add action listener to see if JRadioButtons are changed
	athlon644000JRadioButton = new JRadioButton();
	athlon644000JRadioButton.setBounds( 6, 100, 200, 23 );
	athlon644000JRadioButton.setText( "Athlon 64 4000+ - Add $280.00" );
	aProcessorButtonGroup.add( athlon644000JRadioButton );
	processorJPanel.add( athlon644000JRadioButton );
	athlon644000JRadioButton.addActionListener(

	     new ActionListener() // anonymous inner class
	        {
	           // event handler called when JRadioButton is changed
	           public void actionPerformed ( ActionEvent event )
	              {
	                  processorJRadioButtonActionPerformed( event );
	              }

	         } // end anonymous inner class

	  ); // end call to addActionListener



 	//add AMD image to imageJLabel
  	ImageIcon image = new ImageIcon( FILE_PREFIX + "amd_logo" + FILE_SUFFIX );

  	//display AMD icon in imageJLabel
	imageJLabel.setIcon( image );
	//end set AMD as default

	//reset  JPanel
	processorJPanel.repaint();

	calculateTotal();


} //end method displayAMD



//method to clear all JTextFields
public void clearJTextFields()
{
	subtotalJTextField.setText( "$0.00" );
	taxJTextField.setText( "$0.00" );
	shippingJTextField.setText( "$0.00" );
	totalDueJTextField.setText( "$0.00" );

} //end method clearJTextFields

   // user selected intel for main computer
   private void intelJRadioButtonActionPerformed(
      ActionEvent event )
   {
		displayIntel();
		clearJTextFields();
		setDefaults();
		calculateTotal();

   } // end method intelJRadioButtonActionPerformed

   // user selected AMD for main computer
   private void amdJRadioButtonActionPerformed(
      ActionEvent event )
   {
		displayAMD();
		clearJTextFields();
		setDefaults();
		calculateTotal();

   } // end method amdJRadioButtonActionPerformed

   private void processorJRadioButtonActionPerformed(
         ActionEvent event )
      {

   		clearJTextFields();
   		calculateTotal();

      } // end method processorJRadioButtonActionPerformed

   private void memoryJRadioButtonActionPerformed(
      ActionEvent event )
   {

		clearJTextFields();
		calculateTotal();

   } // end method memoryJRadioButtonActionPerformed

   private void hardDriveJRadioButtonActionPerformed(
      ActionEvent event )
   {
		clearJTextFields();
		calculateTotal();

   } // end method hardDriveJRadioButtonActionPerformed

   private void opticalDriveJRadioButtonActionPerformed(
         ActionEvent event )
      {

   		clearJTextFields();
   		calculateTotal();

      } // end method opticalDriveJRadioButtonActionPerformed

      private void graphicJRadioButtonActionPerformed(
	        ActionEvent event )
	     {

	  		clearJTextFields();
	  		calculateTotal();

	     } // end method graphicJRadioButtonActionPerformed

	private void systemJRadioButtonActionPerformed(
      ActionEvent event )
   {

		clearJTextFields();
		calculateTotal();

   } // end method opSystemJRadioButtonActionPerformed

//method called when the JCheckBoxes are changed (selected or deselected)
   	private void applicationItemStateChanged( ItemEvent event )
   	{
		clearJTextFields();
		calculateTotal();
	}

//method to change text fields to appropriate prices



//set default method
public void setDefaults()
{
	m128MbJRadioButton.setSelected( true );
	h40GbJRadioButton.setSelected( true );
	cdRomJRadioButton.setSelected( true );
	integrated3DJRadioButton.setSelected( true );
	msHomeJRadioButton.setSelected( true );
	msOffice2003JCheckBox.setSelected( false );
	starOfficeJCheckBox.setSelected( false );
	accountingJCheckBox.setSelected( false );
	graphicsJCheckBox.setSelected( false );

}  // end set defaults method

// method to calculate total as member changes selections
	private void calculateTotal()
	{
		if (intelJRadioButton.isSelected())
			{
					subtotal = 499;
					basePrice = "Intel based system starting at $499.00";

					if (pC253JRadioButton.isSelected())
					{
						calculateMemoryTotal();
						calculateHardDriveTotal();
						calculateOpticalDriveTotal();
						calculateGraphicTotal();
						calculateSystemTotal();
						calculateApplicationTotal();
						processor = "Intel Celeron D 2.53GHz processor - Standard";
					}


					else if (p426JRadioButton.isSelected())
					{
						subtotal += 50;
						calculateMemoryTotal();
						calculateHardDriveTotal();
						calculateOpticalDriveTotal();
						calculateGraphicTotal();
						calculateSystemTotal();
						calculateApplicationTotal();
						processor = "P4 2.6Ghz processor - Add $50.00";
					}
					else if (p428JRadioButton.isSelected())
					{
						subtotal += 90;
						calculateMemoryTotal();
						calculateHardDriveTotal();
						calculateOpticalDriveTotal();
						calculateGraphicTotal();
						calculateSystemTotal();
						calculateApplicationTotal();
						processor = "Intel P4 2.8GHz processor - Add $90.00";
					}
					else if (p430JRadioButton.isSelected())
					{
						subtotal += 105;
						calculateMemoryTotal();
						calculateHardDriveTotal();
						calculateOpticalDriveTotal();
						calculateGraphicTotal();
						calculateSystemTotal();
						calculateApplicationTotal();
						processor = "Intel P4 3.0GHz processor - Add $105.00";
					}
					else if (p436JRadioButton.isSelected())
					{
						subtotal += 130;
						calculateMemoryTotal();
						calculateHardDriveTotal();
						calculateOpticalDriveTotal();
						calculateGraphicTotal();
						calculateSystemTotal();
						calculateApplicationTotal();
						processor = "Intel P4 3.6GHz processor - Add $130.00";
					}

		    }
		else if (amdJRadioButton.isSelected())
			{
					subtotal = 439;
					basePrice = "AMD based system starting at $439.00";

					if (sempron2400JRadioButton.isSelected())
					{
						calculateMemoryTotal();
						calculateHardDriveTotal();
						calculateOpticalDriveTotal();
						calculateGraphicTotal();
						calculateSystemTotal();
						calculateApplicationTotal();
						processor = "AMD Sempron 2400+ processor - Standard";
					}

					else if (sempron3100JRadioButton.isSelected())
					{
						subtotal += 25;
						calculateMemoryTotal();
						calculateHardDriveTotal();
						calculateOpticalDriveTotal();
						calculateGraphicTotal();
						calculateSystemTotal();
						calculateApplicationTotal();
						processor = "AMD Sempron 3100+ processor - Add $25.00";
					}
					else if (athlon643500JRadioButton.isSelected())
					{
						subtotal += 90;
						calculateMemoryTotal();
						calculateHardDriveTotal();
						calculateOpticalDriveTotal();
						calculateGraphicTotal();
						calculateSystemTotal();
						calculateApplicationTotal();
						processor = "AMD Athlon 64 3500+ processor - Add $90.00";
					}
					else if (athlon643800JRadioButton.isSelected())
					{
						subtotal += 187;
						calculateMemoryTotal();
						calculateHardDriveTotal();
						calculateOpticalDriveTotal();
						calculateGraphicTotal();
						calculateSystemTotal();
						calculateApplicationTotal();
						processor = "AMD Athlon 64 3800+ processor - Add $187.00";
					}
					else if (athlon644000JRadioButton.isSelected())
					{
						subtotal += 280;
						calculateMemoryTotal();
						calculateHardDriveTotal();
						calculateOpticalDriveTotal();
						calculateGraphicTotal();
						calculateSystemTotal();
						calculateApplicationTotal();
						processor = "AMD Athlon 64 4400+ processor - Add $280.00";
					}


			}  //end if

			taxAmount = subtotal * TAX_RATE;
			shipAmount = subtotal * SHIPPING;
			totalDue = subtotal + taxAmount + shipAmount;

			//specify display format
			DecimalFormat dollars = new DecimalFormat( "$0.00" );

			//display subtotal
			subtotalJTextField.setText( dollars.format( subtotal ));

			//display taxAmount
			taxJTextField.setText( dollars.format( taxAmount ));

			//display shipping and handling cost
			shippingJTextField.setText( dollars.format( shipAmount ));

			//display totalDue
			totalDueJTextField.setText( dollars.format( totalDue ));

}  //end calculateProcessorTotal method

//method to calculate memory slection
	private void calculateMemoryTotal()
	{
					if (m128MbJRadioButton.isSelected())
					{
						memory = "128Mb DDR memory - Standard";
					}
					else if (m256MbJRadioButton.isSelected())
					{
						subtotal += 28;
						memory = "256Mb DDR memory - Add $28.00";
					}
					else if (m512MbJRadioButton.isSelected())
					{
						subtotal += 58;
						memory = "512Mb DDR memory - Add $58.00";
					}
					else if (m1GbJRadioButton.isSelected())
					{
						subtotal += 108;
						memory = "1Gb DDR memory - Add $108.00";
					}
					else if (m2GbJRadioButton.isSelected())
					{
						subtotal += 176;
						memory = "2Gb DDR memory - Add $176.00";
					}

	}// end calculate memory method

//method to calculate hard drive slection
	private void calculateHardDriveTotal()
	{
					if (h40GbJRadioButton.isSelected())
					{
						hardDrive = "40Gb 7200rpm Hard Drive - Standard";
					}
					else if (h80GbJRadioButton.isSelected())
					{
						subtotal += 27;
						hardDrive = "80Gb 7200rpm Hard Drive - Add $27.00";
					}
					else if (h120GbJRadioButton.isSelected())
					{
						subtotal += 50;
						hardDrive = "120Gb 7200rpm Hard Drive - Add $50.00";
					}
					else if (h170GbJRadioButton.isSelected())
					{
						subtotal += 89;
						hardDrive = "170Gb 7200rpm Hard Drive - Add $89.00";
					}

	}// end calculate hard drive method

//method to calculate hard drive slection
	private void calculateOpticalDriveTotal()
	{
					if (cdRomJRadioButton.isSelected())
					{
						opticalDrive = "CD-Rom Drive - Standard";
				    }
					else if (dvdDriveJRadioButton.isSelected())
					{
						subtotal += 17;
						opticalDrive = "DVD Drive - Add $17.00";
					}
					else if (comboJRadioButton.isSelected())
					{
						subtotal += 40;
						opticalDrive = "Combo DVD/CDRW Drive - Add $40.00";
					}
					else if (dvdCDRWJRadioButton.isSelected())
					{
						subtotal += 79;
						opticalDrive = "DVD and CDRW Drive - Add $79.00";
					}

	}// end calculate hard drive method

//method to calculate graphic slection
	private void calculateGraphicTotal()
	{
					if (integrated3DJRadioButton.isSelected())
					{
						graphic = "Integrated 3D Graphics - Standard";
					}
					else if (nvidaPCX5300JRadioButton.isSelected())
					{
						subtotal += 80;
						graphic = "NVIDA GeForce PCX 5300 PCI Express w/128 DDR - Add $80.00";
					}
					else if (nvidaPCX6600JRadioButton.isSelected())
					{
						subtotal += 169;
						graphic = "NVIDA GeForce PCX 6600 PCI Express w/128 DDR - Add $169.00";
					}
					else if (nvidaPCX6800JRadioButton.isSelected())
					{
						subtotal += 490;
						graphic = "NVIDA GeForce PCX 6800 PCI Express w/256 DDR3 - Add $490.00";
					}

	}// end calculate graphic method

//method to calculate operating system selection
	private void calculateSystemTotal()
	{
					if (msHomeJRadioButton.isSelected())
					{
						system = "Microsoft Home Edition OS - Standard";
					}
					else if (msXPProJRadioButton.isSelected())
					{
						subtotal += 59;
						system = "Microsoft XP Professional Ed.- Add $59.00";
					}
					else if (linuxJRadioButton.isSelected())
					{
						subtotal -= 89;
						system = "Linux - Subtract $89.00";
					}


	}// end calculate operating system method

//method to calculate application package slection
	private void calculateApplicationTotal()
	{
					if (msOffice2003JCheckBox.isSelected())
					{
						subtotal += 529;
						msOffice2003 = "Microsoft Office 2003 - Add $529.00\n";
					}
					else
					{
						msOffice2003 = "";
					}
					if (starOfficeJCheckBox.isSelected())
					{
						subtotal += 39;
						starOffice = "Star Office - Add $39.00\n";
					}
					else
					{
						starOffice = "";
					}
					if (accountingJCheckBox.isSelected())
					{
						subtotal += 399;
						accounting = "Accounting package - Add $399.00\n";
					}
					else
					{
						accounting = "";
					}
					if (graphicsJCheckBox.isSelected())
					{
						subtotal += 499;
						graphicsPackage = "Graphics package - Add $499.00\n";
					}
					else
					{
						graphicsPackage = "";
					}
	}// end calculate graphic method

// method called when user clicks placeOrderJButton
   private void placeOrderJButtonActionPerformed( ActionEvent event )
   {

//specify display format
		DecimalFormat dollars = new DecimalFormat( "$0.00" );

		JOptionPane.showMessageDialog(this,  "Please confirm your order of:\n" + basePrice + "\n" +
		processor + "\n" + memory + "\n" + hardDrive + "\n" + graphic  + "\n" +
		"Floppy Disk Drive - Standard" + "\n" + opticalDrive + "\n" + "Integrated Audio - Standard" + "\n" +
		system + "\n" + "Integrated 10/100 Ethernet - Standard\n2 Piece Power Speaker Set - Standard"
		+"\nWindows Keyboard - Standard\nMicrosoft Optical Mouse - Standard\n" + msOffice2003 +  starOffice +
		accounting + graphicsPackage + "\nSubtotal: " + ( dollars.format( subtotal )) + "\nTax: " +
		( dollars.format( taxAmount)) + "\nShipping & Handling: " + ( dollars.format( shipAmount )) +"\nTotal: " +
		 String.valueOf( dollars.format( totalDue )), "Order Confirmation", JOptionPane.QUESTION_MESSAGE );


//open new frame confirming order

		JFrame confirmation = new JFrame("Order Confirmation");

		JTextArea confirmationJTextArea = new JTextArea();

		confirmation.getContentPane().add( confirmationJTextArea, BorderLayout.CENTER );

		confirmationJTextArea.setBounds( 28, 168, 232, 90 );
		confirmationJTextArea.setEditable( false );
		//confirmation.add( confirmationJTextArea );

		confirmationJTextArea.append("Thank you for your order of:\n" + basePrice + "\n" +
		processor + "\n" + memory + "\n" + hardDrive + "\n" + graphic  + "\n" +
		"Floppy Disk Drive - Standard" + "\n" + opticalDrive + "\n" + "Integrated Audio - Standard" + "\n" +
		system + "\n" + "Integrated 10/100 Ethernet - Standard\n2 Piece Power Speaker Set - Standard"
		+"\nWindows Keyboard - Standard\nMicrosoft Optical Mouse - Standard\n" + msOffice2003 +  starOffice +
		accounting + graphicsPackage + "\nSubtotal: " + ( dollars.format( subtotal )) + "\nTax: " +
		( dollars.format( taxAmount)) + "\nShipping & Handling: " + ( dollars.format( shipAmount )) +"\nTotal: " +
		 String.valueOf( dollars.format( totalDue )));


		confirmation.setLocationRelativeTo(null);

		confirmation.pack();

		confirmation.setVisible( true );


   } //end method placeOrderJButton

// method called when user clicks clearJButton
   private void clearJButtonActionPerformed( ActionEvent event )
   {

	    subtotal = 0;
		intelJRadioButton.setSelected( true );
		displayIntel();
		clearJTextFields();
		setDefaults();
		calculateTotal();

   } //end method clearJButton



	//method called when user clicks exit button
	private void exitJButtonActionPerformed( ActionEvent event )
	{
		 System.exit( 0 );
   	} //end method exitJButton



   // main method
      public static void main( String[] args )
      {
         Configurator application = new Configurator();
         application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

      } // end method main

   } // end class Configurator
