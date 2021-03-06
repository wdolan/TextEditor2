/*
 * Graphical User Interface for Customer Information Submission
 * Olympic Pride Project
 * Team Fearsome Foursome
 * GUI primarily developed by Scott Young
 * Handling code primarily developed by Bella Belova
 * File handling code primarily developed by Benny Nunez
 * Class code, bugfixes and streamlining by Amy Roberts
 * Intro to Programming for Business
 * "We pledge that we have complied with the AIC in this work."
 * - AR / BB / BN / SY
 * 
 * This application was originally written using NetBeans.
 * To compile and run this application, a user may use NetBeans or another IDE,
 * or compile using the command-line access to the SDK, using the command "javac GUI.java".
 * To run after manual compilation, use "java GUI."
 * 
 * This application is designed to allow entry of customer data, which the
 * application will format and output into a comma-delimited file. A GUI is 
 * provided for user convenience.
 */
package texteditor;

import java.awt.Component;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Scott Young, Amy Roberts, Bella Belova, Benny Nunez
 */
public class GUI extends javax.swing.JFrame {

	/**
	 * Creates new form GUI
	 */
    
    //Declare variables to use for error Exceptions
    private String first_name;
    private String last_name;
    private String address1;
    private String city;
    private String State;
    private String zip;
    private String email;
    
    // Hold the data in the output textbox
    private String window_output_container;
    
    private String header = "First Name,Last Name,Address,Address 2,"
            + "City,State,Zip Code,Phone Number,Email Address\r\n";
    //If the error exists in required fields, error_flag is set to true
    private boolean error_flag = false;
    
    //If header is displayed then toggle_header is true
    private boolean toggle_header = false;
    
    private Customer cst;
	 private Component aComponent;

