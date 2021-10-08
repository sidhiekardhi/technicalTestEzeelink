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

WebUI.scrollToElement(findTestObject('test_paketspesial/Page_ezeePasar  Pasar Modern Digital  temanbelanjabaru/span_Paket Special'), 
    3)

WebUI.click(findTestObject('testfrozenfood/Page_ezeePasar  Pasar Modern Digital  temanbelanjabaru/span_Frozen Food'))

WebUI.click(findTestObject('testfrozenfood/Page_Produk  ezeePasar  Pasar Modern Digital/img'))

WebUI.click(findTestObject('testfrozenfood/Page_Frozen Food  Beef Burger  isi Burger  ezeePasar  Pasar Modern Digital/button_Beli Sekarang'))

WebUI.closeBrowser()

