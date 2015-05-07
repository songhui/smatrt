This case is a reproduction of the [Jar2UML](http://ssel.vub.ac.be/ssel/research:mdd:jar2uml) tool developed by [Dennis Wagelaar](http://ssel.vub.ac.be/ssel/about:members:denniswagelaar). We use a simplified UML meta-model as the system meta-model, and write an access model to wrap the invocation of [BCEL](http://jakarta.apache.org/bcel/) tool. All the specification could be found [here](http://code.google.com/p/smatrt/source/browse/#svn/trunk/cases/JarUML/specification). The generated adapter could reflect the structure of Java classes inside a Jar file.

We utilize the visualization support provided by Eclipse [UML2](http://www.eclipse.org/modeling/mdt/?project=uml2) tools to generated and show the class diagram of the reflected UML model. Here is snapshot of the generated class diagram for java.io.

![http://smatrt.googlecode.com/svn/trunk/cases/JarUML/result/java_io_classes.jpg](http://smatrt.googlecode.com/svn/trunk/cases/JarUML/result/java_io_classes.jpg)

Note that this is a "reduced version" of runtime management, because the jar file do not change during runtime.