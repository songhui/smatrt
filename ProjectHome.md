This project provides a domain-specific modeling language (the **SM@RT language**) and a code generator (the **SM@RT generator**) to support model-based runtime system management.
**SM@RT language** support developers to specify the structure of a running system, and how to invoke the management API to manipulate this system. From this specification, **SM@RT generator** automatically generates the adapter to wrap the management API into standard MOF reflection interface. With the help of this generated adapter, we can manipulate the running system in the same way as manipulating a standard MOF-compliant models. That means we can directly use the existing model-based tools (like OCL, ATL, GMF etc.) to manage running systems

## News ##

Mar 17th, 2011: Our new progress on SM@RT is to **infer the data model** from existing API clients. The original purpose of this work is to automatically create the system meta-model and access model, but it can also be used on general data processing API. Details can be found in its page: [DataModelInference](DataModelInference.md).

## Documentation ##

We provide a [tutorial](http://smatrt.googlecode.com/files/tutorial%20-%20smart.pdf) to describe how to use SM@RT language and generator, and also how to use the generated adapters.

## Download and Source Code ##

The SM@RT tookit can be downloaded [here](http://smatrt.googlecode.com/files/smatrt.zip), including the editor for SM@RT lanuages and the code generator. The tookit is in the form of several Eclipse plug-ins, which can be deployed on Eclipse 3.4 or later, with EMF support.
The souce code of these plug-ins can be browsed or checked out [here](http://code.google.com/p/smatrt/source/checkout).

## Examples ##

Until now, we have the following cases: [JarUML](JarUML.md), [C2JOnAS](C2JOnAS.md), [SimpleSWT](SimpleSWT.md). We'll be very honored and grateful if anyone would like to try other cases!