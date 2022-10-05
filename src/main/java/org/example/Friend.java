package org.example;

public class Friend extends Contact{


    private int telephonenumber;


    public Friend(String name,int telephonenumber){
    super(name);
    this.telephonenumber = telephonenumber;

    }

@Override
public String toString(){
        return this.getName() +" "+ telephonenumber;
}


}
