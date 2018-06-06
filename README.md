# UML-Teaching
A Papyrus UML Architecture ready to be pruned

### Status ###

[![License](https://img.shields.io/badge/license-EPL2-blue.svg)](https://www.eclipse.org/org/documents/epl-2.0/EPL-2.0.html)
[![Build Status](https://travis-ci.org/bmaggi/UML-Teaching.svg?branch=master)](https://travis-ci.org/bmaggi/UML-Teaching)

## Steps to create your own bundle
 - get the sources (either clone directly or fork in GitHub)
 - open the uml.teaching.plugin project with Papyrus (Toolsmith should be installed)
    - prune the architecture (remove unwanted diagram and table)
    - remove unwanted elements in palette still used in architecture
    - remove element in the 2 childs menus
 - use maven to build the product ``` mvn clean install``` 
 - product is available in uml.teaching.product\target\products

## Example Simple Product with only class diagram 
 - [Branch example](https://github.com/bmaggi/UML-Teaching/tree/example) 
 - [Download product](https://www.dropbox.com/sh/6u19pou8nf3rgy3/AAAC1rKIV_hjKO9Tr8VPYNppa?dl=0)

### Result:
 
__Teaching Architecture__
   
![GitHub TeachingArchitecture](https://github.com/bmaggi/UML-Teaching/blob/example/doc/TeachingArchitecture.png)

__Only Class diagram__
   
![GitHub OnlyClassDiagram](https://github.com/bmaggi/UML-Teaching/blob/example/doc/OnlyClassDiagram.png)

__Simple New Child__
   
![GitHub SimpleNewChild](https://github.com/bmaggi/UML-Teaching/blob/example/doc/SimpleNewChild.png)

__Simple palette__
   
![GitHub SimplePalette](https://github.com/bmaggi/UML-Teaching/blob/example/doc/SimplePalette.png)
