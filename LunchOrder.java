//Craig Broyles
//CPT 421 Final Project

// Final Project: LunchOrder.java
// This application computes costs of selected items for a lunch order.
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;
import javax.swing.border.*;

public class LunchOrder extends JFrame
{
   // JPanel Main Course for user inputs
   private JPanel mainCourseJPanel;

   // ButtonGroup to control numeric and letter JRadioButtons
   private ButtonGroup displayButtonGroup;

   // JRadioButtons to choose to main courses
   private JRadioButton hamburgerJRadioButton;
   private JRadioButton pizzaJRadioButton;
   private JRadioButton saladJRadioButton;

   // JPanel Add-ons for user inputs
   private JPanel addOnsJPanel;

   // JPanel Add-ons for hamburger
   //JCheckBox for Lettuce, Tomato, and Onion
   private JCheckBox hamburgerVeggiesJCheckBox;

   //JCheckBox for Mayonnaise
   private JCheckBox hamburgerMayoJCheckBox;

   //JCheckBox & JLabel for Mustard
   private JCheckBox hamburgerMustardJCheckBox;

   // JPanel Add-ons for pizza
   //JCheckBox for Pepperoni
   private JCheckBox pizzaPepperoniJCheckBox;

   //JCheckBox for Sausage
   private JCheckBox pizzaSausageJCheckBox;

   //JCheckBox for Mushrooms
   private JCheckBox pizzaMushroomsJCheckBox;

   // JPanel Add-ons for salad
   //JCheckBox for Croutons
   private JCheckBox saladCroutonsJCheckBox;

   //JCheckBox for Bacon Bits
   private JCheckBox saladBaconBitsJCheckBox;

   //JCheckBox for Bread Sticks
   private JCheckBox saladBreadSticksJCheckBox;

   // JPanel OrderTotal for user inputs
   private JPanel orderTotalJPanel;

   // JLabel and JTextField for Subtotal
   private JLabel subtotalJLabel;
   private JTextField subtotalJTextField;

   // JLabel and JTextField for Tax
   private JLabel taxJLabel;
   private JTextField taxJTextField;

   // JLabel and JTextField for Total Due
   private JLabel totalDueJLabel;
   private JTextField totalDueJTextField;

   // JButton to calculate total of items selected
   private JButton placeOrderJButton;

   // JButton to clear all JText Fields & set default to hamburger
   private JButton clearJButton;

   // JButton to exit
   private JButton exitJButton;

   //JPanel and JLabel for displaying a main course image
   private JPanel mainCourseImageJPanel;
   private JLabel mainCourseImageJLabel;

   //declare a JLabel for image use
   private JLabel imageJLabel;

   //file name and directory constants
   private final String FILE_PREFIX = "Images/";
   private final String FILE_SUFFIX = ".png";

   //declare tax rate as constant
   double TAX_RATE = .0785;

	//declare subtotal
	double subtotal;

   // no-argument constructor
      public LunchOrder()
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
		 	  imageJLabel.setBounds( 300, 150, 100, 87 );
		 	  contentPane.add( imageJLabel );

         // set up mainCourseJPanel
         mainCourseJPanel = new JPanel();
         mainCourseJPanel.setBounds( 16, 16, 150, 90 );
         mainCourseJPanel.setBorder(
         new TitledBorder( "Main course" ) );
         mainCourseJPanel.setLayout( null );
         contentPane.add( mainCourseJPanel );

         // set up displayButtonGroup
		 displayButtonGroup = new ButtonGroup();

		 // set up hamburgerJRadioButton & set hamburger as default
		 //add item listener to see if JCheckBoxes are changed
		 hamburgerJRadioButton = new JRadioButton();
		 hamburgerJRadioButton.setBounds( 6, 20, 140, 23 );
		 hamburgerJRadioButton.setText( "Hamburger - $6.95" );
		 hamburgerJRadioButton.setSelected( true );
		 displayButtonGroup.add( hamburgerJRadioButton );
		 mainCourseJPanel.add( hamburgerJRadioButton );
		 hamburgerJRadioButton.addActionListener(

		 new ActionListener() // anonymous inner class
		     {
		       // event handler called when numericJRadioButton
		       // is selected
		       public void actionPerformed( ActionEvent event )
		             {
		                hamburgerJRadioButtonActionPerformed( event );
		             }

		      } // end anonymous inner class

		       ); // end call to addActionListener

