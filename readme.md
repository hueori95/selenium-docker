**http://d1uh9e7cu07ukd.cloudfront.net/selenium-docker/reservation-app/index.html**


http://d1uh9e7cu07ukd.cloudfront.net/selenium-docker/vendor-app/index.html

Running Test
TestNG Parameters
- Running a test suite
  java -cp 'libs/*' org.testng.TestNG test-suites/flight-reservation.xml
- Running a test suite with specific thread count
  java -cp 'libs/*' org.testng.TestNG -threadcount 2 test-suites/flight-reservation.xml
- TestNG by default creates test-output directory. You can change it with -d option
  java -cp 'libs/*' org.testng.TestNG -threadcount 2 -d result test-suites/flight-reservation.xml


Passing System Parameters
- To pass the browser option
  java -Dbrowser=chrome -cp 'libs/*' org.testng.TestNG test-suite/flight-reservation.xml

- To run the tests using Selenium Grid
  java -Dselenium.grid.enabled=true -Dselenium.grid.hubHost=localhost -cp 'libs/*' org.testng.TestNG test-suites/flight-reservation.xml
- java -Dselenium.grid.enabled=true -Dbrowser=firefox -cp 'libs/*' org.testng.TestNG test-suites/flight-reservation.xml
  docker run -e BROWSER=firefox -e HUB_HOST=192.168.2.5 -e TEST_SUITE=flight-reservation.xml -e THREAD_COUNT=4 vinsdocker/selenium

