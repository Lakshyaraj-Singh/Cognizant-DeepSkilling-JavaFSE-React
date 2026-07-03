## JPA vs. Hibernate vs. Spring Data JPA

## JPA
=> JPA  stands for Java Persistence API is standard rules theat specifies how java objects to be mapped with database tables .This technology has some interfaces that provide a way to interact with the data in a database. JPA is a specification and doesn't have any direct interactions with a database.

## Hibernate
=>Hibernate is an ORM framework that implements JPA and performs the actual database operations. Hibernate caches data and gives developers more opportunities to define data than JPA.

## SpringDataJPA
=> Is a Spring module that sits on top of JPA and Hibernate, reducing boilerplate code by providing automatic CRUD operations and repository suppor.


**Relationship:**

Spring Data JPA → uses JPA → is usually implemented by Hibernate.