		  // set up pizzaJRadioButton
		  //add item listener to see if JCheckBoxes are changed
		  pizzaJRadioButton = new JRadioButton();
		  pizzaJRadioButton.setBounds( 6, 40, 140, 23 );
		  pizzaJRadioButton.setText( "Pizza - $5.95" );
		  displayButtonGroup.add( pizzaJRadioButton );
		  mainCourseJPanel.add( pizzaJRadioButton );
		  pizzaJRadioButton.addActionListener(

		  new ActionListener() // anonymous inner class
		      {
		         // event handler called when letterJRadioButton
		         // is selected
		         public void actionPerformed( ActionEvent event )
		             {
		                pizzaJRadioButtonActionPerformed( event );
		             }

		          } // end anonymous inner class

      ); // end call to addActionListener

         // set up saladJRadioButton
         //add item listener to see if JCheckBoxes are changed
		 saladJRadioButton = new JRadioButton();
		 saladJRadioButton.setBounds( 6, 60, 140, 23 );
		 saladJRadioButton.setText( "Salad - $4.95" );
		 displayButtonGroup.add( saladJRadioButton );
		 mainCourseJPanel.add( saladJRadioButton );
		 saladJRadioButton.addActionListener(

		 new ActionListener() // anonymous inner class
		       {
		         // event handler called when letterJRadioButton
		         // is selected
		         public void actionPerformed( ActionEvent event )
		              {
		                 saladJRadioButtonActionPerformed( event );
		              }

		           } // end anonymous inner class

      ); // end call to addActionListener

      //Set up add on JPanel
      addOnsJPanel = new JPanel();
	  addOnsJPanel.setBounds( 190, 16, 200, 90 );
	  addOnsJPanel.setBorder(
	  	new TitledBorder( "Add-ons ($.25/each)" ) );
	  addOnsJPanel.setLayout( null );
      contentPane.add( addOnsJPanel );

	  //set hamburger add-ons as default
	  //add item listener to see if JCheckBoxes are changed
	  hamburgerVeggiesJCheckBox = new JCheckBox();
	  	hamburgerVeggiesJCheckBox.setBounds( 6, 20, 180, 23 );
	  	hamburgerVeggiesJCheckBox.setText( "Lettuce, tomato, and onion" );
	  	hamburgerVeggiesJCheckBox.setSelected( true );
	  	addOnsJPanel.add( hamburgerVeggiesJCheckBox );
	  	hamburgerVeggiesJCheckBox.addItemListener(

					new ItemListener()  //anonymous inner class
					{
						//event handler to track when JCheckBox is changed
						public void itemStateChanged( ItemEvent event )
						{
							allItemStateChanged( event );
						}

					} //end anonymous inner class

					);  //end call to addChangeListener


	  	//add mayonnaise
	  	//add item listener to see if JCheckBoxes are changed
	  	hamburgerMayoJCheckBox = new JCheckBox();
	  	hamburgerMayoJCheckBox.setBounds( 6, 40, 180, 23 );
	  	hamburgerMayoJCheckBox.setText( "Mayonnaise" );
	  	addOnsJPanel.add( hamburgerMayoJCheckBox );
	  	hamburgerMayoJCheckBox.addItemListener(

					new ItemListener()  //anonymous inner class
					{
						//event handler to track when JCheckBox is changed
						public void itemStateChanged( ItemEvent event )
						{
							allItemStateChanged( event );
						}

					} //end anonymous inner class

					);  //end call to addChangeListener


	  	//add mustard - set selected
	  	//add item listener to see if JCheckBoxes are changed
	  	hamburgerMustardJCheckBox = new JCheckBox();
	  	hamburgerMustardJCheckBox.setBounds( 6, 60, 180, 23 );
	  	hamburgerMustardJCheckBox.setText( "Mustard" );
	  	hamburgerMustardJCheckBox.setSelected( true );
	  	addOnsJPanel.add( hamburgerMustardJCheckBox );
	  	hamburgerMustardJCheckBox.addItemListener(

					new ItemListener()  //anonymous inner class
					{
						//event handler to track when JCheckBox is changed
						public void itemStateChanged( ItemEvent event )
						{
							allItemStateChanged( event );
						}

					} //end anonymous inner class

					);  //end call to addChangeListener


	  	//add hamburger image to imageJLabel
	  	ImageIcon image = new ImageIcon( FILE_PREFIX + "hamburger" + FILE_SUFFIX );

	  	//display hamburger icon in imageJLabel
		imageJLabel.setIcon( image );
		//end set hamburger as default

      //Set up Order total JPanel
	  orderTotalJPanel = new JPanel();
	  orderTotalJPanel.setBounds( 16, 140, 160, 100 );
	  orderTotalJPanel.setBorder(
	  new TitledBorder( "Order total" ) );
	  orderTotalJPanel.setLayout( null );
      contentPane.add( orderTotalJPanel );

