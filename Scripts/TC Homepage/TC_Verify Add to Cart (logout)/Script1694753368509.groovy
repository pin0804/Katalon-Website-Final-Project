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

WebUI.click(findTestObject('Homepage/Our Products/div_SPEAKERS'))

WebUI.waitForElementVisible(findTestObject('Category Page/txt_category name'), 0)

WebUI.callTestCase(findTestCase('Reusable Test/TC_RT_Category Page/TC_verify element Category Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Category Page/first_product'))

WebUI.waitForElementVisible(findTestObject('Category Page/Product Profile Page/img_product'), 0)

WebUI.callTestCase(findTestCase('Reusable Test/TC_RT_PPP/TC_RT_Product Profile Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Category Page/Product Profile Page/color_picker1'))

WebUI.doubleClick(findTestObject('Category Page/Product Profile Page/btn_quantity_plus'))

WebUI.click(findTestObject('Category Page/Product Profile Page/btn_quantity_min'))

WebUI.click(findTestObject('Category Page/Product Profile Page/btn_ADD TO CART'))

WebUI.waitForElementVisible(findTestObject('Category Page/Product Profile Page/action cart/body_action cart (product)'), 
    0)

WebUI.verifyElementVisible(findTestObject('Category Page/Product Profile Page/action cart/cart_indicator'), FailureHandling.STOP_ON_FAILURE)

def nameproductincart = WebUI.getText(findTestObject('Category Page/Product Profile Page/action cart/txt_name product in cart'))

println(nameproductincart)

WebUI.closeBrowser()

