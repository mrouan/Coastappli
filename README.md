# CoastAppli

The CoastAppli project is included in the project [OSIRISC](https://www-iuem.univ-brest.fr/pops/projects/osirisc-vers-un-observatoire-integre-des-risques-cotiers-d-erosion-submersion). OSIRISC aims to create a scientific observatory of coastal risks. The CoastAppli app is, thus, a tool to the construction of this observatory, and it will help the monitoring of coastal hazards. Indeed, every user can use this participatory sciences app and register their observations of the coast to ease the work of coastal managers.


## Getting Started

This app has been developed using [*Java*](https://www.java.com/fr/). The data are stored in the [IUEM](https://www-iuem.univ-brest.fr/) servers using [MySQL](https://www.mysql.com/fr/)/[PostgreSQL](https://www.postgresql.org/).
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

### Break down into end to end tests

Explain what these tests test and why

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

To make the app available, export it in a signed APK version:
```
Build > Generate Signed Bundle / APK... > APK
```
You can create a new keystore or use an existing one.

Then, you can download the app on the *PlayStore* with an [*Android* developer](https://accounts.google.com/signin/v2/identifier?service=androiddeveloper&passive=1209600&continue=https://play.google.com/apps/publish/signup/#&followup=https://play.google.com/apps/publish/signup/&flowName=GlifWebSignIn&flowEntry=ServiceLogin) account to publish it.

## Built With

* [Android Studio](https://developer.android.com/studio) - The software used for the development


## Authors

* **MALLEIN-GERIN I., MULLER P., SCHMUTZ J., SCHOLTEN N., SILUE G.-H.** - *Initial work* - [IMT Atlantique](https://www.imt-atlantique.fr/fr)
*  **CADIOU J., CARNEIRO J., JUBAULT M., LE RUYET M., LIZÉE G.** - *Second version* - [IMT Atlantique](https://www.imt-atlantique.fr/fr)


## License

This project is licensed under the License - see the [LICENSE.md](LICENSE.md) file for details

