# CoastAppli

Coastappli is a project started in 2019 for a duration of 3 years that aims to create a participatory sciences app to monitor coastal hazards (erosion, submersion, etc.). This project is built thanks to student formations involving teams of researchers, students in "Master EGEL"([IUEM](https://www-iuem.univ-brest.fr/), [UBO](https://www.univ-brest.fr/)) and engineers-students ([IMT Atlantique](https://www.imt-atlantique.fr/fr)).

The CoastAppli project is included in the project [OSIRISC](https://www-iuem.univ-brest.fr/pops/projects/osirisc-vers-un-observatoire-integre-des-risques-cotiers-d-erosion-submersion) with the goal to provide a free smartphone app to register coastal indicators (beach profile, submersion height, etc.). Thanks to these data collected at different times of the year, it will be possible to figure out the evolution of the coast and to better understand this changing environment. The accessibility of this app also aims to draw the public awareness to scientific procedures and to coastal hazards by putting the coast's dynamic behavior center stage.


## Getting Started

This app has been developed using [*Java*](https://www.java.com/fr/). The data are stored in the [IUEM](https://www-iuem.univ-brest.fr/) servers using [MySQL](https://www.mysql.com/fr/) and [PHP](https://www.php.net/).
You will see below all the instructions needed to run the project on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

First, download *Android Studio* and ensure that your are using the good SDK version.

```
SDK Manager: Android 10.0 (Q) | API 29
```

### Running the app (from *Android Studio*)

You can run the app on a real device connected to your computer or you can use an emulator.

In the AVD manager, launch a device or create a new one:

```
AVD Manager: Create Virtual Device
```

Choose the type of device you want to launch the app on and download the good version according to the SDK:

```
Pixel 3a XL: R | API 30
```

Finally, launch the app on the device.

## Running the tests

There are two types of tests in this project. The unit tests in the package:
```
Coastappli-master/app/src/test/java/osirisc.coastappli(test)
```
The other ones are the instrumented tests in the package:
```
Coastappli-master/app/src/test/java/osirisc.coastappli(android Test)
```
Open a test class and run the whole or a specific part by clicking on the ► in the left marge.

## Deployment

To make the app available, export it in a signed APK version:
```
Build > Generate Signed Bundle / APK... > APK
```
You can create a new keystore or use an existing one.

Then, you can download the app on the *PlayStore* with an [*Android* developer](https://accounts.google.com/signin/v2/identifier?service=androiddeveloper&passive=1209600&continue=https://play.google.com/apps/publish/signup/#&followup=https://play.google.com/apps/publish/signup/&flowName=GlifWebSignIn&flowEntry=ServiceLogin) account to publish it.

## Android-Login-And-Registration
Android Login And Registration System with PHP, MySQL and SQLite Databases.

### Login Screen
<a href="https://github.com/akrajilwar/Android-Login-And-Registration/blob/master/project_2_login_screen.png">
<img src="https://github.com/akrajilwar/Android-Login-And-Registration/blob/master/project_2_login_screen.png" height="640px" /></a>

### Registration Screen
<a href="https://github.com/akrajilwar/Android-Login-And-Registration/blob/master/project_2_registration_screen.png">
<img src="https://github.com/akrajilwar/Android-Login-And-Registration/blob/master/project_2_registration_screen.png" height="640px" /></a>

### Email Verify Screen
<a href="https://github.com/akrajilwar/Android-Login-And-Registration/blob/master/project_2_email_verify_screen.png">
<img src="https://github.com/akrajilwar/Android-Login-And-Registration/blob/master/project_2_email_verify_screen.png" height="640px" /></a>

### Home Screen
<a href="https://github.com/akrajilwar/Android-Login-And-Registration/blob/master/project_2_home_screen.png">
<img src="https://github.com/akrajilwar/Android-Login-And-Registration/blob/master/project_2_home_screen.png" height="640px" /></a>

### Steps for WINDOWS ON XAMPP
  - Copy android_login folder to XAMPP=>htdocs
  - Create database android_login =>

         create table users( id int(11) primary key auto_increment, unique_id varchar(23) not null unique, name varchar(50) not null, email varchar(100) not null unique, encrypted_password varchar(250) not null, otpint(6) NOT NULL, verified int(1) NOT NULL DEFAULT '0', created_at datetime DEFAULT NULL );

  - Change Config.php file for username and password

      $username = "root";
      $password = "pass";
      $host = "localhost";
      $dbname = "android_login";

  - Change Main Url inside Functions.Java File
  - If you are using localhost:[PORT] change Mainurl to MAIN_URL = "http://10.0.2.2:[PORT]/android_login/"
  - If you are using just localhost change Mainurl to MAIN_URL = "http://10.0.2.2/android_login/"

  ### Steps for WEBHOSTING
  - Copy android_login folder to cpanel=>www
  - Create database android_login =>

        create table users( idint(11) primary key auto_increment, unique_idvarchar(23) not null unique, namevarchar(50) not null, emailvarchar(100) not null unique, encrypted_passwordvarchar(250) not null, otpint(6) NOT NULL, verifiedint(1) NOT NULL DEFAULT '0', created_at datetime DEFAULT NULL );

  - Change Config.php file for username and password
      $username = "username";
      $password = "pass";
      $host = "localhost";
      $dbname = "username_android_login"; //Check at phpmyadmin whats the name of database

  - Change Main Url inside Functions.Java File // HTTP[S] not HTTP TRY BOTH
  - Change Mainurl to MAIN_URL = "https://hostname.example.com/username_android_login/" example "https://cpanel.example.com/username_android_login/"

## Built With

* [Android Studio](https://developer.android.com/studio) - The software used for the development
* [WampServer](https://www.wampserver.com/en/) - The software used for the server part

## Authors

* **MALLEIN-GERIN I., MULLER P., SCHMUTZ J., SCHOLTEN N., SILUE G.-H.** - *Initial work* - [IMT Atlantique](https://www.imt-atlantique.fr/fr)
*  **CADIOU J., CARNEIRO J., JUBAULT M., LE RUYET M., LIZÉE G.** - *Second version* - [IMT Atlantique](https://www.imt-atlantique.fr/fr)


## License

This project is licensed under the Creative Common Attribution 4.0 International Licence - see the [LICENSE.md](https://github.com/Coastappli/Coastappli/blob/master/LICENCE.md) file for details

