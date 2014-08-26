//Craig Broyles
//Calorie Counter Plus


// This application computes Basal Metabolic Rate (BMR) and Body Mass Index (BMI).
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;
import javax.swing.border.*;

public class CalorieCounterPlus extends JFrame
{
   //JPanel for instructions and information
   private JPanel instructionJPanel;

   // JPanel calorieCounterPlus for user inputs
   private JPanel calorieCounterPlusJPanel;

   // JPanel userInput for user inputs
   private JPanel userInputJPanel;

   // JPanel userOutput for user outputs
   private JPanel userOutputJPanel;

   //JPanel for inforamtion
   private JPanel informationJPanel;

   //JPanel for BMI classification
   private JPanel BMIclassJPanel;

   // ButtonGroup to control JRadioButtons
   private ButtonGroup displayButtonGroup;

   // JRadioButtons to choose to Gender
   private JRadioButton maleJRadioButton;
   private JRadioButton femaleJRadioButton;

	//Instructions JLabel
	private JLabel instructionsJLabel;

	//Instructions2 JLabel
	private JLabel instructions2JLabel;

	// JLabel for BMR information
	private JLabel BMRinfoJLabel;

	// 2nd JLabel for BMR information
	private JLabel BMRinfo2JLabel;

	//JLabel for BMI information
	private JLabel BMIinfoJLabel;

	//2nd JLabel for BMI information
	private JLabel BMIinfo2JLabel;

	//JLabel for BMI of 18.5 or less = Underweight
	private JLabel underweightJLabel;

	//JLabel for BMI of 18.5 - 24.99 = Normal weight
	private JLabel normalJLabel;

	//JLabel for BMI of 25 - 29.99 = Overweight
	private JLabel overweightJLabel;

	//JLabel for BMI of 30 - 34.99 = Obesity (Class 1)
	private JLabel obesity1JLabel;

	//JLabel for BMI of 35 - 39.99 = Obesity (Class 2)
	private JLabel obesity2JLabel;

	//JLabel for BMI of 40 or greater = Morbid Obesity
	private JLabel morbidJLabel;



   //JLabel for height
   private JLabel heightJLabel;

   // JLabel and JTextField for Height in feet
   private JLabel heightFtJLabel;
   private JTextField heightFtJTextField;

   // JLabel and JTextField for Height in inches
   private JLabel heightInJLabel;
   private JTextField heightInJTextField;

   // JLabel and JTextField for weight
   private JLabel weightJLabel;
   private JTextField weightJTextField;
   private JLabel weightLBSJLabel;

   // JLabel and JTextField for age
   private JLabel ageJLabel;
   private JTextField ageJTextField;


   //JLabel and JTextField for BMR information
   private JLabel bmrJLabel;
   private JTextField bmrJTextField;

   //JLabel and JTextFiedl for BMI information
   private JLabel bmiJLabel;
   private JTextField bmiJTextField;


   // JButton to calculate BMR & BMI
   private JButton calculateJButton;

   // JButton to clear all JText Fields
   private JButton clearJButton;

   // JButton to exit
   private JButton exitJButton;






   // no-argument constructor
      public CalorieCounterPlus()
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

		// set up instructions
         instructionJPanel = new JPanel();
         instructionJPanel.setBounds( 16, 16, 485, 60 );
         instructionJPanel.setBorder(
         	new TitledBorder( "Instructions: " ) );
         instructionJPanel.setLayout( null );
         contentPane.add( instructionJPanel );

         //set up instructionsJLabel
		 instructionsJLabel = new JLabel();
		 instructionsJLabel.setBounds( 6, 0, 470, 50 );
		 instructionsJLabel.setHorizontalAlignment( JLabel.LEFT );
		 instructionsJLabel.setText( "Please enter your height in feet and inches, weight in pounds, age in years, " );
      	 instructionJPanel.add( instructionsJLabel );

