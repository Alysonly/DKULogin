package com.gmail.alysonly.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    public WebDriver driver;

            //Функция для передачи параметра

        public Login(WebDriver driver)
        {
            PageFactory.initElements(driver,this);
            this.driver = driver;
        }

        //Поиск логина
        @FindBy(id = "login_form:in_user_name")
            private WebElement UserName;


        //Ввод логина
        public void inputUserName(String name)
        {
            UserName.sendKeys(name);
        }

        //Поиск поля пароля
        @FindBy(id = "login_form:password")
        private WebElement PassField;

        //Ввод пароля
        public void inputPass(String pass)
        {
            PassField.sendKeys(pass);
        }

        //Поиск кнопки
        @FindBy(id = "login_form:do_login")
        private WebElement logButton;

        //нажатие на кнопку
        public void Buttonclick()
        {
            logButton.click();
        }
}
