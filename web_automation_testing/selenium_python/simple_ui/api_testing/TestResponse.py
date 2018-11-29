from selenium import webdriver
import time

chrome_driver_path = r"D:\pgm\WebDrivers\chromedriver.exe"
firefox_driver_path = r"D:\pgm\WebDrivers\geckodriver.exe"
ie_driver_path = r"D:\pgm\WebDrivers\MicrosoftWebDriver.exe"

#firefox_driver = webdriver.Firefox(executable_path=firefox_driver_path)
#ie_driver = webdriver.Ie(executable_path=ie_driver_path)
chrome_driver = webdriver.Chrome(executable_path=chrome_driver_path)

driver = chrome_driver

driver.manage().timeouts().implicitlyWait(time.sleep(10))
driver.get("http://google.com/")
driver.get("http://localhost:8080/")