	public GUI() {
		initComponents();
                cst = new Customer();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      OlympicPride = new javax.swing.JLabel();
      CustInfoForm = new javax.swing.JLabel();
      ReqFieldInstruct = new javax.swing.JLabel();
      FirstName = new javax.swing.JLabel();
      FirstNameField = new javax.swing.JTextField();
      LastName = new javax.swing.JLabel();
      LastNameField = new javax.swing.JTextField();
      AddressLine1 = new javax.swing.JLabel();
      Address1Field = new javax.swing.JTextField();
      AddressLine2 = new javax.swing.JLabel();
      Address2Field = new javax.swing.JTextField();
      City = new javax.swing.JLabel();
      CityField = new javax.swing.JTextField();
      StateLabel = new javax.swing.JLabel();
      StateDropDown = new javax.swing.JComboBox();
      ZipCode = new javax.swing.JLabel();
      PhoneNumber = new javax.swing.JLabel();
      EmailAddress = new javax.swing.JLabel();
      EmailAddressField = new javax.swing.JTextField();
      FileOutput = new javax.swing.JLabel();
      AddHeaderRow = new javax.swing.JButton();
      NewFile = new javax.swing.JButton();
      OpenFile = new javax.swing.JButton();
      SaveRecord = new javax.swing.JButton();
      SaveFile = new javax.swing.JButton();
      Exit = new javax.swing.JButton();
      jScrollPane1 = new javax.swing.JScrollPane();
      FileOutputArea = new javax.swing.JTextArea();
      PhoneNumberField = new javax.swing.JFormattedTextField();
      ZipCodeField = new javax.swing.JFormattedTextField();
      ColorBar1 = new javax.swing.JLabel();
      ColorBar2 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("Olympic Pride Customer Entry Form");

      OlympicPride.setFont(new java.awt.Font("Gill Sans", 1, 48)); // NOI18N
      OlympicPride.setText("Olympic Pride");

      CustInfoForm.setFont(new java.awt.Font("Gill Sans", 1, 28)); // NOI18N
      CustInfoForm.setText("Customer Information Form");

      ReqFieldInstruct.setFont(new java.awt.Font("Lucida Grande", 2, 10)); // NOI18N
      ReqFieldInstruct.setForeground(new java.awt.Color(255, 0, 51));
      ReqFieldInstruct.setText("* indicates required field");

      FirstName.setText("First Name *");

      FirstNameField.setNextFocusableComponent(LastNameField);
      FirstNameField.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            FirstNameFieldActionPerformed(evt);
         }
      });
      FirstNameField.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusGained(java.awt.event.FocusEvent evt) {
            FirstNameFieldFocusGained(evt);
         }
      });

      LastName.setText("Last Name *");

      LastNameField.setNextFocusableComponent(Address1Field);
      LastNameField.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusGained(java.awt.event.FocusEvent evt) {
            LastNameFieldFocusGained(evt);
         }
      });

      AddressLine1.setText("Address 1 *");

      Address1Field.setNextFocusableComponent(Address2Field);
      Address1Field.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusGained(java.awt.event.FocusEvent evt) {
            Address1FieldFocusGained(evt);
         }
      });

      AddressLine2.setForeground(new java.awt.Color(51, 51, 255));
      AddressLine2.setText("Address 2");

      Address2Field.setNextFocusableComponent(CityField);
      Address2Field.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusGained(java.awt.event.FocusEvent evt) {
            Address2FieldFocusGained(evt);
         }
      });

      City.setText("City *");

      CityField.setNextFocusableComponent(StateDropDown);
      CityField.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusGained(java.awt.event.FocusEvent evt) {
            CityFieldFocusGained(evt);
         }
      });

      StateLabel.setText("State *");

      StateDropDown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "Washington D.C.", "West Virginia", "Wisconsin", "Wyoming" }));
      StateDropDown.setNextFocusableComponent(ZipCodeField);
      StateDropDown.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            StateDropDownActionPerformed(evt);
         }
      });

      ZipCode.setText("Zip Code *");

      PhoneNumber.setForeground(new java.awt.Color(51, 51, 255));
      PhoneNumber.setText("Phone Number");

      EmailAddress.setText("Email Address *");

      EmailAddressField.setNextFocusableComponent(SaveRecord);
      EmailAddressField.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusGained(java.awt.event.FocusEvent evt) {
            EmailAddressFieldFocusGained(evt);
         }
      });

      FileOutput.setFont(new java.awt.Font("Gill Sans", 1, 18)); // NOI18N
      FileOutput.setText("File Output");

      AddHeaderRow.setText("Add Header Row");
      AddHeaderRow.setNextFocusableComponent(SaveFile);
      AddHeaderRow.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            AddHeaderRowActionPerformed(evt);
         }
      });

      NewFile.setText("New File");
      NewFile.setNextFocusableComponent(FirstNameField);
      NewFile.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            NewFileActionPerformed(evt);
         }
      });

      OpenFile.setText("Open File");
      OpenFile.setNextFocusableComponent(FirstNameField);
      OpenFile.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            OpenFileActionPerformed(evt);
         }
      });

      SaveRecord.setText("Save Record");
      SaveRecord.setNextFocusableComponent(FirstNameField);
      SaveRecord.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            SaveRecordActionPerformed(evt);
         }
      });

      SaveFile.setText("Save File");
      SaveFile.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            SaveFileActionPerformed(evt);
         }
      });

      Exit.setText("Exit");
      Exit.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            ExitActionPerformed(evt);
         }
      });

      FileOutputArea.setColumns(20);
      FileOutputArea.setRows(5);
      jScrollPane1.setViewportView(FileOutputArea);

      try {
         PhoneNumberField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)###-####")));
      } catch (java.text.ParseException ex) {
         ex.printStackTrace();
      }
      PhoneNumberField.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusGained(java.awt.event.FocusEvent evt) {
            PhoneNumberFieldFocusGained(evt);
         }
      });

      try {
         ZipCodeField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
      } catch (java.text.ParseException ex) {
         ex.printStackTrace();
      }
      ZipCodeField.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            ZipCodeFieldActionPerformed(evt);
         }
      });
      ZipCodeField.addFocusListener(new java.awt.event.FocusAdapter() {
         public void focusGained(java.awt.event.FocusEvent evt) {
            ZipCodeFieldFocusGained(evt);
         }
      });

      ColorBar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/colorbar.jpg"))); // NOI18N

      ColorBar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/colorbar.jpg"))); // NOI18N

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGap(721, 721, 721)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(NewFile)
                           .addComponent(OpenFile)
                           .addComponent(SaveRecord))
                        .addGap(0, 0, Short.MAX_VALUE))
                     .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(SaveFile)
                           .addComponent(Exit))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                     .addComponent(ReqFieldInstruct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                           .addComponent(City, javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(OlympicPride, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(CustInfoForm)
                  .addGap(45, 45, 45))
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(FirstName)
                           .addComponent(LastName)))
                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                           .addComponent(FileOutput)
                           .addGap(414, 414, 414)
                           .addComponent(AddHeaderRow))
                        .addGroup(layout.createSequentialGroup()
                           .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(EmailAddress)
                              .addComponent(AddressLine1)
                              .addComponent(AddressLine2)
                              .addComponent(StateLabel))
                           .addGap(14, 14, 14)
                           .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(Address1Field, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                 .addComponent(LastNameField, javax.swing.GroupLayout.Alignment.LEADING)
                                 .addComponent(FirstNameField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
                              .addComponent(Address2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(CityField, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                 .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(StateDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(ZipCode)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ZipCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PhoneNumber)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(PhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                 .addComponent(EmailAddressField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)))
                           .addGap(90, 90, 90))))
                  .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(ColorBar1)
                     .addComponent(ColorBar2))
                  .addGap(0, 8, Short.MAX_VALUE))))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGap(8, 8, 8)
                  .addComponent(ColorBar1)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(OlympicPride, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(ReqFieldInstruct))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                  .addGap(67, 67, 67)
                  .addComponent(CustInfoForm)))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(FirstName)
               .addComponent(NewFile)
               .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(4, 4, 4)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(LastName)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(LastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(OpenFile)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(AddressLine1)
               .addComponent(Address1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(SaveRecord))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(AddressLine2)
               .addComponent(Address2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(City)
               .addComponent(CityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(ZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(StateLabel)
                  .addComponent(StateDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(ZipCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(PhoneNumberField, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                  .addComponent(PhoneNumber)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(EmailAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(EmailAddress))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(FileOutput)
               .addComponent(AddHeaderRow))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGap(0, 81, Short.MAX_VALUE)
                  .addComponent(SaveFile)
                  .addGap(18, 18, 18)
                  .addComponent(Exit)
                  .addGap(35, 35, 35))
               .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(ColorBar2)
            .addGap(8, 8, 8))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

    private void SaveRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveRecordActionPerformed

        error_flag = false;             // Variable initiation set false

        // First Name is required field.  If field is empty an error msg 
        // displays the error and focus set on missing field
        try
        {
            cst.setFName(FirstNameField.getText());
            
            if(cst.getFName().isEmpty() == true)
            {
                error_flag = true;
                throw Exception (first_name);
                            
            }     // end if first name

         
        }       // end try first name
        
        catch (Exception first_name)
        {
            JOptionPane.showMessageDialog(rootPane, "First Name missing", "First Name", WIDTH);
            FirstNameField.requestFocus();
                 
        }   //end catch first name

        // Last Name is required field.  If field is empty an error msg 
        // displays the error and focus set on missing field
        
        try
        {
            cst.setLName(LastNameField.getText());
            
            if(cst.getLName().isEmpty() == true)
            {
                error_flag = true;
                throw Exception (last_name);
                            
            }       // end if last name

         }       // end try last name
        
        catch (Exception last_name)
        {
            JOptionPane.showMessageDialog(rootPane, "Last Name missing", "Last Name", WIDTH);
            LastNameField.requestFocus();
            
        }   //end catch last name
               
        
        // Address1 is required field.  If field is empty an error msg 
        // displays the error and focus set on missing field        
        try
        {
            cst.setAddress(Address1Field.getText());
            
            if(cst.getAddress().isEmpty() == true)
            {
                error_flag = true;
                throw Exception (address1);
            
            }       // end if address1

         }       // end try address1
        
        catch (Exception address1)
        {
            JOptionPane.showMessageDialog(rootPane, "Address missing", "Address", WIDTH);
            Address1Field.requestFocus();

        }   // end catch address1
        
        
        // The field is optional.
        cst.setAddress2(Address2Field.getText());
                
        
        // City is required field.  If field is empty an error msg 
        // displays the error and focus set on missing field        
        try
        {
            cst.setCity(CityField.getText());
            
            if(cst.getCity().isEmpty() == true)
            {
                error_flag = true;
                throw Exception (city);
            }       // end if city

         }       // end try city
                
         catch (Exception city)
         {
             JOptionPane.showMessageDialog(rootPane, "City missing", "City", WIDTH);
             CityField.requestFocus();
         
         }   // end catch city
        
        // State is required field.  If field is empty an error msg 
        // displays the error and focus set on missing field        
        try
        {
            cst.setState((String)StateDropDown.getSelectedItem());
            if (StateDropDown.getSelectedItem().equals((String)"Select"))

            {
                error_flag = true;
                cst.setState("");     
                throw Exception (State);
            }
          
         }       // end try state
                
         catch (Exception State)
         {
             
             JOptionPane.showMessageDialog(rootPane, "State missing", "State", WIDTH);                          
         
         }   // end catch state

        // Email is required field.  If field is empty an error msg 
        // displays the error and focus set on missing field        
         try
         {
             cst.setEmail(EmailAddressField.getText());
             
             if(cst.getEmail().isEmpty() == true)
             {
                 error_flag = true;
                 throw Exception (email);
             }

          }       // end try email
                
                      
         catch (Exception email)
         {
             JOptionPane.showMessageDialog(rootPane, "EMail missing", "EMail Address", WIDTH);
             EmailAddressField.requestFocus();
         
         }   //end catch email

			cst.setZip(ZipCodeField.getText());
			try
			{
				if(ZipCodeField.getText().length() != 5)
				{
					ZipCodeField.setText("");
					error_flag = true;
					throw Exception (zip);
				}      // end if zip
			}	// end try zip

			catch (Exception zip) 
         {
             JOptionPane.showMessageDialog(rootPane, "Zip Code 5 digits", "Zip Code", WIDTH);
             error_flag = true;
             ZipCodeField.requestFocus();
          
         }      // end catch zip

         //test string match to prevent output issues with masking
				if(PhoneNumberField.getText().equals("(   )   -    "))
				{
					cst.setPhone("");	// prevents the output from having the mask format show up
			   } //end if
				else
				{
					cst.setPhone(PhoneNumberField.getText());
				} //end else

         if(error_flag == false)
         {
				//grab text from output area in case of edits; append data from current customer object, display all
				window_output_container = FileOutputArea.getText() + cst.print();
				FileOutputArea.setText(window_output_container);

				ClearGUIFields();
			}
         
         // reinitialize object using constructor to reset values
         cst = new Customer();
    }//GEN-LAST:event_SaveRecordActionPerformed

    private void StateDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StateDropDownActionPerformed
        // misclick, no code
    }//GEN-LAST:event_StateDropDownActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed

        // Exit button pressed while there are not saved data in output textbox
        
        if (FileOutputArea.getText().isEmpty() != true)
        {
            // Message box OK / Cancel to prevent loosing data.  "0" if OK is selected
            if (JOptionPane.showConfirmDialog(rootPane, "Data is not saved", "Are you sure you want to exit", 2) == 0)
            {
                System.exit(0);
            }
        }
        else
        {
            System.exit(0);
        }
              
    }//GEN-LAST:event_ExitActionPerformed

    private void AddHeaderRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddHeaderRowActionPerformed
       // Add or remove header line
        // Command button pressed once, toggle_header sets to true
        // Command buttone pressed second time, toggle_header sets to false
        if(toggle_header == false)
            toggle_header = true;
        else
            toggle_header = false;
        
        //get text from file output box first, in case of user edits (line added by Amy)
		  window_output_container = FileOutputArea.getText();
   
        //Clean an output textbox to avoid duplicate header
        FileOutputArea.setText("");
        if(toggle_header == true)
        {
            //Insert header and data in the output textbox
            FileOutputArea.setText(header);
            FileOutputArea.append(window_output_container);
        }
        else
        {
            //strip header length from start of string; this line cannot be called unless header has previously been added
            
            window_output_container = window_output_container.substring(header.length(), window_output_container.length());
            FileOutputArea.setText(window_output_container);
        }
        
    }//GEN-LAST:event_AddHeaderRowActionPerformed

    private void FirstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameFieldActionPerformed
		 //misclick; no code
    }//GEN-LAST:event_FirstNameFieldActionPerformed

    //  The following lines of code will select text in textbox if clicked
    private void FirstNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FirstNameFieldFocusGained
        FirstNameField.selectAll();
    }//GEN-LAST:event_FirstNameFieldFocusGained

    private void LastNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LastNameFieldFocusGained
        LastNameField.selectAll();
    }//GEN-LAST:event_LastNameFieldFocusGained

    private void Address1FieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Address1FieldFocusGained
        Address1Field.selectAll();
    }//GEN-LAST:event_Address1FieldFocusGained

    private void Address2FieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Address2FieldFocusGained
        Address2Field.selectAll();
    }//GEN-LAST:event_Address2FieldFocusGained

    private void CityFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CityFieldFocusGained
        CityField.selectAll();
    }//GEN-LAST:event_CityFieldFocusGained

    private void EmailAddressFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailAddressFieldFocusGained
        EmailAddressField.selectAll();
    }//GEN-LAST:event_EmailAddressFieldFocusGained

    /* Open File code started by Benny and assisted by Scott
     * website referenced: https://netbeans.org/kb/docs/java/gui-filechooser.html 
     */
    
   private void OpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenFileActionPerformed
         //Create a file chooser
        JFileChooser fc = new JFileChooser();
        //In response to a button click:
        int returnVal = fc.showOpenDialog(aComponent);
        if (returnVal == fc.APPROVE_OPTION)
		  {
            File file = fc.getSelectedFile();
            // load from file
				try
				{
					FileOutputArea.read(new FileReader(file.getAbsolutePath()), null);
				}
				catch (IOException ex) //corrected from system.out.println to popup by Amy
				{
					 JOptionPane.showMessageDialog(rootPane, "Error accessing file, please check filename and try again.", "File error", WIDTH);
				}
			}

   }//GEN-LAST:event_OpenFileActionPerformed

   private void SaveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveFileActionPerformed
         //Create a file chooser
        JFileChooser fc = new JFileChooser();
        //In response to a button click:
        int returnVal = fc.showSaveDialog(aComponent);
        if (returnVal == fc.APPROVE_OPTION)
		  {
            File file = fc.getSelectedFile();
            // load from file
				try {

					// if file doesnt exists, then create it
					if (!file.exists()) {
						file.createNewFile();
					}

					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					fw.write(FileOutputArea.getText());
					fw.close();

					//clear fields to prepare for new entries
					ClearGUIFields();
					FileOutputArea.setText("");

				} catch (IOException e)

					{
						JOptionPane.showMessageDialog(rootPane, "Error saving file, please retry.", "File error", WIDTH);
					}

		  }	
   }//GEN-LAST:event_SaveFileActionPerformed

   private void PhoneNumberFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PhoneNumberFieldFocusGained
      PhoneNumberField.selectAll();
   }//GEN-LAST:event_PhoneNumberFieldFocusGained

   private void ZipCodeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZipCodeFieldActionPerformed
      // misclick; no code
   }//GEN-LAST:event_ZipCodeFieldActionPerformed

   private void ZipCodeFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ZipCodeFieldFocusGained
      ZipCodeField.selectAll();
   }//GEN-LAST:event_ZipCodeFieldFocusGained

   private void NewFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewFileActionPerformed
		//warn user that any data in fields will be lost
      if (JOptionPane.showConfirmDialog(rootPane, "This will clear all fields and delete all unsaved data.\nAre you sure?", "Data is not saved", 2) == 0)
            {
               //clear fields and discard all text if OK selected
					ClearGUIFields();
					FileOutputArea.setText("");
				}
   }//GEN-LAST:event_NewFileActionPerformed

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
   private javax.swing.JButton AddHeaderRow;
   private javax.swing.JTextField Address1Field;
   private javax.swing.JTextField Address2Field;
   private javax.swing.JLabel AddressLine1;
   private javax.swing.JLabel AddressLine2;
   private javax.swing.JLabel City;
   private javax.swing.JTextField CityField;
   private javax.swing.JLabel ColorBar1;
   private javax.swing.JLabel ColorBar2;
   private javax.swing.JLabel CustInfoForm;
   private javax.swing.JLabel EmailAddress;
   private javax.swing.JTextField EmailAddressField;
   private javax.swing.JButton Exit;
   private javax.swing.JLabel FileOutput;
   private javax.swing.JTextArea FileOutputArea;
   private javax.swing.JLabel FirstName;
   private javax.swing.JTextField FirstNameField;
   private javax.swing.JLabel LastName;
   private javax.swing.JTextField LastNameField;
   private javax.swing.JButton NewFile;
   private javax.swing.JLabel OlympicPride;
   private javax.swing.JButton OpenFile;
   private javax.swing.JLabel PhoneNumber;
   private javax.swing.JFormattedTextField PhoneNumberField;
   private javax.swing.JLabel ReqFieldInstruct;
   private javax.swing.JButton SaveFile;
   private javax.swing.JButton SaveRecord;
   private javax.swing.JComboBox StateDropDown;
   private javax.swing.JLabel StateLabel;
   private javax.swing.JLabel ZipCode;
   private javax.swing.JFormattedTextField ZipCodeField;
   private javax.swing.JScrollPane jScrollPane1;
   // End of variables declaration//GEN-END:variables

    private Exception Exception(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

		//clear all GUI fields other than the file output area
		private void ClearGUIFields()
		{

			FirstNameField.setText("");
			LastNameField.setText("");
			Address1Field.setText("");
			Address2Field.setText("");
			CityField.setText("");
			StateDropDown.setSelectedIndex(0);
			ZipCodeField.setValue(null);		//required to prevent issues with formatted text
			PhoneNumberField.setValue(null);	//ditto
			EmailAddressField.setText("");
			FirstNameField.requestFocus();
		}
}