      	 //set up instructionsJLabel
		 instructions2JLabel = new JLabel();
		 instructions2JLabel.setBounds( 6, 20, 470, 50 );
		 instructions2JLabel.setHorizontalAlignment( JLabel.LEFT );
		 instructions2JLabel.setText( "and select your gender.  Then press calculate to calculate your BMR and BMI." );
      	 instructionJPanel.add( instructions2JLabel );

         // set up calorieCounterPlusJPanel
         calorieCounterPlusJPanel = new JPanel();
         calorieCounterPlusJPanel.setBounds( 16, 200, 150, 90 );
         calorieCounterPlusJPanel.setBorder(
         	new TitledBorder( "Select Gender" ) );
         calorieCounterPlusJPanel.setLayout( null );
         contentPane.add( calorieCounterPlusJPanel );

         // set up displayButtonGroup
		 displayButtonGroup = new ButtonGroup();

		 // set up maleJRadioButton & set male as default

		 maleJRadioButton = new JRadioButton();
		 maleJRadioButton.setBounds( 6, 20, 140, 23 );
		 maleJRadioButton.setText( "Male" );
		 maleJRadioButton.setSelected( true );
		 displayButtonGroup.add( maleJRadioButton );
		 calorieCounterPlusJPanel.add( maleJRadioButton );
		 maleJRadioButton.addActionListener(

		 new ActionListener() // anonymous inner class
		     {
		       // event handler called when maleJRadioButton
		       // is selected
		       public void actionPerformed( ActionEvent event )
		             {
		                maleJRadioButtonActionPerformed( event );
		             }

		      } // end anonymous inner class

		       ); // end call to addActionListener

		  // set up femaleJRadioButton
		  //add item listener to see if JCheckBoxes are changed
		  femaleJRadioButton = new JRadioButton();
		  femaleJRadioButton.setBounds( 6, 40, 140, 23 );
		  femaleJRadioButton.setText( "Female" );
		  displayButtonGroup.add( femaleJRadioButton );
		  calorieCounterPlusJPanel.add( femaleJRadioButton );
		  femaleJRadioButton.addActionListener(

		  new ActionListener() // anonymous inner class
		      {
		         // event handler called when letterJRadioButton
		         // is selected
		         public void actionPerformed( ActionEvent event )
		             {
		                femaleJRadioButtonActionPerformed( event );
		             }

		          } // end anonymous inner class

      ); // end call to addActionListener



	  // set up userInputJPanel
	  userInputJPanel = new JPanel();
	  userInputJPanel.setBounds( 16, 80, 280, 100 );
	  userInputJPanel.setBorder(
	  	new TitledBorder( "Please input information:" ) );
	  userInputJPanel.setLayout( null );
      contentPane.add( userInputJPanel );


      //set up height JLabel
      heightJLabel = new JLabel();
      heightJLabel.setBounds( 6, 20, 70, 23 );
      heightJLabel.setHorizontalAlignment( JLabel.RIGHT );
      heightJLabel.setText( "Height: " );
      userInputJPanel.add( heightJLabel );

      //set up heigthFt JTextField
	  heightFtJTextField = new JTextField();
	  heightFtJTextField.setBounds( 80, 20, 50, 23 );
	  heightFtJTextField.setText( "" );
	  heightFtJTextField.setEditable( true );
	  userInputJPanel.add( heightFtJTextField );

	  //set up heightFt JLabel
	  heightFtJLabel = new JLabel();
	  heightFtJLabel.setBounds( 140, 20, 20, 23 );
	  heightFtJLabel.setHorizontalAlignment( JLabel.LEFT );
	  heightFtJLabel.setText( "Ft" );
	  userInputJPanel.add( heightFtJLabel );


	  //set up heigthIn JTextField
	  heightInJTextField = new JTextField();
	  heightInJTextField.setBounds( 180, 20, 50, 23 );
	  heightInJTextField.setText( "" );
	  heightInJTextField.setEditable( true );
	  userInputJPanel.add( heightInJTextField );

