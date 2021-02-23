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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.click(findTestObject('Page_Amazon.com Online Shopping for Electro_1f0c68/span_All'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Online Shopping for Electro_1f0c68/a_Computers'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Online Shopping for Electro_1f0c68/a_Monitors'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.com/span_Acer'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.com/span_Acer SB220Q bi 21.5 Inches Full HD (19_cc9d58'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Acer SB220Q bi 21.5 Inches _e26c25/input_Sponsored_a-button-input'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Acer SB220Q bi 21.5 Inches _e26c25/input_Sponsored_a-button-input'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Acer SB220Q bi 21.5 Inches _e26c25/input_Sponsored_a-button-input'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Acer SB220Q bi 21.5 Inches _e26c25/input_Sponsored_a-button-input'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Acer SB220Q bi 21.5 Inches _e26c25/input_Sponsored_a-button-input'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Acer SB220Q bi 21.5 Inches _e26c25/span_23 inch'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Acer SB220Q bi 21.5 Inches _e26c25/span_23.8 inch'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Acer SB220Q bi 21.5 Inches _e26c25/span_Monitor  Adapter'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Acer SB220Q bi 21.5 Inches _e26c25/span_Monitor  MK345 Keyboard'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Acer SB220Q bi 21.5 Inches _e26c25/span_Summary'))

WebUI.click(findTestObject('Object Repository/Page_Amazon.com Acer SB220Q bi 21.5 Inches _e26c25/span_Collapse all'))

