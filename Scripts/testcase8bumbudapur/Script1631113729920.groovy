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

WebUI.navigateToUrl('https://ezeepasar.com/')

WebUI.maximizeWindow()

WebUI.scrollToPosition(50, 100)

WebUI.click(findTestObject('testbumbumasakan/Page_ezeePasar  Pasar Modern Digital  temanbelanjabaru/span_Bumbu Masakan'))

WebUI.click(findTestObject('testbumbumasakan/Page_Produk  ezeePasar  Pasar Modern Digital/div_Bumbu Dapur'))

WebUI.click(findTestObject('testbumbumasakan/Page_Produk  ezeePasar  Pasar Modern Digital/img'))

WebUI.click(findTestObject('testbuah/Page_Buah  Anggur Red Globe  ezeePasar  Pasar Modern Digital/button_Beli Sekarang'))

WebUI.closeBrowser()

