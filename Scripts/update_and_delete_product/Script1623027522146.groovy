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

WebUI.navigateToUrl('https://accounts.tokopedia.com/login?ld=https://seller.tokopedia.com/home')

WebUI.setText(findTestObject('Object Repository/Page_Masuk  Login  Tokopedia/input_Nomor Ponsel atau Email_email'), 'sarum4292@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Masuk  Login  Tokopedia/button_Selanjutnya'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Masuk  Login  Tokopedia/input_Kata Sandi_password'), 'bAi0SHa43iL4ZOza1do2yg==')

WebUI.click(findTestObject('Object Repository/Page_Masuk  Login  Tokopedia/span_Masuk'))

WebUI.click(findTestObject('Object Repository/Page_Verifikasi/span_--827'))

WebUI.setText(findTestObject('Object Repository/Page_Verifikasi/input_--827_otp-number-input-1'), '3')

WebUI.setText(findTestObject('Object Repository/Page_Verifikasi/input_--827_otp-number-input-2'), '9')

WebUI.setText(findTestObject('Object Repository/Page_Verifikasi/input_--827_otp-number-input-3'), '2')

WebUI.setText(findTestObject('Object Repository/Page_Verifikasi/input_--827_otp-number-input-4'), '8')

WebUI.setText(findTestObject('Object Repository/Page_Verifikasi/input_--827_otp-number-input-5'), '8')

WebUI.setText(findTestObject('Object Repository/Page_Verifikasi/input_--827_otp-number-input-6'), '9')

WebUI.click(findTestObject('Object Repository/Page_Seller Dashboard  Tokopedia/span_Cek Apa yang Baru'))

WebUI.click(findTestObject('Object Repository/Page_Seller Dashboard  Tokopedia/div_Lewati'))

WebUI.click(findTestObject('Object Repository/Page_Seller Dashboard  Tokopedia/span_Daftar Produk'))

WebUI.click(findTestObject('Object Repository/Page_Pengaturan Produk  Tokopedia/div_Atur etalase produkmu di sini, yuk_unf-_ee6d85'))

WebUI.click(findTestObject('Object Repository/Page_Pengaturan Produk  Tokopedia/div_Atur'))

WebUI.click(findTestObject('Object Repository/Page_Pengaturan Produk  Tokopedia/div_Edit'))

WebUI.switchToWindowTitle('Ubah Produk | Tokopedia')

WebUI.setText(findTestObject('Object Repository/Page_Ubah Produk  Tokopedia/input_Wajib_css-4eg0ft e16vycsw0'), 'Selai Nutella Enakk')

WebUI.click(findTestObject('Object Repository/Page_Ubah Produk  Tokopedia/span_Simpan'))

WebUI.click(findTestObject('Object Repository/Page_Pengaturan Produk  Tokopedia/h5_Selai Nutella Enakk'))

WebUI.click(findTestObject('Object Repository/Page_Pengaturan Produk  Tokopedia/span_AKTIF_css-12a5v84-unf-checkbox__area e4ba57s1'))

WebUI.click(findTestObject('Object Repository/Page_Pengaturan Produk  Tokopedia/path'))

WebUI.click(findTestObject('Object Repository/Page_Pengaturan Produk  Tokopedia/span_Hapus'))

WebUI.click(findTestObject('Object Repository/Page_Pengaturan Produk  Tokopedia/p_1 produk berhasil dihapus'))

WebUI.closeBrowser()

