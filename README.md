# Mule API Annotations

Provides Java annotations used to indicate what is not considered to be part of the API that is maintained compatible across
versions.

# Overview

On Mule 4 classloading model, modules define which Java packages are made available to Mule artifacts, so the classes that are
visible on these modules define the module's API. Those packages can contain both public and package visible classes, but only the
public ones are considered part of the API. For the visible classes, the API of each of them will be formed by public and
protected methods, fields, extended super classes or implemented interfaces, etc.

When a new version of a given module is released, the module's API must be compatible against the previous version. To indicate
the level of compatibility between different module versions, we will use semantic versioning, that uses three different type of
releases: incremental, minor and major version change.

# API Evolution

Semantic versioning is too restrictive about which changes can be made on a given version update, and there are times that having
to change a major release just because a single change in the API can create a mess making versions to explode.
To enable APIs to evolve, without breaking compatibility a set of Java annotations is provided, so API developer can add
restrictions about how an element is supposed to be used and allowing a set of changes on them that will not break the API.

## Restricting Interface Usage

Interfaces define types, allowing to separate the type definition from the implementation, and also make possible to split modules
in two to break cyclic dependencies. In general, interfaces are supposed to be implemented by consumers of a given API. In these
cases, adding non default new methods in minor versions will break the API, as existing implementations won't have the new method
implemented.
However, there are interfaces that are part of the API but are not supposed to be implemented by consumers of the API, they are
only implemented inside the runtime or related modules. API users will just consume the interface. In these cases, there is no
reason to forbid adding methods as users code will not break.
When such an interface is defined in the API, the restriction can be made explicit by adding the @NoImplement annotation to it.
In this way, that interface or any interface that extends it, won't break the API when new methods are added to it.

## Restricting Classes Usage

Classes provide not just a type, but also an implementation. Classes can be extended by users, they can be instantiated or just
consume instances creates by someone else. If a class can be extended, then class's protected structure and behavior cannot be
changed across versions. If users can create instances of the class, then class's public constructors cannot be changed across
versions.
In some situations, probably because the API was not well defined, classes are part of the API but the API developer does not want
to have users exteding or instantiating it. For thos cases there are two additional annotations.
Annotating a class with @NoExtend means that the class is not supposed to be extended by users. Any change in the protected
structure or behavior will not be considered as breaking API across versions.
On the other side, annotating a class with @NoInstantiate means that the class is not supposed to be directly instantiated by
users. Any change in the public class constructors will not be considered as breaking API across versions.