	  //set up heightIn JLabel
	  heightInJLabel = new JLabel();
	  heightInJLabel.setBounds( 240, 20, 20, 23 );
	  heightInJLabel.setHorizontalAlignment( JLabel.LEFT );
	  heightInJLabel.setText( "In" );
	  userInputJPanel.add( heightInJLabel );

	  //set up weight JLabel
	  weightJLabel = new JLabel();
	  weightJLabel.setBounds( 6, 45, 70, 23 );
	  weightJLabel.setHorizontalAlignment( JLabel.RIGHT );
	  weightJLabel.setText( "Weight: " );
	  userInputJPanel.add( weightJLabel );

	  //set up weight JTextField
	  weightJTextField = new JTextField();
	  weightJTextField.setBounds( 80, 45, 50, 23 );
	  weightJTextField.setText( "" );
	  weightJTextField.setEditable( true );
	  userInputJPanel.add( weightJTextField );

	  //set up weightLBS JLabel
	  weightLBSJLabel = new JLabel();
	  weightLBSJLabel.setBounds( 140, 45, 40, 23 );
	  weightLBSJLabel.setHorizontalAlignment( JLabel.LEFT );
	  weightLBSJLabel.setText( "LBS" );
	  userInputJPanel.add( weightLBSJLabel );

	  //set up age JLabel
	  ageJLabel = new JLabel();
	  ageJLabel.setBounds( 6, 70, 70, 23 );
	  ageJLabel.setHorizontalAlignment( JLabel.RIGHT );
	  ageJLabel.setText( "Age: " );
	  userInputJPanel.add( ageJLabel );

	  //set up age JTextField
	  ageJTextField = new JTextField();
	  ageJTextField.setBounds( 80, 70, 50, 23 );
	  ageJTextField.setText( "" );
	  ageJTextField.setEditable( true );
	  userInputJPanel.add( ageJTextField );

	  // set up userOutputJPanel
	  userOutputJPanel = new JPanel();
	  userOutputJPanel.setBounds( 320, 80, 180, 100 );
	  userOutputJPanel.setBorder(
	  	new TitledBorder( "Calculated information:" ) );
	  userOutputJPanel.setLayout( null );
	  contentPane.add( userOutputJPanel );

	  //set up bmr JLabel
      bmrJLabel = new JLabel();
      bmrJLabel.setBounds( 6, 20, 70, 23 );
      bmrJLabel.setHorizontalAlignment( JLabel.RIGHT );
      bmrJLabel.setText( "BMR: " );
      userOutputJPanel.add( bmrJLabel );

      //set up bmr JTextField
	  bmrJTextField = new JTextField();
	  bmrJTextField.setBounds( 80, 20, 50, 23 );
	  bmrJTextField.setText( "" );
	  bmrJTextField.setEditable( false );
	  userOutputJPanel.add( bmrJTextField );

	  //set up bmi JLabel
      bmiJLabel = new JLabel();
      bmiJLabel.setBounds( 6, 45, 70, 23 );
      bmiJLabel.setHorizontalAlignment( JLabel.RIGHT );
      bmiJLabel.setText( "BMI: " );
      userOutputJPanel.add( bmiJLabel );

      //set up bmi JTextField
	  bmiJTextField = new JTextField();
	  bmiJTextField.setBounds( 80, 45, 50, 23 );
	  bmiJTextField.setText( "" );
	  bmiJTextField.setEditable( false );
	  userOutputJPanel.add( bmiJTextField );

	  // set up informationJPanel
	  informationJPanel = new JPanel();
	  informationJPanel.setBounds( 16, 300, 485, 120 );
	  informationJPanel.setBorder(
	      	new TitledBorder( "Information: " ) );
	  instructionJPanel.setLayout( null );
      contentPane.add( informationJPanel );

	  //set up BMRinfoJLabel
	 BMRinfoJLabel = new JLabel();
	 BMRinfoJLabel.setBounds( 6, 0, 470, 50 );
	 BMRinfoJLabel.setHorizontalAlignment( JLabel.LEFT );
	 BMRinfoJLabel.setText( "Basal Metabolic Rate (BMR) is the number of calories you'd burn if you stayed in" );
   	 informationJPanel.add( BMRinfoJLabel );

