Feature: To Test action performing user login and logout scenario fucntionality.

@smoketetst
Scenario: To atomate the user should successfully be able to login with correct credentials i.e., username and password and should be able to perform the login, also the user must be redirected to the dashboard page and on the top left side of the page search for burger-menu-button their user should see a logout web-element in the hover down box.
    Given Launching the browser [optional any browser]
    When validate the current URL.
    When validate the page title.
    When validate the page title.
    When validate the page title.
    Then user should redirect to the dashboard page.
    Then click to burger element and click to logout.
    Then use a synchronization timeout in-between step 5 and 7.
    And use implicitly wait before step4.