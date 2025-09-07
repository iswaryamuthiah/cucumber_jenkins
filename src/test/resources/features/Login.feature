Feature: This feature is for Login Page

  @Login
  Scenario Outline: This is for Login page scenario
    Given user is launching the application

    #And user navigates to login page
    #Then user enters credentials <UserName> and <Password>
    Examples: 
      | UserName | Password    |
      | Priya    | test@123    |
      | iswarya  | test@123445 |

  @LoginTC
  Scenario: This is for Login page scenario
    Given user is launching the application
    #And user navigates to login page
    Then user enters credentials 'Priya' and '12345'  
