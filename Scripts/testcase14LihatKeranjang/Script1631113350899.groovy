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

WebUI.navigateToUrl('https://ezeepasar.com/Produk?category=Promo&categoryid=999')

WebUI.maximizeWindow()

WebUI.click(findTestObject('testlogin/Page_Produk  ezeePasar  Pasar Modern Digital/button_Pesan'))

WebUI.setText(findTestObject('testlogin/Page_EzeePasar - Login  ezeePasar  Pasar Modern Digital/input_Email atau No. Telepon_txtEmailMobile'), 
    'sidika0363@gmail.com')

WebUI.setText(findTestObject('testlogin/Page_EzeePasar - Login  ezeePasar  Pasar Modern Digital/input_Kata Sandi_txtPassword'), 
    'admin123')

WebUI.click(findTestObject('testlogin/Page_EzeePasar - Login  ezeePasar  Pasar Modern Digital/button_Masuk'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('testlihatkeranjang/Page_Paket Special  Bahan Kue Segitiga biru  ezeePasar  Pasar Modern Digital/button_Keranjang'))

WebUI.click(findTestObject('testlihatkeranjang/Page_Produk  ezeePasar  Pasar Modern Digital/button_Lihat Keranjang'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

