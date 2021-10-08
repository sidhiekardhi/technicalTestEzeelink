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

WebUI.click(findTestObject('Object Repository/testrecording/Page_ezeePasar  Pasar Modern Digital  teman_cae51c/button_Nanti saja'))

WebUI.click(findTestObject('Object Repository/testrecording/Page_ezeePasar  Pasar Modern Digital  teman_cae51c/input_Masuk_search'))

WebUI.setText(findTestObject('Object Repository/testrecording/Page_ezeePasar  Pasar Modern Digital  teman_cae51c/input_Masuk_txtSearch'), 
    'bumbu dapur')

WebUI.setText(findTestObject('Object Repository/testrecording/Page_ezeePasar  Pasar Modern Digital  teman_cae51c/input_Masuk_txtSearch_1'), 
    'bumbu dapur')

WebUI.click(findTestObject('Object Repository/testrecording/Page_ezeePasar  Pasar Modern Digital  teman_cae51c/img_Masuk_imgSerch'))

WebUI.click(findTestObject('Object Repository/testrecording/Page_Produk  ezeePasar  Pasar Modern Digita_1cbfbe/img'))

WebUI.click(findTestObject('Object Repository/testrecording/Page_Bahan Makanan  Sauce Bumbu Rasa Tiram _a1159c/button_Beli Sekarang'))

WebUI.closeBrowser()

