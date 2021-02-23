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

WebUI.navigateToUrl('https://ptmkp.qa.poffice.pertamina.com/')

WebUI.setText(findTestObject('P-Office_Draft_Memorandum/Page_Login - IdAMan/input_concat(Don, , t show this again)_idSIButton9'), 
    'trainee03')

WebUI.click(findTestObject('P-Office_Draft_Memorandum/Page_Login - IdAMan/label_Next'))

WebUI.setText(findTestObject('P-Office_Draft_Memorandum/Page_P-Office_Sign In/input_Sign in with your organizational account_UserName'), 
    'trainee03@pertamina.com')

WebUI.setText(findTestObject('P-Office_Draft_Memorandum/Page_P-Office_Sign In/input_Sign in with your organizational account_Password'), 
    'Pertamina@123')

WebUI.click(findTestObject('P-Office_Draft_Memorandum/Page_P-Office_Sign In/span_Sign in'))

WebUI.click(findTestObject('P-Office_Draft_Memorandum/Page_Sign in to your account/input_concat(Don, , t show this again)_idBtn_Back'))

WebUI.verifyElementVisible(findTestObject('P-Office_Draft_Memorandum/Page_P-Office - Draft12/a_Direct69'))

WebUI.click(findTestObject('P-Office_Draft_Memorandum/Page_P-Office - Draft12/a_Direct69'))

WebUI.verifyElementPresent(findTestObject('P-Office_Draft_Memorandum/Page_P-Office/a_Memorandum 5'), 30)

WebUI.click(findTestObject('P-Office_Draft_Memorandum/Page_P-Office/div_About Test issue 1968 se'))

WebUI.click(findTestObject('P-Office_Draft_Memorandum/Page_P-Office - 078H302202021 inline/button_Preview'))

WebUI.click(findTestObject('P-Office_Draft_Memorandum/Page_P-Office - 078H302202021 inline/button_Detail'))

WebUI.verifyElementPresent(findTestObject('P-Office_Draft_Memorandum/Page_P-Office - 078H302202021 inline/th_Mail From'), 
    30, FailureHandling.OPTIONAL)

WebUI.verifyTextPresent('Mail From', false, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('P-Office_Draft_Memorandum/Page_P-Office - 078H302202021 inline/th_About'), 30, 
    FailureHandling.OPTIONAL)

WebUI.verifyTextPresent('About', false, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('P-Office_Draft_Memorandum/Page_P-Office - 078H302202021 inline/th_Attachment'), 
    30, FailureHandling.OPTIONAL)

WebUI.verifyTextPresent('Attachment', false, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('P-Office_Draft_Memorandum/Page_P-Office - 078H302202021 inline/th_Number'), 30, 
    FailureHandling.OPTIONAL)

WebUI.verifyTextPresent('Number', false, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('P-Office_Draft_Memorandum/Page_P-Office - 078H302202021 inline/th_Mail Classification'), 
    30, FailureHandling.OPTIONAL)

WebUI.verifyTextPresent('Mail Classification', false, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('P-Office_Draft_Memorandum/Page_P-Office - 078H302202021 inline/th_Date'), 30, 
    FailureHandling.OPTIONAL)

WebUI.verifyTextPresent('Date', false, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('P-Office_Draft_Memorandum/Page_P-Office - 078H302202021 inline/th_Copy of Mail'), 
    30, FailureHandling.OPTIONAL)

WebUI.verifyTextPresent('Copy of Mail', false, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('P-Office_Draft_Memorandum/Page_P-Office - 078H302202021 inline/label_Disposition'), 
    30, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('P-Office_Draft_Memorandum/Page_P-Office - 078H302202021 inline/button_Tracking'))

WebUI.click(findTestObject('P-Office_Draft_Memorandum/Page_P-Office - 078H302202021 inline/button_History'))

WebUI.verifyElementPresent(findTestObject('P-Office_Draft_Memorandum/Page_P-Office - 078H302202021 inline/th_Position'), 
    30, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('P-Office_Draft_Memorandum/Page_P-Office - 078H302202021 inline/th_Date'), 30, 
    FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('P-Office_Draft_Memorandum/Page_P-Office - 078H302202021 inline/th_Action'), 30, 
    FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('P-Office_Draft_Memorandum/Page_P-Office - 078H302202021 inline/th_Komentar'), 
    30, FailureHandling.OPTIONAL)

WebUI.closeBrowser()

