package testngxml;

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Test">
    <classes>
      <class name="CapstoneProjects.SignUpTest"/>
      <class name="CapstoneProjects.BookingFormTest"/>
      <class name="CapstoneProjects.FlightBookingTest"/>
      <class name="CapstoneProjects.LoginTest"/>
      <class name="CapstoneProjects.FlightSearchTest"/>
      <class name="CapstoneProjects.BookignPageValidationTest"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->