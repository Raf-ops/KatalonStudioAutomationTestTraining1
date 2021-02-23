import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.driver.KatalonWebDriverBackedSelenium
import static com.kms.katalon.core.webui.driver.KatalonWebDriverBackedSelenium.*

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.Keys
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import static org.junit.Assert.*
import java.util.concurrent.Callable
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

'----------------------------------------------------'
'This test case script is generated by Katalon Studio'
'Generated date: 17-Feb-2021 03:13:27 PM'
'File path: D:\\Download\\P-Office Automation Test Memorandum.side'
'Generated by: aulia@ysi.co.id'
'----------------------------------------------------'

String baseUrl = "https://ptmkp.qa.poffice.pertamina.com/"

WebUI.openBrowser('')

selenium = new KatalonWebDriverBackedSelenium(baseUrl)

"open | https://ptmkp.qa.poffice.pertamina.com/Home/Index#!/Master/Template/Inbox/#!/Inbox/Memorandum/List |  | "
selenium.open("https://ptmkp.qa.poffice.pertamina.com/Home/Index#!/Master/Template/Inbox/#!/Inbox/Memorandum/List")

"setWindowSize | 1936x1096 |  | "
// Method setWindowSize is not supported

"//click | css=.app-arrow |  | "
// Method //click is not supported

"click | css=#list-menu-inbox .nav-text |  | "
selenium.click("css=#list-menu-inbox .nav-text")

"click | css=#mail-8fe5a85f-8957-49b1-bcec-d8d046ce0757 .subject-mail |  | Ganti Locator Element dengan surat yang diinginkan (Surat harus ada pada list)"
selenium.click("css=#mail-8fe5a85f-8957-49b1-bcec-d8d046ce0757 .subject-mail")

"click | css=.tablinks:nth-child(3) | Detail | "
selenium.click("css=.tablinks:nth-child(3)")

"click | id=About |  | "
selenium.click("id=About")

"type | id=About | Contoh Komentar | "
selenium.type("id=About", "Contoh Komentar")

"assertElementPresent | css=.ms-Icon--MailReply |  | "
assertTrue(selenium.isElementPresent("css=.ms-Icon--MailReply"))

"//click | css=.ms-Icon--MailReply |  | "
// Method //click is not supported

"click | linkText=Send | Send | "
selenium.click("linkText=Send")