      //set up subtotal JLabel
      subtotalJLabel = new JLabel();
      subtotalJLabel.setBounds( 6, 20, 70, 23 );
      subtotalJLabel.setHorizontalAlignment( JLabel.RIGHT );
      subtotalJLabel.setText( "Subtotal: " );
      orderTotalJPanel.add( subtotalJLabel );

      //set up subtotal JTextField
	  subtotalJTextField = new JTextField();
	  subtotalJTextField.setBounds( 80, 20, 70, 23 );
	  subtotalJTextField.setEditable( false );
	  orderTotalJPanel.add( subtotalJTextField );

	  //set up tax JLabel
	  taxJLabel = new JLabel();
	  taxJLabel.setBounds( 6, 45, 70, 23 );
	  taxJLabel.setHorizontalAlignment( JLabel.RIGHT );
	  taxJLabel.setText( "Tax (7.85%) " );
	  orderTotalJPanel.add( taxJLabel );

	  //set up tax JTextField
	  taxJTextField = new JTextField();
	  taxJTextField.setBounds( 80, 45, 70, 23 );
	  taxJTextField.setEditable( false );
	  orderTotalJPanel.add( taxJTextField );

	  //set up total due JLabel
	  totalDueJLabel = new JLabel();
	  totalDueJLabel.setBounds( 6, 70, 70, 23 );
	  totalDueJLabel.setHorizontalAlignment( JLabel.RIGHT );
	  totalDueJLabel.setText( "Total due: " );
	  orderTotalJPanel.add( totalDueJLabel );

	  //set up total due JTextField
	  totalDueJTextField = new JTextField();
	  totalDueJTextField.setBounds( 80, 70, 70, 23 );
	  totalDueJTextField.setEditable( false );
	  orderTotalJPanel.add( totalDueJTextField );

	  // set up placeOrderJButton
	  placeOrderJButton = new JButton();
	  placeOrderJButton.setBounds( 190, 148, 100, 26 );
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
	  exitJButton.setBounds( 190, 210, 60, 26 );
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
	  	  clearJButton.setBounds( 190, 180, 70, 26 );
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
      setTitle( "Lunch Order" ); // set title bar string
      setSize( 430, 300 );          // set window size
      setLocationRelativeTo(null);
      setVisible( true );           // display window

}// end method createUserInterface

public void displayHamburgerAddOns()
{
	//reset add-on JPanel
	addOnsJPanel.removeAll();

	// set up Add-on JPanel for hamburger
	//add lettuce, tomato, and onion - set selected
	//add item listener to see if JCheckBoxes are changed
	hamburgerVeggiesJCheckBox = new JCheckBox();
	hamburgerVeggiesJCheckBox.setBounds( 6, 20, 180, 23 );
	hamburgerVeggiesJCheckBox.setText( "Lettuce, tomato, and onion" );
	hamburgerVeggiesJCheckBox.setSelected( true );
	addOnsJPanel.add( hamburgerVeggiesJCheckBox );
	hamburgerVeggiesJCheckBox.addItemListener(

			new ItemListener()  //anonymous inner class
			{
				//event handler to track when JCheckBox is changed
				public void itemStateChanged( ItemEvent event )
				{
					allItemStateChanged( event );
				}

			} //end anonymous inner class

			);  //end call to addChangeListener


	//add mayonnaise
	//add item listener to see if JCheckBoxes are changed
	hamburgerMayoJCheckBox = new JCheckBox();
	hamburgerMayoJCheckBox.setBounds( 6, 40, 180, 23 );
	hamburgerMayoJCheckBox.setText( "Mayonnaise" );
	addOnsJPanel.add( hamburgerMayoJCheckBox );
	hamburgerMayoJCheckBox.addItemListener(

			new ItemListener()  //anonymous inner class
			{
				//event handler to track when JCheckBox is changed
				public void itemStateChanged( ItemEvent event )
				{
					allItemStateChanged( event );
				}

			} //end anonymous inner class

			);  //end call to addChangeListener


	//add mustard - set selected
	//add item listener to see if JCheckBoxes are changed
	hamburgerMustardJCheckBox = new JCheckBox();
	hamburgerMustardJCheckBox.setBounds( 6, 60, 180, 23 );
	hamburgerMustardJCheckBox.setText( "Mustard" );
	hamburgerMustardJCheckBox.setSelected( true );
	addOnsJPanel.add( hamburgerMustardJCheckBox );
	hamburgerMustardJCheckBox.addItemListener(

			new ItemListener()  //anonymous inner class
			{
				//event handler to track when JCheckBox is changed
				public void itemStateChanged( ItemEvent event )
				{
					allItemStateChanged( event );
				}

			} //end anonymous inner class

			);  //end call to addChangeListener


	//add hamburger image to imageJLabel
	ImageIcon image = new ImageIcon( FILE_PREFIX + "hamburger" + FILE_SUFFIX );

	//display hamburger icon in imageJLabel
	imageJLabel.setIcon( image );

	//reset add-on JPanel
	addOnsJPanel.repaint();


} //end method displayHamburgerAddOns

