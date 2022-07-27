Feature: Zadanie Zaliczeniowe nr 1 - creating new address on an existing user account

  Scenario Outline: ZZ1 Scenario - log in, create new address and verify data
    Given Browser with open page at address https://mystore-testlab.coderslab.pl/index.php?controller=authentication&back=my-account
    And User logged on using <email> and <password>
    When Page open at address https://mystore-testlab.coderslab.pl/index.php?controller=my-account
    And Addresses button clicked
    And Create new address button clicked
    And Fill in new address data <alias>, <address>, <city>, <zip_code>, <country>, <phone>
    Then New address is created
    And Verify the new address <alias>, <address>, <city>, <zip_code>, <country>, <phone>

    Examples:
      |email                       |password  |alias     |address        |city    |zip_code |country        |phone    |
      |vkgcutygevfffkqrap@kvhrs.com|Lalala123 |Home 2    |Easy Street 5  |Cardiff |91-233   |United Kingdom |123456789|

