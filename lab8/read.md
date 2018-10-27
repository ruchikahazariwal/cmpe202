#The Lime Bike Mobile App Payment Setup:
For setting up a new credit card on the Mobile App, four blocks of 4-digits are entered. At each block, the cursor on the text entry box skips a space. Once a valid 16-digit card number is entered, the cursor skip two spaces and waits for 4 digits. Note, the user does not have to enter the “/” between two digit month and year, it is filled in automatically. Once the expiration date is entered, the cursor jumps another two spaces and waits for the three digit card verification code.

For example: If Customer types in the following digits:
41111111111111110120123
The Card Entry Box will display:
4111 1111 1111 1111 01/20 123
Note: two spaces between CC# and Date and also Date and CVC.

========================================
Screen 

========================================




[4444 4444 4444 4444]  [MM/YY]  [123]  




========================================

Key (Digit or X or Delete) => 

Output After Entering all the digits:

========================================
Screen

========================================




[1111 1111 1111 1111]  [11/11]  [111]  




========================================

Key (Digit or X or Delete) => 

#What design pattern(s) would you use to implement the Credit Card Text Entry and Display?
In app class, CreditCardNum, CreditCardExp and CreditCardCVC have been added as subcomponent of it. In this way, we have implemented Chain of responsibility pattern. Every sub compoment's input is handled by the count of keys entered so far. Whenever count of digits entered form subcomponent reached upper limit, next component inline gets the responsibility to handle the input.

For deletion, I have created one more function for void setPrev( IKeyEventHandler prev), which will help in revering back to the previous component. As we delete digits and componet's lower count limit is reached, chain of responsibility will delete the digit from the previous component.

Decorator pattern has been implemented to add spaces within every 4 block of digits in credit card number. This pattern will also help in displaying "/" after month in credit card expiry.

