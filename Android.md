# Introduction #

We used SM@RT to provide runtime model support for Android platform. For this initial version, we represent some very simple Android runtime data (including the WiFi and process status) as a dynamic Ecore model, which conforms to the meta-model as shown below.

![http://smatrt.googlecode.com/svn/trunk/cases/android/img/metamodel.jpg](http://smatrt.googlecode.com/svn/trunk/cases/android/img/metamodel.jpg)

To show how to use such a runtime model, we ship it with an OCL interpreter, so that you can write OCL queries to indicate and aggregate the runtime data.

Below, we first show how to use the final APK on your android phone, so that you can have a intuitive vision about what is a runtime model for android. After that, we show a bit about how to provide such a runtime model support using SM@RT.

# Get stated with the APK #

Download our final all-in-one APK file from [here](http://smatrt.googlecode.com/files/ocladapt.apk), and install it on a mobile phone with Android 1.5+. Run the application, and you will see the only Activity, as shown below. In the text box, you can input an OCL query conforming to the meta-model shown above, and after clicking the only button, you'll see the query result. Try executing the same query several times, you'll finally see that the result is changing according to system or environment changes. If you are not familiar with OCL, try to long-click the text box to switch among several built-in OCL queries (please, forgive our poor UI design right now, because anytime you long-click the box, you have to first close the input selection dialog). Here are some screen caught from my own android phone. We have tested this apk on HTC Hero and Moto Droid.

![http://smatrt.googlecode.com/svn/trunk/cases/android/img/wifi.jpg](http://smatrt.googlecode.com/svn/trunk/cases/android/img/wifi.jpg)
![http://smatrt.googlecode.com/svn/trunk/cases/android/img/process.jpg](http://smatrt.googlecode.com/svn/trunk/cases/android/img/process.jpg)
![http://smatrt.googlecode.com/svn/trunk/cases/android/img/count.jpg](http://smatrt.googlecode.com/svn/trunk/cases/android/img/count.jpg)

# What's the magic inside this APK #

First, of course, there is something related to SM@RT. Specifically, it is a synchronizer which maintains an Ecore model conforming to the above meta-model, and dynamically synchronize this model with the current system state. So everytime something read or write this model (like the OCL engine), the model it get or set reflects the current system state.

Second, there is an OCL engine to interpret the inputted query, and read the runtime model according to the query. Yes, really, we have ported the EMF and OCL engine on to Android platform. I'm afraid this is even more interesting than SM@RT :(

Finally, there is a stupid Android Activity to let you input OCL queries and show you the result.

# How to generate the synchronizer #

The key component of this apk is the runtime model synchronizer (ok, from our point of view, it is the most important one). It is generated from two simple specifications. The [first specification](http://code.google.com/p/smatrt/source/browse/trunk/cases/android/specification/Android.ecore?r=18) is the system meta-model as shown above (again!), which tells the generator what kind of data can be obtained from the Android API. The [second one](http://code.google.com/p/smatrt/source/browse/trunk/cases/android/specification/Android.acc?r=18) is the so-called access model, which specifies how to invoke the Android API to get or set these kinds of system data. There are five files in the [specification fold](http://code.google.com/p/smatrt/source/browse/trunk/cases/android/specification), but except the two mentioned above, other ones are automatically generated.

From these specifications, we can generate the final synchronizer automatically. The generated code can be browsed [here](http://code.google.com/p/smatrt/source/browse/trunk/cases/android/#android%2Fgenerated%2Focladapt%2Fsrc%2FAndroidSystem).

# Extension #

Currently, it is just a toy example. There could be some different ways for extension.

# Wrapping more Android APIs, like the LocationMangager, the Accelerate manager etc. We could add more classes, attributes or references on the meta-model, and indicate the corresponding invocations on the access model. After that, just generate the code automatically.

# Aggregate the data using OCL queries. For example, using the signal status of WIFI to estimate the location.