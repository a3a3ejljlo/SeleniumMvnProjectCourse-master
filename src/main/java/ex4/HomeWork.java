package ex4;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("Карты = //ul[@class = 'main-menu']//*[text() = 'Карты']");
        System.out.println("Ваш город Москва (Да) = //div[@class = 'informer__btns']/*[text() = 'Да'] ");
        System.out.println("Курс евро = //div/*[contains(text(),'Покупка')]/..//*[3]");
        System.out.println("Качетсво обслуживания = //li/*[text() = 'Качество обслуживания']");
        System.out.println("Фамилия = //input[@placeholder = 'Фамилия']");
        System.out.println("Имя = //input[@placeholder = 'Имя']");
        System.out.println("Отчество = //input[@placeholder = 'Отчество']");
        System.out.println("Дата рождения = //input[contains(@placeholder, 'Дата рождения')]"); // не понял как сделать
        System.out.println("Галочка над отправить = //div[@class = 'checkbox-block']//*[@class = 'checkbox-block__span']");
        System.out.println("Отправить = //button[@id = 'btn_submit']");
        System.out.println("Кредитный калькулятор = //div[@class = 'b-page-heading__title']/*[contains(text(), 'Кредитный калькулятор')]");
        System.out.println("По желаемой сумме кредита = //span[@class = 'radio-block__span']"); // не понял как сделать
        System.out.println("По уровню дохода = //span[@class = 'radio-block__span']");
        System.out.println("25 000  = //input[@id='form_f464a1630']");
        System.out.println("Нет  = "); // тот же случай что и в других ,.текст за пределами элемента, не могу его найти ничем
        System.out.println("575 000  = //div/*[@class = 'js-calc-payment']");
        System.out.println("Ежемесячный платеж  = //div[contains(text(),'12 500.00')]");
        System.out.println("Сумма кредита с финансовой защитой  = //div[contains(text(),'654 897.00')]");
    }
}
