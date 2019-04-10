package Hierarchy;

public class SmartPhone extends PC
{
    private String mobileModemType;

    public SmartPhone() {
    }

    public String getMobileModemType() {
        return mobileModemType;
    }

    public void setMobileModemType(String mobileModemType) {
        this.mobileModemType = mobileModemType;
    }

    public void ring()
    {
        System.out.println("Ring ring!");
    }

}