public void displayPizzaAddOns()
{

	//reset add-on JPanel
	addOnsJPanel.removeAll();

	//set up Add-on JPanel for pizza
	//add Pepperoni
	//add item listener to see if JCheckBoxes are changed
	pizzaPepperoniJCheckBox = new JCheckBox();
	pizzaPepperoniJCheckBox.setBounds( 6, 20, 180, 23 );
	pizzaPepperoniJCheckBox.setText( "Pepperoni" );
	addOnsJPanel.add( pizzaPepperoniJCheckBox );
	pizzaPepperoniJCheckBox.addItemListener(

		new ItemListener()  //anonymous inner class
		{
			//event handler to track when JCheckBox is changed
			public void itemStateChanged( ItemEvent event )
			{
				allItemStateChanged( event );
			}

		} //end anonymous inner class

		);  //end call to addChangeListener


	//add Sausage
	//add item listener to see if JCheckBoxes are changed
	pizzaSausageJCheckBox = new JCheckBox();
	pizzaSausageJCheckBox.setBounds( 6, 40, 180, 23 );
	pizzaSausageJCheckBox.setText( "Sausage" );
	addOnsJPanel.add( pizzaSausageJCheckBox );
	pizzaSausageJCheckBox.addItemListener(

			new ItemListener()  //anonymous inner class
			{
				//event handler to track when JCheckBox is changed
				public void itemStateChanged( ItemEvent event )
				{
					allItemStateChanged( event );
				}

			} //end anonymous inner class

			);  //end call to addChangeListener


	//add Mushrooms
	//add item listener to see if JCheckBoxes are changed
	pizzaMushroomsJCheckBox = new JCheckBox();
	pizzaMushroomsJCheckBox.setBounds( 6, 60, 180, 23 );
	pizzaMushroomsJCheckBox.setText( "Mushrooms" );
	addOnsJPanel.add( pizzaMushroomsJCheckBox );
	pizzaMushroomsJCheckBox.addItemListener(

			new ItemListener()  //anonymous inner class
			{
				//event handler to track when JCheckBox is changed
				public void itemStateChanged( ItemEvent event )
				{
					allItemStateChanged( event );
				}

			} //end anonymous inner class

			);  //end call to addChangeListener


	//add pizza image to imageJLabel
	ImageIcon image = new ImageIcon( FILE_PREFIX + "pizza_slice" + FILE_SUFFIX );

	//display pizza icon in imageJLabel
	imageJLabel.setIcon( image );

	//reset add-on JPanel
	addOnsJPanel.repaint();


} //end method displayPizzaAddOns

public void displaySaladAddOns()
{
	//reset add-on JPanel
	addOnsJPanel.removeAll();

	// set up Add-on JPanel for salad
	//add croutonsJCheckBox
	//add item listener to see if JCheckBoxes are changed
	saladCroutonsJCheckBox = new JCheckBox();
	saladCroutonsJCheckBox.setBounds( 6, 20, 180, 23 );
	saladCroutonsJCheckBox.setText( "Croutons" );
	addOnsJPanel.add( saladCroutonsJCheckBox );
	saladCroutonsJCheckBox.addItemListener(

			new ItemListener()  //anonymous inner class
			{
				//event handler to track when JCheckBox is changed
				public void itemStateChanged( ItemEvent event )
				{
					allItemStateChanged( event );
				}

			} //end anonymous inner class

			);  //end call to addChangeListener


	//add Bacon Bits
	//add item listener to see if JCheckBoxes are changed
	saladBaconBitsJCheckBox = new JCheckBox();
	saladBaconBitsJCheckBox.setBounds( 6, 40, 180, 23 );
	saladBaconBitsJCheckBox.setText( "Bacon bits" );
	addOnsJPanel.add( saladBaconBitsJCheckBox );
	saladBaconBitsJCheckBox.addItemListener(

			new ItemListener()  //anonymous inner class
			{
				//event handler to track when JCheckBox is changed
				public void itemStateChanged( ItemEvent event )
				{
					allItemStateChanged( event );
				}

			} //end anonymous inner class

			);  //end call to addChangeListener


	//add Bread Sticks
	//add item listener to see if JCheckBoxes are changed
	saladBreadSticksJCheckBox = new JCheckBox();
	saladBreadSticksJCheckBox.setBounds( 6, 60, 180, 23 );
	saladBreadSticksJCheckBox.setText( "Bread sticks" );
	addOnsJPanel.add( saladBreadSticksJCheckBox );
	saladBreadSticksJCheckBox.addItemListener(

			new ItemListener()  //anonymous inner class
			{
				//event handler to track when JCheckBox is changed
				public void itemStateChanged( ItemEvent event )
				{
					allItemStateChanged( event );
				}

			} //end anonymous inner class

			);  //end call to addChangeListener


	//add salad image to imageJLabel
	ImageIcon image = new ImageIcon( FILE_PREFIX + "salad" + FILE_SUFFIX );

	//display salad icon in imageJLabel
	imageJLabel.setIcon( image );

	//reset add-on JPanel
	addOnsJPanel.repaint();

} //end method displaySaladAddOns

