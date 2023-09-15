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

WebUI.openBrowser(GlobalVariable.Browser)

WebUI.waitForElementPresent(findTestObject('Homepage/Our Products/div_HEADPHONES'), 0)

WebUI.callTestCase(findTestCase('Reusable Test/TC_RT_Homepage/TC_verify element homepage bar (logout)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Homepage/Menu Bar/btn_OUR PRODUCTS'))

WebUI.callTestCase(findTestCase('Reusable Test/TC_RT_Homepage/TC_Verify element our products'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Homepage/Menu Bar/btn_SPECIAL OFFER'))

WebUI.waitForElementPresent(findTestObject('Homepage/Special Offer/field_SPECIAL OFFER'), 0)

WebUI.callTestCase(findTestCase('Reusable Test/TC_RT_Homepage/TC_verify element special offers'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Homepage/Banner Dinamis/slider section'), 0)

WebUI.verifyElementPresent(findTestObject('Homepage/Banner Dinamis/slider_1'), 0)

WebUI.callTestCase(findTestCase('Reusable Test/TC_RT_Homepage/TC_Verify element dinamic banner'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Homepage/Menu Bar/btn_POPULAR ITEMS'))

WebUI.waitForElementPresent(findTestObject('Homepage/Popular Items/txt_POPULAR ITEMS'), 0)

WebUI.callTestCase(findTestCase('Reusable Test/TC_RT_Homepage/TC_verify element popular items'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Homepage/Menu Bar/btn_CONTACT US'))

WebUI.waitForElementPresent(findTestObject('Homepage/Contact Us/txt_CONTACT US'), 0)

WebUI.callTestCase(findTestCase('Reusable Test/TC_RT_Homepage/TC_Verify element Contact Us'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Homepage/Footer/txt_company'), 0)

WebUI.verifyElementPresent(findTestObject('Homepage/Footer/txt_company'), 0)

WebUI.callTestCase(findTestCase('Reusable Test/TC_RT_Homepage/TC_Verify element footer'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

