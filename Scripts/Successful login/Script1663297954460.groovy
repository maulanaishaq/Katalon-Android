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

// You will need a real .apk file here in order to launch successfully, even if you're not testing it
String appFile = GlobalVariable.AndroidApp

// The app info for the built-in app you really want to test
RunConfiguration.setMobileDriverPreferencesProperty('appPackage', 'com.komodobuyer')

RunConfiguration.setMobileDriverPreferencesProperty('appActivity', 'com.komodobuyer.MainActivity')

// Start the application, but it will actually use the appPackage from above
Mobile.startApplication(appFile, false)

// When we're finished with the first application
//Mobile.closeApplication()
// Install APK
//Mobile.startApplication('C:\\Users\\GK2206L17\\Downloads\\komodobuyer_v2.13.0(115).apk', true)
Mobile.setText(findTestObject('Kodomo-Login Page/input_Email'), 'nauseee1@mail.com', 0)

Mobile.setText(findTestObject('Kodomo-Login Page/input_Password'), 'Kodomo10', 0)

Mobile.tap(findTestObject('Kodomo-Login Page/btn_Login'), 0)

WebUI.delay(2)

Mobile.verifyElementVisible(findTestObject('Kodomo-Login Page/btn_RFQ Process'), 0)