//method to clear all JTextFields
public void clearJTextFields()
{
	subtotalJTextField.setText( "" );
	taxJTextField.setText( "" );
	totalDueJTextField.setText( "" );

} //end method clearJTextFields

   // user selected hamburger for main course
   private void hamburgerJRadioButtonActionPerformed(
      ActionEvent event )
   {
		displayHamburgerAddOns();
		clearJTextFields();

   } // end method hamburgerJRadioButtonActionPerformed

   // user selected pizza for main course
   private void pizzaJRadioButtonActionPerformed(
      ActionEvent event )
   {
		displayPizzaAddOns();
		clearJTextFields();

   } // end method pizzaJRadioButtonActionPerformed

   // user selected salad for main course
   private void saladJRadioButtonActionPerformed(
      ActionEvent event )
   {
		displaySaladAddOns();
		clearJTextFields();

   } // end method saladJRadioButtonActionPerformed

// method called when user clicks placeOrderJButton
   private void placeOrderJButtonActionPerformed( ActionEvent event )
   {
	   	//see which JRadioButton is selected and
	   	//see which JCheckBox is selected to update subtotal
	   	if (hamburgerJRadioButton.isSelected())
	   	{
			subtotal = 6.95;

			if (hamburgerVeggiesJCheckBox.isSelected())
			{
				subtotal += .25;
			}
			if (hamburgerMayoJCheckBox.isSelected())
			{
				subtotal += .25;
			}
			if (hamburgerMustardJCheckBox.isSelected())
			{
				subtotal += .25;
			}
		}
		else if (pizzaJRadioButton.isSelected())
		{
			subtotal = 5.95;

			if (pizzaPepperoniJCheckBox.isSelected())
			{
				subtotal += .25;
			}
			if (pizzaSausageJCheckBox.isSelected())
			{
				subtotal += .25;
			}
			if (pizzaMushroomsJCheckBox.isSelected())
			{
				subtotal += .25;
			}
		}
		else if (saladJRadioButton.isSelected())
		{
			subtotal = 4.95;

			if (saladCroutonsJCheckBox.isSelected())
			{
				subtotal += .25;
			}
			if (saladBaconBitsJCheckBox.isSelected())
			{
				subtotal += .25;
			}
			if (saladBreadSticksJCheckBox.isSelected())
			{
				subtotal += .25;
			}
		} //end if


		double taxAmount = subtotal * TAX_RATE;
		double totalDue = subtotal + taxAmount;

		//specify display format
		DecimalFormat dollars = new DecimalFormat( "$0.00" );

		//display subtotal
		subtotalJTextField.setText( dollars.format( subtotal ));

		//display taxAmount
		taxJTextField.setText( dollars.format( taxAmount ));

		//display totalDue
		totalDueJTextField.setText( dollars.format( totalDue ));

   } //end method placeOrderJButton

// method called when user clicks clearJButton
   private void clearJButtonActionPerformed( ActionEvent event )
   {
		displayHamburgerAddOns();
		clearJTextFields();

   } //end method clearJButton

	//method called when user clicks exit button
	private void exitJButtonActionPerformed( ActionEvent event )
	{
		 System.exit( 0 );
   	} //end method exitJButton

   	//method called when the JCheckBoxes are changed (selected or deselected)
   	private void allItemStateChanged( ItemEvent event )
   	{
		clearJTextFields();
	}


   // main method
      public static void main( String[] args )
      {
         LunchOrder application = new LunchOrder();
         application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

      } // end method main

   } // end class LunchOrder
