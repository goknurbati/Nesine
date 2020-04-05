# Nesine Test Automation Project
In this test automation project, user goes to "Nesine" app and select "All Shares" under Kupondaş menu. After that he select any coupon to basket and finally verify the coupon that is correct one 

# Table of contents 
  * Introduction - The project's aim<br/>
  * Prerequisites<br/>
  * Technologies<br/>
  * Launch<br/>
# Prerequisites
We should set up some tools and frameworks for this test automation project;<br/>
* IntelliJ<br/>
* Java<br/>
* Appium<br/>
* Cucumber<br/>
* Maven<br/>
# Technologies
* Java<br/>
* TestNG<br/>
* BDD</br>
# Setup 
* On GitHub, navigate to the main page of the repository.<br/>
* Under the repository name, click Clone or download.<br/>
* To clone the repository using HTTPS.<br/>
* Open Git Bash.<br/>
* Change the current working directory to the location.<br/>
* Type git clone, and then paste the URL.<br/>
# Structure of Project
Project structure is Page Object Model<br/>
Project has these pakages & folders<br/>
* Features<br/>
  * Login.feature
  * Kupondas.feature
* PageObjects<br/>
  * BasePage
  * Kupondas
  * LoginPage
* Runners<br/>
  * AbstractTestNCCucumberPArallelTest
  * Default
  * KupondasPageRunner
  * LoginPageRunner
* Step Definitions<br/>
  * BaseClass
  * Step
* Utility<br/>
  * WaiterHelper<br/>
Created Login and Kupondas features using Gherkin languages, and in Kupondas feature define the general steps(login step) under the "Background"
Created "BaseClass" for desired capabilities and other main functions for whole project<br/>
# Launch
When you start the Appium toool, update your port to 4724.</br>
When open the project go to "runner" package and select one of them which you want to run (KupondasPageRunner & LoginPageRunner.<br/>
Right click and select "Run"
# Sources
Get dependencies from https://mvnrepository.com/
# Mobile Device Properties
* Device Model Number: SM-G965F / Glaxy S9+
* Platform: Android
* Version: 10
