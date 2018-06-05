# spring-hibernate-1toN_way3

This is the spring hibernate application demonstrating the bi-directional nature of entities in one to many mapping of hibernate 

STUDENT and PHONE have one to many relation, one student can have many phone numbers, 

here we are creating STUDENT_ID_FK column in PHONE table to store the mappings using hibernate, we are NOT creating any third table to store the mapping

In Student.java entity we have defined @OneToMany annotation along with mappedBy attribute, mappedBy points to student object defined in Phone.java entity

IN Phone.java entity we have defined @ManyToOne annotation, also we have defined the foreign key column STUDENT_ID_FK which needs to be created

What does bi-directional nature of entities mean here?
Here we can access all phone numbers of a perticular student using getStudentPhoneNumbers() method of Student class,
Also we can access the student related to the phone number using getStudent() method of Phone class. 