	 //set up BMRinfo2JLabel
	 BMRinfo2JLabel = new JLabel();
	 BMRinfo2JLabel.setBounds( 6, 20, 470, 50 );
	 BMRinfo2JLabel.setHorizontalAlignment( JLabel.LEFT );
	 BMRinfo2JLabel.setText( "bed all day.  You use energy no matter what you're doing, even when sleeping." );
   	 informationJPanel.add( BMRinfo2JLabel );

   	 //set up BMIinfoJLabel
	 BMIinfoJLabel = new JLabel();
	 BMIinfoJLabel.setBounds( 6, 100, 470, 50 );
	 BMIinfoJLabel.setHorizontalAlignment( JLabel.LEFT );
	 BMIinfoJLabel.setText( "Body Mass Index (BMI) is a measurement of body fat based on height and weight" );
   	 informationJPanel.add( BMIinfoJLabel );

   	 //set up BMIinfo2JLabel
	 BMIinfo2JLabel = new JLabel();
	 BMIinfo2JLabel.setBounds( 6, 100, 470, 50 );
	 BMIinfo2JLabel.setHorizontalAlignment( JLabel.LEFT );
	 BMIinfo2JLabel.setText( "that applies to both men and women between the ages of 18 and 65 years." );
   	 informationJPanel.add( BMIinfo2JLabel );

	// set up BMIclassJPanel
	  BMIclassJPanel = new JPanel();
	  BMIclassJPanel.setBounds( 320, 190, 180, 110 );
	  BMIclassJPanel.setBorder(
	  	new TitledBorder( "BMI Classification:" ) );
	  BMIclassJPanel.setLayout( null );
	  contentPane.add( BMIclassJPanel );

	  //set up underweight JLabel
	  underweightJLabel = new JLabel();
	  underweightJLabel.setBounds( 6, 10, 170, 23 );
	  underweightJLabel.setHorizontalAlignment( JLabel.LEFT );
	  underweightJLabel.setText( "18.5 or less    Underweight" );
      BMIclassJPanel.add( underweightJLabel );

      //set up normalJLabel
	  normalJLabel = new JLabel();
	  normalJLabel.setBounds( 6, 25, 170, 23 );
	  normalJLabel.setHorizontalAlignment( JLabel.LEFT );
	  normalJLabel.setText( "18.5 - 24.99    Normal Weight" );
      BMIclassJPanel.add( normalJLabel );

      //set up overweightJLabel
	  overweightJLabel = new JLabel();
	  overweightJLabel.setBounds( 6,40, 170, 23 );
	  overweightJLabel.setHorizontalAlignment( JLabel.LEFT );
	  overweightJLabel.setText( "25 - 29.99       Overweight" );
      BMIclassJPanel.add( overweightJLabel );

      //set up obesity1JLabel
	  obesity1JLabel = new JLabel();
	  obesity1JLabel.setBounds( 6, 55, 170, 23 );
	  obesity1JLabel.setHorizontalAlignment( JLabel.LEFT );
	  obesity1JLabel.setText( "30 - 34.99       Obesity(Class 1)" );
      BMIclassJPanel.add( obesity1JLabel );

      //set up obesity2JLabel
	  obesity2JLabel = new JLabel();
	  obesity2JLabel.setBounds( 6, 70, 170, 23 );
	  obesity2JLabel.setHorizontalAlignment( JLabel.LEFT );
	  obesity2JLabel.setText( "35 - 39.99       Obesity(Class 2)" );
      BMIclassJPanel.add( obesity2JLabel );

      //set up morbidJLabel
	  morbidJLabel = new JLabel();
	  morbidJLabel.setBounds( 6, 85, 170, 23 );
	  morbidJLabel.setHorizontalAlignment( JLabel.LEFT );
	  morbidJLabel.setText( "40 or greater  Morbid Obesity" );
      BMIclassJPanel.add( morbidJLabel );



