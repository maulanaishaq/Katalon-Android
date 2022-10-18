import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

String appFile = GlobalVariable.SwaglabsApp

RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.swaglabsmobileapp')

RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.swaglabsmobileapp.MainActivity')

Mobile.startApplication(appFile, false)

Mobile.setText(findTestObject('Login Page/txt_Username'), 'locked_out_user', 0)

Mobile.setText(findTestObject('Login Page/txt_Password'), 'secret_sauce', 0)

Mobile.tap(findTestObject('Login Page/btn_Login'), 0)

Mobile.verifyElementExist(findTestObject('Login Page/txt_ErrorMessage'), 0)

String actual = Mobile.getText(findTestObject('Login Page/txt_ErrorMessage'), 0)

Mobile.verifyMatch(actual, 'Sorry, this user has been locked out.', false)

