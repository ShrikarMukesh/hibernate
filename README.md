# hibernate Questions
1.SessionFactory vs Session
SessionFactory is a factory class for Session objects. It is available for the whole application while a Session is only available for particular transaction. Session is short-lived while SessionFactory objects are long-lived. SessionFactory provides a second level cache and Session provides a first level cache

2. @OneToOne Mapping Example
The @JoinColumn annotation combined with a @OneToOne mapping indicates that a given column in the owner entity refers to a primary key in the reference entity:

@Entity
public class Office {
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "addressId")
    private Address address;
}
The above code example will create a foreign key linking the Office entity with the primary key from the Address entity. The name of the foreign key column in the Office entity is specified by name property.