	  // set up calculateJButton
	  calculateJButton = new JButton();
	  calculateJButton.setBounds( 190, 210, 100, 26 );
	  calculateJButton.setText( "Calculate" );
	  contentPane.add( calculateJButton );
	  calculateJButton.addActionListener(

	     new ActionListener() // anonymous inner class
	        {
	           // event handler called when calculateJButton is pressed
	           public void actionPerformed ( ActionEvent event )
	              {
	                  calculateJButtonActionPerformed( event );
	              }

	         } // end anonymous inner class

	  ); // end call to addActionListener

	  // set up exitJButton
	  exitJButton = new JButton();
	  exitJButton.setBounds( 190, 270, 60, 26 );
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
	  	  clearJButton.setBounds( 190, 240, 70, 26 );
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
      setTitle( "Calorie Counter Plus" ); // set title bar string
      setSize( 540, 500 );          // set window size
      setLocationRelativeTo(null);
      setVisible( true );           // display window

}// end method createUserInterface


//method to clear all JTextFields
public void clearJTextFields()
{
	heightFtJTextField.setText( "" );
	heightInJTextField.setText( "" );
	weightJTextField.setText( "" );
	ageJTextField.setText( "" );
	bmrJTextField.setText( "" );
	bmiJTextField.setText( "" );


} //end method clearJTextFields

   // user selected male JRadioButton
   private void maleJRadioButtonActionPerformed(
      ActionEvent event )
   {

		clearJTextFields();

   } // end method maleJRadioButtonActionPerformed

   // user selected female JRadioButton
   private void femaleJRadioButtonActionPerformed(
      ActionEvent event )
   {

		clearJTextFields();

   } // end method femaleJRadioButtonActionPerformed



// method called when user clicks calculateJButton
   private void calculateJButtonActionPerformed( ActionEvent event )
   {
	   	//see which JRadioButton is selected
	   	// and perform correct formula
	   	//Check to make sure numbers (integers) were entered

		try
		{
	   		double BMR;
	   		double BMI;
	   		int heightininches = ((Integer.parseInt(heightFtJTextField.getText()) * 12) +
	   				Integer.parseInt(heightInJTextField.getText()));
	   		int weight = Integer.parseInt(weightJTextField.getText());
	   		int age = Integer.parseInt(ageJTextField.getText());

	   		//format to display to two decimal places format
			DecimalFormat twoplaces = new DecimalFormat( "0.00" );

			double heightsquared = heightininches * heightininches;
	   		BMI = ( weight /  heightsquared ) * 703;
			bmiJTextField.setText( String.valueOf (twoplaces.format(BMI)));

	   		if (maleJRadioButton.isSelected())
	   		{
				//FORMULA for Males
				BMR = ((66 + ( 6.23 * weight ) + ( 12.7 * heightininches )) - ( 6.8 * age ));
				bmrJTextField.setText( String.valueOf (twoplaces.format(BMR)));

			}
			else if (femaleJRadioButton.isSelected())
			{
				//FORMULA for females;
				BMR = ((655 + ( 4.35 * weight ) + ( 4.7 * heightininches )) - ( 4.7 * age ));
				bmrJTextField.setText( String.valueOf (twoplaces.format(BMR)));

			} //end if

		} //end try
		catch ( NumberFormatException exception )
		 {
		 	JOptionPane.showMessageDialog( this,
		 		"Please enter only integers for the data input.",
		 		"Number Format Error", JOptionPane.ERROR_MESSAGE );
	 	} //end catch


   } //end method calculateJButton

// method called when user clicks clearJButton
   private void clearJButtonActionPerformed( ActionEvent event )
   {

		clearJTextFields();
		maleJRadioButton.setSelected( true );

   } //end method clearJButton

	//method called when user clicks exit button
	private void exitJButtonActionPerformed( ActionEvent event )
	{
		 System.exit( 0 );
   	} //end method exitJButton




   // main method
      public static void main( String[] args )
      {
         CalorieCounterPlus application = new CalorieCounterPlus();
         application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

      } // end method main

   } // end class CalorieCounterPlus
