import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
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

println(email)

def randomNumber = org.apache.commons.lang.RandomStringUtils.randomNumeric(5)

def email_baru = email

println('original email: ' + email_baru)

def modified_email = email_baru.replace('123', randomNumber.toString())

println('new email: ' + modified_email)

WebUI.openBrowser(GlobalVariable.Browser)

WebUI.waitForElementVisible(findTestObject('Homepage/Our Products/div_HEADPHONES'), 0)

WebUI.click(findTestObject('Homepage/Menu Bar/btn_CONTACT US'))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Reusable Test/TC_RT_Homepage/TC_Verify element Contact Us'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotClickable(findTestObject('Homepage/Contact Us/btn_SEND'))

WebUI.click(findTestObject('Homepage/Contact Us/select_Product'))

WebUI.click(findTestObject('Homepage/Contact Us/select_Product'))

WebUI.click(findTestObject('Homepage/Contact Us/select_Category'))

WebUI.click(findTestObject('Homepage/Contact Us/select_Category'))

WebUI.setText(findTestObject('Homepage/Contact Us/inpt__email'), modified_email)

WebUI.setText(findTestObject('Homepage/Contact Us/inpt__subject'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."')

WebUI.verifyElementClickable(findTestObject(null))

