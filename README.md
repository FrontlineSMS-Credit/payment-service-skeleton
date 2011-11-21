# Payment Service Project Generator

This project is an outline for a new PaymentService.

## How to use this project

This project should help you implement a new PaymentService for FrontlineSMS:Credit.

There are a number of different places where details specific to your project should be filled in.  An easy way to find many of them is to run the following over your project directory:

    grep -r "\${sub:.*}" .

* rename the PaymentService implementation class, package and test class to reflect the name of your service
* update `src/main/resources/META-INF/frontlinesms/PaymentServices` with the fully-qualified name of your `PaymentService` implementation
* fill in details of your service in the POM (any variable starting ${sub should be replaced)
* update @ConfigurableServiceProperties annotation on `PaymentService` implementation
* add your own icon to `src/main/resources/icons/`

## Notes

### TODO

These are sections for the implementer of the new service to fill in.

### FIXME

These are sections for the FrontlineSMS team to improve.
