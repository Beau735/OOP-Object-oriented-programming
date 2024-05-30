## <span style="color:cornflowerblue">OOP - Object-oriented programming</span>

> Object-oriented programming (OOP) is a programming paradigm based on the concept of <span style="color:orange">**"objects"**</span>, which are instances of <span style="color:orange">**classes**</span>. These objects are used to model real-world <span style="color:orange">**entities**</span>, encapsulating both data (attributes) and behavior (methods) that operate on the data. OOP promotes principles such as <span style="color:orange">encapsulation, inheritance, polymorphism, and abstraction</span> to create modular, reusable, and maintainable code.

#### 1. Abstraction:
> Abstraction involves defining complex structures by their essential characteristics while hiding the detailed implementation. This allows focusing on what an object does rather than how it does it.

```java
class Watercraft {
    protected String name;
}
```

##### This is an example of a parent class that defines essential attributes while hiding implementation details.
---

#### 2. Simple inheritance:
> Inheritance is used to create new classes based on existing ones, establishing a permanent relationship between the original and derived classes. The new class inherits attributes and methods from the parent class.

```java
class SailingShip extends Watercraft {}
``` 

##### This is an example of a child class that inherits from the parent class.
----

#### 3. Polymorphism:
> Polymorphism allows methods to have the same name and signature but different implementations in different classes. It is closely related to inheritance and interfaces, enabling objects to be treated as instances of their parent class.

```java
@Override public void swim()
``` 
##### This is an example of method overriding, a form of polymorphism.
----

#### 4. Encapsulation:
> Encapsulation, also known as <span style="color: red">Information Hiding</span>, is a principle of computer science and software development where implementation details of data and methods are hidden, exposing only necessary components.

```java
class Watercraft {
    protected String name;
    protected int draft;
    protected int constructionYear;
    protected String type;
    protected String owner;
}
```

##### This is an example of hiding implementation details of an object by making attributes protected.
----
