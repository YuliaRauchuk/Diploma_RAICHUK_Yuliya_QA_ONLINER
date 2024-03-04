![Onliner.by](https://github.com/YuliaRauchuk/Diploma_RAICHUK_Yuliya_QA_ONLINER/blob/master/ONLINER-LOGO.webp)

## **Description of Product** 
Belarusian website, which includes media, a marketplace of goods and services, and a forum.

## It is an independent, non-state media and initially positioned itself as a platform.
##The portal received registration as a media outlet on August 26, 2019.

## According to the research company Gemius, in 2020 the portal covered 52.08% of the Belarusian Internet audience.
##According to statistics, 60% of its audience are people aged 25 to 34 years.


## **Preconditions**
Open site https://www.onliner.by
Registration is required to use the site. Registration on the site is Free. 
You must fill out the form with the following Email & Password fields,
then check the box "I give my consent to Onliner LLC to process my personal data on the terms stated by the Operator"
and click on the registration button. Confirm the registration link on a valid email.

### **CheckList**
- Сheck the ability to log into the site after registration
- Сheck if validation works when all required form fields are filled in.
  (Verification message: The Email Address field must contain a valid email address). The Password field is required
- Check if errors occur due to incorrect data entry
- Check whether the created account is deleted
- Check if you can add and remove items to your cart
- Check if product sorting works
- Check how the notification works when deleting all products from the cart
- Check if the file can be added to the created account


### **Used in project**

| Stack                   | Version     |
|-------------------------|-------------|
| Allure TestNG           | 3.8.6       |
| Apache Maven            | 1.9.8       |
| Aspectj                 | 2.20.1      |
| Java                    | 11.0.17     |
| Jackson Dataformat yaml | 2.12.3      |
| WebDriveManage          | 5.3.0       |
| Lombok                  | 1.18.24     |
| Log4j                   | 2.19.0      |
| TestNG                  | 7.4.0       |
| Selenium                | 3.141.59    |

### **Instruction for running tests**
- mvn clean test for running default suite - SmokeTest.xml
