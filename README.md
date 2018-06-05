# UML-Teaching
A Papyrus UML Architecture ready to be pruned

# Steps to create your own bundle
 - get the sources (either clone directly or fork in GitHub)
 - open the uml.teaching project with Papyrus (Toolsmith should be installed)
    - prune the architecture (remove unwanted diagram and table)
    - remove unused palette  (similar to the removed diagrams)
    - remove unwanted elements in each palettes
    - remove element in the 2 childs menus
 - use maven to build the product ``` mvn clean install``` 
 - product is available in uml.teaching.product\target\products