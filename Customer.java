// --------------------------------------------------------------------
// Assignment 1
// Written by: Alex Nguyen #2073215
// For Application Development 2 (Mobile) - Winter 2022
// --------------------------------------------------------------------
package discountsystem;

/**
 *
 * @author Alex
 */
public class Customer {
    private String name;
    private boolean member = false;
    private String memberType;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", member=" + member + ", memberType=" + memberType + '}';
    }
    
    public String getName() {
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }
    
    
}
