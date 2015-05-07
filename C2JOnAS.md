### Introduction ###

[JOnAS](http://wiki.jonas.objectweb.org/xwiki/bin/view/Main/WebHome) is an open source JEE application server developed by [ObjectWeb](http://www.objectweb.org/).  We specified and generated an adapter to support users in managing JOnAS systems (like [Java Pet Store](http://java.sun.com/developer/releases/petstore/) deployed on JOnAS). We put the specification, the generated adapters, the utility tools , and the test data [here](http://code.google.com/p/sandtablist/source/browse/#svn/trunk/casestudy/c2_jonas).

### Dependence ###

The generation tool and the generated synchronizer have to run upon [Eclipse 3.4](http://www.eclipse.org/) or later with [EMF](http://www.eclipse.org/projects/project_summary.php?projectid=modeling) support. To test the generated synchronizer, you still have to install a JOnAS server (we have only tested [version 4.9.2](http://forge.objectweb.org/project/showfiles.php?group_id=5)), and copy the "client.jar" and "mejb.jar" of your JOnAS into the generated system adapter.

### Specification ###

The specifications we wrote are stored in the "specification" directory, where  "JOnAS.ecore" is the system meta-model, "JOnAS.decorate" is the access model,

### Generation ###

The "specification" direction stores the generated adapter.

### Use ###
In the usage directory, we defined the C2 meta-model and a QVT to relate this architecture style with the JOnAS system, and use them to generate a synchronizer that dynamically relate the architecture models with the running JOnAS system. Adminstrators could use the the architecture model to monitor and control the system.

The "utility" direction stores a graphical C2 editor, and the "test" directory stores two EJBs implementating the "Product and Item Artists" components, and a web module implementing the RSS generator.

Here are the snapshots for using this generator.

First, the C2 editor and the interface of Java Pet Store.
![http://sandtablist.googlecode.com/svn/trunk/casestudy/c2_jonas/snapshot/first.jpg](http://sandtablist.googlecode.com/svn/trunk/casestudy/c2_jonas/snapshot/first.jpg)

Then, we add the "Artists" and the RSS generator, and currently the RSS generator connects to the "Item Artist", and we can get an RSS seed about all items
![http://sandtablist.googlecode.com/svn/trunk/casestudy/c2_jonas/snapshot/itemrss.jpg](http://sandtablist.googlecode.com/svn/trunk/casestudy/c2_jonas/snapshot/itemrss.jpg)

At last, we link the RSS generator with the "Product Artist"
![http://sandtablist.googlecode.com/svn/trunk/casestudy/c2_jonas/snapshot/productrss.jpg](http://sandtablist.googlecode.com/svn/trunk/casestudy/c2_jonas/snapshot/productrss.jpg)